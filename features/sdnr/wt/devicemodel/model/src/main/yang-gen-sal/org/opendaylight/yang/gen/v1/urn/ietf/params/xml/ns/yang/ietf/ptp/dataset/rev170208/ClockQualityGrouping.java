package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Derived data type for quality of a clock, which containsclockClass, 
 * clockAccuracy and offsetScaledLogVariance.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * grouping clock-quality-grouping {
 *     leaf clock-class {
 *         type clock-class;
 *     }
 *     leaf clock-accuracy {
 *         type uint8;
 *     }
 *     leaf offset-scaled-log-variance {
 *         type uint16;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/clock-quality-grouping</i>
 *
 */
public interface ClockQualityGrouping
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "clock-quality-grouping").intern();

    /**
     * The clockClass denotes the traceability of the timeor frequency distributed by 
     * the clock.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>clockClass</code>, or <code>null</code> if not present
     */
    java.lang.Short getClockClass();
    
    /**
     * The clockAccuracy indicates the expected accuracyof the clock.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>clockAccuracy</code>, or <code>null</code> if not present
     */
    java.lang.Short getClockAccuracy();
    
    /**
     * The offsetScaledLogVariance provides anestimate of the variations of the 
     * clockfrom a linear timescale when it is not synchronizedto another clock using 
     * the protocol.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>offsetScaledLogVariance</code>, or <code>null</code> if not present
     */
    java.lang.Integer getOffsetScaledLogVariance();

}

