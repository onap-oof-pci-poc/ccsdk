package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.historical.performance.type.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePerformanceTypeG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceHistoricalPerformanceTypeG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container performance-data {
 *     leaf es {
 *         type es;
 *     }
 *     leaf ses {
 *         type ses;
 *     }
 *     leaf symbol-error-during-carrier {
 *         type symbol-error-during-carrier;
 *     }
 *     leaf low-power-idle-transmitter-ms {
 *         type low-power-idle-transmitter-ms;
 *     }
 *     leaf low-power-idle-receiver-ms {
 *         type low-power-idle-receiver-ms;
 *     }
 *     uses wire-interface-performance-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/wire-interface-historical-performance-type-g/performance-data</i>
 *
 * <p>To create instances of this class use {@link PerformanceDataBuilder}.
 * @see PerformanceDataBuilder
 *
 */
public interface PerformanceData
    extends
    ChildOf<WireInterfaceHistoricalPerformanceTypeG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.historical.performance.type.g.PerformanceData>,
    WireInterfacePerformanceTypeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "performance-data").intern();


}

