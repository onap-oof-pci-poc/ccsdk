package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationSetG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationDetailsG;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * list operation-details {
 *     key "action-verb";
 *     leaf action-verb {
 *         type action-verbs;
 *     }
 *     list necessary-initialcondition-constraints {
 *         key "is-not";
 *         leaf is-not {
 *             type boolean;
 *         }
 *         uses necessary-initial-condition-constraints-g;
 *     }
 *     uses operation-details-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/operation-set-g/operation-details</i>
 *
 * <p>To create instances of this class use {@link OperationDetailsBuilder}.
 * @see OperationDetailsBuilder
 * @see OperationDetailsKey
 *
 */
public interface OperationDetails
    extends
    ChildOf<OperationSetG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>,
    OperationDetailsG,
    Identifiable<OperationDetailsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "operation-details").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetailsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    OperationDetailsKey getKey();

}

