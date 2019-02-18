/*******************************************************************************
 * ============LICENSE_START========================================================================
 * ONAP : ccsdk feature sdnr wt
 * =================================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property. All rights reserved.
 * =================================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * ============LICENSE_END==========================================================================
 ******************************************************************************/
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database;

import java.io.IOException;
import javax.annotation.Nullable;

import org.elasticsearch.common.bytes.BytesReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * @author Herbert
 *
 */
public class HtMapper<T> {

    private static final Logger log = LoggerFactory.getLogger(HtDatabaseClientAbstract.class);

    private final Class<? extends T> clazz;

    private final JsonMapperBase objectMapperRead;
    private final JsonMapperBase objectMapperWrite;

    private int mappingFailures;


    public HtMapper(Class<? extends T> clazz) {

        this.mappingFailures = 0;
        this.clazz = clazz;

        this.objectMapperRead = new JsonMapperBase();
        this.objectMapperWrite = this.objectMapperRead;
    }

    public Class<? extends T> getClazz() {
        return clazz;
    }

    public int getMappingFailures() {
        return mappingFailures;
    }

    public String objectToJson( T object ) {
        return objectMapperWrite.objectToJson(object);
    }

    /**
     * Do the mapping from Json to class
     * Block further mapping if there is are to many failures
     * @param json String with Objects JSON representation
     * @return The Object
     */
    public @Nullable T getObjectFromJson(byte[] json) {

        if (json == null) {
            return null;
        } else if (mappingFailures < 10) {
            try {
                T object = objectMapperRead.readValue(json, clazz);
                return object;
            } catch (JsonParseException e) {
                mappingFailures++;
                log.warn(e.toString());
            } catch (JsonMappingException e) {
                mappingFailures++;
                log.warn(e.toString());
            } catch (IOException e) {
                mappingFailures++;
                log.warn(e.toString());
            } catch (Exception e) {
                mappingFailures++;
                log.warn(e.toString());
            }
        }
        log.warn("Problems parsing : {} {}", clazz, json);
        return null;
    }

    /**
     * Do the mapping from Json to class
     * Block further mapping if there is are to many failures
     * @param json Byte array with JSON Object representation
     * @return The Object
     */
    public @Nullable T getObjectFromJson(BytesReference json) {

        return json == null ? null : getObjectFromJson(json.toBytes());

    }

}
