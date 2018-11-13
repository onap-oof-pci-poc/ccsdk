package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * This object contains parameters relating to the system and RF aspect of the FAP 
 * device that supports the UMTS system.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping capabilities-umts-g {
 *     leaf duplex-mode {
 *         type enumeration;
 *     }
 *     leaf gsm-rx-supported {
 *         type boolean;
 *     }
 *     leaf hsdpa-supported {
 *         type boolean;
 *     }
 *     leaf max-hsdpa-data-rate-supported {
 *         type max-hsdpa-data-rate-supported;
 *     }
 *     leaf hsupa-supported {
 *         type boolean;
 *     }
 *     leaf max-hsupa-data-rate-supported {
 *         type max-hsupa-data-rate-supported;
 *     }
 *     leaf max-hspdsc-hs-supported {
 *         type uint8;
 *     }
 *     leaf max-hsscc-hs-supported {
 *         type uint64;
 *     }
 *     leaf-list fdd-bands-supported {
 *         type string;
 *     }
 *     leaf-list gsm-rx-bands-supported {
 *         type enumeration;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/capabilities-umts-g</i>
 *
 */
public interface CapabilitiesUmtsG
    extends
    DataObject
{


    public enum DuplexMode {
        /**
         * none
         *
         */
        FddMode(1, "fdd-mode")
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
        "2018-04-08", "capabilities-umts-g").intern();

    /**
     * Indicates the mode supported by the FAP. {{enum}}
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG.DuplexMode</code> <code>duplexMode</code>, or <code>null</code> if not present
     */
    DuplexMode getDuplexMode();
    
    /**
     * Indicates whether the FAP hardware supports the receiving function of GSM or 
     * not.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>gsmRxSupported</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isGsmRxSupported();
    
    /**
     * Indicates whether the FAP hardware supports the HSDPA capability or not.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>hsdpaSupported</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isHsdpaSupported();
    
    /**
     * If the FAP hardware supports HSDPA ({{param|HSDPASupported}} is {{true}}), this 
     * parameter indicates the maximum HSDPA data rate in {{units}} that the device 
     * supports.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxHsdpaDataRateSupported</code>, or <code>null</code> if not present
     */
    BigInteger getMaxHsdpaDataRateSupported();
    
    /**
     * Indicates whether the FAP hardware supports the HSUPA capability or not.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>hsupaSupported</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isHsupaSupported();
    
    /**
     * If the FAP hardware supports HSUPA ({{param|HSUPASupported}} is {{true}}), this 
     * parameter indicates the maximum HSUPA data rate in {{units}} that the device 
     * supports.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxHsupaDataRateSupported</code>, or <code>null</code> if not present
     */
    BigInteger getMaxHsupaDataRateSupported();
    
    /**
     * If the FAP hardware supports HSPA family (either {{param|HSDPASupported}} is 
     * {{true}} or {{param|HSUPASupported}} is {{true}}), this parameter indicates the 
     * available number of codes at the defined spreading factor (SF=16), within the 
     * complete code tree. See {{bibref|3GPP-TS.32.642|Section 6.3.9}} for more 
     * details.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>maxHspdscHsSupported</code>, or <code>null</code> if not present
     */
    java.lang.Short getMaxHspdscHsSupported();
    
    /**
     * If the FAP hardware supports HSPA family (either {{param|HSDPASupported}} is 
     * {{true}} or {{param|HSUPASupported}} is {{true}}), this parameter indicates the 
     * available number of HS-SCCHs for one cell. See {{bibref|3GPP-TS.32.642|Section 
     * 6.3.9}} for more details.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxHssccHsSupported</code>, or <code>null</code> if not present
     */
    BigInteger getMaxHssccHsSupported();
    
    /**
     * {{list}} Indicates the UMTS bands that the FAP supports 
     * {{bibref|3GPP-TS.25.104}}, Release 8. At least one band MUST be supported and 
     * multiple bands MAY be supported. {{bibref|3GPP-TS.25.104}} Version 8.3.0 defines
     * 14 UMTS bands (I through XIV). Each individual band is identified by its upper 
     * case Roman numeral. The order of the band indicators in the string has no 
     * significance. In case a new band is defined in the 3GPP standard in a future 
     * release of {{bibref|3GPP-TS.25.104}}, the corresponding new upper case Roman 
     * numeral will be included in the valid band indicators. The followings are 
     * examples of valid values: :"I" (specifies only band-I is supported) :"I,II,V" 
     * (specifies 3 bands are supported) :"II,VII,I" (specifies 3 bands are supported)
     *
     *
     *
     * @return <code>java.util.List</code> <code>fddBandsSupported</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getFddBandsSupported();
    
    /**
     * {{list}} Indicates the GSM receive bands that the FAP supports 
     * {{bibref|3GPP-TS.45.005}}. At least one band MUST be supported and multiple 
     * bands MAY be supported. {{bibref|3GPP-TS.45.005}} defines 14 GSM bands. {{enum}}
     * The order of the band indicators in the string has no significance. The 
     * following is an example of a valid value. :"GSM850,PCS1900"
     *
     *
     *
     * @return <code>java.util.List</code> <code>gsmRxBandsSupported</code>, or <code>null</code> if not present
     */
    List<GsmRxBandsSupported> getGsmRxBandsSupported();

}

