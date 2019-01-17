package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.wrapperc;

import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.AttributeValueChangedNotificationXml;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ObjectCreationNotificationXml;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ObjectDeletionNotificationXml;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ProblemNotificationXml;

/**
 * Abstraction of YANG specified notifications
 * Each method converts from internal specific class to model unspecific class
 * @author herbert
 *
 */
public interface OnfMicrowaveModelNotification {

	void onObjectCreationNotification(ObjectCreationNotificationXml notificationXml);
    void onObjectDeletionNotification(ObjectDeletionNotificationXml notificationXml);
    void onProblemNotification(ProblemNotificationXml notificationXml);
    void onAttributeValueChangedNotification(AttributeValueChangedNotificationXml notificationXml);

}
