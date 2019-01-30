/*******************************************************************************
 * ============LICENSE_START========================================================================
 * ONAP : ccsdk feature sdnr wt
 * =================================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property. All rights reserved.
 * =================================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * ============LICENSE_END==========================================================================
 ******************************************************************************/
package org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.akka;

import com.typesafe.config.Config;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClusterConfig {

    private static final Logger LOG = LoggerFactory.getLogger(ClusterConfig.class);

    private final List<ClusterNodeInfo> seedNodes;
    private final ClusterRoleInfoCollection roles;
    private ClusterNodeInfo ismeInfo;

    public static ClusterConfig defaultSingleNodeConfig()
    {
        ClusterConfig cfg=new ClusterConfig();
        cfg.ismeInfo=ClusterNodeInfo.defaultSingleNodeInfo();
        cfg.seedNodes.add(cfg.ismeInfo);
        cfg.roles.add(ClusterRoleInfo.defaultSingleNodeRole());
        return cfg;
    }
    public ClusterConfig()
    {
        this.seedNodes = new ArrayList<>();
        this.roles = new ClusterRoleInfoCollection();

    }
    public ClusterConfig(Config o) throws Exception {
        {
            this.seedNodes = new ArrayList<>();
            this.roles = new ClusterRoleInfoCollection();
            List<String> a = o.getStringList("seed-nodes");
            for (int i = 0; i < a.size(); i++) {
                ClusterNodeInfo info = new ClusterNodeInfo(a.get(i));
                this.seedNodes.add(info);
            }
            a = o.getStringList("roles");
            for (int i = 0; i < a.size(); i++) {
                ClusterRoleInfo s = new ClusterRoleInfo(a.get(i));
                this.roles.add(s);
            }
            int idx = this.roles.get(0).getIndex() - 1;
            if (idx >= 0 && idx < this.seedNodes.size()) {
                this.ismeInfo = this.seedNodes.get(idx);
            } else {
                this.ismeInfo = null;
            }
        }

    }

    public boolean isCluster() {
        return this.seedNodes != null ? this.seedNodes.size() > 1 : false;
    }

    public boolean isMe(ClusterNodeInfo i) {
        return this.ismeInfo != null ? this.ismeInfo.equals(i) : false;
    }

    public List<ClusterNodeInfo> getSeedNodes() {
        return this.seedNodes;
    }

    public String getHostName(String defaultValue) {
        if (getRoleMemberIndex() > 0 && getRoleMemberIndex() <= seedNodes.size()) {
            return this.seedNodes.get(getRoleMemberIndex()-1).getRemoteAddress();
        } else {
            LOG.warn("Seednode not available for roleMemberIndex {}. Using default {}",getRoleMember(), defaultValue);
            return defaultValue;
        }
    }

    public String getDBClusterName(String defaultValue) {
        String r = null;
        if (this.seedNodes != null && this.seedNodes.size() > 0) {
            r = String.format("cluster-%s.%d", this.seedNodes.get(0).getRemoteAddress(), this.seedNodes.get(0).getPort());
        }
        if (r == null || r.isEmpty()) {
            r = defaultValue;
        }
        return r;
    }
    public String getClusterSeedNodeName() {
        return this.getClusterSeedNodeName("");
    }
    public String getClusterSeedNodeName(String defaultValue) {
        int idx=this.getRoleMemberIndex()-1;
        String r=null;
        if(this.seedNodes!=null && idx>=0 && this.seedNodes.size()>0 && this.seedNodes.size()>idx)
        {
            r=this.seedNodes.get(idx).getSeedNodeName();
        }
        if (r == null || r.isEmpty()) {
            r = defaultValue;
        }
        return r;
    }
    public int getRoleMemberIndex() {

        ClusterRoleInfo role=this.roles.get("member");
        return role!=null?role.getIndex():0;
    }
    public ClusterRoleInfo getRoleMember() {
        return this.roles.get("member");
    }

    @Override
    public String toString() {
        return "ClusterConfig [seedNodes=" + seedNodes + ", roles=" + roles + ", ismeInfo=" + ismeInfo + "]";
    }


}
