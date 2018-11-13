package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.rev150105;
import javax.annotation.CheckReturnValue;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;

/**
 * Interface for implementing the following YANG RPCs defined in module <b>websocketmanager</b>
 * <pre>
 * rpc websocket-event {
 *     input {
 *         leaf nodeName {
 *             type string;
 *         }
 *         leaf eventType {
 *             type string;
 *         }
 *         leaf xmlEvent {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *         leaf response {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface WebsocketmanagerService
    extends
    RpcService
{




    @CheckReturnValue
    Future<RpcResult<WebsocketEventOutput>> websocketEvent(WebsocketEventInput input);

}

