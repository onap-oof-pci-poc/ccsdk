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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.config;

import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.IniConfigurationFile;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.IniConfigurationFile.ConversionException;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.IniConfigurationFile.Section;

public class BaseSubConfig {

    private final Section subconfig;
    private final ISubConfigHandler configHandler;
    private final IniConfigurationFile config;

    protected Section getSubConfig() {
        return this.subconfig;
    }
    protected ISubConfigHandler getConfigHandler() {
        return this.configHandler;
    }
    protected IniConfigurationFile getConfig() {
        return this.config;
    }
    public BaseSubConfig()
    {
        this.config=null;
        this.subconfig=null;
        this.configHandler=null;
    }
    public BaseSubConfig(IniConfigurationFile config, ISubConfigHandler configHandler,String section) {
        this.config = config;
        this.subconfig = config.subset(section);
        this.configHandler = configHandler;
    }
    protected boolean hasKey(String key)
    {
        if(this.subconfig==null) {
            return false;
        }
        return this.subconfig.hasKey(key);
    }
    protected String getString(String key,String def)
    {
        if(this.subconfig==null) {
            return def;
        }
        String s;
        //try
        {
            s=this.subconfig.getString(key, def);
            if(s.isEmpty()) {
                s=def;
            }
        }
        /*catch(ConversionException e)
        {
            s=def;
        }
        */
        return s;
    }
    protected boolean getBoolean(String key, boolean def) {
        if(this.subconfig==null) {
            return def;
        }
        boolean s;
        try {
            s=this.subconfig.getBoolean(key, def);
        }
        catch(ConversionException e)
        {
            s=def;
        }
        return s;
    }
    protected int getInt(String key, int def) {
        if(this.subconfig==null) {
            return def;
        }
        int s;
        try {
            s=this.subconfig.getInt(key, def);
        }
        catch(ConversionException e)
        {
            s=def;
        }
        return s;
    }
    protected long getLong(String key, long def) {
        if(this.subconfig==null) {
            return def;
        }
        long s;
        try {
            s=this.subconfig.getLong(key, def);
        }
        catch(ConversionException e)
        {
            s=def;
        }
        return s;
    }
    protected void save()
    {
        if(this.configHandler!=null) {
            this.configHandler.save();
        }
    }


}
