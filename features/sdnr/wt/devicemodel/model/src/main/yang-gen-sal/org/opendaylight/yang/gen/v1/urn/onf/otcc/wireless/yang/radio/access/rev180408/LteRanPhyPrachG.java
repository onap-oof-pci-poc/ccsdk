package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the PRACH (Physical Random Access 
 * Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.4}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-phy-prach-g {
 *     leaf-list root-sequence-index {
 *         type string;
 *     }
 *     leaf-list configuration-index {
 *         type string;
 *     }
 *     leaf high-speed-flag {
 *         type boolean;
 *     }
 *     leaf-list zero-correlation-zone-config {
 *         type string;
 *     }
 *     leaf-list freq-offset {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-phy-prach-g</i>
 *
 */
public interface LteRanPhyPrachG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-prach-g").intern();

    /**
     * {{list}} Each item is a Logical root sequence index with a numeric range between
     * 0 and 837 inclusive. In case there is more than one item in the list, the first 
     * item contains the most preferred value. Logical root sequence index is used to 
     * determine 64 physical RACH preamble sequences available in the cell. Corresponds
     * to RACH_ROOT_SEQUENCE parameter defined in {{bibref|3GPP-TS.36.331|Section 
     * 6.3.2}} and {{bibref|3GPP-TS.36.211|Section 5.7.2}}. The multiplicity of the 
     * {{param}} values can also be expressed by defining a range using ".." (two 
     * periods) between two values. In this case, the combination of two values defines
     * the lower-bound and upper-bound of the range inclusive. If this notation is 
     * used, then the list contains at least 2 items: 
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
     * @return <code>java.util.List</code> <code>rootSequenceIndex</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getRootSequenceIndex();
    
    /**
     * {{list}} Each item is an index to the table defining PRACH resources within the 
     * frame with a numeric range between 0 and 63 inclusive. In case there is more 
     * than one item in the list, the first item contains the most preferred value. 
     * Corresponds to PRACH-Configuration-Index parameter defined in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Section 
     * 5.7.1}}. The multiplicity of the {{param}} values can also be expressed by 
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
     * @return <code>java.util.List</code> <code>configurationIndex</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getConfigurationIndex();
    
    /**
     * Indicates whether restricted set or unrestricted set of preambles is used. If 
     * {{true}}, indicates restricted set. If {{false}}, indicates unrestricted set. 
     * Corresponds to highSpeedFlag parameter defined in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and high-speed-flag parameter defined in
     * {{bibref|3GPP-TS.36.211|Section 5.7.2}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>highSpeedFlag</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isHighSpeedFlag();
    
    /**
     * {{list}} Each item is a value used for preamble sequence generation with a 
     * numeric range between 0 and 15 inclusive. In case there is more than one item in
     * the list, the first item contains the most preferred value. Each item 
     * corresponds to zeroCorrelationZoneConfig parameter defined in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and to NCS parameter defined in 
     * {{bibref|3GPP-TS.36.211|Section 5.7.2}}. The multiplicity of the {{param}} 
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
     * @return <code>java.util.List</code> <code>zeroCorrelationZoneConfig</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getZeroCorrelationZoneConfig();
    
    /**
     * {{list}} Each item represents the first available physical resource block number
     * for PRACH. In case there is more than one item in the list, the first item 
     * contains the most preferred value. Corresponds to prach-FreqOffset parameter 
     * defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and nPRBoffsetRA parameter 
     * defined {{bibref|3GPP-TS.36.211|Section 5.7.1}}. The multiplicity of the 
     * {{param}} values can also be expressed by defining a range using ".." (two 
     * periods) between two values. In this case, the combination of two values defines
     * the lower-bound and upper-bound of the range inclusive. If this notation is 
     * used, then the list contains at least 2 items: 
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
     * @return <code>java.util.List</code> <code>freqOffset</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getFreqOffset();

}

