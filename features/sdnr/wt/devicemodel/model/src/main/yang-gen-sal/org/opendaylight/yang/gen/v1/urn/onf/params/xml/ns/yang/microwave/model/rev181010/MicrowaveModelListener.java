package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.NotificationListener;

/**
 * Interface for implementing the following YANG notifications defined in module <b>microwave-model</b>
 * <pre>
 * notification object-creation-notification {
 *     description
 *         "none";
 *     leaf counter {
 *         type counter;
 *     }
 *     leaf time-stamp {
 *         type time-stamp;
 *     }
 *     leaf object-id-ref {
 *         type universal-id;
 *     }
 *     leaf object-type {
 *         type object-type;
 *     }
 *     uses object-creation-notification-g;
 * }
 * notification object-deletion-notification {
 *     description
 *         "none";
 *     leaf counter {
 *         type counter;
 *     }
 *     leaf time-stamp {
 *         type time-stamp;
 *     }
 *     leaf object-id-ref {
 *         type universal-id;
 *     }
 *     uses object-deletion-notification-g;
 * }
 * notification attribute-value-changed-notification {
 *     description
 *         "none";
 *     leaf counter {
 *         type counter;
 *     }
 *     leaf time-stamp {
 *         type time-stamp;
 *     }
 *     leaf object-id-ref {
 *         type universal-id;
 *     }
 *     leaf attribute-name {
 *         type attribute-name;
 *     }
 *     leaf new-value {
 *         type new-value;
 *     }
 *     uses attribute-value-changed-notification-g;
 * }
 * notification problem-notification {
 *     description
 *         "none";
 *     leaf counter {
 *         type counter;
 *     }
 *     leaf time-stamp {
 *         type time-stamp;
 *     }
 *     leaf object-id-ref {
 *         type universal-id;
 *     }
 *     leaf problem {
 *         type problem;
 *     }
 *     leaf severity {
 *         type severity;
 *     }
 *     uses problem-notification-g;
 * }
 * </pre>
 *
 */
public interface MicrowaveModelListener
    extends
    NotificationListener
{




    /**
     * none
     *
     */
    void onObjectCreationNotification(ObjectCreationNotification notification);
    
    /**
     * none
     *
     */
    void onObjectDeletionNotification(ObjectDeletionNotification notification);
    
    /**
     * none
     *
     */
    void onAttributeValueChangedNotification(AttributeValueChangedNotification notification);
    
    /**
     * none
     *
     */
    void onProblemNotification(ProblemNotification notification);

}

