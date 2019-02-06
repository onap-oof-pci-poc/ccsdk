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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OdluxBundleLoaderImpl implements OdluxBundleLoader {

    final static Logger LOG = LoggerFactory.getLogger(OdluxBundleLoaderImpl.class);
    private static OdluxBundleLoaderImpl mObj;

    public static OdluxBundleLoaderImpl getInstance() {
        if (mObj == null)
            mObj = new OdluxBundleLoaderImpl();
        return mObj;
    }

    private final List<OdluxBundle> bundles;

    public synchronized List<OdluxBundle> getBundles() {
        return this.bundles;
    }

    public OdluxBundleLoaderImpl() {
        this.bundles = Collections.synchronizedList(new ArrayList<OdluxBundle>());
        mObj = this;
    }

    @Override
    public synchronized void addBundle(OdluxBundle bundle) {
        LOG.debug("odlux bundle " + bundle.getBundleName() + " added");
        this.bundles.add(bundle);

    }

    @Override
    public synchronized void removeBundle(OdluxBundle bundle) {
        this.bundles.remove(bundle);
        LOG.debug("odlux bundle " + bundle.getBundleName() + " removed");

    }

}
