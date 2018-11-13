package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the carrier information for 
 * inter-freq re-selection scenario (see {{bibref|3GPP-TS.32.592|Section 
 * 6.1.5.1.3}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-mobility-idle-mode-inter-freq-carrier-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf eutra-carrier-arfcn {
 *         type uint16;
 *     }
 *     leaf-list q-rx-lev-min-sib5 {
 *         type string;
 *     }
 *     leaf-list q-offset-freq {
 *         type string;
 *     }
 *     leaf-list t-reselection-eutra {
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
 *     leaf p-max {
 *         type p-max;
 *     }
 *     leaf t-reselection-eutrasf-medium {
 *         type uint8;
 *     }
 *     leaf t-reselection-eutrasf-high {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-mobility-idle-mode-inter-freq-carrier-g</i>
 *
 */
public interface LteRanMobilityIdleModeInterFreqCarrierG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-inter-freq-carrier-g").intern();

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
     * Indicates the ARFCN of this frequency carrier. Corresponds to parameter 
     * dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>eutraCarrierArfcn</code>, or <code>null</code> if not present
     */
    java.lang.Integer getEutraCarrierArfcn();
    
    /**
     * {{list}} Each item is a required minimum received RSRP level on this E-UTRA 
     * frequency carrier, spcified in dBm, with a numeric range between -70 and -22 
     * inclusive. In case there is more than one item in the list, the first item 
     * contains the most preferred value. The value of ({{param}} * 2) yields the 
     * actual value. Corresponds to parameter q-rxLevMin in SIB5 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.3.2}}. The multiplicity of the {{param}} values can also be expressed by 
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
     * @return <code>java.util.List</code> <code>qRxLevMinSib5</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getQRxLevMinSib5();
    
    /**
     * {{list}} Each item is an offset applicable between serving and this frequency 
     * carrier, specified in dBm, with a numeric range between -24 and 24 inclusive. 
     * For values less than or equal to -6, or values greater than or equal to 6, only 
     * the even values are valid. If the value is other than these, the CPE MUST reject
     * the value. In case there is more than one item in the list, the first item 
     * contains the most preferred value. The value of ({{param}} * 2) yields the 
     * actual value. Corresponds to parameter q-OffsetFreq in SIB5 specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.4.2.6}}. The multiplicity of the {{param}} values can also be expressed by 
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
     * @return <code>java.util.List</code> <code>qOffsetFreq</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getQOffsetFreq();
    
    /**
     * {{list}} Each item is a cell re-selection timer for inter-frequency cell 
     * re-selection to this E-UTRA frequency carrier, specified in seconds, with a 
     * numeric range between 0 and 7 inclusive. In case there is more than one item in 
     * the list, the first item contains the most preferred value. Corresponds to 
     * parameter t-ReselectionEUTRA specified in SIB5 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.4.7}}. The multiplicity of the {{param}} values can also be expressed by 
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
     * @return <code>java.util.List</code> <code>tReselectionEutra</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getTReselectionEutra();
    
    /**
     * Absolute priority of this E-UTRA frequency carrier, as used by the 
     * inter-frequency cell re-selection procedure. Corresponds to parameter 
     * CellReselectionPriority specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 
     * 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>cellReselectionPriority</code>, or <code>null</code> if not present
     */
    java.lang.Short getCellReselectionPriority();
    
    /**
     * Threshold used when re-selecting from a lower priority E-UTRAN frequency, 
     * specified in {{units}}. The value of ({{param}} * 2) yields the actual value. 
     * Corresponds to parameter threshX-High specified in SIB5 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.4.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>threshXHigh</code>, or <code>null</code> if not present
     */
    java.lang.Short getThreshXHigh();
    
    /**
     * Threshold used when re-selecting from a higher priority E-UTRAN frequency, 
     * specified in {{units}}. The value of ({{param}} * 2) yields the actual value. 
     * Corresponds to parameter threshX-Low specified in SIB5 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.4.5}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>threshXLow</code>, or <code>null</code> if not present
     */
    java.lang.Short getThreshXLow();
    
    /**
     * Used to limit the allowed UE uplink transmission power on this carrier 
     * frequency, specified in {{units}}. It is used to calculate the parameter 
     * Pcompensation defined in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}. Corresponds 
     * to parameter p-Max specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pMax</code>, or <code>null</code> if not present
     */
    java.lang.Long getPMax();
    
    /**
     * Scaling factor for TreselectionEUTRA for inter-frequency re-selection to this 
     * frequency carrier in Medium-mobility state. The value of {{param}} divided by 
     * 100 yields the actual SF value. Corresponds to parameter 
     * t-ReselectionEUTRA-SF:sf-Medium specified in SIB5 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tReselectionEutrasfMedium</code>, or <code>null</code> if not present
     */
    java.lang.Short getTReselectionEutrasfMedium();
    
    /**
     * Scaling factor for TreselectionEUTRA for inter-frequency re-selection to this 
     * frequency carrier in High-mobility state. The value of {{param}} divided by 100 
     * yields the actual SF value. Corresponds to parameter 
     * t-ReselectionEUTRA-SF:sf-High specified in SIB5 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tReselectionEutrasfHigh</code>, or <code>null</code> if not present
     */
    java.lang.Short getTReselectionEutrasfHigh();

}

