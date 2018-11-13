package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcPortG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * list fc-port {
 *     key "uuid";
 *     leaf-list ltp {
 *         type leafref;
 *     }
 *     leaf role {
 *         type port-role;
 *     }
 *     leaf fc-port-direction {
 *         type port-direction;
 *     }
 *     leaf is-protection-lock-out {
 *         type boolean;
 *     }
 *     leaf selection-priority {
 *         type int64;
 *     }
 *     leaf is-internal-port {
 *         type boolean;
 *     }
 *     leaf-list fc-route-feeds-fc-port-egress {
 *         type string;
 *     }
 *     list local-id {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     leaf uuid {
 *         type universal-id;
 *     }
 *     list extension {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     leaf operational-state {
 *         type operational-state;
 *     }
 *     leaf administrative-control {
 *         type administrative-control;
 *     }
 *     leaf administrative-state {
 *         type administrative-state;
 *     }
 *     leaf lifecycle-state {
 *         type lifecycle-state;
 *     }
 *     list name {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     list label {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     uses fc-port-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/forwarding-construct-g/fc-port</i>
 *
 * <p>To create instances of this class use {@link FcPortBuilder}.
 * @see FcPortBuilder
 * @see FcPortKey
 *
 */
public interface FcPort
    extends
    ChildOf<ForwardingConstructG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>,
    FcPortG,
    Identifiable<FcPortKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "fc-port").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPortKey</code> <code>key</code>, or <code>null</code> if not present
     */
    FcPortKey getKey();

}

