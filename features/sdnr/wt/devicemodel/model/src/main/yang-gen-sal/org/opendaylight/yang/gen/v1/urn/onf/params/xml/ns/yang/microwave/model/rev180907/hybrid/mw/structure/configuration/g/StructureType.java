package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.configuration.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.TdmStructureTypeG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureConfigurationG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * TDM frame to be applied.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container structure-type {
 *     leaf tdm-structure-name {
 *         type string;
 *     }
 *     leaf tdm-segment-size {
 *         type tdm-segment-size;
 *     }
 *     leaf max-number-of-segments-reservable {
 *         type max-number-of-segments-reservable;
 *     }
 *     uses tdm-structure-type-g;
 *     status DEPRECATED;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/hybrid-mw-structure-configuration-g/structure-type</i>
 *
 * <p>To create instances of this class use {@link StructureTypeBuilder}.
 * @see StructureTypeBuilder
 *
 */
@Deprecated
public interface StructureType
    extends
    ChildOf<HybridMwStructureConfigurationG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.configuration.g.StructureType>,
    TdmStructureTypeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "structure-type").intern();


}

