package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentCurrentProblemsG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * container equipment-current-problems {
 *     list current-problem-list {
 *         key "sequence-number";
 *         leaf problem-name {
 *             type problem-name;
 *         }
 *         leaf sequence-number {
 *             type int32;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf problem-severity {
 *             type problem-severity;
 *         }
 *         uses current-problem-type-g;
 *     }
 *     uses equipment-current-problems-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/equipment-pac/equipment-current-problems</i>
 *
 * <p>To create instances of this class use {@link EquipmentCurrentProblemsBuilder}.
 * @see EquipmentCurrentProblemsBuilder
 *
 */
public interface EquipmentCurrentProblems
    extends
    ChildOf<EquipmentPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentCurrentProblems>,
    EquipmentCurrentProblemsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "equipment-current-problems").intern();


}

