package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints;
import java.util.List;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping operation-details-g {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/operation-details-g</i>
 *
 */
public interface OperationDetailsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "operation-details-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ActionVerbs</code> <code>actionVerb</code>, or <code>null</code> if not present
     */
    ActionVerbs getActionVerb();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>necessaryInitialconditionConstraints</code>, or <code>null</code> if not present
     */
    List<NecessaryInitialconditionConstraints> getNecessaryInitialconditionConstraints();

}

