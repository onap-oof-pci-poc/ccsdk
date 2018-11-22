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

package org.onap.ccsdk.features.rest.adaptor.utils;

import org.onap.ccsdk.features.rest.adaptor.ConfigRestAdaptorConstants;
import org.onap.ccsdk.features.rest.adaptor.ConfigRestAdaptorException;
import org.onap.ccsdk.features.rest.adaptor.service.ConfigRestAdaptorServiceImpl;

@SuppressWarnings("squid:S2187")
public class RestTemplateFactoryTest {

    public static void main(String[] args) {

        String propertyFile = RestTemplateFactoryTest.class.getClassLoader().getResource(".").getPath();
        System.out.println(" Property : " + propertyFile);

        try {
            ConfigRestAdaptorServiceImpl configRestAdaptorServiceImpl = new ConfigRestAdaptorServiceImpl(propertyFile);
            String restconfResponse = genericRestGetMDSALOperation(args, configRestAdaptorServiceImpl);
            System.out.println("RestTemplateFactoryTest.main Completed with response :" + restconfResponse);
        } catch (ConfigRestAdaptorException e) {
            e.printStackTrace();
        }
    }

    public static String genericRestGetMDSALOperation(String[] args,
            ConfigRestAdaptorServiceImpl configRestAdaptorServiceImpl) throws ConfigRestAdaptorException {
        String path = "config/Dummy-API:services/service-list/dummy-1234";
        String restconfResponse = configRestAdaptorServiceImpl.getResource(ConfigRestAdaptorConstants.SELECTOR_RESTCONF,
                path, String.class);
        return restconfResponse;
    }

}
