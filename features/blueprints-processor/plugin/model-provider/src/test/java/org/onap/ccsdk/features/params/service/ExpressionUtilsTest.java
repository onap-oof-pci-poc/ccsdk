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

package org.onap.ccsdk.features.params.service;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.onap.ccsdk.features.model.utils.ExpressionUtils;
import org.onap.ccsdk.features.model.utils.TransformationUtils;
import org.onap.ccsdk.sli.core.sli.SvcLogicContext;
import com.att.eelf.configuration.EELFLogger;
import com.att.eelf.configuration.EELFManager;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExpressionUtilsTest {
    private static EELFLogger logger = EELFManager.getInstance().getLogger(ExpressionUtilsTest.class);

    @Test
    public void testProcessJsonExpression() throws Exception {
        String fileContent = FileUtils.readFileToString(new File("src/test/resources/properties/default.json"),
                Charset.defaultCharset());

        SvcLogicContext context = new SvcLogicContext();
        context.setAttribute("host-password", "1234");
        context.setAttribute("host-ip-address", "[\"123.23.34.45\", \"123.23.34.45\"]");
        context.setAttribute("loopback-default", "[\"Sample\", \"Brinda\"]");

        Map<String, String> inparams = new HashMap<String, String>();
        ExpressionUtils jsonExpressionUtils = new ExpressionUtils(context, inparams);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootArray = mapper.readTree(fileContent);
        jsonExpressionUtils.processJsonExpression(rootArray);

    }

    @Test
    public void testJson2Property() throws Exception {
        String fileContent = FileUtils.readFileToString(new File("src/test/resources/properties/convert.json"),
                Charset.defaultCharset());

        List<String> blockKeys = new ArrayList<String>();
        blockKeys.add(
                "interfaces.ResourceAssignmentService.operations.getResourceAssignment.inputs.assignment-mappings");
        blockKeys.add("interfaces.ResourceAssignmentService.operations.getResourceAssignment.outputs");
        blockKeys.add("type");

        Map<String, String> workflowMap = new HashMap<>();
        Map<String, String> propertyMap =
                TransformationUtils.convertJson2Properties(workflowMap, fileContent, blockKeys);

        TransformationUtils.printMap(propertyMap);

    }

}
