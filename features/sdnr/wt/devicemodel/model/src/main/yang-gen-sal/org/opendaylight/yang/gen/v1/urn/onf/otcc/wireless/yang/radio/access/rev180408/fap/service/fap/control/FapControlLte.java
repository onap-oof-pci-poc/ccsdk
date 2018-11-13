package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlLteG;

/**
 * Container for object class FAPService.{i}.FAPControl.LTE.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container fap-control-lte {
 *     leaf op-state {
 *         type boolean;
 *     }
 *     leaf admin-state {
 *         type boolean;
 *     }
 *     leaf rf-tx-status {
 *         type boolean;
 *     }
 *     leaf pm-config {
 *         type string;
 *     }
 *     container fap-control-lte-gateway {
 *         leaf sec-gw-server1 {
 *             type string;
 *         }
 *         leaf sec-gw-server2 {
 *             type string;
 *         }
 *         leaf sec-gw-server3 {
 *             type string;
 *         }
 *         leaf-list s1-sig-link-server-list {
 *             type string;
 *         }
 *         leaf s1-connection-mode {
 *             type enumeration;
 *         }
 *         leaf s1-sig-link-port {
 *             type uint16;
 *         }
 *         uses fap-control-lte-gateway-g;
 *     }
 *     uses fap-control-lte-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control/fap-control-lte</i>
 *
 * <p>To create instances of this class use {@link FapControlLteBuilder}.
 * @see FapControlLteBuilder
 *
 */
public interface FapControlLte
    extends
    ChildOf<FapControl>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlLte>,
    FapControlLteG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-lte").intern();

    /**
     * Container for object class FAPService.{i}.FAPControl.LTE.Gateway.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.lte.FapControlLteGateway</code> <code>fapControlLteGateway</code>, or <code>null</code> if not present
     */
    FapControlLteGateway getFapControlLteGateway();

}

