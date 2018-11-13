package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the PUSCH (Physical Uplink Shared 
 * Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.6}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-phy-pusch-g {
 *     leaf nsb {
 *         type uint8;
 *     }
 *     leaf hopping-mode {
 *         type enumeration;
 *     }
 *     leaf-list hopping-offset {
 *         type string;
 *     }
 *     leaf enable64-qam {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-phy-pusch-g</i>
 *
 */
public interface LteRanPhyPuschG
    extends
    DataObject
{


    public enum HoppingMode {
        /**
         * none
         *
         */
        InterSubFrame(1, "inter-sub-frame"),
        
        /**
         * none
         *
         */
        IntraAndInterSubFrame(2, "intra-and-inter-sub-frame")
        ;
    
        private static final java.util.Map<java.lang.Integer, HoppingMode> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, HoppingMode> b = com.google.common.collect.ImmutableMap.builder();
            for (HoppingMode enumItem : HoppingMode.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private HoppingMode(int value, java.lang.String name) {
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
         * @return corresponding HoppingMode item
         */
        public static HoppingMode forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-pusch-g").intern();

    /**
     * Defines the number of sub-bands. This parameter corresponds to n-SB parameter 
     * specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NSB parameter specified
     * in {{bibref|3GPP-TS.36.211|Section 5.3.4}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>nsb</code>, or <code>null</code> if not present
     */
    java.lang.Short getNsb();
    
    /**
     * Indicates if hopping is "inter-subframe" or "intra and inter-subframe". 
     * Corresponds to hoppingMode parameter specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and Hopping-mode parameter specified in 
     * {{bibref|3GPP-TS.36.211|Section 5.3.4}}.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschG.HoppingMode</code> <code>hoppingMode</code>, or <code>null</code> if not present
     */
    HoppingMode getHoppingMode();
    
    /**
     * {{list}} Each item is a value to compute the set of physical resource blocks to 
     * be used for transmission on PUSCH if uplink frequency hopping mode is enabled, 
     * with a numeric range between 0 and 98 inclusive. In case there is more than one 
     * item in the list, the first item contains the most preferred value. This 
     * parameter corresponds to pusch-HoppingOffset parameter specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NRBHO parameter specified in 
     * {{bibref|3GPP-TS.36.211|Section 5.3.4}}. The multiplicity of the {{param}} 
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
     * @return <code>java.util.List</code> <code>hoppingOffset</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getHoppingOffset();
    
    /**
     * Indicates whether 64QAM is allowed or not. If {{true}}, 64QAM is allowed. If 
     * {{false}}, 64QAM is not allowed. Corresponds to enable64QAM parameter specified 
     * in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enable64Qam</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnable64Qam();

}

