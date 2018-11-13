package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping operation-set-g {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/operation-set-g</i>
 *
 */
public interface OperationSetG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "operation-set-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>afterOperationSet</code>, or <code>null</code> if not present
     */
    List<ActionEffort> getAfterOperationSet();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>beforeOperationSet</code>, or <code>null</code> if not present
     */
    List<ActionEffort> getBeforeOperationSet();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ActionEffort</code> <code>effortAndAction</code>, or <code>null</code> if not present
     */
    ActionEffort getEffortAndAction();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PauseResumeRule</code> <code>pauseResumeRule</code>, or <code>null</code> if not present
     */
    PauseResumeRule getPauseResumeRule();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>operationset</code>, or <code>null</code> if not present
     */
    List<ActionEffort> getOperationset();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isShortLived</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsShortLived();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>operationDetails</code>, or <code>null</code> if not present
     */
    List<OperationDetails> getOperationDetails();

}

