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
public class UntilTest {

	public static void main(String[] args) {

		System.out.println("Test");
        int retry=0, maxRetries=3;
        boolean noErrorIndication=false;

		do {

			if (retry > 0)
				System.out.println("Sleep");
			noErrorIndication = retry == 0;
			System.out.println(retry+ "  " + noErrorIndication);

		} while (noErrorIndication == false && retry++ < maxRetries);

		System.out.println("Done "+noErrorIndication+" "+retry);
	}

}
