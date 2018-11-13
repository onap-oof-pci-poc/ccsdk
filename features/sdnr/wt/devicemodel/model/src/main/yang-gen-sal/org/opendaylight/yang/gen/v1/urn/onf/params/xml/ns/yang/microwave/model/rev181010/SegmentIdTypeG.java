package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * Identifies the segments, which are used to transport the container.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping segment-id-type-g {
 *     leaf structure-id-ref {
 *         type universal-id;
 *     }
 *     leaf segment-id-ref {
 *         type int16;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/segment-id-type-g</i>
 *
 */
public interface SegmentIdTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "segment-id-type-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>structureIdRef</code>, or <code>null</code> if not present
     */
    UniversalId getStructureIdRef();
    
    /**
     * Combinations of structureId and segmentId must be unique inside the device to 
     * assure that every resource is used just once.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>segmentIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Short getSegmentIdRef();

}

