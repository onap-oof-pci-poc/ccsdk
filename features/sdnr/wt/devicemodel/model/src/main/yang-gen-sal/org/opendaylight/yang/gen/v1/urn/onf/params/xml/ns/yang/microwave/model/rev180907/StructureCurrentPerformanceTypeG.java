package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.current.performance.type.g.PerformanceData;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.OtnCurrentDataG;

/**
 * Turns performance information into current performance information by 
 * from OTN_CurrentData.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping structure-current-performance-type-g {
 *     container performance-data {
 *         leaf time-period {
 *             type time-period;
 *         }
 *         leaf es {
 *             type es;
 *         }
 *         leaf ses {
 *             type ses;
 *         }
 *         leaf cses {
 *             type cses;
 *         }
 *         leaf unavailability {
 *             type unavailability;
 *         }
 *         leaf rx-level-min {
 *             type rx-level-min;
 *         }
 *         leaf rx-level-max {
 *             type rx-level-max;
 *         }
 *         leaf rx-level-avg {
 *             type rx-level-avg;
 *         }
 *         uses structure-performance-type-g;
 *     }
 *     leaf timestamp {
 *         type date-and-time;
 *     }
 *     leaf suspect-interval-flag {
 *         type boolean;
 *     }
 *     leaf elapsed-time {
 *         type int64;
 *     }
 *     leaf scanner-id {
 *         type string;
 *     }
 *     leaf granularity-period {
 *         type granularity-period-type;
 *     }
 *     leaf administrative-state {
 *         type administrative-state;
 *     }
 *     leaf object-class {
 *         type object-identifier;
 *     }
 *     leaf name-binding {
 *         type object-identifier;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/structure-current-performance-type-g</i>
 *
 */
public interface StructureCurrentPerformanceTypeG
    extends
    DataObject,
    OtnCurrentDataG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "structure-current-performance-type-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.current.performance.type.g.PerformanceData</code> <code>performanceData</code>, or <code>null</code> if not present
     */
    PerformanceData getPerformanceData();

}

