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
package org.onap.ccsdk.features.sdnr.wt.helpserver.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import org.junit.Test;
import org.mockito.Mockito;
import org.onap.ccsdk.features.sdnr.wt.helpserver.data.ExtactBundleResource;
import org.osgi.framework.Bundle;

public class TestExtract extends Mockito {

    private boolean called = false;
    private String testFile;

    @Test
    public void test() {

        Bundle myBundle = mock(Bundle.class);

        final ClassLoader loader = this.getClass().getClassLoader();
        try {
            when(myBundle.getEntryPaths(anyString())).thenAnswer(invocation -> {
                if (!called) {
                    Object[] args = invocation.getArguments();
                    System.out.println("Get files from: " + args[0]);
                    Enumeration<URL> e = loader.getResources((String) args[0]);
                    List<String> res = new ArrayList<>();
                    while (e.hasMoreElements()) {
                        String resourceFileName = e.nextElement().toString();
                        System.out.println("is file: " + resourceFileName);
                        res.add(resourceFileName);
                    }
                    called = true;
                    return Collections.enumeration(res);
                } else {
                    return null;
                }
            });
            when(myBundle.getEntry(anyString())).thenAnswer(invocation -> {
                Object[] args = invocation.getArguments();
                System.out.println("GetEntrye input: "+args[0]);
                return new URL(testFile = (String) args[0]);
            });

            String TMPDATAFOLDER = "tmpData";

            ExtactBundleResource.copyBundleResoucesRecursively(myBundle, TMPDATAFOLDER, "help/meta.json");

            assertTrue("Test file not found: "+testFile, new File(TMPDATAFOLDER+testFile).exists());

            ExtactBundleResource.deleteRecursively(new File(TMPDATAFOLDER+"file:"));

            assertFalse("Test not deleted: "+testFile, new File(TMPDATAFOLDER+"file:").exists());

        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception" + e);
        }



    }

}
