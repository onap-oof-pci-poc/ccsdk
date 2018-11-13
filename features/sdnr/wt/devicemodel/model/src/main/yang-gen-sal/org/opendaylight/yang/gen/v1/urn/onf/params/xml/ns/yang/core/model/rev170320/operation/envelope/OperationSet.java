package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationSetG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * list operation-set {
 *     key "effort-and-action";
 *     leaf-list after-operation-set {
 *         type action-effort;
 *     }
 *     leaf-list before-operation-set {
 *         type action-effort;
 *     }
 *     leaf effort-and-action {
 *         type action-effort;
 *     }
 *     leaf pause-resume-rule {
 *         type pause-resume-rule;
 *     }
 *     leaf-list operationset {
 *         type action-effort;
 *     }
 *     leaf is-short-lived {
 *         type is-short-lived;
 *     }
 *     list operation-details {
 *         key "action-verb";
 *         leaf action-verb {
 *             type action-verbs;
 *         }
 *         list necessary-initialcondition-constraints {
 *             key "is-not";
 *             leaf is-not {
 *                 type boolean;
 *             }
 *             uses necessary-initial-condition-constraints-g;
 *         }
 *         uses operation-details-g;
 *     }
 *     uses operation-set-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/operation-envelope/operation-set</i>
 *
 * <p>To create instances of this class use {@link OperationSetBuilder}.
 * @see OperationSetBuilder
 * @see OperationSetKey
 *
 */
public interface OperationSet
    extends
    ChildOf<OperationEnvelope>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>,
    OperationSetG,
    Identifiable<OperationSetKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "operation-set").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSetKey</code> <code>key</code>, or <code>null</code> if not present
     */
    OperationSetKey getKey();

}

