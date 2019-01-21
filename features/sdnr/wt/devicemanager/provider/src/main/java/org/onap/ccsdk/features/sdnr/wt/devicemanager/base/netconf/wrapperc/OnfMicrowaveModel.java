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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.wrapperc;

import java.util.List;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.ONFCOreNetworkElementCoreData;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.container.ONFLayerProtocolName;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ProblemNotificationXml;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.OtnHistoryDataG;
import org.opendaylight.yangtools.yang.binding.NotificationListener;
import org.opendaylight.yangtools.yang.common.QName;

public interface OnfMicrowaveModel {

    public void setCoreData(ONFCOreNetworkElementCoreData coreData);

	public void readTheFaultsOfMicrowaveModel(ONFLayerProtocolName lpName, Class<?> lpClass, UniversalId uuid,
			List<ProblemNotificationXml> resultList);

	public List<? extends OtnHistoryDataG> readTheHistoricalPerformanceData(ONFLayerProtocolName lpName, Lp lp);

	public Class<?> getClassForLtpExtension(QName qName);

	public <T extends NotificationListener> T getNotificationListener();

	public void setOnfMicrowaveModelListener(OnfMicrowaveModelNotification microwaveModelListener);

}
