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

import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.Environment;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.IniConfigurationFile;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.IniConfigurationFile.ConfigurationException;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.BaseSubConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.ISubConfigHandler;

public class PmConfig extends BaseSubConfig {

    private static final String SECTION_MARKER_PM = "pm";
    private static final String PROPERTY_KEY_ENABLED = "pmEnabled";
    private static final String PROPERTY_KEY_CLUSTER = "pmCluster";

    private static final boolean DEFAULT_VALUE_ENABLED = true;
    private static final String DEFAULT_VALUE_CLUSTER = "";
    private static PmConfig pmConfig;

    private boolean enabled;

    public static final String ESDATATYPENAME = "database";

    private static final String EMPTY = "empty";

    private String cluster;
    private String host;
    private String node;

    public static String getESDATATYPENAME() {
        return ESDATATYPENAME;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public boolean isPerformanceManagerEnabled() {
        return this.enabled;
    }

    public PmConfig(IniConfigurationFile config, ISubConfigHandler configHandler) throws ConfigurationException {
        this(config, configHandler, true);
    }

    public PmConfig(IniConfigurationFile config, ISubConfigHandler configHandler, boolean save)
            throws ConfigurationException {

        super(config, configHandler, SECTION_MARKER_PM);
        String clustername = Environment.getVar("$HOSTNAME");

        this.enabled = this.getBoolean(PROPERTY_KEY_ENABLED, DEFAULT_VALUE_ENABLED);
        String c = this.getString(PROPERTY_KEY_CLUSTER, clustername);
        if (c != null && c.startsWith("$")) {
            c = Environment.getVar(c);
        }
        this.cluster = c;
        this.node = String.format("%s%s", this.cluster, "n1");
        this.host = "localhost";

        if (save) {
            config.setProperty(SECTION_MARKER_PM + "." + PROPERTY_KEY_ENABLED, this.enabled);
            config.setProperty(SECTION_MARKER_PM + "." + PROPERTY_KEY_CLUSTER, this.cluster);

            this.save();
        }
    }

    private PmConfig() {
        super();
        this.cluster = EMPTY;
        this.host = EMPTY;
        this.node = EMPTY;
        this.enabled = DEFAULT_VALUE_ENABLED;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (cluster == null ? 0 : cluster.hashCode());
        result = prime * result + (enabled ? 1231 : 1237);
        result = prime * result + (host == null ? 0 : host.hashCode());
        result = prime * result + (node == null ? 0 : node.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PmConfig other = (PmConfig) obj;
        if (cluster == null) {
            if (other.cluster != null) {
                return false;
            }
        } else if (!cluster.equals(other.cluster)) {
            return false;
        }
        if (enabled != other.enabled) {
            return false;
        }
        if (host == null) {
            if (other.host != null) {
                return false;
            }
        } else if (!host.equals(other.host)) {
            return false;
        }
        if (node == null) {
            if (other.node != null) {
                return false;
            }
        } else if (!node.equals(other.node)) {
            return false;
        }
        return true;
    }

    public static PmConfig getDefaultConfiguration() {
        PmConfig c = new PmConfig();
        c.enabled = DEFAULT_VALUE_ENABLED;
        c.cluster = DEFAULT_VALUE_CLUSTER;
        return c;
    }

    @Override
    public String toString() {
        return "PmConfig [enabled=" + enabled + ", cluster=" + cluster + ", host=" + host + ", node=" + node + "]";
    }

    public static boolean isInstantiated() {
        return pmConfig != null;
    }

    public static PmConfig getPm(IniConfigurationFile config, ISubConfigHandler configHandler) {
        if (pmConfig == null) {
            try {
                pmConfig = new PmConfig(config, configHandler);
            } catch (ConfigurationException e) {
                pmConfig = PmConfig.getDefaultConfiguration();
            }
        }
        return pmConfig;
    }

    public static PmConfig reload() {
        if (pmConfig == null) {
            return null;
        }
        PmConfig tmpConfig;
        try {
            tmpConfig = new PmConfig(pmConfig.getConfig(), pmConfig.getConfigHandler(), false);
        } catch (ConfigurationException e) {
            tmpConfig = PmConfig.getDefaultConfiguration();
        }
        pmConfig = tmpConfig;
        return pmConfig;
    }

    public static void clear() {
        pmConfig=null;
    }
}
