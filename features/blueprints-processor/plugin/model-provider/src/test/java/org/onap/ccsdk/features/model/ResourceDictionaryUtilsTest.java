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

package org.onap.ccsdk.features.model;

import java.util.Arrays;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.onap.ccsdk.features.model.data.PropertyDefinition;
import org.onap.ccsdk.features.model.data.ResourceAssignment;
import org.onap.ccsdk.features.model.data.dict.ResourceDefinition;
import org.onap.ccsdk.features.model.data.dict.SourcesDefinition;
import org.onap.ccsdk.features.model.data.dict.SourcesProperties;
import org.onap.ccsdk.features.model.utils.ResourceDictionaryUtils;
import com.att.eelf.configuration.EELFLogger;
import com.att.eelf.configuration.EELFManager;

public class ResourceDictionaryUtilsTest {
    private static EELFLogger logger = EELFManager.getInstance().getLogger(ResourceDictionaryUtilsTest.class);

    @Test
    public void validateSingleInputSource() {
        try {
            logger.info(" **************** Validating validateSingleInputSource *****************");
            ResourceAssignment resourceAssignment = new ResourceAssignment();
            resourceAssignment.setName("test-input-key");

            PropertyDefinition propertyDefinition = new PropertyDefinition();
            propertyDefinition.setType(ValidTypes.DATA_TYPE_STRING);

            SourcesProperties sourcesProp = new SourcesProperties();
            sourcesProp.setDependencies(Arrays.asList(new String[] {"vnf-id", "vnf-name"}));

            SourcesDefinition sourceDef = new SourcesDefinition();
            sourceDef.setProperties(sourcesProp);

            HashMap<String, SourcesDefinition> sources = new HashMap<>();
            sources.put("input", sourceDef);

            ResourceDefinition resourceDefinition = new ResourceDefinition();
            resourceDefinition.setProperty(propertyDefinition);
            resourceDefinition.setSources(sources);

            ResourceDictionaryUtils.populateSourceMapping(resourceAssignment, resourceDefinition);

            Assert.assertNotNull("Resource assignment input sourceName is missing ",
                    resourceAssignment.getDictionarySource());
            Assert.assertNotNull("Resource assignment input sourceName property is missing ",
                    resourceAssignment.getProperty());
            Assert.assertNotNull("Resource assignment input sourceName property type is missing ",
                    resourceAssignment.getProperty().getType());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validateSingleDbSource() {
        try {
            logger.info(" **************** Validating validateSingleDbSource *****************");
            ResourceAssignment resourceAssignment = new ResourceAssignment();
            resourceAssignment.setName("test-db-key");

            PropertyDefinition propertyDefinition = new PropertyDefinition();
            propertyDefinition.setType(ValidTypes.DATA_TYPE_STRING);

            SourcesProperties sourcesProp = new SourcesProperties();
            sourcesProp.setDependencies(Arrays.asList(new String[] {"vnf-id", "vnf-name"}));

            SourcesDefinition sourceDef = new SourcesDefinition();
            sourceDef.setProperties(sourcesProp);

            HashMap<String, SourcesDefinition> sources = new HashMap<>();
            sources.put("db", sourceDef);

            ResourceDefinition resourceDefinition = new ResourceDefinition();
            resourceDefinition.setProperty(propertyDefinition);
            resourceDefinition.setSources(sources);

            ResourceDictionaryUtils.populateSourceMapping(resourceAssignment, resourceDefinition);
            Assert.assertNotNull("Resource assignment db sourceName sourceName is missing ",
                    resourceAssignment.getDictionarySource());
            Assert.assertNotNull("Resource assignment db sourceName sourceName property is missing ",
                    resourceAssignment.getProperty());
            Assert.assertNotNull("Resource assignment db sourceName sourceName property type is missing ",
                    resourceAssignment.getProperty().getType());

            Assert.assertNotNull("Resource assignment db dependecy is missing ", resourceAssignment.getDependencies());
            Assert.assertEquals("Resource assignment db dependecy count mismatch ", 2,
                    resourceAssignment.getDependencies().size());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validateMultiSource() {
        try {
            logger.info(" **************** Validating validateMultiSource *****************");
            ResourceAssignment resourceAssignment = new ResourceAssignment();
            resourceAssignment.setName("test-multi-key");

            PropertyDefinition propertyDefinition = new PropertyDefinition();
            propertyDefinition.setType(ValidTypes.DATA_TYPE_STRING);

            SourcesProperties sourcesProp = new SourcesProperties();
            sourcesProp.setDependencies(Arrays.asList(new String[] {"vnf-id", "vnf-name"}));

            SourcesDefinition sourceDef = new SourcesDefinition();
            sourceDef.setProperties(sourcesProp);

            HashMap<String, SourcesDefinition> sources = new HashMap<>();
            sources.put("input", sourceDef);
            sources.put("mdsal", sourceDef);

            ResourceDefinition resourceDefinition = new ResourceDefinition();
            resourceDefinition.setProperty(propertyDefinition);
            resourceDefinition.setSources(sources);

            ResourceDictionaryUtils.populateSourceMapping(resourceAssignment, resourceDefinition);
            Assert.assertNotNull("Resource assignment db sourceName sourceName property is missing ",
                    resourceAssignment.getProperty());
            Assert.assertNotNull("Resource assignment db sourceName sourceName property type is missing ",
                    resourceAssignment.getProperty().getType());
            Assert.assertNull("Resource assignment multi sourceName sourceName definition is present ",
                    resourceAssignment.getDictionarySource());
            Assert.assertNull("Resource assignment  multi sourceName dependecy is present ",
                    resourceAssignment.getDependencies());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSourceDefault() {
        logger.info(" **************** Validating testSourceDefault *****************");
        ResourceAssignment resourceAssignment = new ResourceAssignment();
        resourceAssignment.setName("test-input-key");

        PropertyDefinition propertyDefinition = new PropertyDefinition();
        propertyDefinition.setType(ValidTypes.DATA_TYPE_STRING);

        SourcesProperties sourcesProp = new SourcesProperties();
        sourcesProp.setDependencies(Arrays.asList(new String[] {"vnf-id", "vnf-name"}));

        SourcesDefinition sourceDef = new SourcesDefinition();
        sourceDef.setProperties(sourcesProp);

        HashMap<String, SourcesDefinition> sources = new HashMap<>();
        sources.put("default", sourceDef);

        ResourceDefinition resourceDefinition = new ResourceDefinition();
        resourceDefinition.setProperty(propertyDefinition);
        resourceDefinition.setSources(sources);

        ResourceDictionaryUtils.populateSourceMapping(resourceAssignment, resourceDefinition);

        Assert.assertNotNull("Resource assignment default sourceName is missing ",
                resourceAssignment.getDictionarySource());
        Assert.assertNotNull("Resource assignment default sourceName property is missing ",
                resourceAssignment.getProperty());
        Assert.assertNotNull("Resource assignment default sourceName property type is missing ",
                resourceAssignment.getProperty().getType());
    }

    @Test
    public void testSourceMdsal() {
        logger.info(" **************** Validating testSourceMdsal *****************");
        ResourceAssignment resourceAssignment = new ResourceAssignment();
        resourceAssignment.setName("test-input-key");

        PropertyDefinition propertyDefinition = new PropertyDefinition();
        propertyDefinition.setType(ValidTypes.DATA_TYPE_STRING);

        SourcesProperties sourcesProp = new SourcesProperties();
        sourcesProp.setDependencies(Arrays.asList(new String[] {"vnf-id", "vnf-name"}));

        SourcesDefinition sourceDef = new SourcesDefinition();
        sourceDef.setProperties(sourcesProp);

        HashMap<String, SourcesDefinition> sources = new HashMap<>();
        sources.put("mdsal", sourceDef);

        ResourceDefinition resourceDefinition = new ResourceDefinition();
        resourceDefinition.setProperty(propertyDefinition);
        resourceDefinition.setSources(sources);

        ResourceDictionaryUtils.populateSourceMapping(resourceAssignment, resourceDefinition);

        Assert.assertNotNull("Resource assignment mdsal sourceName is missing ",
                resourceAssignment.getDictionarySource());
        Assert.assertNotNull("Resource assignment mdsal sourceName property is missing ",
                resourceAssignment.getProperty());
        Assert.assertNotNull("Resource assignment mdsal sourceName property type is missing ",
                resourceAssignment.getProperty().getType());
    }

}
