package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317;
import org.opendaylight.yangtools.yang.common.RpcResult;
import javax.annotation.CheckReturnValue;
import org.opendaylight.yangtools.yang.binding.RpcService;
import java.util.concurrent.Future;

/**
 * Interface for implementing the following YANG RPCs defined in module <b>devicemanager-api</b>
 * <pre>
 * rpc get-required-network-element-keys {
 *     "Returns a list of netconf nodes for each data store space";
 *     input {
 *     }
 *     
 *     output {
 *         leaf-list mountpoint-names {
 *             type string;
 *         }
 *     }
 * }
 * rpc show-required-network-element {
 *     "Get information for required network element";
 *     input {
 *         leaf mountpoint-name {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *         container required-network-element {
 *             leaf mountpoint-name {
 *                 type string;
 *             }
 *             leaf status {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * rpc test-maintenance-mode {
 *     "Send test pattern similar to notification that are test from algorithm";
 *     input {
 *         leaf mountpoint-name {
 *             type string;
 *         }
 *         leaf object-id-ref {
 *             type string;
 *         }
 *         leaf problem-name {
 *             type string;
 *         }
 *         leaf test-date {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *         leaf result-string {
 *             type string;
 *         }
 *         leaf mountpoint-name {
 *             type string;
 *         }
 *         leaf node-name {
 *             type string;
 *         }
 *         list filter {
 *             container definition {
 *                 leaf object-id-ref {
 *                     type string;
 *                 }
 *                 leaf problem {
 *                     type string;
 *                 }
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf start-date {
 *                 type string;
 *             }
 *             leaf end-date {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * rpc get-maintenance-mode {
 *     "Get maintenance mode Configuration";
 *     input {
 *         leaf mountpoint-name {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *         leaf mountpoint-name {
 *             type string;
 *         }
 *         leaf node-name {
 *             type string;
 *         }
 *         list filter {
 *             container definition {
 *                 leaf object-id-ref {
 *                     type string;
 *                 }
 *                 leaf problem {
 *                     type string;
 *                 }
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf start-date {
 *                 type string;
 *             }
 *             leaf end-date {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * rpc set-maintenance-mode {
 *     "Set maintenance mode for network element";
 *     input {
 *         leaf mountpoint-name {
 *             type string;
 *         }
 *         leaf node-name {
 *             type string;
 *         }
 *         list filter {
 *             container definition {
 *                 leaf object-id-ref {
 *                     type string;
 *                 }
 *                 leaf problem {
 *                     type string;
 *                 }
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf start-date {
 *                 type string;
 *             }
 *             leaf end-date {
 *                 type string;
 *             }
 *         }
 *     }
 *     
 *     output {
 *         leaf mountpoint-name {
 *             type string;
 *         }
 *         leaf node-name {
 *             type string;
 *         }
 *         list filter {
 *             container definition {
 *                 leaf object-id-ref {
 *                     type string;
 *                 }
 *                 leaf problem {
 *                     type string;
 *                 }
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf start-date {
 *                 type string;
 *             }
 *             leaf end-date {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * rpc clear-current-fault-by-nodename {
 *     "try to clear alarms and sync the alarm with the devices currently connected";
 *     input {
 *         leaf-list nodenames {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *         leaf-list nodenames {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface DevicemanagerApiService
    extends
    RpcService
{




    /**
     * Returns a list of netconf nodes for each data store space
     *
     *
     *
     * @return <code>java.util.concurrent.Future</code> <code>requiredNetworkElementKeys</code>, or <code>null</code> if not present
     */
    @CheckReturnValue
    Future<RpcResult<GetRequiredNetworkElementKeysOutput>> getRequiredNetworkElementKeys();
    
    /**
     * Get information for required network element
     *
     */
    @CheckReturnValue
    Future<RpcResult<ShowRequiredNetworkElementOutput>> showRequiredNetworkElement(ShowRequiredNetworkElementInput input);
    
    /**
     * Send test pattern similar to notification that are test from algorithm
     *
     */
    @CheckReturnValue
    Future<RpcResult<TestMaintenanceModeOutput>> testMaintenanceMode(TestMaintenanceModeInput input);
    
    /**
     * Get maintenance mode Configuration
     *
     *
     *
     * @return <code>java.util.concurrent.Future</code> <code>maintenanceMode</code>, or <code>null</code> if not present
     */
    @CheckReturnValue
    Future<RpcResult<GetMaintenanceModeOutput>> getMaintenanceMode(GetMaintenanceModeInput input);
    
    /**
     * Set maintenance mode for network element
     *
     */
    @CheckReturnValue
    Future<RpcResult<SetMaintenanceModeOutput>> setMaintenanceMode(SetMaintenanceModeInput input);
    
    /**
     * try to clear alarms and sync the alarm with the devices currently connected
     *
     */
    @CheckReturnValue
    Future<RpcResult<ClearCurrentFaultByNodenameOutput>> clearCurrentFaultByNodename(ClearCurrentFaultByNodenameInput input);

}

