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

import static org.junit.Assert.fail;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.onap.ccsdk.features.model.ConfigModelConstant;
import org.onap.ccsdk.features.model.data.ServiceTemplate;
import org.onap.ccsdk.features.model.domain.ConfigModel;
import org.onap.ccsdk.features.model.domain.ConfigModelContent;
import org.onap.ccsdk.features.model.service.ConfigModelService;
import org.onap.ccsdk.features.model.service.ConfigModelServiceImpl;
import org.onap.ccsdk.features.rest.adaptor.service.ConfigRestAdaptorService;
import org.onap.ccsdk.sli.core.sli.SvcLogicContext;
import org.onap.ccsdk.sli.core.sli.SvcLogicException;
import com.att.eelf.configuration.EELFLogger;
import com.att.eelf.configuration.EELFManager;

@RunWith(MockitoJUnitRunner.class)
public class ConfigModelServiceTest {

    private static EELFLogger logger = EELFManager.getInstance().getLogger(ConfigModelServiceTest.class);

    @Mock
    private ConfigRestAdaptorService configRestAdaptorService;

    @Test
    public void testConfigAssignmentInputOutputParams() throws Exception {

        String fileContent = FileUtils.readFileToString(
                new File("src/test/resources/service_templates/resource_assignment.json"), Charset.defaultCharset());

        Map<String, String> context = new HashMap<>();
        ConfigModelServiceImpl configModelServiceImpl = new ConfigModelServiceImpl(configRestAdaptorService);
        context = configModelServiceImpl.convertServiceTemplate2Properties(fileContent, context);

        Assert.assertNotNull("Failed to Prepare Context : ", context);

        context.put("request-id", "12345");
        context.put("vnf-id", "vnf12345");

        Map<String, String> inparams = new HashMap<String, String>();
        inparams.put(ConfigModelConstant.PROPERTY_SELECTOR, "resource-assignment");

        SvcLogicContext inputContext = new SvcLogicContext();
        context.forEach((name, value) -> {
            inputContext.setAttribute(name, value);
        });

        // TransformationUtils.printProperty(inputContext.toProperties());

        configModelServiceImpl.assignInParamsFromModel(inputContext, inparams);
        Assert.assertNotNull("In Param is Null : ", inparams);
        Assert.assertNotNull("Failed to get entity-id in Inparms : ", inparams.get("resource-id"));
        Assert.assertEquals("Failed to get entity-id vlaue in Inparms ", String.valueOf("vnf12345"),
                inparams.get("resource-id"));
        Assert.assertNotNull("Failed to get request-id in Inparms : ", inparams.get("request-id"));
        Assert.assertEquals("Failed to get request-id vlaue in Inparms ", String.valueOf("12345"),
                inparams.get("request-id"));

        configModelServiceImpl.assignOutParamsFromModel(inputContext, inparams);
        logger.info("*************** Output Params *************");
        // TransformationUtils.printProperty(inputContext.toProperties());

    }

    @Test
    public void testConvertServiceTemplate2PropertiesComplex() throws Exception {
        String fileContent = FileUtils.readFileToString(
                new File("src/test/resources/service_templates/resource_assignment.json"), Charset.defaultCharset());

        Map<String, String> context = new HashMap<>();
        context.put("host-password", "1234");
        context.put("host-ip-address", "[123.23.34.45, 123.23.34.45]");

        ConfigModelServiceImpl configModelServiceImpl = new ConfigModelServiceImpl(configRestAdaptorService);
        configModelServiceImpl.convertServiceTemplate2Properties(fileContent, context);

        // TransformationUtils.printMap(context);

        Map<String, String> inparams = new HashMap<String, String>();
        inparams.put(ConfigModelConstant.PROPERTY_SELECTOR, "resource-assignment");
        logger.info("Before Input Result: " + inparams);

        SvcLogicContext inputContext = new SvcLogicContext();
        context.forEach((name, value) -> {
            inputContext.setAttribute(name, value);
        });

        configModelServiceImpl.assignInParamsFromModel(inputContext, inparams);
        logger.info("----------Input Result: " + inparams);

        inputContext.setAttribute("assignment-params", "default-assigned");
        configModelServiceImpl.assignOutParamsFromModel(inputContext, inparams);

        // TransformationUtils.printProperty(inputContext.toProperties());

    }

