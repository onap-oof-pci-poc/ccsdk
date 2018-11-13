package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ethernet.container.configuration.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerConfigurationG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SegmentIdTypeG;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Lists the segments used for transporting this Ethernet container. In case 
 * EthernetContainer::ContainerCapability::bundlingIsAvail==0, all 
 * TypeDefinitions::segmentIdType::structureId must be identical in the list.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list segments-id-list {
 *     key "structure-id-ref" "segment-id-ref";
 *     leaf structure-id-ref {
 *         type universal-id;
 *     }
 *     leaf segment-id-ref {
 *         type int16;
 *     }
 *     uses segment-id-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/ethernet-container-configuration-g/segments-id-list</i>
 *
 * <p>To create instances of this class use {@link SegmentsIdListBuilder}.
 * @see SegmentsIdListBuilder
 * @see SegmentsIdListKey
 *
 */
public interface SegmentsIdList
    extends
    ChildOf<EthernetContainerConfigurationG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ethernet.container.configuration.g.SegmentsIdList>,
    SegmentIdTypeG,
    Identifiable<SegmentsIdListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "segments-id-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ethernet.container.configuration.g.SegmentsIdListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SegmentsIdListKey getKey();

}

