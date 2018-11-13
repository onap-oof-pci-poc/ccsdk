package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * This object models an individual beacon intervals. It may be used to model both 
 * 1x and HRPD beacons with offset from start of beacon frame measured in 80ms 
 * slots.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-beacon-beacon-list-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf beacon-index {
 *         type int64;
 *     }
 *     leaf offset {
 *         type uint16;
 *     }
 *     leaf duration {
 *         type duration;
 *     }
 *     leaf transmission-format {
 *         type enumeration;
 *     }
 *     leaf beacon-band-class {
 *         type int64;
 *     }
 *     leaf beacon-channel-freq {
 *         type uint16;
 *     }
 *     leaf-list beacon-pn-offset {
 *         type string;
 *     }
 *     leaf tx-power {
 *         type tx-power;
 *     }
 *     leaf beacon-sid {
 *         type uint16;
 *     }
 *     leaf beacon-nid {
 *         type uint16;
 *     }
 *     leaf beacon-pzid {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-beacon-beacon-list-g</i>
 *
 */
public interface Cdma2000BeaconBeaconListG
    extends
    DataObject
{


    public enum TransmissionFormat {
        /**
         * none
         *
         */
        _0(1, "0"),
        
        /**
         * none
         *
         */
        _1(2, "1")
        ;
    
        private static final java.util.Map<java.lang.Integer, TransmissionFormat> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TransmissionFormat> b = com.google.common.collect.ImmutableMap.builder();
            for (TransmissionFormat enumItem : TransmissionFormat.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private TransmissionFormat(int value, java.lang.String name) {
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
         * @return corresponding TransmissionFormat item
         */
        public static TransmissionFormat forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-beacon-beacon-list-g").intern();

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
     * Instance identifier for this beacon interval. Allowed range is 
     * 0..(BeaconListNumberOfEntries-1).
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>beaconIndex</code>, or <code>null</code> if not present
     */
    java.lang.Long getBeaconIndex();
    
    /**
     * Offset from the start of the beacon frame in 80ms slots.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>offset</code>, or <code>null</code> if not present
     */
    java.lang.Integer getOffset();
    
    /**
     * Duration of this beacon interval in {{units}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>duration</code>, or <code>null</code> if not present
     */
    java.lang.Integer getDuration();
    
    /**
     * Determines if this beacon interval shall transmit HRPD (HRPD) or CDMA2000 
     * 1x.{HRPD="0", 1x="1"}.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000BeaconBeaconListG.TransmissionFormat</code> <code>transmissionFormat</code>, or <code>null</code> if not present
     */
    TransmissionFormat getTransmissionFormat();
    
    /**
     * Band class for this beacon interval.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>beaconBandClass</code>, or <code>null</code> if not present
     */
    java.lang.Long getBeaconBandClass();
    
    /**
     * Channel number for this beacon interval.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>beaconChannelFreq</code>, or <code>null</code> if not present
     */
    java.lang.Integer getBeaconChannelFreq();
    
    /**
     * {{list}} Each item is a pilot PN offset of the pilot beacon for this channel in 
     * units of 64 PN chips. If this parameter contains more than one item, then the 
     * FAP is expected to select one from the list as the PilotPN to be used for this 
     * channel. If the self-configuration capability is not to be used, then this 
     * parameter SHALL contain only a single item.
     *
     *
     *
     * @return <code>java.util.List</code> <code>beaconPnOffset</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getBeaconPnOffset();
    
    /**
     * TX power for the beacon interval (in {{units}}). If self-configuration of the 
     * Beacon Tx Power is enabled, then this value is determined by the FAP.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>txPower</code>, or <code>null</code> if not present
     */
    java.lang.Long getTxPower();
    
    /**
     * SID for this beacon interval.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>beaconSid</code>, or <code>null</code> if not present
     */
    java.lang.Integer getBeaconSid();
    
    /**
     * NID for this beacon interval.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>beaconNid</code>, or <code>null</code> if not present
     */
    java.lang.Integer getBeaconNid();
    
    /**
     * PZID for this beacon interval.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>beaconPzid</code>, or <code>null</code> if not present
     */
    BigInteger getBeaconPzid();

}

