package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the ULSCH (Uplink Shared Channel) 
 * configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.3}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-mac-ulsch-g {
 *     leaf max-harq-tx {
 *         type uint8;
 *     }
 *     leaf periodic-bsr-timer {
 *         type periodic-bsr-timer;
 *     }
 *     leaf retx-bsr-timer {
 *         type retx-bsr-timer;
 *     }
 *     leaf tti-bundling {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-mac-ulsch-g</i>
 *
 */
public interface LteRanMacUlschG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mac-ulsch-g").intern();

    /**
     * Maximum number of UL HARQ transmissions. Corresponds to parameter maxHARQ-Tx 
     * specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in 
     * {{bibref|3GPP-TS.36.321|Section 5.4.2.2}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>maxHarqTx</code>, or <code>null</code> if not present
     */
    java.lang.Short getMaxHarqTx();
    
    /**
     * Timer for Periodic BSR (Buffer Status Report) reporting, specified in number of 
     * {{units}}. UE transmits periodic BSR at the expiration of this timer. 
     * Corresponds to parameter periodicBSR-Timer specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 
     * 5.4.5}}. Value of 0 indicates "infinity."
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>periodicBsrTimer</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPeriodicBsrTimer();
    
    /**
     * Timer for Regular BSR reporting, specified in number of {{units}}. UE transmits 
     * a Regular BSR at the expiration of this timer if data is available in the 
     * buffer. Corresponds to parameter retxBSR-Timer specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 
     * 5.4.5}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>retxBsrTimer</code>, or <code>null</code> if not present
     */
    java.lang.Integer getRetxBsrTimer();
    
    /**
     * Enables/disables TTI bundling. If {{true}}, TTI bundling is enabled. If 
     * {{false}}, TTI bundling is disabled. Corresponds to parameter ttiBundling 
     * specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in 
     * {{bibref|3GPP-TS.36.321|Section 5.4.2.1}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>ttiBundling</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isTtiBundling();

}

