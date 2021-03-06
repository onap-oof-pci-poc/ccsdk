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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.index.impl;

import java.util.Date;
import org.elasticsearch.index.query.QueryBuilder;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.archiveservice.ArchiveCleanProvider;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDataBaseReaderAndWriter;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseClientAbstract;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseNode;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.IndexClientBuilder;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.util.NetconfTimeStamp;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.index.database.types.EsEventOdluxLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Setup index mwtn in the database
 * @author herbert
 *
 */
public class IndexMwtnService implements AutoCloseable, ArchiveCleanProvider {

    private static final Logger LOG = LoggerFactory.getLogger(IndexMwtnService.class);
    private static final NetconfTimeStamp NETCONFTIME_CONVERTER = NetconfTimeStamp.getConverter();

    /** Index name to be used */
    public static final String INDEX = "mwtn";
    /** Location of mapping data **/
    private static final String MAPPING = "elasticsearch/index/mwtn/mwtnMapping.json";
    /** Location of configuration data **/
    private static final String MODELDATA = "elasticsearch/index/mwtn/modelDescription";

    private final HtDataBaseReaderAndWriter<EsEventOdluxLog> eventRWOdluxLog;


    private final HtDatabaseClientAbstract client;

    // --- Construct and initialize

    public IndexMwtnService(HtDatabaseNode database) throws Exception {
        LOG.info("Create {} start", this.getClass().getSimpleName());


        IndexClientBuilder clientBuilder = IndexClientBuilder.getBuilder(INDEX)
                .setMappingSettingJsonFileName(MAPPING)
                .setModelDataDirectory(MODELDATA);
        client = clientBuilder.create(database);
        clientBuilder.close();

        eventRWOdluxLog = new HtDataBaseReaderAndWriter<>(client, EsEventOdluxLog.ESDATATYPENAME, EsEventOdluxLog.class);

        LOG.info("Create {} finished. DB Service sucessfully started.", this.getClass().getSimpleName());
    }

    /**
     * Get client to be used in other services
     * @return client
     */
    public HtDatabaseClientAbstract getClient() {
        return client;
    }

    /**
     * Write into Odlux log, used by client
     * @param logEntry as test data
     */
    public void writeOdluxEventForTestpurpose(EsEventOdluxLog logEntry) {
        eventRWOdluxLog.doWrite(logEntry);
    }


    @Override
    public void close() throws Exception {
        if (client != null) {
            client.close();
        }
    }

    @Override
    public int doIndexClean(Date olderAreOutdated) {

        String netconfTimeStamp = NETCONFTIME_CONVERTER.getTimeStampAsNetconfString(olderAreOutdated);

        QueryBuilder queryOdluxLog = EsEventOdluxLog.getQueryForTimeStamp(netconfTimeStamp);
        int removed = eventRWOdluxLog.doRemoveByQuery(queryOdluxLog);
        return removed;

    }

    @Override
    public int getNumberOfOldObjects(Date olderAreOutdated) {

        String netconfTimeStamp = NETCONFTIME_CONVERTER.getTimeStampAsNetconfString(olderAreOutdated);
        int numberOfElements = 0;

        QueryBuilder queryOdluxLog = EsEventOdluxLog.getQueryForTimeStamp(netconfTimeStamp);
        numberOfElements += eventRWOdluxLog.doReadAll(queryOdluxLog).size();

        return numberOfElements;
    }
}
