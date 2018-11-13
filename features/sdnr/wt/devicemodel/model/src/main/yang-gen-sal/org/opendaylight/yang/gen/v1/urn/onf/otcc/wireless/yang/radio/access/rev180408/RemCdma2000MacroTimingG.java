package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * Parameters for controlling CDMA2000 system timing derived from macro system 
 * sniffing.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-cdma2000-macro-timing-g {
 *     leaf admin-state {
 *         type uint8;
 *     }
 *     leaf tracking-channel-number {
 *         type uint64;
 *     }
 *     leaf tracking-band-class {
 *         type uint8;
 *     }
 *     leaf-list tracking-pn-offset {
 *         type string;
 *     }
 *     leaf timing-source {
 *         type uint8;
 *     }
 *     leaf channel-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-cdma2000-macro-timing-g</i>
 *
 */
public interface RemCdma2000MacroTimingG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-macro-timing-g").intern();

    /**
     * This is the Admin State of Macro Timing. Lock means MacroTiming feature is 
     * Enabled. Unlock means MacroTiming feature is disabled. 0 - Lock (Enabled), 1 - 
     * Unlock (Disabled).
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>adminState</code>, or <code>null</code> if not present
     */
    java.lang.Short getAdminState();
    
    /**
     * Channel number of Macro Base Station currently used for MacroTiming.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>trackingChannelNumber</code>, or <code>null</code> if not present
     */
    BigInteger getTrackingChannelNumber();
    
    /**
     * BandClass of Macro Base Station currently used for MacroTiming.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>trackingBandClass</code>, or <code>null</code> if not present
     */
    java.lang.Short getTrackingBandClass();
    
    /**
     * {{list}} Each item is a (single value) PN offset in units of 64 PN chips of a 
     * Macro Base Station currently used for MacroTiming.
     *
     *
     *
     * @return <code>java.util.List</code> <code>trackingPnOffset</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getTrackingPnOffset();
    
    /**
     * This parameter indicates the timing source for the FAP: 0 - GPS 1 - Macro Timing
     * The other read-only parameters in this object only have valid values when 
     * timingsource is set to 1.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>timingSource</code>, or <code>null</code> if not present
     */
    java.lang.Short getTimingSource();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>channelNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getChannelNumberOfEntries();

}

