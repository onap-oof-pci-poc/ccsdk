package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the system and RF aspect of the FAP 
 * device that supports the LTE system.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping capabilities-lte-g {
 *     leaf duplex-mode {
 *         type enumeration;
 *     }
 *     leaf-list bands-supported {
 *         type uint8;
 *     }
 *     leaf nnsf-supported {
 *         type boolean;
 *     }
 *     leaf umts-rx-supported {
 *         type boolean;
 *     }
 *     leaf-list umts-rx-bands-supported {
 *         type string;
 *     }
 *     leaf gsm-rx-supported {
 *         type boolean;
 *     }
 *     leaf-list gsm-rx-bands-supported {
 *         type enumeration;
 *     }
 *     leaf cdma2000-rx-supported {
 *         type boolean;
 *     }
 *     leaf-list cdma2000-rx-bands-supported {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/capabilities-lte-g</i>
 *
 */
public interface CapabilitiesLteG
    extends
    DataObject
{


    public enum DuplexMode {
        /**
         * none
         *
         */
        FddMode(1, "fdd-mode"),
        
        /**
         * none
         *
         */
        TddMode(2, "tdd-mode")
        ;
    
        private static final java.util.Map<java.lang.Integer, DuplexMode> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, DuplexMode> b = com.google.common.collect.ImmutableMap.builder();
            for (DuplexMode enumItem : DuplexMode.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private DuplexMode(int value, java.lang.String name) {
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
         * @return corresponding DuplexMode item
         */
        public static DuplexMode forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum GsmRxBandsSupported {
        /**
         * none
         *
         */
        TGsm380(1, "t-gsm380"),
        
        /**
         * none
         *
         */
        TGsm410(2, "t-gsm410"),
        
        /**
         * none
         *
         */
        Gsm450(3, "gsm450"),
        
        /**
         * none
         *
         */
        Gsm480(4, "gsm480"),
        
        /**
         * none
         *
         */
        Gsm710(5, "gsm710"),
        
        /**
         * none
         *
         */
        Gsm750(6, "gsm750"),
        
        /**
         * none
         *
         */
        TGsm810(7, "t-gsm810"),
        
        /**
         * none
         *
         */
        Gsm850(8, "gsm850"),
        
        /**
         * none
         *
         */
        PGsm900(9, "p-gsm900"),
        
        /**
         * none
         *
         */
        EGsm900(10, "e-gsm900"),
        
        /**
         * none
         *
         */
        RGsm900(11, "r-gsm900"),
        
        /**
         * none
         *
         */
        TGsm900(12, "t-gsm900"),
        
        /**
         * none
         *
         */
        Dcs1800(13, "dcs1800"),
        
        /**
         * none
         *
         */
        Pcs1900(14, "pcs1900")
        ;
    
        private static final java.util.Map<java.lang.Integer, GsmRxBandsSupported> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, GsmRxBandsSupported> b = com.google.common.collect.ImmutableMap.builder();
            for (GsmRxBandsSupported enumItem : GsmRxBandsSupported.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private GsmRxBandsSupported(int value, java.lang.String name) {
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
         * @return corresponding GsmRxBandsSupported item
         */
        public static GsmRxBandsSupported forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-lte-g").intern();

    /**
     * Indicates the mode supported by the LTE FAP. {{enum}}
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG.DuplexMode</code> <code>duplexMode</code>, or <code>null</code> if not present
     */
    DuplexMode getDuplexMode();
    
    /**
     * {{list}} Indicates the LTE bands that the LTE FAP supports 
     * {{bibref|3GPP-TS.36.101|Section 5.5}}. At least one band MUST be supported and 
     * multiple bands MAY be supported. Each individual band is identified by arabic 
     * number (1, 2,...). The order of the band indicators in the string has no 
     * significance. In case a new band is defined in the 3GPP standard in a future 
     * release of {{bibref|3GPP-TS.36.101}}, the corresponding new band number will be 
     * included in the valid band indicators. The followings are examples of valid 
     * values: :"1" (specifies only band-1 is supported) :"1,2,11" (specifies 3 bands 
     * are supported) :"2,11,1" (specifies 3 bands are supported)
     *
     *
     *
     * @return <code>java.util.List</code> <code>bandsSupported</code>, or <code>null</code> if not present
     */
    List<java.lang.Short> getBandsSupported();
    
    /**
     * Indicates whether LTE FAP supports the NAS Node Selection Function (NNSF) or 
     * not. NNSF is described in {{bibref|3GPP-TS.36.300|Section 19.2.1.7 and Section 
     * 4.6.1}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>nnsfSupported</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isNnsfSupported();
    
    /**
     * Indicates whether the LTE FAP hardware supports the receiving function of UMTS 
     * or not.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>umtsRxSupported</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isUmtsRxSupported();
    
    /**
     * {{list}} Indicates the UMTS receive bands that the LTE FAP supports 
     * {{bibref|3GPP-TS.25.104}}, Release 8. If {{param|UMTSRxSupported}} is {{true}}, 
     * then at least one band MUST be supported and multiple bands MAY be supported. 
     * Each individual band is identified by its upper case Roman numeral. The order of
     * the band indicators in the string has no significance. In case a new band is 
     * defined in the 3GPP standard in a future release of {{bibref|3GPP-TS.25.104}}, 
     * the corresponding new upper case Roman numeral will be included in the valid 
     * band indicators. The followings are examples of valid values: :"I" (specifies 
     * only band-I is supported) :"I,II,V" (specifies 3 bands are supported) 
     * :"II,VII,I" (specifies 3 bands are supported)
     *
     *
     *
     * @return <code>java.util.List</code> <code>umtsRxBandsSupported</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getUmtsRxBandsSupported();
    
    /**
     * Indicates whether the LTE FAP hardware supports the receiving function of GSM or
     * not.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>gsmRxSupported</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isGsmRxSupported();
    
    /**
     * {{list}} Indicates the GSM receive bands that the LTE FAP supports 
     * {{bibref|3GPP-TS.45.005}}. If {{param|GSMRxSupported}} is {{true}}, then at 
     * least one band MUST be supported and multiple bands MAY be supported. 
     * {{bibref|3GPP-TS.45.005}} defines 14 GSM bands. {{enum}} The order of the band 
     * indicators in the string has no significance. The following is an example of a 
     * valid value. :"GSM850,PCS1900"
     *
     *
     *
     * @return <code>java.util.List</code> <code>gsmRxBandsSupported</code>, or <code>null</code> if not present
     */
    List<GsmRxBandsSupported> getGsmRxBandsSupported();
    
    /**
     * Indicates whether the LTE FAP hardware supports the receiving function of 
     * CDMA2000 or not.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>cdma2000RxSupported</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isCdma2000RxSupported();
    
    /**
     * {{list}} Indicates the CDMA2000 receive bands that the LTE FAP supports. If 
     * {{param|CDMA2000RxSupported}} is {{true}}, then at least one band MUST be 
     * supported and multiple bands MAY be supported. The order of the band indicators 
     * in the string has no significance. Bandclass is a 1 or 2-digit number as defined
     * in {{bibref|3GPP2-C.S0057-B}}. The following are example values: :"0" (specifies
     * US Cellular) :"1,3,14" (specifies US PCS, Japan Cellular and US PCS 1.9Ghz) 
     * specifies 3 bands are supported)
     *
     *
     *
     * @return <code>java.util.List</code> <code>cdma2000RxBandsSupported</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getCdma2000RxBandsSupported();

}

