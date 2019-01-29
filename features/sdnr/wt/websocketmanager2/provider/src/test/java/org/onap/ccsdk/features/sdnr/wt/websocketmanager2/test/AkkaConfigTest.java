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
package org.onap.ccsdk.features.sdnr.wt.websocketmanager2.test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.utils.AkkaConfig;

public class AkkaConfigTest {

    @Test
    public void test() throws URISyntaxException, IOException {

        AkkaConfig config=null;
        try {
            //config = AkkaConfig.load("akka-singlenode.cfg", true);
            config = AkkaConfig.loadContent(loadResourceContentAsString("akka-singlenode.cfg"));
        } catch (Exception e) {
            e.printStackTrace();
            fail("error loading singlenode config");
        }
        assertEquals("no singlenode config detected",false,config.isCluster());
        assertEquals("more than one node detected",1,config.getClusterConfig().getSeedNodes().size());

        try {
            config = AkkaConfig.loadContent(loadResourceContentAsString("akka-cluster.cfg"));
        } catch (Exception e) {
            fail("error loading cluster config");
        }
        assertEquals("no cluster config detected",true,config.isCluster());
        assertTrue("only one node detected",config.getClusterConfig().getSeedNodes().size()>1);
    }

    private String loadResourceContentAsString(String resourceName) throws URISyntaxException, FileNotFoundException, IOException {

        StringBuilder sb = new StringBuilder();

        ClassLoader classLoader = getClass().getClassLoader();
        File file = Paths.get(classLoader.getResource(resourceName).toURI()).toFile();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        }
        return sb.toString();
    }
}
