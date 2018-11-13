package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.performance.type.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfacePerformanceTypeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.TimeXStatesTypeG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Time period the transmitter operated in the respective transmission mode.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list time-x-states-list {
 *     key "transmission-mode";
 *     leaf transmission-mode {
 *         type leafref;
 *     }
 *     leaf time {
 *         type time;
 *     }
 *     uses time-x-states-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-performance-type-g/time-x-states-list</i>
 *
 * <p>To create instances of this class use {@link TimeXStatesListBuilder}.
 * @see TimeXStatesListBuilder
 * @see TimeXStatesListKey
 *
 */
public interface TimeXStatesList
    extends
    ChildOf<AirInterfacePerformanceTypeG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.performance.type.g.TimeXStatesList>,
    TimeXStatesTypeG,
    Identifiable<TimeXStatesListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "time-x-states-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.performance.type.g.TimeXStatesListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    TimeXStatesListKey getKey();

}

