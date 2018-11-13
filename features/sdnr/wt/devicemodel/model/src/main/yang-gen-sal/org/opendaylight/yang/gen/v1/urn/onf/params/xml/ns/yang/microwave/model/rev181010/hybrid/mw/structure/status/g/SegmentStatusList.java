package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.status.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SegmentStatusTypeG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.HybridMwStructureStatusG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Status of each segment (all TDM and one Ethernet). Multiplicity = 
 * HybridMwStructure::StructureConfiguration::tdmReservedNumberOfSegments + 1
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list segment-status-list {
 *     key "segment-status-type-id";
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
 * <i>microwave-model/hybrid-mw-structure-status-g/segment-status-list</i>
 *
 * <p>To create instances of this class use {@link SegmentStatusListBuilder}.
 * @see SegmentStatusListBuilder
 * @see SegmentStatusListKey
 *
 */
public interface SegmentStatusList
    extends
    ChildOf<HybridMwStructureStatusG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.status.g.SegmentStatusList>,
    SegmentStatusTypeG,
    Identifiable<SegmentStatusListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "segment-status-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.status.g.SegmentStatusListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SegmentStatusListKey getKey();

}

