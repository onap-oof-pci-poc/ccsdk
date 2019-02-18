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
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.action.admin.indices.alias.IndicesAliasesResponse;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequestBuilder;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsResponse;
import org.elasticsearch.action.admin.indices.mapping.put.PutMappingResponse;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.bytes.BytesReference;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Herbert
 *
 */
public class HtDatabaseClientAbstract implements HtDataBase, AutoCloseable {

    private final Logger log = LoggerFactory.getLogger(HtDatabaseClientAbstract.class);

    private final Client client;
    private String esIndexAlias;

    /**
     * Simple database initialization. Query all ES configuration information from cluster node.
     *
     * @param esIndex Database index
     * @param database database node descriptor
     */
    public HtDatabaseClientAbstract(String esIndex, @Nonnull HtDatabaseNode database) {

        this.esIndexAlias = esIndex;
        this.client = database.getClient();
    }


    /*----------------------------------
     * some constructing functions, used by public constructors
     */


    /*----------------------------------
     * Getter / Setter
     */

    @Override
    public String getNetworkIndex() {
        return esIndexAlias;
    }

    @Override
    public void setNetworkIndex(String es_index) {
        this.esIndexAlias = es_index;
    }

    @Override
    public Client getClient() {
        return client;
    }

    /*----------------------------------
     * Functions
     */

    /**
     * Close function
     */
    @Override
    public void close() {
        client.close();
    }

    /**
     * Verify if index already created
     *
     * @return boolean accordingly
     */
    public boolean isExistsIndex() {

        if (esIndexAlias == null) {
            throw new IllegalArgumentException("Missing Index");
        }

        log.debug("Check status of ES index: {}", esIndexAlias);

        final IndicesExistsResponse indexStatus =
                client.admin().indices().prepareExists(esIndexAlias).execute().actionGet();

        return indexStatus.isExists();

    }


    /**
     * Create and write the mapping and setting of the index
     *
     * @param jsonIndexMappingSetting with mapping and setting definition Object or null for no
     *        configuration
     */
    public void doCreateIndexWithMapping(JSONObject jsonIndexMappingSetting) {

        if (esIndexAlias == null) {
            throw new IllegalArgumentException("Missing Index");
        }

        try {
            // Create index with mapping and setting
            String esIndexName = esIndexAlias + "_v1";
            log.debug("Create not existing ES index: {} with alias:{}", esIndexName, esIndexAlias);

            doCreateIndexWithMappingsAndSettings(esIndexName, jsonIndexMappingSetting);

            // Set Alias
            log.debug("Set alias {} to index {}", esIndexAlias, esIndexName);
            IndicesAliasesResponse setAliasResponse =
                    client.admin().indices().prepareAliases().addAlias(esIndexName, esIndexAlias).execute().actionGet();
            log.debug("CreateIndex response {}", setAliasResponse);

        } catch (ElasticsearchException e) {
            log.warn("ElasticsearchException: {}", e.getDetailedMessage());
        }
    }


    /**
     * Assign each mapping in the mappings section as separate mapping entry
     *
     * @param createIndexRequestBuilder builder for command to ES
     * @param jsonIndexMappingSetting json with mapping information
     */
    private void doCreateIndexWithMappingsAndSettings(String esIndexName, JSONObject jsonIndexMappingSetting) {

        CreateIndexRequestBuilder createIndexRequestBuilder = client.admin().indices().prepareCreate(esIndexName);
        if (createIndexRequestBuilder == null) {
            throw new HtDatabaseClientException("No client. Can not create index.", esIndexAlias);
        }

        if (jsonIndexMappingSetting != null) {
            try {
                doAddMappings(createIndexRequestBuilder, jsonIndexMappingSetting);
                doAddSetting(createIndexRequestBuilder, jsonIndexMappingSetting);
                log.debug(" doCreateIndexWithMapping");
            } catch (RuntimeException e) {
                log.info("Exception during adding mappings or settings to CreateIndexRequestBuilder. ", e);
            }
        }

        CreateIndexResponse createResponse = createIndexRequestBuilder.execute().actionGet();
        log.debug("CreateIndex response {}", createResponse);
    }

