package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsGatewayG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts;

/**
 * Container for object class FAPService.{i}.FAPControl.UMTS.Gateway.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container fap-control-umts-gateway {
 *     leaf sec-gw-server1 {
 *         type string;
 *     }
 *     leaf sec-gw-server2 {
 *         type string;
 *     }
 *     leaf sec-gw-server3 {
 *         type string;
 *     }
 *     leaf fap-gw-server1 {
 *         type string;
 *     }
 *     leaf fap-gw-server2 {
 *         type string;
 *     }
 *     leaf fap-gw-server3 {
 *         type string;
 *     }
 *     leaf fap-gw-port {
 *         type uint16;
 *     }
 *     uses fap-control-umts-gateway-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control/fap-control-umts/fap-control-umts-gateway</i>
 *
 * <p>To create instances of this class use {@link FapControlUmtsGatewayBuilder}.
 * @see FapControlUmtsGatewayBuilder
 *
 */
public interface FapControlUmtsGateway
    extends
    ChildOf<FapControlUmts>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway>,
    FapControlUmtsGatewayG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-umts-gateway").intern();


}

