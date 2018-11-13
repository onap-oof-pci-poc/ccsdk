package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac.HolderConfiguration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac.HolderCapability;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac.HolderCurrentProblems;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac.HolderStatus;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * list holder-pac {
 *     key "holder";
 *     leaf holder {
 *         type leafref;
 *     }
 *     container holder-capability {
 *         leaf-list supported-alarms {
 *             type string;
 *         }
 *         uses holder-capability-g;
 *     }
 *     container holder-configuration {
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
 *         uses holder-configuration-g;
 *     }
 *     container holder-status {
 *         uses holder-status-g;
 *     }
 *     container holder-current-problems {
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
 *         uses holder-current-problems-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/holder-pac</i>
 *
 * <p>To create instances of this class use {@link HolderPacBuilder}.
 * @see HolderPacBuilder
 * @see HolderPacKey
 *
 */
public interface HolderPac
    extends
    ChildOf<OnfCoreModelConditionalPackagesData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>,
    Identifiable<HolderPacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "holder-pac").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>holder</code>, or <code>null</code> if not present
     */
    UniversalId getHolder();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac.HolderCapability</code> <code>holderCapability</code>, or <code>null</code> if not present
     */
    HolderCapability getHolderCapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac.HolderConfiguration</code> <code>holderConfiguration</code>, or <code>null</code> if not present
     */
    HolderConfiguration getHolderConfiguration();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac.HolderStatus</code> <code>holderStatus</code>, or <code>null</code> if not present
     */
    HolderStatus getHolderStatus();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac.HolderCurrentProblems</code> <code>holderCurrentProblems</code>, or <code>null</code> if not present
     */
    HolderCurrentProblems getHolderCurrentProblems();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    HolderPacKey getKey();

}