    /**
     * Add one or more mappings to command
     *
     * @param createIndexRequestBuilder to add parameters
     * @param jsonIndexMappingSetting contains mapping and setting information
     */
    private void doAddMappings(CreateIndexRequestBuilder createIndexRequestBuilder,
            JSONObject jsonIndexMappingSetting) {

        // If there are json information .. verify if they contain mappings
        JSONObject jsonMapping = jsonIndexMappingSetting.optJSONObject("mappings");

        // Handle optional mappings if requested
        if (jsonMapping != null) {
            log.debug("Set mapping for index {} {}", esIndexAlias, jsonMapping);

            // For any reason the function below was not working without iterator
            Set<String> keys = getStringKeySet(jsonMapping);
            if (log.isDebugEnabled()) {
                log.debug("Found length: {} keys: {}", jsonMapping.length(), keys.size());
            }

            for (String docType : keys) {
                JSONObject jsonObject = jsonMapping.getJSONObject(docType);
                if (jsonObject != null) {
                    String jsonObjectString = jsonObject.toString();
                    log.debug("Doctype:{} mapping:{}", docType, jsonObjectString);
                    createIndexRequestBuilder.addMapping(docType, jsonObjectString);
                    log.debug("Mapping created Doctype:{}", docType);
                } else {
                    log.debug("No jsonObject for docType {}", docType);
                }
            }
        } else {
            log.debug("No mapping requested for index {}", esIndexAlias);
        }
    }

    /**
     * Add one setting to command
     *
     * @param createIndexRequestBuilder to add parameters
     * @param jsonIndexMappingSetting contains mapping and setting information
     */
    private void doAddSetting(CreateIndexRequestBuilder createIndexRequestBuilder, JSONObject jsonIndexMappingSetting) {
        // Handle optional settings if requested
        log.debug("Handle settings");
        JSONObject jsonSettings = jsonIndexMappingSetting.optJSONObject("settings");
        if (jsonSettings != null) {
            log.debug("Set setting for index {} {}", esIndexAlias, jsonSettings);
            createIndexRequestBuilder.setSettings(Settings.settingsBuilder().loadFromSource(jsonSettings.toString()));
        } else {
            log.debug("No settings requested for index {}", esIndexAlias);
        }
    }

    /**
     * Create Index with alias according to definition, but no mapping
     */
    public void doCreateIndex() {
        doCreateIndexWithMapping(null);
    }

    /**
     * Write a JSON mapping definition for a document from a file to ES Hint: A later change of the
     * mapping is not possible.
     *
     * @param jsonString String with mapping definition in JSON Format
     */

    public void doWriteMappingJson(String jsonString) {

        if (esIndexAlias == null) {
            throw new IllegalArgumentException("Missing Index");
        }
        if (jsonString == null) {
            String s = "Mapping string parameter is null";
            log.warn(s);
            throw new IllegalArgumentException(s);
        }

        try {
            // MAPPING GOES HERE
            log.debug("Check status of ES index: {}", esIndexAlias);

            final IndicesExistsResponse indexStatus =
                    client.admin().indices().prepareExists(esIndexAlias).execute().actionGet();

            if (indexStatus.isExists()) {
                log.debug("ES index exists: {}", esIndexAlias);
                // A change of mapping is not working. This here works only for new datatypes

                PutMappingResponse res = client.admin().indices().preparePutMapping(esIndexAlias).setSource(jsonString)
                        .execute().actionGet();
                if (log.isDebugEnabled()) {
                    log.debug("Result: {}", res);
                }

            } else {
                log.debug("Create not existing ES index: {}", esIndexAlias);

                CreateIndexRequestBuilder createIndexRequestBuilder =
                        client.admin().indices().prepareCreate(esIndexAlias);
                createIndexRequestBuilder.addMapping(jsonString).execute().actionGet();
            }

        } catch (ElasticsearchException e) {
            log.warn(e.getDetailedMessage());
        }
    }

    /**
     * Write a Json mapping definition for a document from a file to ES
     *
     * @param fileName Filename with json definition.
     */
    public void doWriteMappingFromFile(String fileName) {


        log.info("Write mapping from File: {}", fileName);

        if (esIndexAlias == null) {
            throw new IllegalArgumentException("Missing Index");
        }

        if (fileName == null) {
            log.warn("No mapping for {} specified in parameter file.", esIndexAlias);
            return;
        }

        String content = null;

        try {
            content = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        } catch (IOException e1) {
            log.warn("Problem with file {}: {}", fileName, e1.getMessage());
        }

        doWriteMappingJson(content);

    }

