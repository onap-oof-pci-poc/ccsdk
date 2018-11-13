package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

/**
 * PCFPDSN Object configured for 1x. 
 * {{object|.CellConfig.CDMA2000.OneX.BatchPCFPDSN.{i}.}} table should be used to 
 * configure PDSN details.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-pcfpdsn-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf pdsn-number {
 *         type int64;
 *     }
 *     leaf security-parameter-index {
 *         type uint32;
 *     }
 *     leaf security-key {
 *         type binary;
 *     }
 *     leaf ios-version {
 *         type enumeration;
 *     }
 *     leaf pds-nadmin-status {
 *         type int64;
 *     }
 *     leaf pdsn-health-status {
 *         type uint8;
 *     }
 *     leaf pdsnip-address {
 *         type ip-address;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-pcfpdsn-g</i>
 *
 */
public interface Cdma2000OneXPcfpdsnG
    extends
    DataObject
{


    public enum IosVersion {
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
    
        private static final java.util.Map<java.lang.Integer, IosVersion> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, IosVersion> b = com.google.common.collect.ImmutableMap.builder();
            for (IosVersion enumItem : IosVersion.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private IosVersion(int value, java.lang.String name) {
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
         * @return corresponding IosVersion item
         */
        public static IosVersion forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-pcfpdsn-g").intern();

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
     * Index of this PDSN object in the PCFPDSNCollection array. The index is used as 
     * PDSN number in PDSN selection algorithm. ({{bibref|3GPP2-A.S0013}})
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pdsnNumber</code>, or <code>null</code> if not present
     */
    java.lang.Long getPdsnNumber();
    
    /**
     * Security Parameter Index used
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>securityParameterIndex</code>, or <code>null</code> if not present
     */
    java.lang.Long getSecurityParameterIndex();
    
    /**
     * Secret key in 32-digit hexidecimal representation.
     *
     *
     *
     * @return <code>byte[]</code> <code>securityKey</code>, or <code>null</code> if not present
     */
    byte[] getSecurityKey();
    
    /**
     * HRPD IOS Version of this PDSN.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG.IosVersion</code> <code>iosVersion</code>, or <code>null</code> if not present
     */
    IosVersion getIosVersion();
    
    /**
     * Administrative status of this PDSN. 0- UP 1-DOWN.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pdsNadminStatus</code>, or <code>null</code> if not present
     */
    java.lang.Long getPdsNadminStatus();
    
    /**
     * Reachability status of this PDSN. 0-unreachable, 1-reachable.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>pdsnHealthStatus</code>, or <code>null</code> if not present
     */
    java.lang.Short getPdsnHealthStatus();
    
    /**
     * IP address of the PDSN.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>pdsnipAddress</code>, or <code>null</code> if not present
     */
    IpAddress getPdsnipAddress();

}

