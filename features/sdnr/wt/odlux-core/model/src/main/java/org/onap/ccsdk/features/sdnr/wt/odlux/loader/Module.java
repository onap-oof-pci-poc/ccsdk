/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.onap.ccsdk.features.sdnr.wt.odlux.loader;

import java.util.List;

/**
 * Copyright (c) 2014 Inocybe Technologies, and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

public abstract class Module {
    /**
     * Name of the dlux module
     */
    String moduleName;

    /**
     * url via the module can be accessed
     */
    String url;

    /**
     * Location of resources to be registered
     */
    String directory;

       /**
     * List of external or internal css dependencies
     */
    List<String> cssDependencies;


    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public String getModuleName() {
    	return this.moduleName;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

   
   
}