    /**
     * Write list with json objects from json files
     *
     * @param docTypeAndFileName List with 2 String Array. String[0] Contains the dataType name
     *        String[1] Contains the filename
     */
    public void doWriteJsonFiles(List<String[]> docTypeAndFileName) {

        if (docTypeAndFileName != null) {
            log.debug("Write number of JSONFiles: {}", docTypeAndFileName.size());
            int t = 1;
            for (String[] s : docTypeAndFileName) {
                if (s.length == 2) {
                    writeJsonObjectsFromFile(s[0], s[1]);
                } else {
                    log.warn("Wrong parameters number. Entry: {}", t);
                }
                t++;
            }
        }
    }

    /**
     * Write one object into Database
     *
     * @param esId Database index
     * @param dataTypeName Name of datatype
     * @param json String in JSON format.
     * @return esId of the object
     */
    @Override
    public String doWriteJsonString(String dataTypeName, IsEsObject esId, String json) {
        return doWriteByteArray(dataTypeName, esId, json.getBytes());
    }

    /**
     * Write one object into Database
     *
     * @param esId Database index
     * @param dataTypeName Name of datatype
     * @param json String in JSON format.
     * @return esId of the object
     */

    @Override
    public String doWriteByteArray(String dataTypeName, IsEsObject esId, byte[] json) {
        return doWriteRaw(dataTypeName, esId.getEsId(), json);
    }

    /**
     * Write one object into Database
     *
     * @param dataTypeName Name of datatype
     * @param id id of the object or null
     * @param json Object as json
     * @return esId of the Object
     */
    public String doWriteJsonObject(String dataTypeName, String id, JSONObject json) {
        return doWriteRaw(dataTypeName, id, json.toString().getBytes());
    }

    /**
     * Write one object into Database
     *
     * @param esId Database index or null
     * @param dataTypeName Name of datatype
     * @param json String in JSON format.
     * @return esId of the object
     */

    public String doWriteRaw(String dataTypeName, String esId, byte[] json) {

        if (esIndexAlias == null) {
            throw new IllegalArgumentException("Missing Index");
        }

        IndexRequestBuilder request = esId == null || esId.isEmpty() ? client.prepareIndex(esIndexAlias, dataTypeName)
                : client.prepareIndex(esIndexAlias, dataTypeName, esId);

        IndexResponse response = null;
        try {
            response = request.setSource(json).execute().actionGet();
        } catch (ElasticsearchException e) {
            log.warn("ES Exception {} Json: {}", e.getMessage(), new String(json));
        }

        if (response == null) {
            String jsonString = new String(json);
            log.warn("Response null during write: {} {}", esId, jsonString);
            return null;
        } else {
            return response.getId();
        }
    }

    /**
     * Write JSON Data. First level contains datatype, next level id Example "datatype" : { "id" : { } }
     * @param json Object
     */
    public void doWriteJSONObject(JSONObject json) {

        Set<String> docTypes = getStringKeySet(json);
        log.debug("Found number of keys: {} keys: {}", json.length(), docTypes.size());
        for (String docType : docTypes) {
            JSONObject objects = json.optJSONObject(docType);
            if (objects == null) {
                log.debug("Skip json {} with class {}", docType, json.get(docType).getClass());
            } else {
                doWriteJsonObjectsWithIds(docType, objects);
            }
        }
    }

    /**
     * Write object and Id of object for a doctype
     * @param docType of the objects
     * @param objects a bunch of objects with ids as object name
     */
    private void doWriteJsonObjectsWithIds(String docType, JSONObject objects) {
        Set<String> ids = getStringKeySet(objects);
        log.debug("write doctype {} with elements {}", docType, ids.size());
        for (String id : ids) {
            JSONObject jsonIdObject = objects.optJSONObject(id);
            if (jsonIdObject == null) {
                log.debug("Skip jsonsub {} with class {}", id, objects.get(id).getClass());
            } else {
                if (log.isTraceEnabled()) {
                    log.trace("Jsonsub object of id {} '{}'", id, jsonIdObject);
                }
                this.doWriteRaw(docType, id, jsonIdObject.toString().getBytes());
            }
        }
    }

