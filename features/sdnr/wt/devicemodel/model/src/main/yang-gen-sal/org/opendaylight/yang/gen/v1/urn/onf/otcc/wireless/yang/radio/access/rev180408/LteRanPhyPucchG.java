package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the PUCCH (Physical Uplink Control 
 * Channel) configuration. (see {{bibref|3GPP-TS.32.592|Section 6.1.1.5}})
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-phy-pucch-g {
 *     leaf delta-pucch-shift {
 *         type enumeration;
 *     }
 *     leaf-list nrbcqi {
 *         type string;
 *     }
 *     leaf ncsan {
 *         type uint8;
 *     }
 *     leaf-list n1-pucchan {
 *         type string;
 *     }
 *     leaf-list cqipucch-resource-index {
 *         type string;
 *     }
 *     leaf k {
 *         type k;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-phy-pucch-g</i>
 *
 */
public interface LteRanPhyPucchG
    extends
    DataObject
{


    public enum DeltaPucchShift {
        /**
         * none
         *
         */
        Ds1(1, "ds1"),
        
        /**
         * none
         *
         */
        Ds2(2, "ds2"),
        
        /**
         * none
         *
         */
        Ds3(3, "ds3")
        ;
    
        private static final java.util.Map<java.lang.Integer, DeltaPucchShift> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, DeltaPucchShift> b = com.google.common.collect.ImmutableMap.builder();
            for (DeltaPucchShift enumItem : DeltaPucchShift.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private DeltaPucchShift(int value, java.lang.String name) {
            this.value = value;
            this.name = name;
        }
    
        /**
         * Returns the name of the enumeration item as it is specified in the input yang.
         *
         * @return the name of the enumeration item as it is specified in the input yang
         */
        public java.lang.String getName() {
            return name;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg integer value
         * @return corresponding DeltaPucchShift item
         */
        public static DeltaPucchShift forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-pucch-g").intern();

    /**
     * Defines the cyclic shift used for PUCCH formats 1/1a/1b in a resource block used
     * for a mix of formats 1/1a/1b and 2/2a/2b. It is an integer multiple of 
     * deltaPUCCHShift within the range of {0, 1, ., 7} . Corresponds to 
     * deltaPUCCH-Shift parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} 
     * and Delta-shiftPUCCH parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPucchG.DeltaPucchShift</code> <code>deltaPucchShift</code>, or <code>null</code> if not present
     */
    DeltaPucchShift getDeltaPucchShift();
    
    /**
     * {{list}} Each item is a value that defines the bandwidth in terms of resource 
     * blocks available for use by PUCCH formats 2/2a/2b transmission in each slot, 
     * with a numeric range between 0 and 98 inclusive. In case there is more than one 
     * item in the list, the first item contains the most preferred value. Corresponds 
     * to nRB-CQI parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and 
     * NRB(2) parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}. The multiplicity
     * of the {{param}} values can also be expressed by defining a range using ".." 
     * (two periods) between two values. In this case, the combination of two values 
     * defines the lower-bound and upper-bound of the range inclusive.If this notation 
     * is used, then the list contains at least 2 items: 
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
     * @return <code>java.util.List</code> <code>nrbcqi</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getNrbcqi();
    
    /**
     * Defines the number of cyclic shift used for PUCCH formats 1/1a/1b in a resource 
     * block used for a mix of formats 1/1a/1b and 2/2a/2b. The value is an integer 
     * multiple of deltaPUCCHShift within the range of {0, 1, ., 7}. Corresponds to 
     * nCS-AN parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NRB(1) 
     * parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>ncsan</code>, or <code>null</code> if not present
     */
    java.lang.Short getNcsan();
    
    /**
     * {{list}} Each item is a value that determines resources used for transmission of
     * PUCCH format 1/1a/1b and 2/2a/2b, with a numeric range between 0 and 2047 
     * inclusive. In case there is more than one item in the list, the first item 
     * contains the most preferred value. Corresponds to n1PUCCH-AN parameter defined 
     * in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NPUCCH(1) parameter defined 
     * {{bibref|3GPP-TS.36.213|Section 10.1}}. The multiplicity of the {{param}} values
     * can also be expressed by defining a range using ".." (two periods) between two 
     * values. In this case, the combination of two values defines the lower-bound and 
     * upper-bound of the range inclusive. If this notation is used, then the list 
     * contains at least 2 items: 
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
     * @return <code>java.util.List</code> <code>n1Pucchan</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getN1Pucchan();
    
    /**
     * {{list}} Each item is a value that indicates the position of PUCCH, with a 
     * numeric range between 0 and 1185 inclusive. In case there is more than one item 
     * in the list, the first item contains the most preferred value. . Corresponds to 
     * the cqi-PUCCH-ResourceIndex IE specified in {{bibref|3GPP-TS.36.331|Section 
     * 6.3.2}}. and to parameter nPUCCH(2) specified in {{bibref|3GPP-TS.36.213|Section
     * 7.2}}. The multiplicity of the {{param}} values can also be expressed by 
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
     * @return <code>java.util.List</code> <code>cqipucchResourceIndex</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getCqipucchResourceIndex();
    
    /**
     * Sub-band size for sub-band reporting mode expressed in units of physical 
     * {{units}}, see {{bibref|3GPP-TS.36.213|Section 7.2.2}}. This parameter 
     * corresponds to the K IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>k</code>, or <code>null</code> if not present
     */
    java.lang.Short getK();

}

