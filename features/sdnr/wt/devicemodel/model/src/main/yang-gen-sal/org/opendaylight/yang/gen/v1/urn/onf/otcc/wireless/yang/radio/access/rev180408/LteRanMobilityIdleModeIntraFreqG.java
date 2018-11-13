package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the idle mode mobility 
 * for intra-freq re-selection scenario (see {{bibref|3GPP-TS.32.592|Section 
 * 6.1.5.1.2}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-mobility-idle-mode-intra-freq-g {
 *     leaf-list q-rx-lev-min-sib1 {
 *         type string;
 *     }
 *     leaf-list q-rx-lev-min-sib3 {
 *         type string;
 *     }
 *     leaf q-rx-lev-min-offset {
 *         type q-rx-lev-min-offset;
 *     }
 *     leaf-list s-intra-search {
 *         type string;
 *     }
 *     leaf-list t-reselection-eutra {
 *         type string;
 *     }
 *     leaf-list s-non-intra-search {
 *         type string;
 *     }
 *     leaf cell-reselection-priority {
 *         type uint8;
 *     }
 *     leaf p-max {
 *         type p-max;
 *     }
 *     leaf thresh-serving-low {
 *         type thresh-serving-low;
 *     }
 *     leaf t-reselection-eutrasf-medium {
 *         type uint8;
 *     }
 *     leaf t-reselection-eutrasf-high {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-mobility-idle-mode-intra-freq-g</i>
 *
 */
public interface LteRanMobilityIdleModeIntraFreqG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-intra-freq-g").intern();

    /**
     * {{list}} Each item is a required minimum received RSRP level of a E-UTRA cell 
     * for cell selection, specified in dBm, with a numeric range between -70 and -22 
     * inclusive. In case there is more than one item in the list, the first item 
     * contains the most preferred value. The value of ({{param}} * 2) yields the 
     * actual value. Corresponds to parameter q-rxLevMin in SIB1 in 
     * {{bibref|3GPP-TS.36.331|Section 6.2.2}} and in {{bibref|3GPP-TS.36.304|Section 
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
     * @return <code>java.util.List</code> <code>qRxLevMinSib1</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getQRxLevMinSib1();
    
    /**
     * {{list}} Each item is a required minimum received RSRP level for intra-frequency
     * E-UTRA cell re-selection, specified in dBm, with a numeric range between -70 and
     * -22 inclusive. In case there is more than one item in the list, the first item 
     * contains the most preferred value. The value of ({{param}} * 2) yields the 
     * actual value. Corresponds to parameter q-rxLevMin in SIB3 in 
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
     * @return <code>java.util.List</code> <code>qRxLevMinSib3</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getQRxLevMinSib3();
    
    /**
     * Defines offset with respect to QrxLevMin, specified in {{units}}. This offset is
     * taken into account in the computation of Srxlev for cell selection evaluation of
     * cells detected during a periodic search for a higher priority PLMN while camped 
     * normally in a VPLMN. The value of ({{param}} * 2) yields the actual value. 
     * Corresponds to parameter q-rxLevMinOffset in SIB1 specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.2.2}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.3.2}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>qRxLevMinOffset</code>, or <code>null</code> if not present
     */
    java.lang.Short getQRxLevMinOffset();
    
    /**
     * {{list}} Each item is a threshold for intra-frequency measurements, specified in
     * dB, with a numeric range between 0 and 31 inclusive. In case there is more than 
     * one item in the list, the first item contains the most preferred value. The 
     * value of ({{param}} * 2) yields the actual value. Corresponds to parameter 
     * s-IntraSearch specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and 
     * in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}. The multiplicity of the {{param}} 
     * values can also be expressed by defining a range using ".." (two periods) 
     * between two values. In this case, the combination of two values defines the 
     * lower-bound and upper-bound of the range inclusive. If this notation is used, 
     * then the list contains at least 2 items: 
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
     * @return <code>java.util.List</code> <code>sIntraSearch</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getSIntraSearch();
    
    /**
     * {{list}} Each item is a cell re-selection timer for intra-frequency E-UTRA cell 
     * re-selection, specified in seconds, with a numeric range between 0 and 7 
     * inclusive. In case there is more than one item in the list, the first item 
     * contains the most preferred value. Corresponds to parameter t-ReselectionEUTRA 
     * specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in 
     * {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}. The multiplicity of the {{param}} 
     * values can also be expressed by defining a range using ".." (two periods) 
     * between two values. In this case, the combination of two values defines the 
     * lower-bound and upper-bound of the range inclusive. If this notation is used, 
     * then the list contains at least 2 items: 
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
     * {{list}} Each item is a threshold for inter-frequency and inter-RAT measurements
     * with lower or equal priority, specified in dB, with a numeric range between 0 
     * and 31 inclusive. In case there is more than one item in the list, the first 
     * item contains the most preferred value. The value of ({{param}} * 2) yields the 
     * actual value. Corresponds to parameter s-NonIntraSearch specified in SIB3 in 
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
     * @return <code>java.util.List</code> <code>sNonIntraSearch</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getSNonIntraSearch();
    
    /**
     * Absolute priority of the E-UTRAN serving carrier frequency used in the 
     * inter-frequency and inter-RAT cell re-selection procedure. Corresponds to 
     * parameter CellReselectionPriority specified in SIB3 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.4.7}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>cellReselectionPriority</code>, or <code>null</code> if not present
     */
    java.lang.Short getCellReselectionPriority();
    
    /**
     * Used to limit the allowed UE uplink transmission power on the serving frequency,
     * specified in {{units}}. It is used to calculate the parameter Pcompensation 
     * defined in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}. Corresponds to parameter 
     * p-Max specified in SIB1 and SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1 and 
     * Section 6.3.4}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pMax</code>, or <code>null</code> if not present
     */
    java.lang.Long getPMax();
    
    /**
     * Threshold for serving frequency used in evaluation of re-selection towards lower
     * priority E-UTRAN frequency or inter-RAT, specified in {{units}}. The value of 
     * ({{param}} * 2) yields the actual value. Corresponds to parameter 
     * threshServingLow specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} 
     * and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>threshServingLow</code>, or <code>null</code> if not present
     */
    java.lang.Short getThreshServingLow();
    
    /**
     * Scaling factor for intra-frequency TreselectionEUTRA in Medium-mobility state. 
     * The value of {{param}} divided by 100 yields the actual SF value. Corresponds to
     * parameter t-ReselectionEUTRA-SF:sf-Medium specified in SIB3 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tReselectionEutrasfMedium</code>, or <code>null</code> if not present
     */
    java.lang.Short getTReselectionEutrasfMedium();
    
    /**
     * Scaling factor for intra-frequency TreselectionEUTRA in High-mobility state. The
     * value of {{param}} divided by 100 yields the actual SF value. Corresponds to 
     * parameter t-ReselectionEUTRA-SF:sf-High specified in SIB3 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tReselectionEutrasfHigh</code>, or <code>null</code> if not present
     */
    java.lang.Short getTReselectionEutrasfHigh();

}

