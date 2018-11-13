package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.status.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.SegmentStatusTypeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.PureEthernetStructureStatusG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Status of the Ethernet transport segment. Always just one segment.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container segment-status-list {
 *     leaf segment-status-type-id {
 *         type int16;
 *     }
 *     leaf segment-is-reserved-for-tdm {
 *         type segment-is-reserved-for-tdm;
 *     }
 *     leaf operational-status {
 *         type operational-status;
 *     }
 *     leaf obsolete-priority-class {
 *         type obsolete-priority-class;
 *     }
 *     leaf obsolete-drop-order-rank {
 *         type obsolete-drop-order-rank;
 *     }
 *     uses segment-status-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/pure-ethernet-structure-status-g/segment-status-list</i>
 *
 * <p>To create instances of this class use {@link SegmentStatusListBuilder}.
 * @see SegmentStatusListBuilder
 *
 */
public interface SegmentStatusList
    extends
    ChildOf<PureEthernetStructureStatusG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.status.g.SegmentStatusList>,
    SegmentStatusTypeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "segment-status-list").intern();


}

