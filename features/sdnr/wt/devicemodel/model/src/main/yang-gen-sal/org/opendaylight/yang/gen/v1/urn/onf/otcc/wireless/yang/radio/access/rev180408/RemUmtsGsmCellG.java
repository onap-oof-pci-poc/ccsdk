package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Table indicating the components of the discovered cells.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-umts-gsm-cell-g {
 *     leaf band-indicator {
 *         type enumeration;
 *     }
 *     leaf arfcn {
 *         type uint16;
 *     }
 *     leaf bsic {
 *         type uint8;
 *     }
 *     leaf plmnid {
 *         type string;
 *     }
 *     leaf lac {
 *         type uint16;
 *     }
 *     leaf rac {
 *         type uint8;
 *     }
 *     leaf ci {
 *         type uint16;
 *     }
 *     leaf rssi {
 *         type rssi;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-umts-gsm-cell-g</i>
 *
 */
public interface RemUmtsGsmCellG
    extends
    DataObject
{


    public enum BandIndicator {
        /**
         * none
         *
         */
        Gsm850(1, "gsm 850"),
        
        /**
         * none
         *
         */
        Gsm900(2, "gsm 900"),
        
        /**
         * none
         *
         */
        Dcs1800(3, "dcs 1800"),
        
        /**
         * none
         *
         */
        Pcs1900(4, "pcs 1900")
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
        "2018-04-08", "rem-umts-gsm-cell-g").intern();

    /**
     * Indicates how to interpret the BCCH ARFCN.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG.BandIndicator</code> <code>bandIndicator</code>, or <code>null</code> if not present
     */
    BandIndicator getBandIndicator();
    
    /**
     * Absolute Radio Frequency Channel Number (ARFCN) {{bibref|3GPP-TS.05.05}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>arfcn</code>, or <code>null</code> if not present
     */
    java.lang.Integer getArfcn();
    
    /**
     * Base Station Identity Code {{bibref|3GPP-TS.03.03}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>bsic</code>, or <code>null</code> if not present
     */
    java.lang.Short getBsic();
    
    /**
     * PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) 
     * {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}. Mobile Country Code 
     * consists of three digits and uniquely identifies the country of domicile of the 
     * subscriber. Mobile Network Code consists of two or three digits and identifies 
     * the Home PLMN within a country. For a 2-digit MNC the total string length of the
     * PLMNID is 5.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>plmnid</code>, or <code>null</code> if not present
     */
    java.lang.String getPlmnid();
    
    /**
     * Location Area Code (LAC) as defined in SIB1 {{bibref|3GPP-TS.25.331}}. The 
     * concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the LAI (Location
     * Area ID) {{bibref|3GPP-TS.23.003}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>lac</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLac();
    
    /**
     * Routing Area Code (RAC) consists of up to 3 numerical characters. The 
     * concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing
     * Area ID (RAI). {{bibref|3GPP-TS.23.003|Section 4.2}} 
     * {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>rac</code>, or <code>null</code> if not present
     */
    java.lang.Short getRac();
    
    /**
     * Cell Identity. {{bibref|3GPP-TS.25.331|Section 10.3.2.2}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>ci</code>, or <code>null</code> if not present
     */
    java.lang.Integer getCi();
    
    /**
     * Received signal level in {{units}} of the BCCH carrier.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>rssi</code>, or <code>null</code> if not present
     */
    java.lang.Long getRssi();

}

