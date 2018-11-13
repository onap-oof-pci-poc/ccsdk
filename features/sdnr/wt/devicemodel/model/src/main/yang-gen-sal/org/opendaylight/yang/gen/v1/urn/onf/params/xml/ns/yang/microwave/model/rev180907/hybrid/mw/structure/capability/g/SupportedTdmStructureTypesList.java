package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.capability.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.TdmStructureTypeG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureCapabilityG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Lists the TDM frame types that are supported.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list supported-tdm-structure-types-list {
 *     key "tdm-structure-name";
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/hybrid-mw-structure-capability-g/supported-tdm-structure-types-list</i>
 *
 * <p>To create instances of this class use {@link SupportedTdmStructureTypesListBuilder}.
 * @see SupportedTdmStructureTypesListBuilder
 * @see SupportedTdmStructureTypesListKey
 *
 */
public interface SupportedTdmStructureTypesList
    extends
    ChildOf<HybridMwStructureCapabilityG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>,
    TdmStructureTypeG,
    Identifiable<SupportedTdmStructureTypesListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "supported-tdm-structure-types-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SupportedTdmStructureTypesListKey getKey();

}

