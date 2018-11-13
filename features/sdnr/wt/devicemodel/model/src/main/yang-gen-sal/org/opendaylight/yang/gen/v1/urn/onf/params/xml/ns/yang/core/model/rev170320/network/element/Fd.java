package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.network.element;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingDomainG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NetworkElement;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * list fd {
 *     key "uuid";
 *     leaf-list layer-protocol-name {
 *         type layer-protocol-name;
 *     }
 *     leaf-list lower-level-fd {
 *         type leafref;
 *     }
 *     leaf-list fc {
 *         type leafref;
 *     }
 *     leaf-list ltp {
 *         type leafref;
 *     }
 *     leaf-list lower-level-link {
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
 *     uses forwarding-domain-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/network-element/fd</i>
 *
 * <p>To create instances of this class use {@link FdBuilder}.
 * @see FdBuilder
 * @see FdKey
 *
 */
public interface Fd
    extends
    ChildOf<NetworkElement>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.network.element.Fd>,
    ForwardingDomainG,
    Identifiable<FdKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "fd").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.network.element.FdKey</code> <code>key</code>, or <code>null</code> if not present
     */
    FdKey getKey();

}

