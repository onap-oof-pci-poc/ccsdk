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

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SourcesProperties {

    @JsonProperty(value = "key")
    private String key;

    @JsonProperty(value = "type")
    private String type;

    @JsonProperty(value = "query")
    private String query;

    @JsonProperty(value = "url-path")
    private String urlPath;

    @JsonProperty(value = "expression-type")
    private String expressionType;

    @JsonProperty(value = "path")
    private String path;

    @JsonProperty("input-key-mapping")
    private Map<String, String> inputKeyMapping;

    @JsonProperty("output-key-mapping")
    private Map<String, String> outputKeyMapping;

    @JsonProperty("key-dependencies")
    private List<String> dependencies;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public String getPath() {
        return path;
    }

    public void setExpressionType(String expressionType) {
        this.expressionType = expressionType;
    }

    public String getExpressionType() {
        return expressionType;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Map<String, String> getInputKeyMapping() {
        return inputKeyMapping;
    }

    public void setInputKeyMapping(Map<String, String> inputKeyMapping) {
        this.inputKeyMapping = inputKeyMapping;
    }

    public Map<String, String> getOutputKeyMapping() {
        return outputKeyMapping;
    }

    public void setOutputKeyMapping(Map<String, String> outputKeyMapping) {
        this.outputKeyMapping = outputKeyMapping;
    }

    public List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }

}
