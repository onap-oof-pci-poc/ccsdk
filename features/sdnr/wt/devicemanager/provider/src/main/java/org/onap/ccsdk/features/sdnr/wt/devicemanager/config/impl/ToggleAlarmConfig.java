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

import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.IniConfigurationFile;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.IniConfigurationFile.ConfigurationException;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.HtDevicemanagerConfiguration.ISubConfigHandler;

public class ToggleAlarmConfig extends BaseSubConfig{

    private static final String SECTION_MARKER_TA = "toggleAlarmFilter";
    private static final String PROPERTY_KEY_ENABLED = "taEnabled";
    private static final String PROPERTY_KEY_DELAY = "taDelay";

    private static final boolean DEFAULT_VALUE_ENABLED = true;
    private static final long DEFAULT_VALUE_DELAY = 3000;  //in ms
    private static ToggleAlarmConfig taConfig;
    private boolean enabled;
    private long delay;

    public boolean isEnabled() {
        return this.enabled;
    }
    public long getDelay() {
        return this.delay;
    }
    private ToggleAlarmConfig() {
        super();
        this.enabled = DEFAULT_VALUE_ENABLED;
        this.delay=DEFAULT_VALUE_DELAY;
    }
    public ToggleAlarmConfig(IniConfigurationFile config, ISubConfigHandler configHandler) throws ConfigurationException {
        this(config, configHandler, true);
    }

    public ToggleAlarmConfig(IniConfigurationFile config, ISubConfigHandler configHandler, boolean save)
            throws ConfigurationException {

        super(config, configHandler, SECTION_MARKER_TA);

        this.enabled = this.getBoolean(PROPERTY_KEY_ENABLED, DEFAULT_VALUE_ENABLED);
        this.delay = this.getLong(PROPERTY_KEY_DELAY,DEFAULT_VALUE_DELAY);
        if (save) {
            config.setProperty(SECTION_MARKER_TA + "." + PROPERTY_KEY_ENABLED, this.enabled);
            config.setProperty(SECTION_MARKER_TA + "." + PROPERTY_KEY_DELAY, this.delay);

            this.save();
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ToggleAlarmConfig) {
            ToggleAlarmConfig cobj = (ToggleAlarmConfig) obj;
            if(cobj.enabled!=this.enabled) {
                return false;
            }
            if (cobj.delay!=this.delay) {
                return false;
            }
            return true;
        }
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return "ToggleAlarmConfig [enabled=" + enabled + ", delay=" + delay + "]";
    }


    public static ToggleAlarmConfig getDefaultConfiguration() {
        ToggleAlarmConfig c = new ToggleAlarmConfig();
        c.enabled = DEFAULT_VALUE_ENABLED;
        c.delay = DEFAULT_VALUE_DELAY;
        return c;
    }
    public static boolean isInstantiated() {
        return taConfig != null;
    }

    public static ToggleAlarmConfig getTa(IniConfigurationFile config, ISubConfigHandler configHandler) {
        if (taConfig == null) {
            try {
                taConfig = new ToggleAlarmConfig(config, configHandler);
            } catch (ConfigurationException e) {
                taConfig = ToggleAlarmConfig.getDefaultConfiguration();
            }
        }
        return taConfig;
    }

    public static ToggleAlarmConfig reload() {
        if (taConfig == null) {
            return null;
        }
        ToggleAlarmConfig tmpConfig;
        try {
            tmpConfig = new ToggleAlarmConfig(taConfig.getConfig(), taConfig.getConfigHandler(), false);
        } catch (ConfigurationException e) {
            tmpConfig = ToggleAlarmConfig.getDefaultConfiguration();
        }
        taConfig = tmpConfig;
        return taConfig;
    }

    public static void clear() {
        taConfig=null;
    }
}
