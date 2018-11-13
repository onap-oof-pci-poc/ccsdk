package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts;

/**
 * Container for object class FAPService.{i}.FAPControl.UMTS.SelfConfig.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container fap-control-umts-self-config {
 *     leaf uarfcn-self-config-enable {
 *         type boolean;
 *     }
 *     leaf primary-scrambling-code-self-config-enable {
 *         type boolean;
 *     }
 *     leaf maxfap-tx-power-expanded-self-config-enable {
 *         type boolean;
 *     }
 *     leaf pcpich-power-self-config-enable {
 *         type boolean;
 *     }
 *     leaf max-ul-tx-power-self-config-enable {
 *         type boolean;
 *     }
 *     leaf lacracura-self-config-enable {
 *         type boolean;
 *     }
 *     leaf neighbor-list-self-config-enable {
 *         type boolean;
 *     }
 *     leaf cell-re-selection-self-config-enable {
 *         type boolean;
 *     }
 *     leaf intra-freq-meas-self-config-enable {
 *         type boolean;
 *     }
 *     leaf inter-freq-meas-self-config-enable {
 *         type boolean;
 *     }
 *     leaf inter-rat-meas-self-config-enable {
 *         type boolean;
 *     }
 *     leaf ue-internal-meas-config-enable {
 *         type boolean;
 *     }
 *     leaf noise-rise-limit-config-enable {
 *         type boolean;
 *     }
 *     uses fap-control-umts-self-config-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control/fap-control-umts/fap-control-umts-self-config</i>
 *
 * <p>To create instances of this class use {@link FapControlUmtsSelfConfigBuilder}.
 * @see FapControlUmtsSelfConfigBuilder
 *
 */
public interface FapControlUmtsSelfConfig
    extends
    ChildOf<FapControlUmts>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>,
    FapControlUmtsSelfConfigG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-umts-self-config").intern();


}

