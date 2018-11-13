package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains all global attributes of the 1xFemto application.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-control-cdma2000-one-x-g {
 *     leaf admin-state {
 *         type enumeration;
 *     }
 *     leaf op-state {
 *         type enumeration;
 *     }
 *     leaf rf-tx-status {
 *         type boolean;
 *     }
 *     leaf daylight {
 *         type int64;
 *     }
 *     leaf max-p-rev {
 *         type int64;
 *     }
 *     leaf reregister {
 *         type uint64;
 *     }
 *     leaf emergency-session-period {
 *         type emergency-session-period;
 *     }
 *     leaf location-area-code {
 *         type uint16;
 *     }
 *     leaf msc-id {
 *         type uint64;
 *     }
 *     leaf active-handin-enable {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-cdma2000-one-x-g</i>
 *
 */
public interface FapControlCdma2000OneXG
    extends
    DataObject
{


    public enum AdminState {
        /**
         * none
         *
         */
        Lock(1, "lock"),
        
        /**
         * none
         *
         */
        Unlock(2, "unlock")
        ;
    
        private static final java.util.Map<java.lang.Integer, AdminState> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, AdminState> b = com.google.common.collect.ImmutableMap.builder();
            for (AdminState enumItem : AdminState.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private AdminState(int value, java.lang.String name) {
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
         * @return corresponding AdminState item
         */
        public static AdminState forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum OpState {
        /**
         * none
         *
         */
        Enabled(1, "enabled"),
        
        /**
         * none
         *
         */
        Disabled(2, "disabled")
        ;
    
        private static final java.util.Map<java.lang.Integer, OpState> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OpState> b = com.google.common.collect.ImmutableMap.builder();
            for (OpState enumItem : OpState.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private OpState(int value, java.lang.String name) {
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
         * @return corresponding OpState item
         */
        public static OpState forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-one-x-g").intern();

    /**
     * Administrative state for 1x
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG.AdminState</code> <code>adminState</code>, or <code>null</code> if not present
     */
    AdminState getAdminState();
    
    /**
     * Operational state of the 1x
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG.OpState</code> <code>opState</code>, or <code>null</code> if not present
     */
    OpState getOpState();
    
    /**
     * Current status of this RF transmitter. {{true}} indicates that the 3G Tx 
     * transmitter is on. {{false}} indicates that the 3G Tx transmitter is off. This 
     * state is tied to the Administrative state which is controlled by the ACS. When 
     * the ACS sets AdminState to {{true}}, then the FAP has permission to turn on the 
     * RF transmitter. When the ACS sets AdminState to {{false}}, then the FAP is not 
     * allowed to provide service and MUST turn off the RF transmitter.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>rfTxStatus</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isRfTxStatus();
    
    /**
     * If Daylight Savings Time is being used with respect to CDMA2000 1x overhead 
     * parameters (see {{bibref|3GPP2-C.S0005}}), then {{param}} should be set to 
     * {{true}}. Otherwise, {{param}} should be set to {{false}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>daylight</code>, or <code>null</code> if not present
     */
    java.lang.Long getDaylight();
    
    /**
     * Protocol revision supported by the FAP.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxPRev</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxPRev();
    
    /**
     * {{param}} triggers a re-registration of all mobiles. The FAP triggers 
     * re-registration of all registered mobiles everytime this number changes
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>reregister</code>, or <code>null</code> if not present
     */
    BigInteger getReregister();
    
    /**
     * The period (in {{units}}) the session of an unauthorized user is kept alive 
     * after an emergency call.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>emergencySessionPeriod</code>, or <code>null</code> if not present
     */
    java.lang.Integer getEmergencySessionPeriod();
    
    /**
     * This is the location area code.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>locationAreaCode</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLocationAreaCode();
    
    /**
     * This is the FAP's MSCID. This ID is used in PANI header.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>mscId</code>, or <code>null</code> if not present
     */
    BigInteger getMscId();
    
    /**
     * Indicates whether the FAP performs active hand-in from another base station. If 
     * {{true}} active hand-in is enabled; if {{false}} active hand-in is disabled.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>activeHandinEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isActiveHandinEnable();

}