    /**
     * Remove Object from database
     */
    @Override
    public boolean doRemove(String dataTypeName, IsEsObject esId) {

        if (esIndexAlias == null) {
            throw new IllegalArgumentException("Missing Index");
        }

        DeleteResponse response =
                client.prepareDelete(esIndexAlias, dataTypeName, esId.getEsId()).execute().actionGet();

        return response.isFound();
    }

    /**
     * Read Json Object from database
     */
    @Override
    public @Nullable BytesReference doReadJsonData(String dataTypeName, IsEsObject esId) {

        if (esId.getEsId() == null) {
            throw new IllegalArgumentException("Read access to object without database Id");
        }

        return doReadJsonData(dataTypeName, esId.getEsId());
    }

    /**
     * Read Json Object from database
     */
    @Override
    public @Nullable BytesReference doReadJsonData(String dataTypeName, String esId) {

        log.debug("NetworkIndex read: {}", esIndexAlias);

        GetResponse response = client.prepareGet(esIndexAlias, dataTypeName, esId)
                // .setOperationThreaded(false)
                .execute().actionGet();

        return response.isExists() ? response.getSourceAsBytesRef() : null;
    }


    @Override
    public SearchHit[] doReadByQueryJsonData(int start, int length, String dataTypeName, QueryBuilder qb) {

        log.debug("NetworkIndex query and read: {}", esIndexAlias);

        SearchResponse response1 = client.prepareSearch(esIndexAlias).setTypes(dataTypeName).setQuery(qb).setFrom(start)
                .setSize(length).execute().actionGet();

        return response1.getHits().hits();
    }


    @Override
    public SearchHit[] doReadAllJsonData(int start, int length, String dataTypeName) {
        // Use query
        QueryBuilder qb = QueryBuilders.matchAllQuery();
        return doReadByQueryJsonData(start, length, dataTypeName, qb);
    }

    /**
     * Write Json datetype that is specified by file to ES
     *
     * @param dataType ES Datatype name
     * @param fileName file name
     */
    public void writeJsonObjectsFromFile(String dataType, String fileName) {

        log.debug("Start: Index: '{}' ' datatype: '{}'  File: '{}'", esIndexAlias, dataType, fileName);

        String content = null;

        try {
            content = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        } catch (IOException e1) {
            log.warn("Can not read file: {}", e1.getMessage());
        }

        if (content != null && content.charAt(0) == 0xfeff) {
            content = content.substring(1);
            log.debug("Delete first char {} {}", dataType, fileName);
        }

        if (content != null) {
            IndexResponse response = null;
            try {
                response = client.prepareIndex(esIndexAlias, dataType).setSource(content).execute().actionGet();
            } catch (ElasticsearchException e) {
                log.error("ElasticsearchException during write:  for {} from {} from {}", e.getMessage(), dataType, fileName);
            } catch (Exception e) {
                log.error("Exception during write:  for {} from {} from {}", e.getMessage(), dataType, fileName);
            }

            if (response != null) {
                if (!response.isCreated()) {
                    String responseAsString = response.toString();
                    log.warn("Jackson Response not created: {} {} {}", dataType, fileName, responseAsString);
                } else {
                    log.debug("Created: {}", response.getId());
                }
            } else {
                log.warn("Jackson Response null after write {} {}", dataType, fileName);
            }
        }

    }

    @Override
    public void closeDb() {
        if (client != null) {
            client.close();
        }
    }


    // For any reason the function json.keySet() was not working in Oxygen => replaced by iterator
    public static @Nonnull Set<String> getStringKeySet(JSONObject json) {
        Set<String> keys = new HashSet<>();
        Iterator<?> iterator = json.keys();
        while (iterator.hasNext()) {
            keys.add((String) iterator.next());
        }
        return keys;
    }


    private static class HtDatabaseClientException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public HtDatabaseClientException(String string, String esIndexAlias) {
            super(string + " Effected index: " + "esIndexAlias");
        }
    }

}
