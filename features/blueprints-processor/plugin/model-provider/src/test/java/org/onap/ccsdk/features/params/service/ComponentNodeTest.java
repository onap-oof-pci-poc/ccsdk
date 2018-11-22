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

import static org.mockito.Matchers.any;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.testing.mock.osgi.MockOsgi;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.onap.ccsdk.features.data.adaptor.domain.TransactionLog;
import org.onap.ccsdk.features.data.adaptor.service.ConfigResourceService;
import org.onap.ccsdk.features.model.ConfigModelConstant;
import org.onap.ccsdk.features.model.service.ComponentNodeDelegate;
import org.onap.ccsdk.features.model.service.ComponentNodeServiceImpl;
import org.onap.ccsdk.features.model.service.ConfigModelService;
import org.onap.ccsdk.features.model.service.ConfigModelServiceImpl;
import org.onap.ccsdk.features.model.utils.TransformationUtils;
import org.onap.ccsdk.features.rest.adaptor.service.ConfigRestAdaptorService;
import org.onap.ccsdk.sli.core.sli.SvcLogicContext;
import org.onap.ccsdk.sli.core.sli.SvcLogicException;
import org.osgi.framework.BundleContext;
import com.att.eelf.configuration.EELFLogger;
import com.att.eelf.configuration.EELFManager;

@RunWith(MockitoJUnitRunner.class)
public class ComponentNodeTest {
    private static EELFLogger logger = EELFManager.getInstance().getLogger(ComponentNodeTest.class);
    @Mock
    private ConfigResourceService configResourceService;

    @Mock
    private ConfigRestAdaptorService configRestAdaptorService;

    BundleContext bundleContext = MockOsgi.newBundleContext();

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);

        MockComponentNode mockSvcLogicPlugin = new MockComponentNode();
        bundleContext.registerService(MockComponentNode.class, mockSvcLogicPlugin, null);

        try {
            Mockito.doAnswer(new Answer<Void>() {
                @Override
                public Void answer(InvocationOnMock invocationOnMock) throws Throwable {
                    Object[] args = invocationOnMock.getArguments();
                    if (args != null) {
                        logger.trace("Transaction info " + Arrays.asList(args));
                    }
                    return null;
                }
            }).when(configResourceService).save(any(TransactionLog.class));
        } catch (SvcLogicException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @After
    public void after() {

    }

    @Test
    public void testProcess() {

        try {
            String serviceTemplateContent = FileUtils.readFileToString(
                    new File("src/test/resources/componentnode/default.json"), Charset.defaultCharset());
            ConfigModelService configModelService = new ConfigModelServiceImpl(configRestAdaptorService);

            Map<String, String> map = new HashMap<>();
            configModelService.convertServiceTemplate2Properties(serviceTemplateContent, map);

            SvcLogicContext ctx = new SvcLogicContext();
            map.forEach((name, value) -> {
                if (StringUtils.isNotBlank(name) && StringUtils.isNotBlank(value)) {
                    ctx.setAttribute(name, value);
                }
            });
            ctx.setAttribute("vnf-id", "1234");

            ComponentNodeServiceImpl componentNodeService =
                    new ComponentNodeServiceImpl(bundleContext, configResourceService, configRestAdaptorService);

            ComponentNodeDelegate componentNodeDelegate = new ComponentNodeDelegate(componentNodeService);
            Map<String, String> inParams = new HashMap<>();
            inParams.put(ConfigModelConstant.PROPERTY_SELECTOR, "generate-configuration");

            componentNodeDelegate.process(inParams, ctx);
            TransformationUtils.printMap(inParams);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test(expected = SvcLogicException.class)
    public void testFailure() throws Exception {
        ComponentNodeServiceImpl componentNodeService =
                new ComponentNodeServiceImpl(bundleContext, configResourceService, configRestAdaptorService);
        ComponentNodeDelegate componentNodeDelegate = new ComponentNodeDelegate(componentNodeService);

        Map<String, String> inParams = new HashMap<String, String>();
        inParams.put(ConfigModelConstant.PROPERTY_SELECTOR, "generate-configuration");
        SvcLogicContext ctx = new SvcLogicContext();
        componentNodeDelegate.process(inParams, ctx);
    }
}
