package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container wirebased-interface-status {
 *     leaf interface-is-up {
 *         type interface-is-up;
 *     }
 *     leaf-list receive-signal-is-detected {
 *         type boolean;
 *     }
 *     leaf pmd-is-up {
 *         type pmd-is-up;
 *     }
 *     leaf pmd-cur {
 *         type pmd-cur;
 *     }
 *     container signal-ordering-kind-cur {
 *         leaf signal-ordering-kind-name {
 *             type string;
 *         }
 *         leaf-list signal-list {
 *             type string;
 *         }
 *         uses signal-ordering-type-g;
 *     }
 *     leaf eee-is-up {
 *         type eee-is-up;
 *     }
 *     leaf link-is-up {
 *         type link-is-up;
 *     }
 *     leaf link-is-idle {
 *         type link-is-idle;
 *     }
 *     leaf tx-level-cur {
 *         type tx-level-cur;
 *     }
 *     leaf-list rx-level-cur {
 *         type rx-level-cur;
 *     }
 *     leaf temp-cur {
 *         type temp-cur;
 *     }
 *     leaf loop-back-kind-up {
 *         type loop-back-kind-up;
 *     }
 *     uses wire-interface-status-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/wire-interface-pac/wirebased-interface-status</i>
 *
 * <p>To create instances of this class use {@link WirebasedInterfaceStatusBuilder}.
 * @see WirebasedInterfaceStatusBuilder
 *
 */
public interface WirebasedInterfaceStatus
    extends
    ChildOf<WireInterfacePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>,
    WireInterfaceStatusG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "wirebased-interface-status").intern();


}

