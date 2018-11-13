package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.Generaldirectives;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.Operationidentifiers;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container operation-envelope {
 *     list operation-set {
 *         key "effort-and-action";
 *         leaf-list after-operation-set {
 *             type action-effort;
 *         }
 *         leaf-list before-operation-set {
 *             type action-effort;
 *         }
 *         leaf effort-and-action {
 *             type action-effort;
 *         }
 *         leaf pause-resume-rule {
 *             type pause-resume-rule;
 *         }
 *         leaf-list operationset {
 *             type action-effort;
 *         }
 *         leaf is-short-lived {
 *             type is-short-lived;
 *         }
 *         list operation-details {
 *             key "action-verb";
 *             leaf action-verb {
 *                 type action-verbs;
 *             }
 *             list necessary-initialcondition-constraints {
 *                 key "is-not";
 *                 leaf is-not {
 *                     type boolean;
 *                 }
 *                 uses necessary-initial-condition-constraints-g;
 *             }
 *             uses operation-details-g;
 *         }
 *         uses operation-set-g;
 *     }
 *     container generaldirectives {
 *         uses general-directives-g;
 *     }
 *     container operationidentifiers {
 *         uses operation-identifiers-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/operation-envelope</i>
 *
 * <p>To create instances of this class use {@link OperationEnvelopeBuilder}.
 * @see OperationEnvelopeBuilder
 *
 */
public interface OperationEnvelope
    extends
    ChildOf<CoreModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "operation-envelope").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>operationSet</code>, or <code>null</code> if not present
     */
    List<OperationSet> getOperationSet();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.Generaldirectives</code> <code>generaldirectives</code>, or <code>null</code> if not present
     */
    Generaldirectives getGeneraldirectives();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.Operationidentifiers</code> <code>operationidentifiers</code>, or <code>null</code> if not present
     */
    Operationidentifiers getOperationidentifiers();

}

