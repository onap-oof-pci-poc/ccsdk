package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Collection of members of the timeProperties data set.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * grouping time-properties-ds-entry {
 *     leaf current-utc-offset-valid {
 *         type boolean;
 *     }
 *     leaf current-utc-offset {
 *         type int16;
 *     }
 *     leaf leap59 {
 *         type boolean;
 *     }
 *     leaf leap61 {
 *         type boolean;
 *     }
 *     leaf time-traceable {
 *         type boolean;
 *     }
 *     leaf frequency-traceable {
 *         type boolean;
 *     }
 *     leaf ptp-timescale {
 *         type boolean;
 *     }
 *     leaf time-source {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/time-properties-ds-entry</i>
 *
 */
public interface TimePropertiesDsEntry
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "time-properties-ds-entry").intern();

    /**
     * When set, the current UTC offset is valid.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>currentUtcOffsetValid</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isCurrentUtcOffsetValid();
    
    /**
     * The offset between TAI and UTC when the epoch of thePTP system is the PTP epoch,
     * i.e., when ptp-timescaleis TRUE; otherwise, the value has no meaning.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>currentUtcOffset</code>, or <code>null</code> if not present
     */
    java.lang.Short getCurrentUtcOffset();
    
    /**
     * When set, the last minute of the current UTC daycontains 59 seconds.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>leap59</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLeap59();
    
    /**
     * When set, the last minute of the current UTC daycontains 61 seconds.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>leap61</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLeap61();
    
    /**
     * When set, the timescale and the currentUtcOffset are traceable to a primary 
     * reference.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>timeTraceable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isTimeTraceable();
    
    /**
     * When set, the frequency determining the timescaleis traceable to a primary 
     * reference.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>frequencyTraceable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isFrequencyTraceable();
    
    /**
     * When set, the clock timescale of the grandmaster clock is PTP; otherwise, the 
     * timescale is ARB (arbitrary).
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>ptpTimescale</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPtpTimescale();
    
    /**
     * The source of time used by the grandmaster clock.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>timeSource</code>, or <code>null</code> if not present
     */
    java.lang.Short getTimeSource();

}

