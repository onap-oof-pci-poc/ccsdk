package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to configuring UMTS CN.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-cn-g {
 *     leaf plmn-type {
 *         type enumeration;
 *     }
 *     leaf plmnid {
 *         type string;
 *     }
 *     leaf-list equiv-plmnid {
 *         type string;
 *     }
 *     leaf sac {
 *         type uint16;
 *     }
 *     leaf broadcast-sac {
 *         type uint16;
 *     }
 *     leaf-list lacrac {
 *         type string;
 *     }
 *     leaf lac-in-use {
 *         type uint16;
 *     }
 *     leaf rac-in-use {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-cn-g</i>
 *
 */
public interface UmtsCnG
    extends
    DataObject
{


    public enum PlmnType {
        /**
         * none
         *
         */
        GsmMap(1, "gsm-map"),
        
        /**
         * none
         *
         */
        Ansi41(2, "ansi-41")
        ;
    
        private static final java.util.Map<java.lang.Integer, PlmnType> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, PlmnType> b = com.google.common.collect.ImmutableMap.builder();
            for (PlmnType enumItem : PlmnType.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private PlmnType(int value, java.lang.String name) {
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
         * @return corresponding PlmnType item
         */
        public static PlmnType forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-cn-g").intern();

    /**
     * Type of Public Land Mobile Network (PLMN).
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG.PlmnType</code> <code>plmnType</code>, or <code>null</code> if not present
     */
    PlmnType getPlmnType();
    
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
     * {{list}} Each item is a PLMNID. PLMN ID consists of Mobile Country Code (MCC) 
     * and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, 
     * {{bibref|3GPP-TS.24.008}}. Mobile Country Code consists of three digits and 
     * uniquely identifies the country of domicile of the subscriber. Mobile Network 
     * Code consists of two or three digits and identifies the Home PLMN within a 
     * country. For a 2-digit MNC the total string length of the PLMNID is 5.
     *
     *
     *
     * @return <code>java.util.List</code> <code>equivPlmnid</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getEquivPlmnid();
    
    /**
     * Service Area Code (SAC) {{bibref|3GPP-TS.23.003}}. The concatenation of PLMN ID 
     * (MCC+MNC), LAC, and SAC uniquely identifies the Service Area ID (SAI).
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>sac</code>, or <code>null</code> if not present
     */
    java.lang.Integer getSac();
    
    /**
     * Service Area Code (SAC) for broadcast. The format of this parameter is the same 
     * with {{param|SAC}}, and it uniquely identifies the Service Area ID (SAI) for 
     * Earthquake and Tsunami Warning Services (ETWS) {{bibref|3GPP-TS.25.469|Section 
     * 9.1.3}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>broadcastSac</code>, or <code>null</code> if not present
     */
    java.lang.Integer getBroadcastSac();
    
    /**
     * {{list}} Each item is a LAC/RAC combination expressed in the following format: 
     * :&amp;lt;LAC or LACrange&amp;gt;':'&amp;lt;RAC or RACrange&amp;gt; Where LAC and
     * RAC are single values, while LACrange and RACrange are inclusive and can be 
     * expressed in the following format: 
     * :&amp;lt;Start-value&amp;gt;".."&amp;lt;End-value&amp;gt; Location Area Code 
     * (LAC) consists of up to 5 numerical characters. The concatenation of PLMN ID 
     * (MCC+MNC) and LAC uniquely identifies the Location Area ID (LAI). 
     * {{bibref|3GPP-TS.23.003|Section 4.1}} {{bibref|3GPP-TS.25.413|Section 9.2.3.6}}.
     * Routing Area Code (RAC) consists of up to 3 numerical characters. The 
     * concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing
     * Area ID (RAI). {{bibref|3GPP-TS.23.003|Section 4.2}} 
     * {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}. The FAP is to select one LAC and RAC 
     * from the combination(s) expressed in this parameter for use in 
     * {{param|LACInUse}} and {{param|RACInUse}} respectively. If a LAC occurs more 
     * than once in the list, this shall not increase the chance that it is selected 
     * over other LAC values in the list. The following are examples of the valid 
     * LACRAC combination formats: :"64000:210" ::(one list item with single value for 
     * LAC and RAC) :"64000..64100:210, 64101:211" ::(two list items, first item has a 
     * LAC range) :"64000:210..214, 64001:215..219" ::(two list items, both items have 
     * a RAC range for a specific LAC value) :"64000..64100:210..214" ::(one list item 
     * both have a LAC range and a RAC range)
     *
     *
     *
     * @return <code>java.util.List</code> <code>lacrac</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getLacrac();
    
    /**
     * The LAC being used by the FAP. Self-configuration for LAC is controlled by 
     * {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability 
     * perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} 
     * from an enabled perspective. If the self-configuration capability is available 
     * and enabled, this parameter indicates the value selected by the FAP among the 
     * choices provided in {{param|LACRAC}}. If the self-configuration capability is 
     * not available or not enabled, then this parameter contains the first LAC value 
     * in {{param|LACRAC}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>lacInUse</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLacInUse();
    
    /**
     * The RAC being used by the FAP. Self-configuration for RAC is controlled by 
     * {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability 
     * perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} 
     * from an enabled perspective. If the self-configuration capability is available 
     * and enabled, this parameter indicates the value selected by the FAP among the 
     * choices provided in {{param|LACRAC}}. If the self-configuration capability is 
     * not available or not enabled, then this parameter contains the first RAC value 
     * in {{param|LACRAC}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>racInUse</code>, or <code>null</code> if not present
     */
    java.lang.Short getRacInUse();

}

