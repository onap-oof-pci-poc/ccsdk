package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * This object contains parameters relating to configuring LTE EPC.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-epc-g {
 *     leaf-list allowed-ciphering-algorithm-list {
 *         type enumeration;
 *     }
 *     leaf-list allowed-integrity-protection-algorithm-list {
 *         type enumeration;
 *     }
 *     leaf tac {
 *         type uint16;
 *     }
 *     leaf eaid {
 *         type uint32;
 *     }
 *     leaf max-plmn-list-entries {
 *         type uint64;
 *     }
 *     leaf plmn-list-number-of-entries {
 *         type uint64;
 *     }
 *     leaf max-qo-s-entries {
 *         type uint64;
 *     }
 *     leaf qo-s-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-epc-g</i>
 *
 */
public interface LteEpcG
    extends
    DataObject
{


    public enum AllowedCipheringAlgorithmList {
        /**
         * none
         *
         */
        Eea0(1, "eea0"),
        
        /**
         * none
         *
         */
        _128Eea1(2, "128-eea1"),
        
        /**
         * none
         *
         */
        _128Eea2(3, "128-eea2")
        ;
    
        private static final java.util.Map<java.lang.Integer, AllowedCipheringAlgorithmList> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, AllowedCipheringAlgorithmList> b = com.google.common.collect.ImmutableMap.builder();
            for (AllowedCipheringAlgorithmList enumItem : AllowedCipheringAlgorithmList.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private AllowedCipheringAlgorithmList(int value, java.lang.String name) {
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
         * @return corresponding AllowedCipheringAlgorithmList item
         */
        public static AllowedCipheringAlgorithmList forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum AllowedIntegrityProtectionAlgorithmList {
        /**
         * none
         *
         */
        _128Eia1(1, "128-eia1"),
        
        /**
         * none
         *
         */
        _128Eia2(2, "128-eia2")
        ;
    
        private static final java.util.Map<java.lang.Integer, AllowedIntegrityProtectionAlgorithmList> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, AllowedIntegrityProtectionAlgorithmList> b = com.google.common.collect.ImmutableMap.builder();
            for (AllowedIntegrityProtectionAlgorithmList enumItem : AllowedIntegrityProtectionAlgorithmList.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private AllowedIntegrityProtectionAlgorithmList(int value, java.lang.String name) {
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
         * @return corresponding AllowedIntegrityProtectionAlgorithmList item
         */
        public static AllowedIntegrityProtectionAlgorithmList forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-epc-g").intern();

    /**
     * {{list}} Each item is a ciphering algorithm allowed to be used for RRC and UP 
     * confidentiality protection as defined in {{bibref|3GPP-TS.33.401}}. If the list 
     * contains more than 1 item, it is in the order of the preferred algorithm to be 
     * used. {{enum}}
     *
     *
     *
     * @return <code>java.util.List</code> <code>allowedCipheringAlgorithmList</code>, or <code>null</code> if not present
     */
    List<AllowedCipheringAlgorithmList> getAllowedCipheringAlgorithmList();
    
    /**
     * {{list}} Each item is a integrity protection algorithm allowed to be used for 
     * RRC as defined in {{bibref|3GPP-TS.33.401}}. If the list contains more than 1 
     * item, it is in the order of the preferred algorithm to be used. {{enum}}
     *
     *
     *
     * @return <code>java.util.List</code> <code>allowedIntegrityProtectionAlgorithmList</code>, or <code>null</code> if not present
     */
    List<AllowedIntegrityProtectionAlgorithmList> getAllowedIntegrityProtectionAlgorithmList();
    
    /**
     * TAC (Tracking Area Code) for LTE FAP as specified in SystemInformationBlockType1
     * message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>tac</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTac();
    
    /**
     * Emergency Area ID that uniquely identifies the area of emergency for Earthquake 
     * and Tsunami Warning Services (ETWS). Corresponds to Emergency Area ID in 
     * {{bibref|3GPP-TS.36.413|Section 9.2.1.47}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>eaid</code>, or <code>null</code> if not present
     */
    java.lang.Long getEaid();
    
    /**
     * The maximum number of entries available in the 
     * {{object|.CellConfig.LTE.EPC.PLMNList.{i}.}} table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxPlmnListEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxPlmnListEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>plmnListNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getPlmnListNumberOfEntries();
    
    /**
     * The maximum number of entries in the {{object|.CellConfig.LTE.EPC.QoS.{i}.}} 
     * table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxQoSEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxQoSEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>qoSNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getQoSNumberOfEntries();

}

