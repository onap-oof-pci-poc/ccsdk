package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentConfigurationG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * container equipment-configuration {
 *     list problem-type-severity-list {
 *         key "problem-type-name";
 *         leaf problem-type-name {
 *             type string;
 *         }
 *         leaf problem-type-severity {
 *             type severity-type;
 *         }
 *         uses problem-severity-type-g;
 *     }
 *     uses equipment-configuration-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/equipment-pac/equipment-configuration</i>
 *
 * <p>To create instances of this class use {@link EquipmentConfigurationBuilder}.
 * @see EquipmentConfigurationBuilder
 *
 */
public interface EquipmentConfiguration
    extends
    ChildOf<EquipmentPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentConfiguration>,
    EquipmentConfigurationG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "equipment-configuration").intern();


}

