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
/**
 *
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.ptp.impl;

import java.util.List;

/**
 * Path list with logical-termination-point list
 "path" : [{
  "path-id": "4d778388-41c8-11e7-a919-92ebcb67fe33",
  "path-name": "NE-10-ClockIdentity",
  "layer-protocol-name": "PTP",
  "directionality": "unidirectional",
  "logical-termination-point": [{
    "ltp-reference":"yep",
    "physical-port-reference": "shelf:1-slot:1-Card-port:5",
    "node-reference":"NE-10",
    "site-reference": "site-a",
    "site-name": "GUI-Label",
    "geo-location": {
       "longitude": "54.123456",
       "latitude": "13.123456"
    }]
  }]
 * @author herbert
 *
 */
public class Path {

    String pathId;
    String pathName;
    String layperProtocolName;
    String directionality;
    List<LogicalTerminationPoint> logicalTerminationPoints;

}
