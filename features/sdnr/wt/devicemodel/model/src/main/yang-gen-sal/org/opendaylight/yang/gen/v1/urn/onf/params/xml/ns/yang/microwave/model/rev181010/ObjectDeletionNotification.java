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
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/object-deletion-notification</i>
 *
 * <p>To create instances of this class use {@link ObjectDeletionNotificationBuilder}.
 * @see ObjectDeletionNotificationBuilder
 *
 */
public interface ObjectDeletionNotification
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ObjectDeletionNotification>,
    ObjectDeletionNotificationG,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "object-deletion-notification").intern();


}

