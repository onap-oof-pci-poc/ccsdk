package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.tdm.container.configuration.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TdmContainerConfigurationG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TdmContainerTypeG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Type of TDM container.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container container-type {
 *     leaf tdm-container-name {
 *         type tdm-container-name;
 *     }
 *     leaf tdm-container-size {
 *         type tdm-container-size;
 *     }
 *     uses tdm-container-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/tdm-container-configuration-g/container-type</i>
 *
 * <p>To create instances of this class use {@link ContainerTypeBuilder}.
 * @see ContainerTypeBuilder
 *
 */
public interface ContainerType
    extends
    ChildOf<TdmContainerConfigurationG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.tdm.container.configuration.g.ContainerType>,
    TdmContainerTypeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "container-type").intern();


}

