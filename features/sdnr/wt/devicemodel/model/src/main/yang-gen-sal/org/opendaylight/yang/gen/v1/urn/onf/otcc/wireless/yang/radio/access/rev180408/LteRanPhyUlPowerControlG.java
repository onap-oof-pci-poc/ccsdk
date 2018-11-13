package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the uplink power control 
 * configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.7}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-phy-ul-power-control-g {
 *     leaf-list p0-nominal-pusch {
 *         type string;
 *     }
 *     leaf-list alpha {
 *         type string;
 *     }
 *     leaf-list p0-nominal-pucch {
 *         type string;
 *     }
 *     leaf delta-fpucch-format1 {
 *         type delta-fpucch-format1;
 *     }
 *     leaf delta-fpucch-format1b {
 *         type delta-fpucch-format1b;
 *     }
 *     leaf delta-fpucch-format2 {
 *         type delta-fpucch-format2;
 *     }
 *     leaf delta-fpucch-format2a {
 *         type delta-fpucch-format2a;
 *     }
 *     leaf delta-fpucch-format2b {
 *         type delta-fpucch-format2b;
 *     }
 *     leaf delta-preamble-msg3 {
 *         type delta-preamble-msg3;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-phy-ul-power-control-g</i>
 *
 */
public interface LteRanPhyUlPowerControlG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-ul-power-control-g").intern();

    /**
     * {{list}} Each item is a value to compute the UL UE transmit power for 
     * transmission on PUSCH for semi-persistant grants, with a numeric range between 
     * -126 and 24 inclusive. In case there is more than one item in the list, the 
     * first item contains the most preferred value. Corresponds to p0-NominalPUSCH 
     * parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and 
     * PO_NOMINAL_PUSCH(0) parameter specified in {{bibref|3GPP-TS.36.211|Section 
     * 5.1.1.1}}. The multiplicity of the {{param}} values can also be expressed by 
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
     * @return <code>java.util.List</code> <code>p0NominalPusch</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getP0NominalPusch();
    
    /**
     * {{list}} Each item is a value used to compute the UL UE transmit power for 
     * transmission on PUSCH, from the list of 0, 4, 5, 6, 7, 8, 9, 100. In case there 
     * is more than one item in the list, the first item contains the most preferred 
     * value. Actual values of range are from 0.00 to 1.00. The value of {{param}} 
     * divided by 100 yields the actual value. Corresponds to alpha parameter specified
     * in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and to α parameter specified in 
     * {{bibref|3GPP-TS.36.211|Section 5.1.1.1}}. The multiplicity of the {{param}} 
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
     * @return <code>java.util.List</code> <code>alpha</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getAlpha();
    
    /**
     * {{list}} Each item is a value to compute the UL UE transmit power for 
     * transmission on PUCCH, with a numeric range between -126 and 24 inclusive. In 
     * case there is more than one item in the list, the first item contains the most 
     * preferred value. Corresponds to p0-NominalPUCCH parameter specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and PO_NOMINAL_PUCCH parameter specified
     * in {{bibref|3GPP-TS.36.211|Section 5.1.2.1}}. The multiplicity of the {{param}} 
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
     * @return <code>java.util.List</code> <code>p0NominalPucch</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getP0NominalPucch();
    
    /**
     * Defines deltaF-PUCCH-Format1 to derive the UE transmit power. Corresponds to 
     * parameter ?F_PUCCH(1) in {{units}} as specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 
     * 5.1.2}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>deltaFpucchFormat1</code>, or <code>null</code> if not present
     */
    java.lang.Long getDeltaFpucchFormat1();
    
    /**
     * Defines deltaF-PUCCH-Format1b to derive the UE transmit power. Corresponds to 
     * parameter ?F_PUCCH(1b) in {{units}} dB as specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 
     * 5.1.2}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>deltaFpucchFormat1b</code>, or <code>null</code> if not present
     */
    java.lang.Short getDeltaFpucchFormat1b();
    
    /**
     * Defines deltaF-PUCCH-Format2 to derive the UE transmit power. Corresponds to 
     * parameter ?F_PUCCH(2) in {{units}} as specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 
     * 5.1.2}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>deltaFpucchFormat2</code>, or <code>null</code> if not present
     */
    java.lang.Long getDeltaFpucchFormat2();
    
    /**
     * Defines deltaF-PUCCH-Format2a to derive the UE transmit power. Corresponds to 
     * parameter ?F_PUCCH(2a) in {{units}} as specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 
     * 5.1.2}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>deltaFpucchFormat2a</code>, or <code>null</code> if not present
     */
    java.lang.Long getDeltaFpucchFormat2a();
    
    /**
     * Defines deltaF-PUCCH-Format2b to derive the UE transmit power. Corresponds to 
     * parameter ?F_PUCCH(2b) in {{units}} as specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 
     * 5.1.2}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>deltaFpucchFormat2b</code>, or <code>null</code> if not present
     */
    java.lang.Long getDeltaFpucchFormat2b();
    
    /**
     * Defines the parameter in {{units}} used to compute the UL UE transmit power for 
     * transmission of random access response grant. This parameter corresponds to 
     * deltaPreambleMsg3 parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}
     * and to ?PREAMBLE_Msg3 parameter specified in {{bibref|3GPP-TS.36.213|Section 
     * 5.1.1.1}}. Actual value is 2x the value of this parameter.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>deltaPreambleMsg3</code>, or <code>null</code> if not present
     */
    java.lang.Long getDeltaPreambleMsg3();

}

