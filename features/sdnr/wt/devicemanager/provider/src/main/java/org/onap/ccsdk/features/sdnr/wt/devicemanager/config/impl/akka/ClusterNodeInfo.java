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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class ClusterNodeInfo {
    private final String protocol;
    private final String clusterName;
    private final String remoteAdr;
    private final int port;
    private final String seedNodeName;

    public static ClusterNodeInfo defaultSingleNodeInfo() {
        return new ClusterNodeInfo("akka.tcp","opendaylight-cluster-data","127.0.0.1",2550);
    }

    public ClusterNodeInfo(String s) throws Exception {
        final String regex = "([a-z.]*):\\/\\/([a-zA-Z0-9-]*)@([a-zA-Z0-9.-]*):([0-9]*)";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(s);
        if (!matcher.find()) {
            throw new Exception("invalid seedNode format");
        }
        this.seedNodeName = matcher.group();
        this.protocol = matcher.group(1);
        this.clusterName = matcher.group(2);
        this.remoteAdr = matcher.group(3);
        this.port = Integer.parseInt(matcher.group(4));
    }

    public ClusterNodeInfo(String protocol, String clustername, String remoteadr, int port) {
        this.protocol=protocol;
        this.clusterName=clustername;
        this.remoteAdr=remoteadr;
        this.port=port;
        this.seedNodeName=this.protocol+"://"+this.clusterName+"@"+this.remoteAdr+":"+this.port;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getClusterName() {
        return clusterName;
    }

    public String getRemoteAddress() {
        return remoteAdr;
    }
    public String getSeedNodeName() {
        return seedNodeName;
    }

    public int getPort() {
        return port;
    }

    @Override
    public String toString() {
        return "ClusterNodeInfo [protocol=" + protocol + ", clusterName=" + clusterName + ", remoteAdr=" + remoteAdr
                + ", port=" + port + ", seedNodeName=" + seedNodeName + "]";
    }

}
