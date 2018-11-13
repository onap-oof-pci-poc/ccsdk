package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.pure.ethernet.structure.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwPureEthernetStructurePac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.PureEthernetStructureCurrentPerformanceG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container pure-ethernet-structure-current-performance {
 *     list current-performance-data-list {
 *         key "scanner-id";
 *         leaf performance-data {
 *             type structure-performance-type;
 *         }
 *         leaf timestamp {
 *             type date-and-time;
 *         }
 *         leaf suspect-interval-flag {
 *             type boolean;
 *         }
 *         leaf elapsed-time {
 *             type int64;
 *         }
 *         leaf scanner-id {
 *             type string;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf administrative-state {
 *             type administrative-state;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *         uses structure-current-performance-type-g;
 *     }
 *     uses pure-ethernet-structure-current-performance-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-pure-ethernet-structure-pac/pure-ethernet-structure-current-performance</i>
 *
 * <p>To create instances of this class use {@link PureEthernetStructureCurrentPerformanceBuilder}.
 * @see PureEthernetStructureCurrentPerformanceBuilder
 *
 */
public interface PureEthernetStructureCurrentPerformance
    extends
    ChildOf<MwPureEthernetStructurePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.pure.ethernet.structure.pac.PureEthernetStructureCurrentPerformance>,
    PureEthernetStructureCurrentPerformanceG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "pure-ethernet-structure-current-performance").intern();


}

