package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to Access Management, as defined in 
 * {{bibref|3GPP-TS.32.592}}/ Closed Subscriber Group (CSG) service behavior is 
 * specified in {{bibref|3GPP-TS.22.011}}. Note: Cell barring and 3GPP access 
 * parameters are contained in SIB1 in {{bibref|3GPP-TS.36.331}}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping access-mgmt-lte-g {
 *     leaf access-mode {
 *         type access-mode;
 *     }
 *     leaf max-u-es-served {
 *         type max-u-es-served;
 *     }
 *     leaf max-csg-members {
 *         type max-csg-members;
 *     }
 *     leaf max-non-csg-members {
 *         type max-non-csg-members;
 *     }
 *     leaf max-resource-non-csg-members {
 *         type uint8;
 *     }
 *     leaf csgid {
 *         type uint32;
 *     }
 *     leaf hnb-name {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/access-mgmt-lte-g</i>
 *
 */
public interface AccessMgmtLteG
    extends
    DataObject
{


    public enum AccessMode {
        /**
         * none
         *
         */
        OpenAccess(1, "open access"),
        
        /**
         * none
         *
         */
        ClosedAccess(2, "closed access"),
        
        /**
         * none
         *
         */
        HybridAccess(3, "hybrid access")
        ;
    
        private static final java.util.Map<java.lang.Integer, AccessMode> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, AccessMode> b = com.google.common.collect.ImmutableMap.builder();
            for (AccessMode enumItem : AccessMode.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private AccessMode(int value, java.lang.String name) {
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
         * @return corresponding AccessMode item
         */
        public static AccessMode forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-lte-g").intern();

    /**
     * Indicates the type of access mode the FAP operates in. {{enum}} Note: This 
     * parameter controls the setting of the CSGindicator bit, specified in SIB1 in 
     * {{bibref|3GPP-TS.36.331}}.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLteG.AccessMode</code> <code>accessMode</code>, or <code>null</code> if not present
     */
    AccessMode getAccessMode();
    
    /**
     * Maximum number of concurrent UEs allowed at a cell. Valid for any 
     * {{param|AccessMode}}. A value of -1 allows an unlimited number of concurrent UEs
     * up to the limit of FAP capacity. The setting does not affect emergency calls.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxUEsServed</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxUEsServed();
    
    /**
     * Maximum number of concurrent CSG member UEs allowed at a hybrid or closed cell. 
     * A value of -1 allows an unlimited number of CSG members up to the limit of FAP 
     * capacity. The setting cannot be larger than the value of {{param|MaxUEsServed}}.
     * The setting does not affect emergency calls. {{bibref|3GPP-TS.22.011}}, 
     * {{bibref|3GPP-TS.22.220}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxCsgMembers</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxCsgMembers();
    
    /**
     * Maximum number of concurerent non-CSG member UEs allowed at a hybrid cell. Valid
     * only if {{param|AccessMode}} is {{enum|Hybrid Access|AccessMode}}. The setting 
     * cannot be larger than the value of {{param|MaxUEsServed}}. The setting does not 
     * affect emergency calls.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxNonCsgMembers</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxNonCsgMembers();
    
    /**
     * Maximum percentage of physical resource that can be assigned to non-CSG members 
     * aggregately at one time. This applies to PDSCH physical resource blocks.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>maxResourceNonCsgMembers</code>, or <code>null</code> if not present
     */
    java.lang.Short getMaxResourceNonCsgMembers();
    
    /**
     * Defines the Closed Subscriber Group of the Access Control List. The LTE FAP 
     * broadcasts this in SIB1, and corresponds to parameter csg-Identity in SIB1 in 
     * {{bibref|3GPP-TS.36.331}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>csgid</code>, or <code>null</code> if not present
     */
    java.lang.Long getCsgid();
    
    /**
     * Home NodeB name. An operator-defined string that is broadcast by a CSG cell or a
     * hybrid cell and displayed on the UE for the purpose of manual cell selection or 
     * indication that the UE is camped on the cell as specified in 
     * {{bibref|3GPP-TS.22.220|Section 5.4.2}}. Corresponds to parameter 'hnb-Name' 
     * specified in SIB9 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>hnbName</code>, or <code>null</code> if not present
     */
    java.lang.String getHnbName();

}

