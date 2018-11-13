package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

/**
 * The Batch configuration Object used to configure PDSN table using a start and 
 * end IP address. The order of the address is used as part of PDSN selection 
 * algorithm, e.g., the first element is considered PDSN number 0. (Refer to 
 * {{bibref|3GPP2-A.S0013}}). To get individual PDSN entries use the 
 * {{object|.CellConfig.CDMA2000.OneX.PCFPDSN.{i}.}}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-batch-pcfpdsn-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf batch-table-number {
 *         type int64;
 *     }
 *     leaf batch-table-start-ip-address {
 *         type ip-address;
 *     }
 *     leaf batch-table-end-ip-address {
 *         type ip-address;
 *     }
 *     leaf batch-table-security-parameter-index {
 *         type uint32;
 *     }
 *     leaf batch-table-secret-key {
 *         type binary;
 *     }
 *     leaf batch-table-ios-version {
 *         type enumeration;
 *     }
 *     leaf batch-table-pdsn-admin-status {
 *         type int64;
 *     }
 *     leaf pdsn-type {
 *         type enumeration;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-batch-pcfpdsn-g</i>
 *
 */
public interface Cdma2000OneXBatchPcfpdsnG
    extends
    DataObject
{


    public enum BatchTableIosVersion {
        /**
         * none
         *
         */
        Tia878Ballot(1, "tia-878-ballot"),
        
        /**
         * none
         *
         */
        Tia8781(2, "tia-878-1"),
        
        /**
         * none
         *
         */
        Tia878A(3, "tia-878-a"),
        
        /**
         * none
         *
         */
        Tia878Legacy(4, "tia-878-legacy")
        ;
    
        private static final java.util.Map<java.lang.Integer, BatchTableIosVersion> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, BatchTableIosVersion> b = com.google.common.collect.ImmutableMap.builder();
            for (BatchTableIosVersion enumItem : BatchTableIosVersion.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private BatchTableIosVersion(int value, java.lang.String name) {
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
         * @return corresponding BatchTableIosVersion item
         */
        public static BatchTableIosVersion forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum PdsnType {
        /**
         * none
         *
         */
        OneX(1, "one-x"),
        
        /**
         * none
         *
         */
        HrpdRev0(2, "hrpd-rev0"),
        
        /**
         * none
         *
         */
        HrpdRevA(3, "hrpd-rev-a")
        ;
    
        private static final java.util.Map<java.lang.Integer, PdsnType> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, PdsnType> b = com.google.common.collect.ImmutableMap.builder();
            for (PdsnType enumItem : PdsnType.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private PdsnType(int value, java.lang.String name) {
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
         * @return corresponding PdsnType item
         */
        public static PdsnType forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-batch-pcfpdsn-g").intern();

    /**
     * Enables or disables the {{object}} entry.
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
     * The BatchTable Number should be given only once during the creation of a Batch 
     * Table. This is the Key Attribute that uniquely identifies a BatchTable entry. 
     * This number indicates the index of this batch to determine the PDSN number in 
     * the PDSN selection algorithm ({{bibref|3GPP2-A.S0013}}).
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>batchTableNumber</code>, or <code>null</code> if not present
     */
    java.lang.Long getBatchTableNumber();
    
    /**
     * Start IP address of the range of PDSNs.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>batchTableStartIpAddress</code>, or <code>null</code> if not present
     */
    IpAddress getBatchTableStartIpAddress();
    
    /**
     * End IP address of the range of PDSNs.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>batchTableEndIpAddress</code>, or <code>null</code> if not present
     */
    IpAddress getBatchTableEndIpAddress();
    
    /**
     * Security Parameter Index to be used.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>batchTableSecurityParameterIndex</code>, or <code>null</code> if not present
     */
    java.lang.Long getBatchTableSecurityParameterIndex();
    
    /**
     * Secret key in 32-digit hexidecimal representation.
     *
     *
     *
     * @return <code>byte[]</code> <code>batchTableSecretKey</code>, or <code>null</code> if not present
     */
    byte[] getBatchTableSecretKey();
    
    /**
     * IOS Version of this PDSN.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXBatchPcfpdsnG.BatchTableIosVersion</code> <code>batchTableIosVersion</code>, or <code>null</code> if not present
     */
    BatchTableIosVersion getBatchTableIosVersion();
    
    /**
     * Administrative status of this PDSN. 0- UP 1-DOWN.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>batchTablePdsnAdminStatus</code>, or <code>null</code> if not present
     */
    java.lang.Long getBatchTablePdsnAdminStatus();
    
    /**
     * Indicates the PDSN type for this batch.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXBatchPcfpdsnG.PdsnType</code> <code>pdsnType</code>, or <code>null</code> if not present
     */
    PdsnType getPdsnType();

}

