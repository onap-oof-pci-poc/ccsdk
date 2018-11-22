/*
 * Copyright © 2017-2018 AT&T Intellectual Property.
 * Modifications Copyright © 2018 IBM.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onap.ccsdk.features.model.utils;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.onap.ccsdk.features.model.data.ArtifactDefinition;
import org.onap.ccsdk.features.model.data.CapabilityAssignment;
import org.onap.ccsdk.features.model.data.NodeTemplate;

public class ServiceTemplateUtilsTest {

    ServiceTemplateUtils serviceTemplateUtils = new ServiceTemplateUtils();

    @Test
    public void testPopulateVnfNodeProperties() {
        NodeTemplate nodeTemplate = createNodeTemplate();

        String nodeTemplateKey = "nodeTemplateKey";
        Map<String, String> context = new HashMap<String, String>();

        Map<String, String> result =
                serviceTemplateUtils.populateVnfNodeProperties(nodeTemplateKey, nodeTemplate, context, null);

        Assert.assertTrue(result.size() > 0);
    }

    @Test
    public void testPopulateNodeTemplateArtifacts() {
        String nodeTemplateKey = "nodeTemplateKey";
        NodeTemplate nodeTemplate = createNodeTemplate();
        Map<String, String> context = new HashMap<String, String>();

        Map<String, String> result =
                serviceTemplateUtils.populateNodeTemplateArtifacts(nodeTemplateKey, nodeTemplate, context);

        Assert.assertTrue(result.size() > 0);
    }

    private NodeTemplate createNodeTemplate() {
        NodeTemplate nodeTemplate = new NodeTemplate();
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("prop1", "value");
        CapabilityAssignment capabilityAssignment = new CapabilityAssignment();
        capabilityAssignment.setProperties(properties);
        Map<String, CapabilityAssignment> capabilities = new HashMap<String, CapabilityAssignment>();
        capabilities.put("key", capabilityAssignment);
        nodeTemplate.setCapabilities(capabilities);

        ArtifactDefinition artifactDefinition = new ArtifactDefinition();
        artifactDefinition.setFile("file");
        artifactDefinition.setDeployPath("deployPath");
        artifactDefinition.setContent("content");
        Map<String, ArtifactDefinition> artifacts = new HashMap<String, ArtifactDefinition>();
        artifacts.put("artifactName1", artifactDefinition);
        nodeTemplate.setArtifacts(artifacts);

        return nodeTemplate;
    }
}
