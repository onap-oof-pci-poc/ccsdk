package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Table containing the inter-RAT cell list for CDMA2000 provided by the ACS. The 
 * table contents MAY be added/deleted/modified during operation, in which case 
 * these changes shall be reflected in the broadcast information as soon as 
 * possible.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-neighbor-list-inter-rat-cell-cdma2000-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf must-include {
 *         type boolean;
 *     }
 *     leaf band-class {
 *         type uint8;
 *     }
 *     leaf arfcn {
 *         type uint16;
 *     }
 *     leaf pn-offset {
 *         type uint16;
 *     }
 *     leaf type {
 *         type enumeration;
 *     }
 *     leaf cid {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-neighbor-list-inter-rat-cell-cdma2000-g</i>
 *
 */
public interface LteRanNeighborListInterRatCellCdma2000G
    extends
    DataObject
{


    public enum Type {
        /**
         * none
         *
         */
        _1xRtt(1, "1x-rtt"),
        
        /**
         * none
         *
         */
        Hrpd(2, "hrpd")
        ;
    
        private static final java.util.Map<java.lang.Integer, Type> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Type> b = com.google.common.collect.ImmutableMap.builder();
            for (Type enumItem : Type.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private Type(int value, java.lang.String name) {
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
         * @return corresponding Type item
         */
        public static Type forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-neighbor-list-inter-rat-cell-cdma2000-g").intern();

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
     * Indicates whether this instance of the neighbor shall be included or excluded in
     * the FAP's NL configuration.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mustInclude</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMustInclude();
    
    /**
     * Defines the CDMA2000 band in which the CDMA2000 frequency carrier can be found, 
     * specified in bandclass number. BandClass is defined in 
     * {{bibref|3GPP2-C.S0057-B}} Table 1.5-1. Corresponds to parameter bandClass 
     * specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>bandClass</code>, or <code>null</code> if not present
     */
    java.lang.Short getBandClass();
    
    /**
     * Defines the CDMA2000 frequency carrier within a CDMA2000 band, as specified by 
     * ARFCN-ValueCDMA2000 in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and 
     * {{bibref|3GPP2-C.S0002-A}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>arfcn</code>, or <code>null</code> if not present
     */
    java.lang.Integer getArfcn();
    
    /**
     * Defines the PN offset that represents the "Physical cell identity" in CDMA2000 
     * system, as specified by PhysCellIdCDMA2000 in SIB8 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>pnOffset</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPnOffset();
    
    /**
     * Indicates the type of the cell. This parameter determines the length of the CID 
     * parameter.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInterRatCellCdma2000G.Type</code> <code>type</code>, or <code>null</code> if not present
     */
    Type getType();
    
    /**
     * Defines the global cell identity of the cell. For a 1xRTT cell, the cell 
     * identity is a binary string 47 bits long. For a HRPD cell, the cell identity is 
     * a binary string 128 bits long. The value of {{param}} parameter is interpreted 
     * as 128-bit long unsigned integer. If {{param|Type}} is {{enum|1xRTT|Type}}, the 
     * first 47 bits (6 octet) is used and the rest of this {{param}} parameter MUST be
     * ignored by the CPE. If {{param|Type}} is {{enum|HRPD|Type}}, the entire 16 octet
     * is used as {{param}}. Corresponds to IE CellGlobalIdCDMA2000 specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.4}}.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cid</code>, or <code>null</code> if not present
     */
    java.lang.String getCid();

}

