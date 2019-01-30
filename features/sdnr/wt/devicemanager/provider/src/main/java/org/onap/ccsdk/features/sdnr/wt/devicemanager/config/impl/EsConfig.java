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

public class EsConfig extends BaseSubConfig {

    public static final String SECTION_MARKER_ES = "es";
    public static final String ESDATATYPENAME = "database";
    private static final String EMPTY = "empty";
    private static final String PROPERTY_KEY_CLUSTER = "esCluster";
    private static final String DEFAULT_VALUE_CLUSTER = "";
    private static EsConfig esConfig;

    private String cluster;
    private String host;
    private String node;
    private String index;

    private EsConfig() {
        super();
        this.host = EMPTY;
        this.node = EMPTY;
        this.index = EMPTY;
        this.cluster = DEFAULT_VALUE_CLUSTER;
    }

    public EsConfig cloneWithIndex(String _index) {
        EsConfig c = new EsConfig();
        c.index = _index;
        c.host = this.host;
        c.node = this.node;
        c.cluster = this.cluster;
        return c;
    }

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

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "EsConfig [cluster=" + cluster + ", host=" + host + ", node=" + node + ", index=" + index + "]";
    }

    public EsConfig(IniConfigurationFile config, ISubConfigHandler configHandler) throws ConfigurationException {
        this(config, configHandler, true);
    }

    public EsConfig(IniConfigurationFile config, ISubConfigHandler configHandler, boolean save)
            throws ConfigurationException {

        super(config, configHandler, SECTION_MARKER_ES);
        String clustername = Environment.getVar("$HOSTNAME");

        String c = this.getString(PROPERTY_KEY_CLUSTER, clustername);
        if (c != null && c.startsWith("$")) {
            c = Environment.getVar(c);
        }
        this.cluster = c;
        this.node = String.format("%s%s", this.cluster, "n1");
        this.host = "localhost";

        if (save) {
            config.setProperty(SECTION_MARKER_ES + "." + PROPERTY_KEY_CLUSTER, this.cluster);
            this.save();
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (cluster == null ? 0 : cluster.hashCode());
        result = prime * result + (host == null ? 0 : host.hashCode());
        result = prime * result + (index == null ? 0 : index.hashCode());
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
        EsConfig other = (EsConfig) obj;
        if (cluster == null) {
            if (other.cluster != null) {
                return false;
            }
        } else if (!cluster.equals(other.cluster)) {
            return false;
        }
        if (host == null) {
            if (other.host != null) {
                return false;
            }
        } else if (!host.equals(other.host)) {
            return false;
        }
        if (index == null) {
            if (other.index != null) {
                return false;
            }
        } else if (!index.equals(other.index)) {
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

    @Override
    public void save()
    {
        this.getConfig().setProperty(SECTION_MARKER_ES + "." + PROPERTY_KEY_CLUSTER, this.cluster);
        super.save();
    }
    public static boolean isInstantiated() {
        return esConfig != null;
    }

    public static EsConfig getDefaultConfiguration() {
        return new EsConfig();
    }

    public static EsConfig getEs(IniConfigurationFile config, ISubConfigHandler configHandler) {
        if (esConfig == null) {
            try {
                esConfig = new EsConfig(config, configHandler);
            } catch (ConfigurationException e) {
                esConfig = EsConfig.getDefaultConfiguration();
            }
        }
        return esConfig;
    }

    public static EsConfig reload() {
        if (esConfig == null) {
            return null;
        }
        EsConfig tmpConfig;
        try {
            tmpConfig = new EsConfig(esConfig.getConfig(), esConfig.getConfigHandler(), false);
        } catch (ConfigurationException e) {
            tmpConfig = EsConfig.getDefaultConfiguration();
        }
        esConfig = tmpConfig;
        return esConfig;
    }

    public static void clear() {
        esConfig=null;
    }

}
