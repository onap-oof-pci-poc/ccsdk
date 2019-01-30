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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import java.io.File;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.akka.ClusterConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AkkaConfig {

    @SuppressWarnings("unused")
    private static final Logger LOG = LoggerFactory.getLogger(AkkaConfig.class);

    private static final String DEFAULT_FILENAME = "configuration/initial/akka.conf";
    private final String filename;
    private ClusterConfig cluserConfig;

    public ClusterConfig getClusterConfig() {
        return this.cluserConfig;
    }

    private AkkaConfig(String filename) {
        this.filename = filename;
    }

    public AkkaConfig() {
        this(null);
    }

    @Override
    public String toString() {
        return "AkkaConfig [filename=" + filename + ", cluserConfig=" + cluserConfig + "]";
    }

    private void loadFromFile() throws Exception {
        Config cfg = ConfigFactory.parseFile(new File(this.filename));
        this.cluserConfig = new ClusterConfig(cfg.getConfig("odl-cluster-data").getConfig("akka").getConfig("cluster"));
    }

    public boolean isCluster() {
        return this.cluserConfig != null ? this.cluserConfig.isCluster() : false;
    }

    public static AkkaConfig load() throws Exception {
        return load(DEFAULT_FILENAME);
    }

    public static AkkaConfig load(String filename) throws Exception {
        AkkaConfig cfg = new AkkaConfig(filename);
        cfg.loadFromFile();
        return cfg;
    }

    public boolean isSingleNode() {
        return !this.isCluster();
    }
    public static AkkaConfig defaultSingleNodeConfig()
    {
        AkkaConfig cfg=new AkkaConfig();
        cfg.cluserConfig=new ClusterConfig();
        return cfg;
    }

    public static AkkaConfig parse(String content) throws Exception {
        Config cfg = ConfigFactory.parseString(content);
        AkkaConfig c = new AkkaConfig();
        c.cluserConfig=new ClusterConfig(cfg.getConfig("odl-cluster-data").getConfig("akka").getConfig("cluster"));
        return c;
    }
}
