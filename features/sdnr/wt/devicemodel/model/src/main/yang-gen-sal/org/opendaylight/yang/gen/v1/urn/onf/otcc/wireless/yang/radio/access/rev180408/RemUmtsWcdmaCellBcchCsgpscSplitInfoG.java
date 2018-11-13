package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the Primary Scambling Code (PSC) 
 * split information for the CSG. Defined in SIB3/11bis 
 * {{bibref|3GPP-TS.25.331|Section 10.3.2.8 and 10.3.2.9}}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-umts-wcdma-cell-bcch-csgpsc-split-info-g {
 *     leaf start-psc-range1-coefficient {
 *         type uint8;
 *     }
 *     leaf number-of-ps-cs {
 *         type enumeration;
 *     }
 *     leaf psc-range2-offset {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-umts-wcdma-cell-bcch-csgpsc-split-info-g</i>
 *
 */
public interface RemUmtsWcdmaCellBcchCsgpscSplitInfoG
    extends
    DataObject
{


    public enum NumberOfPsCs {
        /**
         * none
         *
         */
        _5(1, "5"),
        
        /**
         * none
         *
         */
        _10(2, "10"),
        
        /**
         * none
         *
         */
        _15(3, "15"),
        
        /**
         * none
         *
         */
        _20(4, "20"),
        
        /**
         * none
         *
         */
        _30(5, "30"),
        
        /**
         * none
         *
         */
        _40(6, "40"),
        
        /**
         * none
         *
         */
        _50(7, "50"),
        
        /**
         * none
         *
         */
        _64(8, "64"),
        
        /**
         * none
         *
         */
        _80(9, "80"),
        
        /**
         * none
         *
         */
        _120(10, "120"),
        
        /**
         * none
         *
         */
        _160(11, "160"),
        
        /**
         * none
         *
         */
        _256(12, "256"),
        
        /**
         * none
         *
         */
        Alltherest(13, "alltherest"),
        
        /**
         * none
         *
         */
        Spare3(14, "spare3"),
        
        /**
         * none
         *
         */
        Spare2(15, "spare2"),
        
        /**
         * none
         *
         */
        Spare1(16, "spare1")
        ;
    
        private static final java.util.Map<java.lang.Integer, NumberOfPsCs> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NumberOfPsCs> b = com.google.common.collect.ImmutableMap.builder();
            for (NumberOfPsCs enumItem : NumberOfPsCs.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private NumberOfPsCs(int value, java.lang.String name) {
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
         * @return corresponding NumberOfPsCs item
         */
        public static NumberOfPsCs forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-umts-wcdma-cell-bcch-csgpsc-split-info-g").intern();

    /**
     * The value of this Information Element (IE) multiplied by 8 specifies the start 
     * PSC value of the first PSC range as specified in {{bibref|3GPP-TS.25.331|Section
     * 8.6.2.4}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>startPscRange1Coefficient</code>, or <code>null</code> if not present
     */
    java.lang.Short getStartPscRange1Coefficient();
    
    /**
     * This Information Element (IE) specifies the number of PSCs reserved for CSG 
     * cells in each PSC range.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchCsgpscSplitInfoG.NumberOfPsCs</code> <code>numberOfPsCs</code>, or <code>null</code> if not present
     */
    NumberOfPsCs getNumberOfPsCs();
    
    /**
     * If this Information Element (IE) is included, the UE shall calculate the second 
     * PSC range as specified in {{bibref|3GPP-TS.25.331|Section 8.6.2.4}}. If this 
     * Information Element (IE) is not included, the UE shall consider the second PSC 
     * range to be not present.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>pscRange2Offset</code>, or <code>null</code> if not present
     */
    java.lang.Short getPscRange2Offset();

}

