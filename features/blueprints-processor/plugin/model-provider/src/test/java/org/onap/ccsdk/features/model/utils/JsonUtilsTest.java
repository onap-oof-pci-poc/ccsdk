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
import org.junit.Test;
import org.onap.ccsdk.features.model.ValidTypes;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonUtilsTest {

    @Test
    public void testPopulatePrimitiveValues() {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        JsonUtils.populatePrimitiveValues("key1", "value", "", objectNode);
        JsonUtils.populatePrimitiveValues("key2", true, ValidTypes.DATA_TYPE_BOOLEAN, objectNode);
        JsonUtils.populatePrimitiveValues("key3", 1, ValidTypes.DATA_TYPE_INTEGER, objectNode);
        JsonUtils.populatePrimitiveValues("key4", 1.1f, ValidTypes.DATA_TYPE_FLOAT, objectNode);
        JsonUtils.populatePrimitiveValues("key5", "13213123131", ValidTypes.DATA_TYPE_TIMESTAMP, objectNode);

        assertTrue("value".equals(objectNode.get("key1").asText()));
        assertTrue(objectNode.get("key2").asBoolean());
        assertTrue(objectNode.get("key3").asInt() == 1);
        assertTrue(objectNode.get("key4").floatValue() == 1.1f);
        assertTrue("13213123131".equals(objectNode.get("key5").asText()));
    }

    @Test
    public void testPopulatePrimitiveValuesArrayNode() {
        ArrayNode objectNode = JsonNodeFactory.instance.arrayNode();
        JsonUtils.populatePrimitiveValues("value", "", objectNode);
        JsonUtils.populatePrimitiveValues(true, ValidTypes.DATA_TYPE_BOOLEAN, objectNode);
        JsonUtils.populatePrimitiveValues(1, ValidTypes.DATA_TYPE_INTEGER, objectNode);
        JsonUtils.populatePrimitiveValues(1.1f, ValidTypes.DATA_TYPE_FLOAT, objectNode);
        JsonUtils.populatePrimitiveValues("13213123131", ValidTypes.DATA_TYPE_TIMESTAMP, objectNode);

        assertTrue(objectNode.size() == 5);
    }

    @Test
    public void testPopulatePrimitiveDefaultValues() {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        JsonUtils.populatePrimitiveDefaultValues("key1", "", objectNode);
        JsonUtils.populatePrimitiveDefaultValues("key2", ValidTypes.DATA_TYPE_BOOLEAN, objectNode);
        JsonUtils.populatePrimitiveDefaultValues("key3", ValidTypes.DATA_TYPE_INTEGER, objectNode);
        JsonUtils.populatePrimitiveDefaultValues("key4", ValidTypes.DATA_TYPE_FLOAT, objectNode);

        assertTrue("".equals(objectNode.get("key1").asText()));
        assertTrue(objectNode.get("key2").asBoolean() == false);
        assertTrue(objectNode.get("key3").asInt() == 0);
        assertTrue(objectNode.get("key4").floatValue() == 0.0f);
    }

    @Test
    public void testPopulatePrimitiveDefaultValuesForArrayNode() {
        ArrayNode objectNode = JsonNodeFactory.instance.arrayNode();
        JsonUtils.populatePrimitiveDefaultValuesForArrayNode("", objectNode);
        JsonUtils.populatePrimitiveDefaultValuesForArrayNode(ValidTypes.DATA_TYPE_BOOLEAN, objectNode);
        JsonUtils.populatePrimitiveDefaultValuesForArrayNode(ValidTypes.DATA_TYPE_INTEGER, objectNode);
        JsonUtils.populatePrimitiveDefaultValuesForArrayNode(ValidTypes.DATA_TYPE_FLOAT, objectNode);

        assertTrue(objectNode.size() == 4);
    }

    @Test
    public void testPopulateJsonNodeValues() {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        JsonUtils.populateJsonNodeValues("key1", JsonNodeFactory.instance.textNode("value"),
                ValidTypes.DATA_TYPE_STRING, objectNode);
        JsonUtils.populateJsonNodeValues("key2", JsonNodeFactory.instance.booleanNode(true),
                ValidTypes.DATA_TYPE_BOOLEAN, objectNode);
        JsonUtils.populateJsonNodeValues("key3", JsonNodeFactory.instance.numberNode(1), ValidTypes.DATA_TYPE_INTEGER,
                objectNode);
        JsonUtils.populateJsonNodeValues("key4", JsonNodeFactory.instance.numberNode(1.1f), ValidTypes.DATA_TYPE_FLOAT,
                objectNode);
        JsonUtils.populateJsonNodeValues("key5", JsonNodeFactory.instance.textNode("13213123131"),
                ValidTypes.DATA_TYPE_TIMESTAMP, objectNode);
        assertTrue(objectNode.get("key2").asBoolean());

        assertTrue("value".equals(objectNode.get("key1").asText()));
        assertTrue(objectNode.get("key2").asBoolean());
        assertTrue(objectNode.get("key3").asInt() == 1);
        assertTrue(objectNode.get("key4").floatValue() == 1.1f);
        assertTrue("13213123131".equals(objectNode.get("key5").asText()));
    }
}
