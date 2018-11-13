package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceDiversityConfigurationG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ThresholdCrossAlarmTypeG;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of threshold cross alarms to be configured.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list threshold-cross-alarm-list {
 *     key "g826-value-kind" "granularity-period";
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
 *     uses threshold-cross-alarm-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-diversity-configuration-g/threshold-cross-alarm-list</i>
 *
 * <p>To create instances of this class use {@link ThresholdCrossAlarmListBuilder}.
 * @see ThresholdCrossAlarmListBuilder
 * @see ThresholdCrossAlarmListKey
 *
 */
public interface ThresholdCrossAlarmList
    extends
    ChildOf<AirInterfaceDiversityConfigurationG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>,
    ThresholdCrossAlarmTypeG,
    Identifiable<ThresholdCrossAlarmListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "threshold-cross-alarm-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ThresholdCrossAlarmListKey getKey();

}

