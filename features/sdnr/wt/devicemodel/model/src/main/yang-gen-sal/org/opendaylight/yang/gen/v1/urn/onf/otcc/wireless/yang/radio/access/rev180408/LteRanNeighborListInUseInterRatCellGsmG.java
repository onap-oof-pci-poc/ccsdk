package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Table containing the inter-RAT cell list for GERAN (GSM) cell.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-neighbor-list-in-use-inter-rat-cell-gsm-g {
 *     leaf plmnid {
 *         type string;
 *     }
 *     leaf lac {
 *         type uint16;
 *     }
 *     leaf bsic {
 *         type uint8;
 *     }
 *     leaf ci {
 *         type uint16;
 *     }
 *     leaf band-indicator {
 *         type enumeration;
 *     }
 *     leaf bccharfcn {
 *         type uint16;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-neighbor-list-in-use-inter-rat-cell-gsm-g</i>
 *
 */
public interface LteRanNeighborListInUseInterRatCellGsmG
    extends
    DataObject
{


    public enum BandIndicator {
        /**
         * none
         *
         */
        Gsm850(1, "gsm850"),
        
        /**
         * none
         *
         */
        Gsm900(2, "gsm900"),
        
        /**
         * none
         *
         */
        Dcs1800(3, "dcs1800"),
        
        /**
         * none
         *
         */
        Pcs1900(4, "pcs1900")
        ;
    
        private static final java.util.Map<java.lang.Integer, BandIndicator> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, BandIndicator> b = com.google.common.collect.ImmutableMap.builder();
            for (BandIndicator enumItem : BandIndicator.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private BandIndicator(int value, java.lang.String name) {
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
         * @return corresponding BandIndicator item
         */
        public static BandIndicator forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-neighbor-list-in-use-inter-rat-cell-gsm-g").intern();

    /**
     * PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) 
     * {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}. Mobile Country Code 
     * consists of three digits and uniquely identifies the country of domicile of the 
     * subscriber. Mobile Network Code consists of two or three digits and identifies 
     * the Home PLMN within a country. For a 2-digit MNC the total string length of 
     * {{param}} is 5.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>plmnid</code>, or <code>null</code> if not present
     */
    java.lang.String getPlmnid();
    
    /**
     * Location Area Code (LAC). The concatenation of PLMN ID (MCC+MNC) and LAC 
     * uniquely identifies the Location Area ID (LAI). {{bibref|3GPP-TS.23.003|Section 
     * 4.1}} {{bibref|3GPP-TS.25.413|Section 9.2.3.6}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>lac</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLac();
    
    /**
     * BSIC of the cell per {{bibref|3GPP-TS.23.003}}, consisting of: :Bit 7:6 - not 
     * used ("00") :Bit 5:3 - NCC (PLMN Color Code) :Bit 2:0 - BCC (BS color code) For 
     * example, if NCC is 7 and BCC is 2 you would have 00111010 (binary) or 0x3A 
     * (hex), and the value of this parameter would be 58.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>bsic</code>, or <code>null</code> if not present
     */
    java.lang.Short getBsic();
    
    /**
     * Cell ID of the cell per {{bibref|3GPP-TS.23.003|Section 4.3.1}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>ci</code>, or <code>null</code> if not present
     */
    java.lang.Integer getCi();
    
    /**
     * Indicates how to interpret the BCCH ARFCN. {{enum}}
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellGsmG.BandIndicator</code> <code>bandIndicator</code>, or <code>null</code> if not present
     */
    BandIndicator getBandIndicator();
    
    /**
     * ARFCN of this cell.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>bccharfcn</code>, or <code>null</code> if not present
     */
    java.lang.Integer getBccharfcn();

}

