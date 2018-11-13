package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Operational parameters for the HRPD portion of a CDMA2000 FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-control-cdma2000-hrpd-g {
 *     leaf op-state {
 *         type boolean;
 *     }
 *     leaf admin-state {
 *         type boolean;
 *     }
 *     leaf rf-tx-status {
 *         type boolean;
 *     }
 *     leaf a13-session-transfer-enable {
 *         type boolean;
 *     }
 *     leaf local-ip-access-enable {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-cdma2000-hrpd-g</i>
 *
 */
public interface FapControlCdma2000HrpdG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-hrpd-g").intern();

    /**
     * Current operational state of the FAP as defined in ITU-X.731 [32]. If {{true}} 
     * the FAP is currently enabled. If {{false}} the FAP is currently disabled.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>opState</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isOpState();
    
    /**
     * Lock or unlock the FAP. This controls the administrative state of the FAP as 
     * defined in ITU-X.731 [32]. If {{true}} Unlocked with permission to serve traffic
     * (and enable RF transmitter(s)). If {{false}} Locked. Transition FAP to state 
     * where it is NOT permitted to serve traffic. RF transmitter is disabled. Given 
     * that this command controls the FAP's RF transmitter, the underlying expectation 
     * is that the unlock is done when all necessary conditions are met to allow the 
     * transmitter to key on and provide service, including aspects such as: location 
     * verification (including meeting the governing regulatory requirements) verifying
     * the FAP configuration if physical tampering is supported and no physical 
     * tampering is detected. The default value after power-on is {{false}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>adminState</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAdminState();
    
    /**
     * Current status of this RF transmitter. {{true}} indicates that the 3G Tx 
     * transmitter is on. {{false}} indicates that the 3G Tx transmitter is off. This 
     * state is tied to the Administrative state which is controlled by the ACS. When 
     * the ACS sets AdminState to {{true}}, then the FAP has permission to turn on the 
     * RF transmitter. When the ACS sets AdminState to {{false}}, then the FAP is not 
     * allowed to provide service and MUST turn off the RF transmitter.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>rfTxStatus</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isRfTxStatus();
    
    /**
     * Indicates whether the FAP performs A13 session transfer. If {{true}} A13 session
     * transfer is enabled; if {{false}} A13 session transfer is disabled.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>a13SessionTransferEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isA13SessionTransferEnable();
    
    /**
     * Indicates whether the FAP can assign local IP address to capable ATs. If 
     * {{true}} local IP address is assigned.; if {{false}} local IP address is not 
     * assigned.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>localIpAccessEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLocalIpAccessEnable();

}

