package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.pure.ethernet.structure.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwPureEthernetStructurePac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.PureEthernetStructureConfigurationG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container pure-ethernet-structure-configuration {
 *     list problem-kind-severity-list {
 *         key "problem-kind-name";
 *         leaf problem-kind-name {
 *             type problem-kind-name;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *         uses structure-problem-severity-type-g;
 *     }
 *     uses pure-ethernet-structure-configuration-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-pure-ethernet-structure-pac/pure-ethernet-structure-configuration</i>
 *
 * <p>To create instances of this class use {@link PureEthernetStructureConfigurationBuilder}.
 * @see PureEthernetStructureConfigurationBuilder
 *
 */
public interface PureEthernetStructureConfiguration
    extends
    ChildOf<MwPureEthernetStructurePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.pure.ethernet.structure.pac.PureEthernetStructureConfiguration>,
    PureEthernetStructureConfigurationG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "pure-ethernet-structure-configuration").intern();


}

