package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * Table containing the system information broadcast in the BCCH logical channel.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-umts-wcdma-cell-bcch-g {
 *     leaf plmn-type {
 *         type enumeration;
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
 *     leaf cell-id {
 *         type uint32;
 *     }
 *     leaf pcpich-tx-power {
 *         type int64;
 *     }
 *     leaf csg-indicator {
 *         type boolean;
 *     }
 *     leaf csgid {
 *         type uint32;
 *     }
 *     leaf-list uarfcndl-list {
 *         type uint16;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-umts-wcdma-cell-bcch-g</i>
 *
 */
public interface RemUmtsWcdmaCellBcchG
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
        "2018-04-08", "rem-umts-wcdma-cell-bcch-g").intern();

    /**
     * Type of Public Land Mobile Network (PLMN).
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchG.PlmnType</code> <code>plmnType</code>, or <code>null</code> if not present
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
     * Location Area Code (LAC) as defined in SIB 1 {{bibref|3GPP-TS.25.331}}. The 
     * concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the LAI (Location
     * Area ID) {{bibref|3GPP-TS.23.003}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>lac</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLac();
    
    /**
     * Routing Area Code (RAC) as defined in SIB 1 {{bibref|3GPP-TS.25.331}}. The 
     * concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the RAI 
     * (Routing Area ID) {{bibref|3GPP-TS.23.003}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>rac</code>, or <code>null</code> if not present
     */
    java.lang.Short getRac();
    
    /**
     * Cell Identity as defined in SIB3 {{bibref|3GPP-TS.25.331|Section10.3.2.2}}. 
     * {{bibref|3GPP-TS.24.008}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>cellId</code>, or <code>null</code> if not present
     */
    java.lang.Long getCellId();
    
    /**
     * Primary Common Pilot Channel (CPICH) power level on SIB 5/6 
     * {{bibref|3GPP-TS.25.331|Section10.3.6.55}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pcpichTxPower</code>, or <code>null</code> if not present
     */
    java.lang.Long getPcpichTxPower();
    
    /**
     * The CSG-indicator Information Element (IE) in the Master Information Block 
     * reflects the access mode of the CSG cell. It is hence dependent on the value of 
     * {{param|.AccessMgmt.UMTS.AccessMode}}. If {{true}} the CSG-indicator IE is 
     * present, reflecting closed access to the CSG cell. If {{false}} the 
     * CSG-indicator IE is absent, reflecting the access mode as "not a closed-access".
     * {{bibref|3GPP-TS.25.331|Section 10.2.48.8.1}}
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>csgIndicator</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isCsgIndicator();
    
    /**
     * Defines the Closed Subscriber Group of the Access Control List. FAP broadcasts 
     * this CSG ID in SIB3 {{bibref|3GPP-TS.25.331|Section10.3.2.8}} depending on the 
     * AccessMode.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>csgid</code>, or <code>null</code> if not present
     */
    java.lang.Long getCsgid();
    
    /**
     * {{list}} Each item is a UTRA Absolute Radio Frequency Channel Number (UARFCN} in
     * the DL direction dedicated to the CSG cells. {{param}} is broadcast in SIB 11bis
     * {{bibref|3GPP-TS.25.331|Section 10.2.48.8.14a}}. The corresponding UTRA Absolute
     * Radio Frequency Channel Number (UARFCN} in the UL direction is derived based on 
     * the fixed offset applicable for the frequency band.
     *
     *
     *
     * @return <code>java.util.List</code> <code>uarfcndlList</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getUarfcndlList();

}

