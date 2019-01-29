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

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseNode;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseUpdateFile;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseWebAPIClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseUpdateFile.EsUpdateObject;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseUpdateFile.FileReadCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndexUpdateService implements AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(IndexUpdateService.class);

    protected static final String FILENAME = "etc/elasticsearch_update.zip";

    private final HtDatabaseWebAPIClient webClient;

    private final boolean autoremove=true;

    @SuppressWarnings("unused")
    private ScheduledFuture<?> taskHandle;
    private final ScheduledExecutorService scheduler;
    @SuppressWarnings("unused")
    private final HtDatabaseNode database;

    private final FileReadCallback onReadUpdateFile = new FileReadCallback()
    {
        @Override
        public void read(EsUpdateObject obj,String filename) {
            try {
                IndexUpdateService.this.webClient.sendRequest(obj.Uri, obj.Method, obj.Body);
                LOG.info("run database update file "+filename);
            } catch (IOException e) {
                LOG.warn("problem for request "+obj.Uri);
            }
        }

        @Override
        public void onerror(String filename,IOException e) {
            LOG.warn("problem reading content file "+filename+ " :"+e.getMessage());
        }

    };
    private final Runnable checkForUpdateTask = () -> {
	    File f=new File(FILENAME);
	    if(f.exists())
	    {
	        LOG.debug("found update file "+f.getAbsolutePath());
	        try {
	            HtDatabaseUpdateFile updateFile=new HtDatabaseUpdateFile(FILENAME);
	            if(updateFile.readFiles(onReadUpdateFile))
	            {
	                LOG.info("update successful");
	            }
	            updateFile.close();
	            if(IndexUpdateService.this.autoremove)
	            {
	                LOG.debug("autodelete updatefile");
	                f.delete();
	            }

	        } catch (IOException e) {
	            LOG.warn("problem with update file:"+e.getMessage());
	        }
	    }
	};



    public IndexUpdateService(HtDatabaseNode database, String esNodeserverName, String esClusterName, String esNodeName) {
        this.database = database;
        this.webClient = new HtDatabaseWebAPIClient();
        this.scheduler = Executors.newSingleThreadScheduledExecutor();
    }
    public void start()
    {
        this.taskHandle = this.scheduler.scheduleAtFixedRate(checkForUpdateTask, 0, 120, TimeUnit.SECONDS);
    }
    public void stop()
    {
        this.scheduler.shutdown();
    }
    @Override
    public void close() throws Exception {
        stop();
    }
}
