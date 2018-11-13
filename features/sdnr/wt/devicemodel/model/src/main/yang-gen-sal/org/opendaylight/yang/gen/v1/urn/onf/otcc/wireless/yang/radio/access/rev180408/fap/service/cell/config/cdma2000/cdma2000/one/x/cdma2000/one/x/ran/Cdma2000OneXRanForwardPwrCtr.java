package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanForwardPwrCtrG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.ForwardPwrCtr.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x-ran-forward-pwr-ctr {
 *     leaf fpcfch-init-setpt {
 *         type fpcfch-init-setpt;
 *     }
 *     leaf fpc-subchan-gain {
 *         type fpc-subchan-gain;
 *     }
 *     leaf rl-gain-adj {
 *         type rl-gain-adj;
 *     }
 *     leaf fpcfchfer {
 *         type uint8;
 *     }
 *     leaf fpcfch-min-setpt {
 *         type fpcfch-min-setpt;
 *     }
 *     leaf fpcfch-max-setpt {
 *         type fpcfch-max-setpt;
 *     }
 *     uses cdma2000-one-x-ran-forward-pwr-ctr-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-ran/cdma2000-one-x-ran-forward-pwr-ctr</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXRanForwardPwrCtrBuilder}.
 * @see Cdma2000OneXRanForwardPwrCtrBuilder
 *
 */
public interface Cdma2000OneXRanForwardPwrCtr
    extends
    ChildOf<Cdma2000OneXRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>,
    Cdma2000OneXRanForwardPwrCtrG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-forward-pwr-ctr").intern();


}

