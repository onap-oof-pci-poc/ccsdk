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

package org.onap.ccsdk.features.model.domain;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.Serializable;
import java.util.Date;

public class ResourceDictionary implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String dataType;
    private String entrySchema;
    private JsonNode definition;
    private String description;
    private String tags;
    private Date creationDate;
    private String updatedBy;

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder("[");
        buffer.append("name = " + name);
        buffer.append(", dataType = " + dataType);
        buffer.append(", entrySchema = " + entrySchema);
        buffer.append(", creationDate = " + creationDate);
        buffer.append("]");
        return buffer.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getEntrySchema() {
        return entrySchema;
    }

    public void setEntrySchema(String entrySchema) {
        this.entrySchema = entrySchema;
    }

    public JsonNode getDefinition() {
        return definition;
    }

    public void setDefinition(JsonNode definition) {
        this.definition = definition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

}
