package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Shared Secret Table. This table gathers information about all types of shared 
 * secret-based credentials (UICC).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping transport-security-secret-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf type {
 *         type enumeration;
 *     }
 *     leaf status {
 *         type enumeration;
 *     }
 *     leaf uicc-card-id {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/transport-security-secret-g</i>
 *
 */
public interface TransportSecuritySecretG
    extends
    DataObject
{


    public enum Type {
        /**
         * none
         *
         */
        Sim(1, "sim"),
        
        /**
         * none
         *
         */
        Usim(2, "usim")
        ;
    
        private static final java.util.Map<java.lang.Integer, Type> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Type> b = com.google.common.collect.ImmutableMap.builder();
            for (Type enumItem : Type.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private Type(int value, java.lang.String name) {
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
         * @return corresponding Type item
         */
        public static Type forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum Status {
        /**
         * none
         *
         */
        Present(1, "present"),
        
        /**
         * none
         *
         */
        NotPresent(2, "not-present"),
        
        /**
         * none
         *
         */
        Error(3, "error")
        ;
    
        private static final java.util.Map<java.lang.Integer, Status> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Status> b = com.google.common.collect.ImmutableMap.builder();
            for (Status enumItem : Status.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private Status(int value, java.lang.String name) {
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
         * @return corresponding Status item
         */
        public static Status forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport-security-secret-g").intern();

    /**
     * Enable or disable this Shared Secret entry
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnable();
    
    /**
     * The type of this Shared Secret entry.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSecuritySecretG.Type</code> <code>type</code>, or <code>null</code> if not present
     */
    Type getType();
    
    /**
     * The status of this Shared Secret entry.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSecuritySecretG.Status</code> <code>status</code>, or <code>null</code> if not present
     */
    Status getStatus();
    
    /**
     * The UICC Card Identifier (UICCID), only numeric values are allowed. 
     * {{bibref|ITU-E.118}}
     *
     *
     *
     * @return <code>java.lang.String</code> <code>uiccCardId</code>, or <code>null</code> if not present
     */
    java.lang.String getUiccCardId();

}

