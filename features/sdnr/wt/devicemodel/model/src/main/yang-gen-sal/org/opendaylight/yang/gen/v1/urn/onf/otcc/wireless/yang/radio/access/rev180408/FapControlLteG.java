package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the LTE system specific information.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-control-lte-g {
 *     leaf op-state {
 *         type boolean;
 *     }
 *     leaf admin-state {
 *         type boolean;
 *     }
 *     leaf rf-tx-status {
 *         type boolean;
 *     }
 *     leaf pm-config {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-lte-g</i>
 *
 */
public interface FapControlLteG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-lte-g").intern();

    /**
     * Current operational state of the LTE FAP as defined in {{bibref|ITU-X.731}}. If 
     * {{true}} the LTE FAP is currently enabled. If {{false}} the LTE FAP is currently
     * disabled.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>opState</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isOpState();
    
    /**
     * Lock or unlock the LTE FAP. This controls the administrative state of the LTE 
     * FAP as defined in {{bibref|ITU-X.731}}. If {{true}} Unlocked with permission to 
     * serve traffic (and enable RF transmitter(s)). If {{false}} Locked. Transition 
     * LTE FAP to state where it is NOT permitted to serve traffic. RF transmitter is 
     * disabled. Given that this command controls the LTE FAP's RF transmitter, the 
     * underlying expectation is that the unlock is done when all necessary conditions 
     * are met to allow the transmitter to key on and provide service, including 
     * aspects such as: # location verification (including meeting the governing 
     * regulatory requirements) # verifying the LTE FAP configuration # if physical 
     * tampering is supported and no physical tampering is detected. The default value 
     * after power-on is {{false}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>adminState</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAdminState();
    
    /**
     * Current status of this LTE FAP RF transmitter. {{true}} indicates that the LTE 
     * FAP Tx transmitter is on. {{false}} indicates that the LTE FAP Tx transmitter is
     * off. This state is tied to the Administrative state which is controlled by the 
     * ACS. :When the ACS sets {{param|AdminState}} to {{true}}, then the LTE FAP has 
     * permission to turn on the RF transmitter. :When the ACS sets 
     * {{param|AdminState}} to {{false}}, then the LTE FAP is not allowed to provide 
     * service and MUST turn off the RF transmitter.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>rfTxStatus</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isRfTxStatus();
    
    /**
     * The value MUST be the path name of a row in optional the 
     * ''.FAP.PerfMgmt.Config.'' table (see {{bibref|TR-262}}). This is the performance
     * management related configuration for the LTE FAP. In case of a 
     * multiple-radio-technology FAP product, each radio technology can have its own PM
     * configuration or share a common PM configuration. In the former case, {{param}} 
     * can contain a unique instance number. In the latter case, {{param}} under all 
     * radio technologies can have the same instance number. If the referenced object 
     * is deleted, the parameter value MUST be set to an empty string.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>pmConfig</code>, or <code>null</code> if not present
     */
    java.lang.String getPmConfig();

}

