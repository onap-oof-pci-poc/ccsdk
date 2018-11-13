package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentStatus;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentCurrentProblems;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentConfiguration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentCapability;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * list equipment-pac {
 *     key "equipment";
 *     leaf equipment {
 *         type leafref;
 *     }
 *     container equipment-capability {
 *         leaf-list supported-alarms {
 *             type string;
 *         }
 *         uses equipment-capability-g;
 *     }
 *     container equipment-configuration {
 *         list problem-type-severity-list {
 *             key "problem-type-name";
 *             leaf problem-type-name {
 *                 type string;
 *             }
 *             leaf problem-type-severity {
 *                 type severity-type;
 *             }
 *             uses problem-severity-type-g;
 *         }
 *         uses equipment-configuration-g;
 *     }
 *     container equipment-status {
 *         uses equipment-status-g;
 *     }
 *     container equipment-current-problems {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses current-problem-type-g;
 *         }
 *         uses equipment-current-problems-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/equipment-pac</i>
 *
 * <p>To create instances of this class use {@link EquipmentPacBuilder}.
 * @see EquipmentPacBuilder
 * @see EquipmentPacKey
 *
 */
public interface EquipmentPac
    extends
    ChildOf<OnfCoreModelConditionalPackagesData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>,
    Identifiable<EquipmentPacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "equipment-pac").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>equipment</code>, or <code>null</code> if not present
     */
    UniversalId getEquipment();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentCapability</code> <code>equipmentCapability</code>, or <code>null</code> if not present
     */
    EquipmentCapability getEquipmentCapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentConfiguration</code> <code>equipmentConfiguration</code>, or <code>null</code> if not present
     */
    EquipmentConfiguration getEquipmentConfiguration();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentStatus</code> <code>equipmentStatus</code>, or <code>null</code> if not present
     */
    EquipmentStatus getEquipmentStatus();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentCurrentProblems</code> <code>equipmentCurrentProblems</code>, or <code>null</code> if not present
     */
    EquipmentCurrentProblems getEquipmentCurrentProblems();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    EquipmentPacKey getKey();

}

