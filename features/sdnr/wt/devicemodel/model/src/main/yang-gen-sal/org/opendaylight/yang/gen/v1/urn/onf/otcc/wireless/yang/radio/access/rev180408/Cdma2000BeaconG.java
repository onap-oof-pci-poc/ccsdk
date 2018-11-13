package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object models the attributes to control the generalized beacon. The beacon 
 * is modeled as a beacon frame composed of multiple beacon intervals. The beacon 
 * frame start is time-aligned to the instant when 1x 80ms paging frames and HRPD 
 * control channel frames align (occurs once every 1.28s).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-beacon-g {
 *     leaf beacon-admin-status {
 *         type enumeration;
 *     }
 *     leaf beacon-oper-status {
 *         type enumeration;
 *     }
 *     leaf hrpd-beacon-enable {
 *         type boolean;
 *     }
 *     leaf period {
 *         type period;
 *     }
 *     leaf maxfap-beacon-tx-power {
 *         type string;
 *     }
 *     leaf maxfap-beacon-tx-power-in-use {
 *         type maxfap-beacon-tx-power-in-use;
 *     }
 *     leaf beacon-pch-pwr-percentage {
 *         type beacon-pch-pwr-percentage;
 *     }
 *     leaf max-hrpd-beacon-tx-power {
 *         type string;
 *     }
 *     leaf max-hrpd-beacon-tx-power-in-use {
 *         type max-hrpd-beacon-tx-power-in-use;
 *     }
 *     leaf beacon-pilot-pwr-percentage {
 *         type beacon-pilot-pwr-percentage;
 *     }
 *     leaf beacon-sync-pwr-percentage {
 *         type beacon-sync-pwr-percentage;
 *     }
 *     leaf max-beacon-list-entries {
 *         type uint64;
 *     }
 *     leaf beacon-list-number-of-entries {
 *         type uint64;
 *     }
 *     leaf max-hrpd-beacon-list-entries {
 *         type uint64;
 *     }
 *     leaf hrpd-beacon-list-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-beacon-g</i>
 *
 */
public interface Cdma2000BeaconG
    extends
    DataObject
{


    public enum BeaconAdminStatus {
        /**
         * none
         *
         */
        Locked(1, "locked"),
        
        /**
         * none
         *
         */
        Unlocked(2, "unlocked")
        ;
    
        private static final java.util.Map<java.lang.Integer, BeaconAdminStatus> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, BeaconAdminStatus> b = com.google.common.collect.ImmutableMap.builder();
            for (BeaconAdminStatus enumItem : BeaconAdminStatus.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private BeaconAdminStatus(int value, java.lang.String name) {
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
         * @return corresponding BeaconAdminStatus item
         */
        public static BeaconAdminStatus forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum BeaconOperStatus {
        /**
         * none
         *
         */
        Locked(1, "locked"),
        
        /**
         * none
         *
         */
        Unlocked(2, "unlocked"),
        
        /**
         * none
         *
         */
        Fault(3, "fault")
        ;
    
        private static final java.util.Map<java.lang.Integer, BeaconOperStatus> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, BeaconOperStatus> b = com.google.common.collect.ImmutableMap.builder();
            for (BeaconOperStatus enumItem : BeaconOperStatus.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private BeaconOperStatus(int value, java.lang.String name) {
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
         * @return corresponding BeaconOperStatus item
         */
        public static BeaconOperStatus forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-beacon-g").intern();

    /**
     * Allows administrative control of beacon.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG.BeaconAdminStatus</code> <code>beaconAdminStatus</code>, or <code>null</code> if not present
     */
    BeaconAdminStatus getBeaconAdminStatus();
    
    /**
     * Reports operational status of beacon.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconG.BeaconOperStatus</code> <code>beaconOperStatus</code>, or <code>null</code> if not present
     */
    BeaconOperStatus getBeaconOperStatus();
    
    /**
     * If set to {{true}} the HRPD-specific beacon described by 
     * {{object|HRPDBeaconList}} object is enabled. If set to {{false}}, all HRPD 
     * beacons (if any) are contained in the BeaconList object.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>hrpdBeaconEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isHrpdBeaconEnable();
    
    /**
     * Length and periodicity of the beacon frame in {{units}}. Reference - 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>period</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPeriod();
    
    /**
     * Maximum transmission power allowed on the FAP Beacon frequencies. {{param}} is 
     * expressed as a range of allowed maximum power levels with ".." (two periods) 
     * between the upper and lower values, i.e. 
     * "&amp;lt;;Pmax_low&amp;gt;..&amp;lt;;Pmax_high&amp;gt;". {{param}} identifies 
     * the limits between which the FAP can self-configure its maximum beacon transmit 
     * power. Self-configuration for maximum beacon transmission power is controlled by
     * {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerConfig}} from 
     * an availability perspective and 
     * {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerSelfConfigEnable}}
     * from an enabled perspective. &amp;lt;;Pmax_low&amp;gt; and 
     * &amp;lt;;Pmax_high&amp;gt; are measured in dBm and have a range of -40.0 to 20.0
     * incremented by 0.1 dB.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>maxfapBeaconTxPower</code>, or <code>null</code> if not present
     */
    java.lang.String getMaxfapBeaconTxPower();
    
    /**
     * Maximum beacon transmission power measured in {{units}} currently used by the 
     * FAP on any beacon frequency. Actual values of the maximum transmission power are
     * -40.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 
     * yields the actual value of the maximum transmission power.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxfapBeaconTxPowerInUse</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxfapBeaconTxPowerInUse();
    
    /**
     * Percentage of Max Sector Power Used By Paging Channel (expressed in {{units}}). 
     * For example, 93333 means 93.333% of the max sector power.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>beaconPchPwrPercentage</code>, or <code>null</code> if not present
     */
    java.lang.Long getBeaconPchPwrPercentage();
    
    /**
     * Maximum transmission power allowed on the dedicated HRPD beacon. {{param}} is 
     * expressed as a range of allowed maximum power levels with ".." (two periods) 
     * between the upper and lower values, i.e. 
     * "&amp;lt;Pmax_low&amp;gt;..&amp;lt;Pmax_high&amp;gt;". MaxHRPDBeaconTxPower 
     * identifies the limits between which the FAP can self-configure its maximum 
     * beacon transmit power. Self-configuration for maximum beacon transmission power 
     * is controlled by 
     * {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerConfig}} from 
     * an availability perspective and 
     * {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerSelfConfigEnable}}
     * from an enabled perspective. &amp;lt;Pmax_low&amp;gt; and 
     * &amp;lt;Pmax_high&amp;gt; are measured in dBm and have a range of -40.0 to 20.0 
     * incremented by 0.1 dB.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>maxHrpdBeaconTxPower</code>, or <code>null</code> if not present
     */
    java.lang.String getMaxHrpdBeaconTxPower();
    
    /**
     * Maximum beacon transmission power measured in dBm currently used by the FAP on 
     * any beacon frequency. Actual values of the maximum transmission power are -40.0 
     * dBm to 20.0 in units of {{units}}. The value of {{param}} divided by 10 yields 
     * the actual value of the maximum transmission power.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxHrpdBeaconTxPowerInUse</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxHrpdBeaconTxPowerInUse();
    
    /**
     * Percentage of Max Sector Power Used By Pilot Channel (expressed in {{units}}). 
     * For example, 19950 means 19.950% of total.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>beaconPilotPwrPercentage</code>, or <code>null</code> if not present
     */
    java.lang.Long getBeaconPilotPwrPercentage();
    
    /**
     * Percentage of Max Sector Power Used By Sync Channel (expressed in {{units}}). 
     * For example, 23458 means 23.458% of the max sector power.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>beaconSyncPwrPercentage</code>, or <code>null</code> if not present
     */
    java.lang.Long getBeaconSyncPwrPercentage();
    
    /**
     * Maximum number of entries in the 
     * {{object|.CellConfig.CDMA2000.Beacon.BeaconList.{i}.}} object.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxBeaconListEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxBeaconListEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>beaconListNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getBeaconListNumberOfEntries();
    
    /**
     * Maximum number of entries in the 
     * {{object|.CellConfig.CDMA2000.Beacon.HRPDBeaconList.{i}.}} object.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxHrpdBeaconListEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxHrpdBeaconListEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>hrpdBeaconListNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getHrpdBeaconListNumberOfEntries();

}

