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

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.helpserver.data.ExtactBundleResource;
import org.onap.ccsdk.features.sdnr.wt.helpserver.data.HelpInfrastructureObject;

public class TestHelpInfObject {

    private static final String GETHELPDIRECTORYBASE = "data";
    private static final String ROOT = "tmp";
    private static final String CONTENT = "abc";

    @Before
    public void init() {
        try {
            ExtactBundleResource.deleteRecursively(new File(GETHELPDIRECTORYBASE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @After
    public void deinit() {
        this.init();
    }
    @Test
    public void test() {
        File root=new File(HelpInfrastructureObject.getHelpDirectoryBase()+"/"+ROOT);
        TestMyServlet.createHelpFile("/"+ROOT+"/test/0.4.0/README.md", CONTENT);
        TestMyServlet.createHelpFile("/"+ROOT+"/test2/0.4.0/README.md", CONTENT);
        TestMyServlet.createHelpFile("/"+ROOT+"/test3/abc/0.4.0/README.md", CONTENT);
        TestMyServlet.createHelpFile("/"+ROOT+"/test3/abc1/0.4.0/README.md", CONTENT);
        TestMyServlet.createHelpFile("/"+ROOT+"/test5/0.4.0/README.md", CONTENT);

        try {
            new HelpInfrastructureObject(root.toPath());
        } catch (URISyntaxException e) {
            fail(e.getMessage());
        }


    }


}
