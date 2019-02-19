/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
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
