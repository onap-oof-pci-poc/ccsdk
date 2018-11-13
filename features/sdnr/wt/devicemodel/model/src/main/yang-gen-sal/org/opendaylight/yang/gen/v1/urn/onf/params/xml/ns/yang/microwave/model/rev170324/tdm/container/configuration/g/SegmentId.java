package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.tdm.container.configuration.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TdmContainerConfigurationG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.SegmentIdTypeG;

/**
 * Multiplicity = 1; One segment per TDM container; Type of segment must match 
 * of container;
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container segment-id {
 *     leaf structure-id-ref {
 *         type universal-id;
 *     }
 *     leaf segment-id-ref {
 *         type int16;
 *     }
 *     uses segment-id-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/tdm-container-configuration-g/segment-id</i>
 *
 * <p>To create instances of this class use {@link SegmentIdBuilder}.
 * @see SegmentIdBuilder
 *
 */
public interface SegmentId
    extends
    ChildOf<TdmContainerConfigurationG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.tdm.container.configuration.g.SegmentId>,
    SegmentIdTypeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "segment-id").intern();


}

