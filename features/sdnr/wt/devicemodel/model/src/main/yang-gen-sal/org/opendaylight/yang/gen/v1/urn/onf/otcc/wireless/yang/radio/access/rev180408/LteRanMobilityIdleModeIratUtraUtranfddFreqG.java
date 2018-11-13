package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the channel frequncy related 
 * information of UTRA (UMTS) system (see {{bibref|3GPP-TS.32.592|Section 
 * 6.1.5.1.5, 6.1.5.1.6}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf utra-carrier-arfcn {
 *         type uint16;
 *     }
 *     leaf-list q-rx-lev-min {
 *         type string;
 *     }
 *     leaf-list q-qual-min {
 *         type string;
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
 *     leaf p-max-utra {
 *         type p-max-utra;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq-g</i>
 *
 */
public interface LteRanMobilityIdleModeIratUtraUtranfddFreqG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq-g").intern();

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
     * Indicates the ARFCN of the frequency carrier. Corresponds to parameter 
     * CarrierFreq in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>utraCarrierArfcn</code>, or <code>null</code> if not present
     */
    java.lang.Integer getUtraCarrierArfcn();
    
    /**
     * {{list}} Each item is a required minimum received RSCP level on this UTRA 
     * frequency carrier, specified in dBm, with a numeric range between -60 and -13 
     * inclusive. In case there is more than one item in the list, the first item 
     * contains the most preferred value. The value of ({{param}} * 2 + 1) yields the 
     * actual value. Corresponds to parameter q-RxLevMin in SIB6 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.25.304|Section 
     * 5.2.3.1.2}}. The multiplicity of the {{param}} values can also be expressed by 
     * defining a range using ".." (two periods) between two values. In this case, the 
     * combination of two values defines the lower-bound and upper-bound of the range 
     * inclusive. If this notation is used, then the list contains at least 2 items: 
     * "&amp;lt;preferred-value&amp;gt;,&amp;lt;lower-bound&amp;gt;..&amp;lt;upper-bound&amp;gt;".
     * If supports self-configuration capability for {{param}} and more than one item 
     * is configured, then is expected to select one from the list and overwrite this 
     * parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>qRxLevMin</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getQRxLevMin();
    
    /**
     * {{list}} Each item is a required minimum received Ec/Io level on this UTRA FDD 
     * carrier, specified in dB, with a numeric range between -24 and 0 inclusive. In 
     * case there is more than one item in the list, the first item contains the most 
     * preferred value. Corresponds to parameter q-QualMin in SIB6 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.25.304|Section 
     * 5.2.3.1.2}}. The multiplicity of the {{param}} values can also be expressed by 
     * defining a range using ".." (two periods) between two values. In this case, the 
     * combination of two values defines the lower-bound and upper-bound of the range 
     * inclusive. If this notation is used, then the list contains at least 2 items: 
     * "&amp;lt;preferred-value&amp;gt;,&amp;lt;lower-bound&amp;gt;..&amp;lt;upper-bound&amp;gt;".
     * If supports self-configuration capability for {{param}} and more than one item 
     * is configured, then is expected to select one from the list and overwrite this 
     * parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>qQualMin</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getQQualMin();
    
    /**
     * Absolute priority of this UTRA FDD frequency carrier, as used by the 
     * inter-frequency cell re-selection procedure. Corresponds to parameter 
     * CellReselectionPriority specified in SIB6 in {{bibref|3GPP-TS.36.331|Section 
     * 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>cellReselectionPriority</code>, or <code>null</code> if not present
     */
    java.lang.Short getCellReselectionPriority();
    
    /**
     * Threshold used when re-selecting towards a higher priority UTRA FDD frequency, 
     * specified in {{units}}. The value of ({{param}} * 2) yields the actual value. 
     * Corresponds to parameter threshX-High specified in SIB6 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.4.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>threshXHigh</code>, or <code>null</code> if not present
     */
    java.lang.Short getThreshXHigh();
    
    /**
     * Threshold used when re-selecting towards a lower priority UTRA FDD frequency, 
     * specified in {{units}}. The value of ({{param}} * 2) yields the actual value. 
     * Corresponds to parameter threshX-Low specified in SIB6 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.4.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>threshXLow</code>, or <code>null</code> if not present
     */
    java.lang.Short getThreshXLow();
    
    /**
     * Used to limit the allowed UE uplink transmission power on this UTRA FDD carrier 
     * frequency, specified in {{units}}. It is used to calculate the parameter 
     * Pcompensation defined in {{bibref|3GPP-TS.25.304|Section 5.2.3.1.2}}. 
     * Corresponds to parameter p-MaxUTRA specified in SIB6 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pMaxUtra</code>, or <code>null</code> if not present
     */
    java.lang.Long getPMaxUtra();

}

