package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.GranularityPeriodType;

/**
 * Allows defining a threshold cross alarm.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping threshold-cross-alarm-type-g {
 *     leaf g826-value-kind {
 *         type g826-type;
 *     }
 *     leaf granularity-period {
 *         type granularity-period-type;
 *     }
 *     leaf alarm-raising-threshold {
 *         type alarm-raising-threshold;
 *     }
 *     leaf alarm-clearing-threshold {
 *         type alarm-clearing-threshold;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/threshold-cross-alarm-type-g</i>
 *
 */
public interface ThresholdCrossAlarmTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "threshold-cross-alarm-type-g").intern();

    /**
     * Kind of performance value that shall be equipped with a threshold alarm.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.G826Type</code> <code>g826ValueKind</code>, or <code>null</code> if not present
     */
    G826Type getG826ValueKind();
    
    /**
     * Period of the performance data collection.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.GranularityPeriodType</code> <code>granularityPeriod</code>, or <code>null</code> if not present
     */
    GranularityPeriodType getGranularityPeriod();
    
    /**
     * Number of events required for raising the threshold cross alarm.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>alarmRaisingThreshold</code>, or <code>null</code> if not present
     */
    java.lang.Integer getAlarmRaisingThreshold();
    
    /**
     * Number of events required for clearing the threshold cross alarm.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>alarmClearingThreshold</code>, or <code>null</code> if not present
     */
    java.lang.Integer getAlarmClearingThreshold();

}

