/*
 * ============LICENSE_START=======================================================
 * ONAP : CCSDK.apps.sdnr.wt.apigateway
 * ================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property.
 * All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.index.impl;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.EsObject;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDataBaseReaderAndWriter;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseClientAbstract;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseNode;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.util.NetconfTimeStamp;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.EsConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndexCleanService implements AutoCloseable {

	private static final String EVENTLOG_FIELD_TIMESTAMP = "event.timeStamp";
	private static final String FAULTLOG_FIELD_TIMESTAMP = "fault.timeStamp";
	private static final String LOG_FIELD_TIMESTAMP = "timestamp";
	private static final String EVENTLOG_ESDATATYPENAME = "eventlog";
	private static final String FAULTLOG_ESDATATYPENAME = "faultlog";
	private static final String LOG_ESDATATYPENAME = "log";
	private static final String INDEX_EVENTSERVICE_INDEX = "sdnevents";

	private static final Logger LOG = LoggerFactory.getLogger(IndexCleanService.class);
	
	private final EsConfig config;
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	private final HtDataBaseReaderAndWriter<EsObject> enventlogRW;
	private final HtDataBaseReaderAndWriter<EsObject> faultlogRW;
	private final HtDataBaseReaderAndWriter<EsObject> logRW;
    
	public IndexCleanService(EsConfig config,HtDatabaseNode htDatabase) {
		this.config = config;
		this.enventlogRW=new HtDataBaseReaderAndWriter<>(new HtDatabaseClientAbstract(INDEX_EVENTSERVICE_INDEX,htDatabase), EVENTLOG_ESDATATYPENAME, EsObject.class);
		this.faultlogRW=new HtDataBaseReaderAndWriter<>(new HtDatabaseClientAbstract(INDEX_EVENTSERVICE_INDEX,htDatabase), FAULTLOG_ESDATATYPENAME, EsObject.class);
		this.logRW=new HtDataBaseReaderAndWriter<>(new HtDatabaseClientAbstract(IndexMwtnService.INDEX,htDatabase), LOG_ESDATATYPENAME, EsObject.class);
		if (this.config.getArchiveInterval() > 0) {
			this.scheduler.scheduleAtFixedRate(doClean, this.config.getArchiveInterval(),
					this.config.getArchiveInterval(), TimeUnit.SECONDS);
		}
	}

	private final Runnable doClean = new Runnable() {

		@Override
		public void run() {
			try {
			long time = System.currentTimeMillis()-IndexCleanService.this.config.getArchiveLimit()*1000;
			LOG.debug("cleaning logs from entries older than {}",new Date(time).toString());
			
			if (IndexCleanService.this.hasEntriesOlderThan(IndexCleanService.this.enventlogRW,EVENTLOG_FIELD_TIMESTAMP,time)) {
				IndexCleanService.this.removeEntriesOlderThan(IndexCleanService.this.enventlogRW,EVENTLOG_FIELD_TIMESTAMP,time);
			}
			else {
				LOG.debug("no items to remove in {}",IndexCleanService.this.enventlogRW.getDataTypeName());
			}
			if (IndexCleanService.this.hasEntriesOlderThan(IndexCleanService.this.faultlogRW,FAULTLOG_FIELD_TIMESTAMP,time)) {
				IndexCleanService.this.removeEntriesOlderThan(IndexCleanService.this.faultlogRW,FAULTLOG_FIELD_TIMESTAMP,time);
			}
			else {
				LOG.debug("no items to remove in {}",IndexCleanService.this.faultlogRW.getDataTypeName());
			}
			if (IndexCleanService.this.hasEntriesOlderThan(IndexCleanService.this.logRW,LOG_FIELD_TIMESTAMP,time)) {
				IndexCleanService.this.removeEntriesOlderThan(IndexCleanService.this.logRW,LOG_FIELD_TIMESTAMP,time);
			}
			else {
				LOG.debug("no items to remove in {}",IndexCleanService.this.logRW.getDataTypeName());
			}
			}
			catch(Exception e) {
				LOG.warn("problem executing dbclean",e);
			}

		}
	};

	private void removeEntriesOlderThan(HtDataBaseReaderAndWriter<EsObject> dbrw, String field, long millis) {
		QueryBuilder query = new RangeQueryBuilder(field).lt(NetconfTimeStamp.getConverter().getTimeStampAsNetconfString(millis));
		int r=dbrw.doRemoveByQuery(query);
		if(r>0) {
			LOG.info("removed {} objects from {}",r,dbrw.getDataTypeName());
		}
		else {
			LOG.debug("no items were removed from {}. Filter query not correct? {}",dbrw.getDataTypeName(),query.toString());
		}
	}

	private boolean hasEntriesOlderThan(HtDataBaseReaderAndWriter<EsObject> dbrw,String field,long millis) {
		
		List<EsObject> results;
		QueryBuilder query = new RangeQueryBuilder(field).lt(NetconfTimeStamp.getConverter().getTimeStampAsNetconfString(millis));
		results=dbrw.doReadAll(query );
		if(results!=null && results.size()>0)
			return true;
		return false;
	}

	@Override
	public void close() throws Exception {
		this.scheduler.shutdown();
	}

	
}