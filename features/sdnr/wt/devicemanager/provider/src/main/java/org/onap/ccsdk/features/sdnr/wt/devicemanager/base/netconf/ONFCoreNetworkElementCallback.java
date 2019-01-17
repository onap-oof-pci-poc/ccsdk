package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf;

import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.AttributeValueChangedNotificationXml;

public interface ONFCoreNetworkElementCallback {

	public void notificationFromNeListener(AttributeValueChangedNotificationXml notificationXml);

}
