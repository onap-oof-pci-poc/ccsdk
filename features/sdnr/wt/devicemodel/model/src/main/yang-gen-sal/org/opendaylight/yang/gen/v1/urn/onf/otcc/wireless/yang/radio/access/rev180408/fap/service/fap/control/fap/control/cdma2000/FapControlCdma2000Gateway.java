package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000GatewayG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.FAPControl.CDMA2000.Gateway.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container fap-control-cdma2000-gateway {
 *     leaf sec-gw-server1 {
 *         type string;
 *     }
 *     leaf sec-gw-server2 {
 *         type string;
 *     }
 *     leaf sec-gw-server3 {
 *         type string;
 *     }
 *     leaf sec-gw-switchover-count {
 *         type uint64;
 *     }
 *     uses fap-control-cdma2000-gateway-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control/fap-control-cdma2000/fap-control-cdma2000-gateway</i>
 *
 * <p>To create instances of this class use {@link FapControlCdma2000GatewayBuilder}.
 * @see FapControlCdma2000GatewayBuilder
 *
 */
public interface FapControlCdma2000Gateway
    extends
    ChildOf<FapControlCdma2000>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>,
    FapControlCdma2000GatewayG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-gateway").intern();


}

