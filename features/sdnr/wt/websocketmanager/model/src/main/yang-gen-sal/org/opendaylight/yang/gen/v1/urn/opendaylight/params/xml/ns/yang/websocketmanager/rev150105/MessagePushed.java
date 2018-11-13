package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.rev150105;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>websocketmanager</b>
 * <pre>
 * notification messagePushed {
 *     leaf message {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>websocketmanager/messagePushed</i>
 *
 * <p>To create instances of this class use {@link MessagePushedBuilder}.
 * @see MessagePushedBuilder
 *
 */
public interface MessagePushed
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.rev150105.MessagePushed>,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:websocketmanager",
        "2015-01-05", "messagePushed").intern();

    /**
     * @return <code>java.lang.String</code> <code>message</code>, or <code>null</code> if not present
     */
    java.lang.String getMessage();

}

