package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * CDMA2000 1x active handin operational parameters.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-control-cdma2000-one-x-active-handin-measurement-g {
 *     leaf active-handin-measurement-enable {
 *         type boolean;
 *     }
 *     leaf active-hand-in-measurement-duration {
 *         type active-hand-in-measurement-duration;
 *     }
 *     leaf measurement-report-threshold {
 *         type measurement-report-threshold;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-cdma2000-one-x-active-handin-measurement-g</i>
 *
 */
public interface FapControlCdma2000OneXActiveHandinMeasurementG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-one-x-active-handin-measurement-g").intern();

    /**
     * Indicates whether the FAP performs active hand-in measurement if a request is 
     * received. If {{true}} active hand-in measurement is enabled; if {{false}} active
     * hand-in measurement is disabled.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>activeHandinMeasurementEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isActiveHandinMeasurementEnable();
    
    /**
     * The minimum duration in {{units}} for which FAP should take a mobile's RL pilot 
     * strength measurements for active hand-in purpose when directed by the network. 
     * Instead of continuous measurement for this entire duration, a FAP can make 
     * multiple measurements by sampling over shorter durations. In such a case, this 
     * value specifies the minimum time separation required between the first and last 
     * measurement samples.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>activeHandInMeasurementDuration</code>, or <code>null</code> if not present
     */
    java.lang.Integer getActiveHandInMeasurementDuration();
    
    /**
     * The threshold (in {{units}}) for the FAP to report an active hand-in 
     * measurement. If the metric to be reported is below the threshold, the FAP may 
     * not send any report.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>measurementReportThreshold</code>, or <code>null</code> if not present
     */
    java.lang.Long getMeasurementReportThreshold();

}

