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

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.onap.ccsdk.features.model.ConfigModelConstant;
import org.onap.ccsdk.features.model.data.PropertyDefinition;
import org.onap.ccsdk.features.model.data.ResourceAssignment;
import org.onap.ccsdk.features.model.data.dict.ResourceDefinition;
import org.onap.ccsdk.features.model.data.dict.SourcesDefinition;
import com.att.eelf.configuration.EELFLogger;
import com.att.eelf.configuration.EELFManager;

/**
 * ResourceDictionaryUtils.java Purpose to provide ResourceDictionaryUtils
 *
 * @version 1.0
 */
public class ResourceDictionaryUtils {

    private ResourceDictionaryUtils() {
        // Do nothing
    }

    private static EELFLogger logger = EELFManager.getInstance().getLogger(ResourceDictionaryUtils.class);

    /**
     * This Method is to assign the source name to the Dictionary Definition Check to see if the source
     * definition is not present then assign, if more than one source then assign only one source.
     *
     * @param resourceAssignment
     * @param resourceDefinition
     */
    @SuppressWarnings("squid:S3776")
    public static void populateSourceMapping(ResourceAssignment resourceAssignment,
            ResourceDefinition resourceDefinition) {

        if (resourceAssignment != null && resourceDefinition != null
                && StringUtils.isBlank(resourceAssignment.getDictionarySource())) {

            setProperty(resourceAssignment, resourceDefinition);
            Map<String, SourcesDefinition> sourcesDefinition = resourceDefinition.getSources();

            if (sourcesDefinition != null && MapUtils.isNotEmpty(sourcesDefinition) && sourcesDefinition.size() == 1) {
                if (sourcesDefinition.get("input") != null) {
                    resourceAssignment.setDictionarySource(ConfigModelConstant.SOURCE_INPUT);
                } else if (sourcesDefinition.get("default") != null) {
                    resourceAssignment.setDictionarySource(ConfigModelConstant.SOURCE_DEFAULT);
                } else if (sourcesDefinition.get("db") != null) {
                    resourceAssignment.setDictionarySource(ConfigModelConstant.SOURCE_DB);
                    if (resolve(() -> sourcesDefinition.get("db").getProperties().getDependencies()).isPresent()
                            && CollectionUtils
                                    .isNotEmpty(sourcesDefinition.get("db").getProperties().getDependencies())) {
                        resourceAssignment
                                .setDependencies(sourcesDefinition.get("db").getProperties().getDependencies());
                    }
                } else if (sourcesDefinition.get("mdsal") != null) {
                    resourceAssignment.setDictionarySource(ConfigModelConstant.SOURCE_MDSAL);
                    if (resolve(() -> sourcesDefinition.get("mdsal").getProperties().getDependencies()).isPresent()
                            && CollectionUtils
                                    .isNotEmpty(sourcesDefinition.get("mdsal").getProperties().getDependencies())) {
                        resourceAssignment
                                .setDependencies(sourcesDefinition.get("mdsal").getProperties().getDependencies());
                    }
                }
                logger.info("automapped resourceAssignment : {}", resourceAssignment);
            }
        }
    }

    public static <T> Optional<T> resolve(Supplier<T> resolver) {
        try {
            T result = resolver.get();
            return Optional.ofNullable(result);
        } catch (NullPointerException e) {
            return Optional.empty();
        }
    }

    /**
     * Overriding ResourceAssignment Properties with properties defined in Dictionary
     */
    private static void setProperty(ResourceAssignment resourceAssignment, ResourceDefinition resourceDefinition) {
        if (StringUtils.isNotBlank(resourceDefinition.getProperty().getType())) {
            PropertyDefinition property = resourceAssignment.getProperty();
            if (property == null) {
                property = new PropertyDefinition();
            }
            if (resourceDefinition.getProperty() != null) {
                property.setType(resourceDefinition.getProperty().getType());
                if (resourceDefinition.getProperty().getEntrySchema() != null) {
                    property.setEntrySchema(resourceDefinition.getProperty().getEntrySchema());
                }
                resourceAssignment.setProperty(property);
            }
        }
    }

}
