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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.config.util;

import java.util.ArrayList;
import java.util.List;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.FileWatchdog;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.IniConfigurationFile;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.IniConfigurationFile.ConfigurationException;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.IConfigChangedListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigFileObserver extends FileWatchdog {

    private static final Logger LOG = LoggerFactory.getLogger(ConfigFileObserver.class);

    private final List<IConfigChangedListener> mConfigChangedHandlers = new ArrayList<>();
    private final IniConfigurationFile mConfig;

    public ConfigFileObserver(String filename, long pollIntervallMs, IniConfigurationFile mConfig) {
        super(filename);
        this.setDelay(pollIntervallMs);
        this.mConfig = mConfig;
    }

    @Override
    protected void doOnChange() {

        boolean succeeded = true;
        LOG.debug("property file has changed");
        try {
            mConfig.reLoad();

        } catch (ConfigurationException e) {
            LOG.warn("error reloading config: " + e.getMessage());
            succeeded = false;

        }
        if (!succeeded) {
            return;
        }
        if (this.mConfigChangedHandlers == null) {
            LOG.debug("handler list is null");// should never happen
            return;
        }
        // push event to all listeners
        for (IConfigChangedListener listener : this.mConfigChangedHandlers) {
            if (listener != null) {
                listener.onConfigChanged();
            }
        }
    }

    public void registerConfigChangedListener(IConfigChangedListener l) {
        if (!this.mConfigChangedHandlers.contains(l)) {
            this.mConfigChangedHandlers.add(l);
        }
    }

    public void unregisterConfigChangedListener(IConfigChangedListener l) {
        this.mConfigChangedHandlers.remove(l);
    }
}
