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

import org.junit.Assert;
import org.junit.Test;
import com.fasterxml.jackson.databind.JsonNode;

public class JsonParserUtilsTest {

    @Test
    public void testParse() {
        final String jsonExample = "{\"key\":\"value\"}";

        JsonNode rootJsonNode = JsonParserUtils.parse(jsonExample, "$");
        Assert.assertEquals(jsonExample, rootJsonNode.toString());

        JsonNode keyJsonNode = JsonParserUtils.parse(rootJsonNode, "$['key']");
        Assert.assertEquals("value", keyJsonNode.asText());

        Assert.assertEquals(jsonExample,
                JsonParserUtils.parseNSet("{\"key\":\"NOT_VALUE\"}", "$['key']", keyJsonNode).toString());

        rootJsonNode = JsonParserUtils.parse("{\"key\":\"NOT_VALUE\"}", "$");
        Assert.assertEquals(jsonExample, JsonParserUtils.parseNSet(rootJsonNode, "$['key']", keyJsonNode).toString());
    }

}
