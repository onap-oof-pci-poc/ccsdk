package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.rev150105;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>websocketmanager</b>
 * <pre>
 * container input {
 *     leaf nodeName {
 *         type string;
 *     }
 *     leaf eventType {
 *         type string;
 *     }
 *     leaf xmlEvent {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>websocketmanager/websocket-event/input</i>
 *
 * <p>To create instances of this class use {@link WebsocketEventInputBuilder}.
 * @see WebsocketEventInputBuilder
 *
 */
public interface WebsocketEventInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.rev150105.WebsocketEventInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:websocketmanager",
        "2015-01-05", "input").intern();

    /**
     * @return <code>java.lang.String</code> <code>nodeName</code>, or <code>null</code> if not present
     */
    java.lang.String getNodeName();
    
    /**
     * @return <code>java.lang.String</code> <code>eventType</code>, or <code>null</code> if not present
     */
    java.lang.String getEventType();
    
    /**
     * @return <code>java.lang.String</code> <code>xmlEvent</code>, or <code>null</code> if not present
     */
    java.lang.String getXmlEvent();

}

