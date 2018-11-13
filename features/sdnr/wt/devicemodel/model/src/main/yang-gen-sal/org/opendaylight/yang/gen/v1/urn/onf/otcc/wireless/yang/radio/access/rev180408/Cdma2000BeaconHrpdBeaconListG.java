package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object models individual HRPD beacon intervals where the beacon start is 
 * expressed as a number of HRPD control channel slots from the start of the 
 * frame.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-beacon-hrpd-beacon-list-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf beacon-index {
 *         type int64;
 *     }
 *     leaf c-coffset {
 *         type uint16;
 *     }
 *     leaf offset {
 *         type int64;
 *     }
 *     leaf duration {
 *         type uint16;
 *     }
 *     leaf num-c-ccycles {
 *         type uint8;
 *     }
 *     leaf beacon-band-class {
 *         type uint8;
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-beacon-hrpd-beacon-list-g</i>
 *
 */
public interface Cdma2000BeaconHrpdBeaconListG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-beacon-hrpd-beacon-list-g").intern();

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
     * 0..(HRPDBeaconListNumberOfEntries-1).
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>beaconIndex</code>, or <code>null</code> if not present
     */
    java.lang.Long getBeaconIndex();
    
    /**
     * Offset of the current beacon interval from the start of the beacon frame, in 
     * Control Channel cycles. The HRPDBeaconList interval SHOULD not overlap in time 
     * with any beacon interval for the same channel defined in the BeaconList object.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>cCoffset</code>, or <code>null</code> if not present
     */
    java.lang.Integer getCCoffset();
    
    /**
     * Start of beacon transmission with respect to the Control Channel boundary.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>offset</code>, or <code>null</code> if not present
     */
    java.lang.Long getOffset();
    
    /**
     * Duration of the beacon transmission within a Control Channel cycle, in slots. 
     * Beacon is transmitted starting offset from the CC boundary for duration. 
     * Transmission restarts offset from the next CC boundary, given that beacon 
     * interval spans more than 1 CC cycles.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>duration</code>, or <code>null</code> if not present
     */
    java.lang.Integer getDuration();
    
    /**
     * Number of Control Channel Cycles this beacon interval spans.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>numCCcycles</code>, or <code>null</code> if not present
     */
    java.lang.Short getNumCCcycles();
    
    /**
     * Band class for this beacon interval.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>beaconBandClass</code>, or <code>null</code> if not present
     */
    java.lang.Short getBeaconBandClass();
    
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
     * TX power for the beacon interval. If self-configuration of the HRPD Beacon Tx 
     * Power is enabled, then this value is determined by the FAP.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>txPower</code>, or <code>null</code> if not present
     */
    java.lang.Long getTxPower();

}

