package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
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
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/problem-notification</i>
 *
 * <p>To create instances of this class use {@link ProblemNotificationBuilder}.
 * @see ProblemNotificationBuilder
 *
 */
public interface ProblemNotification
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ProblemNotification>,
    ProblemNotificationG,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "problem-notification").intern();


}

