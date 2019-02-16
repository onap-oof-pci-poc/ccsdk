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
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseWebAPIClient;

public class ESWebAPITest {

	public static void main(String[] args)
	{
		HtDatabaseWebAPIClient client=new HtDatabaseWebAPIClient();
		try {
			String response=client.sendRequest("/mwtn/mediator-server/_search", "GET", new JSONObject("{\"match\":{\"id\":id}}"));
			System.out.println(response);
		} catch (JSONException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
