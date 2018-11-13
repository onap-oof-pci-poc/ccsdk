package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.hybrid.mw.structure.status.g.SegmentStatusList;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import java.util.List;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping hybrid-mw-structure-status-g {
 *     list segment-status-list {
 *         key "segment-status-type-id";
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/hybrid-mw-structure-status-g</i>
 *
 */
public interface HybridMwStructureStatusG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "hybrid-mw-structure-status-g").intern();

    /**
     * Status of each segment (all TDM and one Ethernet). Multiplicity = 
     * HybridMwStructure::StructureConfiguration::tdmReservedNumberOfSegments + 1
     *
     *
     *
     * @return <code>java.util.List</code> <code>segmentStatusList</code>, or <code>null</code> if not present
     */
    List<SegmentStatusList> getSegmentStatusList();
    
    /**
     * Time and date of the last update of the status information. 
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime</code> <code>lastStatusChange</code>, or <code>null</code> if not present
     */
    DateAndTime getLastStatusChange();

}

