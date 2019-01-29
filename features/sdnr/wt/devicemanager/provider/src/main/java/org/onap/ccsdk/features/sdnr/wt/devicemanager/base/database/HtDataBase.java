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

import org.elasticsearch.client.Client;
import org.elasticsearch.common.bytes.BytesReference;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.search.SearchHit;


/**
 * Interface, used by access one object
 * @author Herbert
 *
 */
public interface HtDataBase {

    String getNetworkIndex();
    void setNetworkIndex(String networkIndex);

    Client getClient();
    void closeDb();

    public BytesReference doReadJsonData( String dataTypeName, IsEsObject esId );
    public BytesReference doReadJsonData(String dataTypeName, String esId);
    public SearchHit[] doReadAllJsonData( int start, int length, String dataTypeName );
    public SearchHit[] doReadByQueryJsonData( int start, int length, String dataTypeName, QueryBuilder query);

    public String doWriteByteArray( String dataTypeName, IsEsObject esId, byte[] json);
    public String doWriteJsonString( String dataTypeName, IsEsObject esId, String json);

    public boolean doRemove( String dataTypeName, IsEsObject esId );

}
