/*
 * Copyright (c) 2014 Inocybe Technologies, and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.onap.ccsdk.sdnr.wt.odlux.loader;

import javax.servlet.ServletException;

import com.google.common.base.Preconditions;

import org.onap.ccsdk.features.sdnr.wt.odlux.loader.OdluxModuleLoader;
import org.onap.ccsdk.features.sdnr.wt.odlux.loader.exception.OdluxLoaderException;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.onap.ccsdk.features.sdnr.wt.odlux.loader.Module;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class OdluxLoader implements OdluxModuleLoader {

    private OdluxLoaderIndexServlet indexServlet;
    private static Logger logger = LoggerFactory.getLogger(OdluxLoader.class);

    /**
     * List of modules registered with dlux
     */
    private List<Module> modules = new ArrayList<>();

    private String RESOURCE_URL = "/";

    private String RESOURCE_DIRECTORY = "/odlux";

    private String SERVLET_URL = "/index.html";

    @Override
    public void addModule(Module module){
        modules.add(module);
    }

    @Override
    public void removeModule(Module module) {
        modules.remove(module);
    }

    public List<Module> getModules() {
        return modules;
    }

    public void onUnbindService(HttpService httpService) {
        httpService.unregister(SERVLET_URL);
        httpService.unregister(RESOURCE_URL);
        this.indexServlet = null;
    }

    public void onBindService(HttpService httpService) throws ServletException, NamespaceException, OdluxLoaderException {
        Preconditions.checkNotNull(httpService,
            "Unable to inject HttpService into OdluxLoader. dlux modules won't work without httpService");

        this.indexServlet = new OdluxLoaderIndexServlet(this);
        httpService.registerServlet(SERVLET_URL, this.indexServlet, null, null);
        httpService.registerResources(RESOURCE_URL, RESOURCE_DIRECTORY, null);
        logger.info("OdluxLoader Service initialization complete.");
    }

}