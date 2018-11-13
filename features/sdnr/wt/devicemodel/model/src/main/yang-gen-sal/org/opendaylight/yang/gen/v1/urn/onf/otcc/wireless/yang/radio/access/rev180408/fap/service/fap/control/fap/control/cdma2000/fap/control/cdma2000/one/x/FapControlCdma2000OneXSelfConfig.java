package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXSelfConfigG;

/**
 * Container for object class FAPService.{i}.FAPControl.CDMA2000.OneX.SelfConfig.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container fap-control-cdma2000-one-x-self-config {
 *     leaf rfcnfl-self-config-enable {
 *         type boolean;
 *     }
 *     leaf pilot-pn-self-config-enable {
 *         type boolean;
 *     }
 *     leaf maxfap-tx-power-self-config-enable {
 *         type boolean;
 *     }
 *     leaf maxfap-beacon-tx-power-self-config-enable {
 *         type boolean;
 *     }
 *     uses fap-control-cdma2000-one-x-self-config-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control/fap-control-cdma2000/fap-control-cdma2000-one-x/fap-control-cdma2000-one-x-self-config</i>
 *
 * <p>To create instances of this class use {@link FapControlCdma2000OneXSelfConfigBuilder}.
 * @see FapControlCdma2000OneXSelfConfigBuilder
 *
 */
public interface FapControlCdma2000OneXSelfConfig
    extends
    ChildOf<FapControlCdma2000OneX>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXSelfConfig>,
    FapControlCdma2000OneXSelfConfigG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-one-x-self-config").intern();


}

