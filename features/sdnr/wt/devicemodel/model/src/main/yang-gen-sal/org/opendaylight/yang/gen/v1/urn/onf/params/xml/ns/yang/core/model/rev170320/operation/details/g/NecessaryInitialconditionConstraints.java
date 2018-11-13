package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NecessaryInitialConditionConstraintsG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationDetailsG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * list necessary-initialcondition-constraints {
 *     key "is-not";
 *     leaf is-not {
 *         type boolean;
 *     }
 *     uses necessary-initial-condition-constraints-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/operation-details-g/necessary-initialcondition-constraints</i>
 *
 * <p>To create instances of this class use {@link NecessaryInitialconditionConstraintsBuilder}.
 * @see NecessaryInitialconditionConstraintsBuilder
 * @see NecessaryInitialconditionConstraintsKey
 *
 */
public interface NecessaryInitialconditionConstraints
    extends
    ChildOf<OperationDetailsG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>,
    NecessaryInitialConditionConstraintsG,
    Identifiable<NecessaryInitialconditionConstraintsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "necessary-initialcondition-constraints").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraintsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    NecessaryInitialconditionConstraintsKey getKey();

}

