package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.rev150105;
import org.opendaylight.yangtools.yang.binding.NotificationListener;

/**
 * Interface for implementing the following YANG notifications defined in module <b>websocketmanager</b>
 * <pre>
 * notification messagePushed {
 *     leaf message {
 *         type string;
 *     }
 * }
 * </pre>
 *
 */
public interface WebsocketmanagerListener
    extends
    NotificationListener
{




    void onMessagePushed(MessagePushed notification);

}

