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

import static org.junit.Assert.assertTrue;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.onap.ccsdk.features.model.ConfigModelConstant;
import org.onap.ccsdk.features.model.ConfigModelException;
import org.onap.ccsdk.features.model.ValidTypes;
import org.onap.ccsdk.features.model.data.PropertyDefinition;
import org.onap.ccsdk.features.model.data.ResourceAssignment;
import org.onap.ccsdk.features.model.data.dict.ResourceDefinition;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ResourceAssignmentUtilsTest {

    @Test
    public void testGetArtifactNodeContent() {
        String nodeTemplateName = "nodeTemplateNmae";
        String templateContent = "content";
        Map<String, Object> context = new HashMap<String, Object>();
        context.put(ConfigModelConstant.PROPERTY_NODE_TEMPLATES_DOT + nodeTemplateName + ".content", templateContent);

        String retrievedContent = ResourceAssignmentUtils.getArtifactNodeContent(nodeTemplateName, context);

        assertTrue(templateContent.equals(retrievedContent));
    }

    @Test
    public void testGetArtifactNodeMapping() {
        String nodeTemplateName = "nodeTemplateNmae";
        String templateContent = "[]";
        Map<String, Object> context = new HashMap<String, Object>();
        context.put(ConfigModelConstant.PROPERTY_NODE_TEMPLATES_DOT + nodeTemplateName + ".mapping", templateContent);

        List<ResourceAssignment> map = ResourceAssignmentUtils.getArtifactNodeMapping(nodeTemplateName, context);
        assertTrue(map.size() == 0);
    }

    @Test
    public void testCleanContextTemplateNDictionaryKeys() {
        String recipeName = "recipe";
        Map<String, Object> componentContext = new HashMap<String, Object>();
        componentContext.put(ConfigModelConstant.PROPERTY_ACTION_NAME, recipeName);
        componentContext.put(ConfigModelConstant.PROPERTY_DICTIONARY_KEY_DOT + recipeName + ".", "value1");
        componentContext.put(ConfigModelConstant.PROPERTY_RECIPE_KEY_DOT + recipeName + ".", "value2");
        ResourceAssignmentUtils.cleanContextTemplateNDictionaryKeys(componentContext);

        assertTrue(componentContext.size() == 1);
    }

    @Test
    public void testGetDictionaryKeyValue() {
        String recipeName = "recipe";
        String dictionaryName = "dictionaryKey";
        Map<String, Object> componentContext = new HashMap<String, Object>();
        componentContext.put(ConfigModelConstant.PROPERTY_ACTION_NAME, recipeName);
        componentContext.put(ConfigModelConstant.PROPERTY_DICTIONARY_KEY_DOT + recipeName + "." + dictionaryName,
                "value1");
        ResourceAssignment resourceAssignment = new ResourceAssignment();
        resourceAssignment.setDictionaryName(dictionaryName);

        String value = (String) ResourceAssignmentUtils.getDictionaryKeyValue(componentContext, resourceAssignment);
        assertTrue("value1".equals(value));
    }

    @Test
    public void testGetDictionaryKeyValueWithDictionaryDefinition() {
        String recipeName = "recipe";
        String dictionaryName = "dictionaryKey";
        Map<String, Object> componentContext = new HashMap<String, Object>();
        componentContext.put(ConfigModelConstant.PROPERTY_ACTION_NAME, recipeName);
        componentContext.put(ConfigModelConstant.PROPERTY_DICTIONARY_KEY_DOT + recipeName + "." + dictionaryName,
                "value1");
        ResourceDefinition resourceDefinition = new ResourceDefinition();
        resourceDefinition.setName(dictionaryName);

        String value = (String) ResourceAssignmentUtils.getDictionaryKeyValue(componentContext, resourceDefinition);
        assertTrue("value1".equals(value));
    }

    @Test
    public void testGetTemplateKeyValue() {
        String recipeName = "recipe";
        String templateKeyName = "templateKey";
        Map<String, Object> componentContext = new HashMap<String, Object>();
        componentContext.put(ConfigModelConstant.PROPERTY_ACTION_NAME, recipeName);
        componentContext.put(ConfigModelConstant.PROPERTY_RECIPE_KEY_DOT + recipeName + "." + templateKeyName,
                "value1");
        ResourceAssignment resourceAssignment = new ResourceAssignment();
        resourceAssignment.setName(templateKeyName);

        String value = (String) ResourceAssignmentUtils.getTemplateKeyValue(componentContext, resourceAssignment);
        assertTrue("value1".equals(value));
    }

    @Test
    public void testSetResourceDataValue() throws Exception {
        String recipeName = "recipe";
        Map<String, Object> componentContext = new HashMap<String, Object>();
        componentContext.put(ConfigModelConstant.PROPERTY_ACTION_NAME, recipeName);

        ResourceAssignment resourceAssignment = createResourceAssignment("name1", ValidTypes.DATA_TYPE_STRING, null);
        Object value = "value";
        ResourceAssignmentUtils.setResourceDataValue(componentContext, resourceAssignment, value);
        assertTrue(value.equals(resourceAssignment.getProperty().getValue()));

        resourceAssignment = createResourceAssignment("name1", ValidTypes.DATA_TYPE_INTEGER, null);
        value = "1";
        ResourceAssignmentUtils.setResourceDataValue(componentContext, resourceAssignment, value);
        assertTrue((int) resourceAssignment.getProperty().getValue() == 1);

        resourceAssignment = createResourceAssignment("name1", ValidTypes.DATA_TYPE_BOOLEAN, null);
        value = "true";
        ResourceAssignmentUtils.setResourceDataValue(componentContext, resourceAssignment, value);
        assertTrue((boolean) resourceAssignment.getProperty().getValue());

        resourceAssignment = createResourceAssignment("name1", ValidTypes.DATA_TYPE_FLOAT, null);
        value = "1.1";
        ResourceAssignmentUtils.setResourceDataValue(componentContext, resourceAssignment, value);
        assertTrue((float) resourceAssignment.getProperty().getValue() == 1.1f);
    }

    @Test
    public void testSetFailedResourceDataValue() throws Exception {
        ResourceAssignment resourceAssignment = createResourceAssignment("name1", ValidTypes.DATA_TYPE_STRING, "value");
        String message = "message";
        ResourceAssignmentUtils.setFailedResourceDataValue(null, resourceAssignment, message);

        assertTrue(message.equals(resourceAssignment.getMessage()));
        assertTrue(ConfigModelConstant.STATUS_FAILURE.equals(resourceAssignment.getStatus()));
    }

    @Test(expected = ConfigModelException.class)
    public void testAssertTemplateKeyValueNotNull() throws Exception {
        Map<String, Object> componentContext = null;
        ResourceAssignment resourceAssignment = createResourceAssignment("name1", ValidTypes.DATA_TYPE_STRING, "value");
        ResourceAssignmentUtils.assertTemplateKeyValueNotNull(componentContext, resourceAssignment);
    }

    @Test
    public void testGenerateResourceDataForAssignments() throws Exception {
        List<ResourceAssignment> assignments = new ArrayList<ResourceAssignment>();
        assignments.add(createResourceAssignment("name1", ValidTypes.DATA_TYPE_STRING, "string"));
        assignments.add(createResourceAssignment("name2", ValidTypes.DATA_TYPE_BOOLEAN, true));
        assignments.add(createResourceAssignment("name3", ValidTypes.DATA_TYPE_INTEGER, 1));
        assignments.add(createResourceAssignment("name4", ValidTypes.DATA_TYPE_FLOAT, 1.1f));
        assignments.add(createResourceAssignment("name5", ValidTypes.DATA_TYPE_TIMESTAMP, "1523908097735"));
        assignments.add(createResourceAssignment("name6", "", new HashMap<String, String>()));
        ResourceAssignmentUtils.generateResourceDataForAssignments(assignments);
    }

    public void testResourceAssignmentForNullEmptyValues() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode raContent =
                mapper.readTree(new File("src/test/resources/service_templates/ra-content-with-mising-value.json"));

        List<ResourceAssignment> assignments =
                mapper.readValue(raContent.toString(), new TypeReference<List<ResourceAssignment>>() {});

        ResourceAssignmentUtils.generateResourceDataForAssignments(assignments);
    }

    private ResourceAssignment createResourceAssignment(String name, String dataType, Object value) {
        PropertyDefinition property = new PropertyDefinition();
        property.setType(dataType);
        property.setValue(value);
        property.setRequired(true);
        ResourceAssignment ra = new ResourceAssignment();
        ra.setName(name);
        ra.setProperty(property);
        return ra;
    }

}
