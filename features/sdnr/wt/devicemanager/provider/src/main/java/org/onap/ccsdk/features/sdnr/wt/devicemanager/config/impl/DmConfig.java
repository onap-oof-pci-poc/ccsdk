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

import java.util.EnumMap;
import java.util.Map;

import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.IniConfigurationFile;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.IniConfigurationFile.ConfigurationException;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InternalSeverity;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.BaseSubConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.ISubConfigHandler;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.devicemonitor.impl.DeviceMonitorProblems;

/**
 * Configuration of devicemonitor, section [devicemonitor]
 *   SeverityConnectionlossNeOAM=minor
 *   SeverityConnectionlossOAM=major
 *   SeverityConnectionlossMediator=critical
 */
public class DmConfig extends BaseSubConfig{

    private static final String SECTION_MARKER_TA = "devicemonitor";
    private static final String PROPERTY_KEY_PREFIX_Severity = "Severity";

    private static DmConfig dmConfig = null;

    private Map<DeviceMonitorProblems, InternalSeverity> severty = new EnumMap<>(DeviceMonitorProblems.class);

    /*
     * Constructor
     */
    private DmConfig() {
        super();
    }

    public DmConfig(IniConfigurationFile config, ISubConfigHandler configHandler) throws ConfigurationException {
        this(config, configHandler, true);
    }

    public DmConfig(IniConfigurationFile config, ISubConfigHandler configHandler, boolean save)
            throws ConfigurationException {

        super(config, configHandler, SECTION_MARKER_TA);

        for (DeviceMonitorProblems problem : DeviceMonitorProblems.values()) {
        	severty.put(problem, readProperty(problem));
        }

        if (save) {
            for (DeviceMonitorProblems problem : DeviceMonitorProblems.values()) {
            	configSetPropertyp(config, problem, severty.get(problem));
            }
            this.save();
        }
    }

	public InternalSeverity getSeverity(DeviceMonitorProblems problem) {
		return severty.get(problem);
	}

    public static DmConfig getDefaultConfiguration() {
        DmConfig c = new DmConfig();
        for (DeviceMonitorProblems problem : DeviceMonitorProblems.values()) {
        	c.severty.put(problem, InternalSeverity.Major);
        }
        return c;
    }
    public static boolean isInstantiated() {
        return dmConfig != null;
    }

    public static DmConfig getDmConfig(IniConfigurationFile config, ISubConfigHandler configHandler) {
        if (dmConfig == null) {
            try {
                dmConfig = new DmConfig(config, configHandler);
            } catch (ConfigurationException e) {
                dmConfig = DmConfig.getDefaultConfiguration();
            }
        }
        return dmConfig;
    }

    public static DmConfig reload() {
        if (dmConfig == null) {
            return null;
        }
        DmConfig tmpConfig;
        try {
            tmpConfig = new DmConfig(dmConfig.getConfig(), dmConfig.getConfigHandler(), false);
        } catch (ConfigurationException e) {
            tmpConfig = DmConfig.getDefaultConfiguration();
        }
        dmConfig = tmpConfig;
        return dmConfig;
    }

    public static void clear() {
        dmConfig=null;
    }

    /*
     * Private Helper functions
     */
    private static String getPropertyName(DeviceMonitorProblems problem) {
    	return PROPERTY_KEY_PREFIX_Severity+problem.name();
    }

    private static void configSetPropertyp(IniConfigurationFile config, DeviceMonitorProblems problem, InternalSeverity value) {
        config.setProperty(SECTION_MARKER_TA + "."+getPropertyName(problem), value.getValueAsString());
    }

    private InternalSeverity readProperty(DeviceMonitorProblems problem) {
    	return InternalSeverity.valueOfString(getString(getPropertyName(problem), InternalSeverity.Major.getValueAsString()));
    }

}