    @Test
    public void testGetNodeTemplateContent() throws Exception {
        String templateContent = "{\"id\":\"id\"}";
        SvcLogicContext context = new SvcLogicContext();
        context.setAttribute(ConfigModelConstant.PROPERTY_NODE_TEMPLATES_DOT + templateContent + ".content",
                templateContent);

        ConfigModelServiceImpl configModelServiceImpl = new ConfigModelServiceImpl(configRestAdaptorService);
        String content = configModelServiceImpl.getNodeTemplateContent(context, templateContent);

        Assert.assertEquals(content, templateContent);
    }

    @Test
    public void testGetNodeTemplateMapping() throws Exception {
        String templateContent = "{\"capabilities\":{\"mapping\":{\"properties\":{\"mapping\":[\"test\"]}}}}";
        SvcLogicContext context = new SvcLogicContext();
        context.setAttribute(ConfigModelConstant.PROPERTY_NODE_TEMPLATES_DOT + templateContent, templateContent);

        ConfigModelServiceImpl configModelServiceImpl = new ConfigModelServiceImpl(configRestAdaptorService);
        configModelServiceImpl.getNodeTemplateMapping(context, templateContent);
        // Assert.assertEquals(content, templateContent);
    }

    @Test
    public void testValidateServiceTemplate() throws Exception {
        ConfigModelServiceImpl configModelServiceImpl = new ConfigModelServiceImpl(configRestAdaptorService);
        ServiceTemplate serviceTemplate = new ServiceTemplate();

        try {
            configModelServiceImpl.validateServiceTemplate(null);
            fail("Should have thrown exception");
        } catch (SvcLogicException e) {
        }

        try {
            configModelServiceImpl.validateServiceTemplate(serviceTemplate);
            fail("Should have thrown exception");
        } catch (SvcLogicException e) {
        }

        Map<String, String> metadata = new HashMap<String, String>();
        metadata.put(ConfigModelConstant.SERVICE_TEMPLATE_KEY_ARTIFACT_AUTHOR, "author");
        metadata.put(ConfigModelConstant.SERVICE_TEMPLATE_KEY_ARTIFACT_NAME, "name");
        metadata.put(ConfigModelConstant.SERVICE_TEMPLATE_KEY_ARTIFACT_VERSION, "version");
        serviceTemplate.setMetadata(metadata);

        Assert.assertTrue(configModelServiceImpl.validateServiceTemplate(serviceTemplate));
    }

    @Test
    public void testPrepareContext() throws Exception {
        Mockito.when(configRestAdaptorService.getResource(Matchers.anyString(), Matchers.anyString(), Matchers.any()))
                .thenReturn(createConfigModel());

        String input = "{\"action-name\": \"resource-assignment-action\"}";
        ConfigModelService configModelService = new ConfigModelServiceImpl(configRestAdaptorService);

        Map<String, String> ctx =
                configModelService.prepareContext(null, input, "serviceTemplateName", "serviceTemplateVersion");
        Assert.assertEquals("resource-assignment-action", ctx.get(ConfigModelConstant.PROPERTY_ACTION_NAME));

        ctx = configModelService.prepareContext(null, input, "{}");
        Assert.assertEquals("resource-assignment-action", ctx.get(ConfigModelConstant.PROPERTY_ACTION_NAME));
    }

    @Test
    public void testConvertServiceTemplate2Properties() throws Exception {
        Map<String, String> metadata = new HashMap<String, String>();
        metadata.put("key", "value");
        ServiceTemplate serviceTemplate = new ServiceTemplate();
        serviceTemplate.setMetadata(metadata);
        Map<String, String> context = new HashMap<String, String>();

        ConfigModelService configModelService = new ConfigModelServiceImpl(configRestAdaptorService);
        Map<String, String> ctx = configModelService.convertServiceTemplate2Properties(serviceTemplate, context);

        Assert.assertEquals("value", ctx.get("key"));
    }

    private ConfigModel createConfigModel() {
        ConfigModel configModel = new ConfigModel();
        List<ConfigModelContent> configModelContents = new ArrayList<ConfigModelContent>();
        ConfigModelContent configModelContent = new ConfigModelContent();
        configModelContent.setContentType(ConfigModelConstant.MODEL_CONTENT_TYPE_TOSCA_JSON);
        configModelContent.setContent("{\"description\": \"description\"}");
        configModelContents.add(configModelContent);
        configModel.setConfigModelContents(configModelContents);
        configModel.setPublished("Y");
        return configModel;
    }
}
