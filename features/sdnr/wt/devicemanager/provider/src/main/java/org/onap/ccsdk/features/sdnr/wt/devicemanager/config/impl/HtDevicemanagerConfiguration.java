/*******************************************************************************
 * ============LICENSE_START=======================================================
 * ONAP : ccsdk feature sdnr wt
 *  ================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property.
 * All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 ******************************************************************************/
package org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl;

import java.io.File;
import java.io.IOException;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.IniConfigurationFile;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.IniConfigurationFile.ConfigurationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HtDevicemanagerConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(HtDevicemanagerConfiguration.class);

    private static final long FILE_POLL_INTERVAL_MS = 1000;

    private static final String CONFIGURATIONFILE = "etc/devicemanager.properties";

    private final IniConfigurationFile mConfig;
    private final File mFile;
    private final ConfigFileObserver fileObserver;
    private final ISubConfigHandler subconfigHandler;

    public HtDevicemanagerConfiguration() throws IOException, ConfigurationException {
        this(CONFIGURATIONFILE);
    }

    public HtDevicemanagerConfiguration(String filename) throws IOException, ConfigurationException {

        LOG.info("Reading config file {}",filename);

        this.mFile = new File(filename);
        if (!this.mFile.exists()) {
            this.mFile.createNewFile();
        }
        this.mConfig = new IniConfigurationFile(this.mFile);
        this.mConfig.load();
        this.subconfigHandler = () -> mConfig.save();
        this.fileObserver = new ConfigFileObserver(filename,FILE_POLL_INTERVAL_MS, mConfig);
        this.fileObserver.start();
    }

    public void registerConfigChangedListener(IConfigChangedListener l) {
        this.fileObserver.registerConfigChangedListener(l);
    }

    public void unregisterConfigChangedListener(IConfigChangedListener l) {
        this.fileObserver.unregisterConfigChangedListener(l);
    }

    @Override
    protected void finalize() throws Throwable {
        if(this.fileObserver!=null) {
            this.fileObserver.interrupt();
        }
        super.finalize();
    }
    public DcaeConfig getDcae() {
        return DcaeConfig.getDcae(mConfig, this.subconfigHandler);
    }

    public AaiConfig getAai() {
        return AaiConfig.getAai(mConfig, this.subconfigHandler);
    }

    public EsConfig getEs() {
        return EsConfig.getEs(mConfig, this.subconfigHandler);
    }

    public PmConfig getPm() {
        return PmConfig.getPm(mConfig, this.subconfigHandler);
    }
    public ToggleAlarmConfig getToggleAlarm() {
        return ToggleAlarmConfig.getTa(mConfig, this.subconfigHandler);
    }

    public void clear() {
        DcaeConfig.clear();
        AaiConfig.clear();
        EsConfig.clear();
        PmConfig.clear();
        ToggleAlarmConfig.clear();
    }



}
