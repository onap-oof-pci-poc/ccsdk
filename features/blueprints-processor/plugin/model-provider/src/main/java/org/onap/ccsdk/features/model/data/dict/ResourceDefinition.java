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

package org.onap.ccsdk.features.model.data.dict;

import java.util.Map;
import org.onap.ccsdk.features.model.data.PropertyDefinition;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceDefinition {

    @JsonProperty(value = "name", required = true)
    private String name;

    @JsonProperty(value = "tags")
    private String tags;

    @JsonProperty(value = "property")
    private PropertyDefinition property;

    @JsonProperty(value = "updated-by")
    private String updatedBy;

    @JsonProperty(value = "sources", required = true)
    private Map<String, SourcesDefinition> sourcesDefinition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PropertyDefinition getProperty() {
        return property;
    }

    public void setProperty(PropertyDefinition property) {
        this.property = property;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Map<String, SourcesDefinition> getSources() {
        return sourcesDefinition;
    }

    public void setSources(Map<String, SourcesDefinition> sourcesDefinition) {
        this.sourcesDefinition = sourcesDefinition;
    }

}
