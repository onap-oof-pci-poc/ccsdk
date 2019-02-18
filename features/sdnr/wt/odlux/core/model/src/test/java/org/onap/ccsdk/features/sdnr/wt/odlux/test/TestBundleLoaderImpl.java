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
package org.onap.ccsdk.features.sdnr.wt.odlux.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.odlux.model.bundles.OdluxBundle;
import org.onap.ccsdk.features.sdnr.wt.odlux.model.bundles.OdluxBundleLoaderImpl;

public class TestBundleLoaderImpl {

	@Test
	public void test() {
		OdluxBundleLoaderImpl loader = OdluxBundleLoaderImpl.getInstance();
		OdluxBundle bundle1 = new OdluxBundle();
		bundle1.setBundleName("b1");
		bundle1.setIndex(0);
		bundle1.setLoader(loader);
		OdluxBundle bundle2 = new OdluxBundle();
		bundle2.setBundleName("b2");
		bundle2.setIndex(55);
		bundle2.setLoader(loader);
		bundle1.initialize();
		bundle2.initialize();
		assertNotNull(bundle1.getResourceFileContent("index.html"));
		assertNotNull(bundle2.getResourceFileContent("index2.html"));
		assertEquals(2, loader.getBundles().size());
		loader.addBundle(bundle1);
		loader.addBundle(bundle2);
		assertEquals(4, loader.getBundles().size());
		loader.removeBundle(bundle1);
		loader.removeBundle(bundle2);
		assertEquals(2, loader.getBundles().size());
		assertTrue(bundle1.hasResource("index.html"));
		assertTrue(bundle2.hasResource("index2.html"));
		assertNotNull(bundle1.getLoader());
		assertEquals(0,bundle1.getIndex());
		bundle1.clean();
		bundle2.clean();
		assertEquals(0,loader.getBundles().size());
		

	}
}
