/*******************************************************************************
 * ============LICENSE_START=======================================================
 * ONAP : ccsdk feature sdnr wt
 *  ================================================================================
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
 ******************************************************************************/
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test.dcaeConnector;

import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.DcaeConfig;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.dcaeConnector.impl.DcaeMessages;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.dcaeConnector.impl.DcaeSenderImpl;

public class DcaeTestClient {

    private static final boolean TESTCOLLECTOR_YES = true;

    public static void main(String[] args) {

        System.out.println("Test program to verify DCAE https connectivity");

        //Get configuration
        DcaeConfig configuration = DcaeConfig.getDefaultConfiguration();

        if (configuration != null) {

            //Start services
            System.out.println("Configuration: "+configuration);

            DcaeSenderImpl dcaeClient = new DcaeSenderImpl(configuration.getEventReveicerUrl(), configuration.getUserCredentials());

            if (TESTCOLLECTOR_YES) {
                System.out.println("Connect to testclient and send notifications");

                DcaeMessages dcaeMessages = new DcaeMessages(dcaeClient, "ControllerName", 31, null);

                for (int t=0; t < 2; t++) {
                    try {
                        Thread.sleep(1000);                 //1000 milliseconds is one second.
                    } catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println(t+". Send notification and receive answer message");
                    System.out.println("Heartbeat message: "+dcaeMessages.postHeartBeat());
                    System.out.println("Status of ECOMP Client: "+dcaeClient.getStatusAsString());
                }

            } else {

                System.out.println("Connect to server and receive initial answer.");
                System.out.println("Message: "+dcaeClient.testConnectServer());

            }

        }
   }

}
