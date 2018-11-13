package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.PureEthernetStructureStatusG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container pure-ethernet-structure-status {
 *     container segment-status-list {
 *         leaf segment-status-type-id {
 *             type int16;
 *         }
 *         leaf segment-is-reserved-for-tdm {
 *             type segment-is-reserved-for-tdm;
 *         }
 *         leaf operational-status {
 *             type operational-status;
 *         }
 *         leaf obsolete-priority-class {
 *             type obsolete-priority-class;
 *         }
 *         leaf obsolete-drop-order-rank {
 *             type obsolete-drop-order-rank;
 *         }
 *         uses segment-status-type-g;
 *     }
 *     leaf last-status-change {
 *         type last-status-change;
 *     }
 *     uses pure-ethernet-structure-status-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-pure-ethernet-structure-pac/pure-ethernet-structure-status</i>
 *
 * <p>To create instances of this class use {@link PureEthernetStructureStatusBuilder}.
 * @see PureEthernetStructureStatusBuilder
 *
 */
public interface PureEthernetStructureStatus
    extends
    ChildOf<MwPureEthernetStructurePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureStatus>,
    PureEthernetStructureStatusG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "pure-ethernet-structure-status").intern();


}

