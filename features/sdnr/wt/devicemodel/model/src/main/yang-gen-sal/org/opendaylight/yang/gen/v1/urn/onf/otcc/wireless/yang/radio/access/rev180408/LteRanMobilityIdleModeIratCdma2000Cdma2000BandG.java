package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the channel frequncy related 
 * information of CDMA2000 system (see {{bibref|3GPP-TS.32.592|Section 
 * 6.1.5.1.8}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf band-class {
 *         type band-class;
 *     }
 *     leaf cell-reselection-priority {
 *         type uint8;
 *     }
 *     leaf thresh-x-high {
 *         type thresh-x-high;
 *     }
 *     leaf thresh-x-low {
 *         type thresh-x-low;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band-g</i>
 *
 */
public interface LteRanMobilityIdleModeIratCdma2000Cdma2000BandG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band-g").intern();

    /**
     * Enables or disables this entry.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnable();
    
    /**
     * {{datatype|expand}}
     *
     *
     *
     * @return <code>java.lang.String</code> <code>alias</code>, or <code>null</code> if not present
     */
    java.lang.String getAlias();
    
    /**
     * Defines the CDMA2000 band in which the CDMA2000 carrier frequency can be found, 
     * specified in {{units}}. BandClass is defined in 3GPP2 C.S0057-B Table 1.5-1. 
     * Corresponds to parameter bandClass specified in SIB8 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>bandClass</code>, or <code>null</code> if not present
     */
    java.lang.Short getBandClass();
    
    /**
     * Absolute priority of this CDMA2000 band used by the inter-frequency cell 
     * re-selection procedure. Corresponds to parameter CellReselectionPriority 
     * specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in 
     * {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>cellReselectionPriority</code>, or <code>null</code> if not present
     */
    java.lang.Short getCellReselectionPriority();
    
    /**
     * Threshold used when re-selecting towards a higher priority CDMA2000 band than 
     * current serving E-UTRA frequency, specified in {{units}}. The value of 
     * ({{param}} * 2) yields the actual value. Corresponds to parameter threshX-High 
     * specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in 
     * {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>threshXHigh</code>, or <code>null</code> if not present
     */
    java.lang.Short getThreshXHigh();
    
    /**
     * Threshold used when re-selecting towards a lower priority CDMA2000 band than 
     * current serving E-UTRA frequency, specified in {{units}}. The value of 
     * ({{param}} * 2) yields the actual value. Corresponds to parameter threshX-Low 
     * specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in 
     * {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>threshXLow</code>, or <code>null</code> if not present
     */
    java.lang.Short getThreshXLow();

}

