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
import java.util.HashMap;
import java.util.Map;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.http.BaseHTTPClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.http.BaseHTTPResponse;

/*
 * base... baseURL, e.g. http://10.10.55.11:8432/api/paut/
 *
 * usage: this.sendRequest()
 * 		uri... all after the baseURL => request-url=base+uri
 *		headers: https://developer.mozilla.org/de/docs/Web/HTTP/Headers
 *
 */
public class ExampleHttpClient extends BaseHTTPClient{

	private final String username;
	private final String password;

	/*
	 * for normal http request without ssl client certificate authorization
	 */
	public ExampleHttpClient(String base, boolean trustAllCerts,String user,String passwd)
	{
		super(base,trustAllCerts);
		this.username=user;
		this.password=passwd;
		int timeout=60000;//http timeout in ms
		this.setTimeout(timeout);


	}
	/*
	 * for client cert authorization
	 */
	public ExampleHttpClient(String base, boolean trustAllCerts, String certFilename, String passphrase,
			int sslCertType) {
		super(base, trustAllCerts, certFilename, passphrase, sslCertType);
		this.username="";
		this.password="";

	}


	public void doExamplePost(String param1,int param2) throws IOException
	{
		String uri="network/pnf/id";
		String method="GET";
		String body=String.format("{\"param1\":\"%s\",\"param1\":%d}",param1,param2);
		Map<String, String> headers = new HashMap<String,String>();
		headers.put("Accept-Encoding", "utf-8");
		headers.put("Authorization", BaseHTTPClient.getAuthorizationHeaderValue(this.username, this.password));
		BaseHTTPResponse response=this.sendRequest(uri, method, body, headers );

		if(response.code==BaseHTTPResponse.CODE200)
		{

		}


	}
}
