package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
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
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/object-creation-notification</i>
 *
 * <p>To create instances of this class use {@link ObjectCreationNotificationBuilder}.
 * @see ObjectCreationNotificationBuilder
 *
 */
public interface ObjectCreationNotification
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ObjectCreationNotification>,
    ObjectCreationNotificationG,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "object-creation-notification").intern();


}

