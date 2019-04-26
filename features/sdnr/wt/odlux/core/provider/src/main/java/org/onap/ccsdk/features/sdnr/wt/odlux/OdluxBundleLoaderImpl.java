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
package org.onap.ccsdk.features.sdnr.wt.odlux;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import org.onap.ccsdk.features.sdnr.wt.odlux.model.bundles.OdluxBundle;
import org.onap.ccsdk.features.sdnr.wt.odlux.model.bundles.OdluxBundleLoader;
import org.onap.ccsdk.features.sdnr.wt.odlux.model.bundles.OdluxBundleResourceAccess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OdluxBundleLoaderImpl implements OdluxBundleLoader {

    private final static Logger LOG = LoggerFactory.getLogger(OdluxBundleLoaderImpl.class);

    private static OdluxBundleLoaderImpl singleton = null;

    private Object lock;
    // private List<OdluxBundle> bundles;
    private ConcurrentSkipListSet<OdluxBundle> bundles2;
    private Comparator<OdluxBundle> sortorderbundlecomparator;

    public OdluxBundleLoaderImpl() {
        if (singleton != null) {
            LOG.error("Multiple intializations of singleton");
        } else {
            lock = new Object();
            sortorderbundlecomparator = (arg0, arg1) -> {
                int diff = arg0.getIndex() - arg1.getIndex();
                return diff > 0 ? 1 : diff < 0 ? -1 : 0;
            };
            bundles2 = new ConcurrentSkipListSet<>(sortorderbundlecomparator);

            singleton = this;
        }
    }

    public static OdluxBundleLoaderImpl getInstance() {
        if (singleton == null) {
            LOG.warn("Test initialization order");
            new OdluxBundleLoaderImpl();
        }
        return singleton;
    }

    @Override
    public int getNumberOfBundles() {
        synchronized (lock) {
            return this.bundles2.size();
        }
    }

    @Override
    public void addBundle(OdluxBundle bundle) {
        LOG.debug("odlux bundle " + bundle.getBundleName() + " added");
        this.bundles2.add(bundle);


    }

    @Override
    public void removeBundle(OdluxBundle bundle) {
        this.bundles2.remove(bundle);
        LOG.debug("odlux bundle " + bundle.getBundleName() + " removed");

    }

    public List<String> getLoadedBundles(String myBundleName) {
        List<String> list = new ArrayList<>();
        for (OdluxBundle b : bundles2) {
            list.add(b.getBundleName());
        }
        list.add(myBundleName);
        return list;
    }

    private List<String> getBundleNames(String myBundleName) {
        final List<String> names = new ArrayList<>();
        for (OdluxBundle b : bundles2) {
            names.add(b.getBundleName());
        }
        names.add(myBundleName);
        return names;
    }

    public String getResourceContent(String fn, OdluxBundleResourceAccess indexBundle) {
        String fileContent = null;

        if (indexBundle.hasResource(fn)) {
            fileContent = indexBundle.getResourceFileContent(fn, getBundleNames(indexBundle.getBundleName()));
        } else {
            LOG.debug("not found in framework res. try to find in applications");
            final Iterator<OdluxBundle> it = bundles2.iterator();
            while (it.hasNext()) {
                OdluxBundle b = it.next();
                if (b.hasResource(fn)) {
                    LOG.debug("found res in " + b.getBundleName());
                    fileContent = b.getResourceFileContent(fn);
                    break;
                }
            }
        }
        return fileContent;
    }

}
