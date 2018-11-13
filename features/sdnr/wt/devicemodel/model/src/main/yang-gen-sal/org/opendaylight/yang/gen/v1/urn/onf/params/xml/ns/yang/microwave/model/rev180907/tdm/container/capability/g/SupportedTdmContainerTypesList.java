package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.tdm.container.capability.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.TdmContainerCapabilityG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.TdmContainerTypeG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Lists the TDM containers that are supported.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list supported-tdm-container-types-list {
 *     key "tdm-container-name";
 *     leaf tdm-container-name {
 *         type string;
 *     }
 *     leaf tdm-container-size {
 *         type tdm-container-size;
 *     }
 *     uses tdm-container-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/tdm-container-capability-g/supported-tdm-container-types-list</i>
 *
 * <p>To create instances of this class use {@link SupportedTdmContainerTypesListBuilder}.
 * @see SupportedTdmContainerTypesListBuilder
 * @see SupportedTdmContainerTypesListKey
 *
 */
public interface SupportedTdmContainerTypesList
    extends
    ChildOf<TdmContainerCapabilityG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.tdm.container.capability.g.SupportedTdmContainerTypesList>,
    TdmContainerTypeG,
    Identifiable<SupportedTdmContainerTypesListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "supported-tdm-container-types-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.tdm.container.capability.g.SupportedTdmContainerTypesListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SupportedTdmContainerTypesListKey getKey();

}

