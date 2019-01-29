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

import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseClientAbstract;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseNode;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.IndexClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Setup index mwtn in the database
 * @author herbert
 *
 */
public class IndexConfigService implements AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(IndexConfigService.class);

    /** Index name to be used */
    private static final String INDEX = "config";
    /** Location of configuration data **/
    private static final String MODELDATA = "/elasticsearch/index/config";

    private HtDatabaseClientAbstract client;

    // --- Construct and initialize

    public IndexConfigService(HtDatabaseNode database) {
    	LOG.info("Create {} start", this.getClass().getSimpleName());

    	IndexClientBuilder clientBuilder = IndexClientBuilder.getBuilder(INDEX).setModelDataDirectory(MODELDATA);
    	client = clientBuilder.create(database);
    	LOG.info("Create {} finished. DB Service {} started.", this.getClass().getSimpleName(),  client != null ? "sucessfully" : "not" );
    }

	@Override
	public void close() throws Exception {
		client.close();
	}

}
