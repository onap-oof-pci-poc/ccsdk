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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import com.fasterxml.jackson.databind.JsonNode;

public class TransformationUtilsTest {

    @Test
    public void testGetJson() {
        Map<String, Object> configparameters = new HashMap<String, Object>();
        configparameters.put("key", "value");
        String json = TransformationUtils.getJson(configparameters);
        assertTrue("{\"key\":\"value\"}".equals(json));
    }

    @Test
    public void testGetJsonNodeForString() {
        String content = "{\"key\":\"value\"}";
        JsonNode jsonNodeForString = TransformationUtils.getJsonNodeForString(content);
        assertNotNull(jsonNodeForString);
    }

    @Test
    public void testGetMapfromJson() {
        String content = "{\"key\":\"value\"}";
        Map<String, Object> mapfromJson = TransformationUtils.getMapfromJson(content);
        assertTrue(mapfromJson.size() == 1);
        assertTrue("value".equals(mapfromJson.get("key")));
    }

    @Test
    public void testGetMapfromJsonString() {
        String content = "{\"key\":\"value\"}";
        Map<String, Object> mapfromJson = TransformationUtils.getMapfromJsonString(content);
        assertTrue(mapfromJson.size() == 1);
        assertTrue("value".equals(mapfromJson.get("key")));
    }

    @Test
    public void testConvertJson2RootProperties() throws Exception {
        Map<String, String> context = new HashMap<String, String>();
        String jsonContent = "{\"key\":\"value\"}";
        Map<String, String> convertJson2RootProperties =
                TransformationUtils.convertJson2RootProperties(context, jsonContent);
        assertTrue(convertJson2RootProperties.size() == 1);
        assertTrue("value".equals(convertJson2RootProperties.get("key")));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testGetJsonNodeAndTreeToValueAndConvertJson2Properties() throws Exception {
        Map<String, String> configparameters = new HashMap<String, String>();
        configparameters.put("key", "value");
        JsonNode jsonNode = TransformationUtils.getJsonNode(configparameters);
        assertNotNull(jsonNode);

        Map<String, String> result = TransformationUtils.treeToValue(jsonNode, HashMap.class);
        assertTrue("value".equals(result.get("key")));

        result = TransformationUtils.convertJson2Properties(null, jsonNode, null);
        assertTrue("value".equals(result.get("key")));
    }

    @Test
    public void testGetJsonSchema() {
        String jsonSchema = TransformationUtils.getJsonSchema(String.class);
        assertNotNull(jsonSchema);
    }
}
