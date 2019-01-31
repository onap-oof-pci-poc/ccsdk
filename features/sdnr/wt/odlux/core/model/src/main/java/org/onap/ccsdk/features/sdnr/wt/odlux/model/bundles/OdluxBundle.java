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
package org.onap.ccsdk.features.sdnr.wt.odlux.model.bundles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * At startup of each karaf bundle, each UI module creates an instance of this class via blueprint.
 * Initialize method gets called at loading of bundle.
 */

public class OdluxBundle {

    final static Logger LOG = LoggerFactory.getLogger(OdluxBundle.class);
    private static final String LR = "\n";

    private String bundleName;
    private OdluxBundleLoader loader;
    private int index;

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    public OdluxBundleLoader getLoader() {
        return loader;
    }

    public void setLoader(OdluxBundleLoader loader) {
        this.loader = loader;
    }

    public void setBundleName(String bundleName) {
        this.bundleName = bundleName;
    }

    public String getBundleName() {
        return this.bundleName;
    }

    public OdluxBundle() {}

    protected OdluxBundle(final OdluxBundleLoader loader, final String bundleName) {
        this.loader = loader;
        this.bundleName = bundleName;
    }

    public void initialize() {

        LOG.info("Registering resources");
        try {
            List<String> resources = this.getResourceFiles("/odlux");
            if (resources.size() > 0) {
                for (String res : resources) {
                    LOG.debug("found res " + res);
                }
            } else {
                String res = "/odlux/" + this.getBundleName() + ".js";
                if (this.hasResource(res)) {
                    LOG.debug("found res " + res);
                } else
                    LOG.warn("no resources found in bundle");
            }
        } catch (IOException e) {
            LOG.debug("problem searching for resources: " + e.getMessage());
        }
        if (this.loader != null) {
            if (this.bundleName == null)
                LOG.error("bundle name is missing. Bundle can not be registered with odlux");
            else {
                LOG.info("Registering bunlde {}", this.bundleName);
                this.loader.addBundle(this);
            }
        }
    }

    public void clean() {
        LOG.info("Unregistering resources");

        if (this.loader != null) {
            this.loader.removeBundle(this);
        }
    }

    public boolean hasResource(String filename) {
        return this.getResource(filename) != null;
    }

    public String getResourceFileContent(String filename) {
        return this.loadFileContent(this.getResource(filename));
    }

    private URL getResource(String filename) {
        return ClassLoaderUtilExt.getResource(filename, this.getClass());
    }

    protected String loadFileContent(URL url) {
        if (url == null)
            return null;
        LOG.debug("try to load res " + url.toString());
        StringBuilder sb = new StringBuilder();
        BufferedReader in;
        try {
            in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine + LR);
            }
            in.close();
        } catch (IOException e) {
            LOG.warn("could not load resfile " + url.toString() + ": " + e.getMessage());
            return null;
        }

        return sb.toString();
    }

    private List<String> getResourceFiles(String path) throws IOException {
        List<String> filenames = new ArrayList<>();

        try {

            InputStream in = getResourceAsStream(path);
            if (in != null) {
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                if (br != null) {
                    String resource;

                    while ((resource = br.readLine()) != null) {
                        filenames.add(resource);
                    }
                }
            }
        } catch (Exception e) {
            LOG.warn("problem loading res " + path);
        }

        return filenames;
    }

    private InputStream getResourceAsStream(String resource) {
        final InputStream in = getContextClassLoader().getResourceAsStream(resource);

        return in == null ? getClass().getResourceAsStream(resource) : in;
    }

    private ClassLoader getContextClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }
}
