package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.FAPControl.UMTS.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container fap-control-umts {
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
 *     container fap-control-umts-self-config {
 *         leaf uarfcn-self-config-enable {
 *             type boolean;
 *         }
 *         leaf primary-scrambling-code-self-config-enable {
 *             type boolean;
 *         }
 *         leaf maxfap-tx-power-expanded-self-config-enable {
 *             type boolean;
 *         }
 *         leaf pcpich-power-self-config-enable {
 *             type boolean;
 *         }
 *         leaf max-ul-tx-power-self-config-enable {
 *             type boolean;
 *         }
 *         leaf lacracura-self-config-enable {
 *             type boolean;
 *         }
 *         leaf neighbor-list-self-config-enable {
 *             type boolean;
 *         }
 *         leaf cell-re-selection-self-config-enable {
 *             type boolean;
 *         }
 *         leaf intra-freq-meas-self-config-enable {
 *             type boolean;
 *         }
 *         leaf inter-freq-meas-self-config-enable {
 *             type boolean;
 *         }
 *         leaf inter-rat-meas-self-config-enable {
 *             type boolean;
 *         }
 *         leaf ue-internal-meas-config-enable {
 *             type boolean;
 *         }
 *         leaf noise-rise-limit-config-enable {
 *             type boolean;
 *         }
 *         uses fap-control-umts-self-config-g;
 *     }
 *     container fap-control-umts-gateway {
 *         leaf sec-gw-server1 {
 *             type string;
 *         }
 *         leaf sec-gw-server2 {
 *             type string;
 *         }
 *         leaf sec-gw-server3 {
 *             type string;
 *         }
 *         leaf fap-gw-server1 {
 *             type string;
 *         }
 *         leaf fap-gw-server2 {
 *             type string;
 *         }
 *         leaf fap-gw-server3 {
 *             type string;
 *         }
 *         leaf fap-gw-port {
 *             type uint16;
 *         }
 *         uses fap-control-umts-gateway-g;
 *     }
 *     uses fap-control-umts-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control/fap-control-umts</i>
 *
 * <p>To create instances of this class use {@link FapControlUmtsBuilder}.
 * @see FapControlUmtsBuilder
 *
 */
public interface FapControlUmts
    extends
    ChildOf<FapControl>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>,
    FapControlUmtsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-umts").intern();

    /**
     * Container for object class FAPService.{i}.FAPControl.UMTS.SelfConfig.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig</code> <code>fapControlUmtsSelfConfig</code>, or <code>null</code> if not present
     */
    FapControlUmtsSelfConfig getFapControlUmtsSelfConfig();
    
    /**
     * Container for object class FAPService.{i}.FAPControl.UMTS.Gateway.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway</code> <code>fapControlUmtsGateway</code>, or <code>null</code> if not present
     */
    FapControlUmtsGateway getFapControlUmtsGateway();

}

