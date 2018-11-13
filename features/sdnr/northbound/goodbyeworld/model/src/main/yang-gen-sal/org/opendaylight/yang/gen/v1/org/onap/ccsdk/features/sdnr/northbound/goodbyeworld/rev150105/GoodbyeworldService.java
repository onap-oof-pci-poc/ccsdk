package org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.goodbyeworld.rev150105;
import javax.annotation.CheckReturnValue;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;

/**
 * Interface for implementing the following YANG RPCs defined in module <b>goodbyeworld</b>
 * <pre>
 * rpc greeting {
 *     input {
 *         leaf salutation {
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
public interface GoodbyeworldService
    extends
    RpcService
{




    @CheckReturnValue
    Future<RpcResult<GreetingOutput>> greeting(GreetingInput input);

}

