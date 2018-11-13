package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanAccessParametersG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.AccessParameters.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x-ran-access-parameters {
 *     leaf nom-pwr {
 *         type int64;
 *     }
 *     leaf init-pwr {
 *         type int64;
 *     }
 *     leaf pwr-step-indb {
 *         type uint8;
 *     }
 *     leaf nom-pwr-ext {
 *         type nom-pwr-ext;
 *     }
 *     leaf apm-auth {
 *         type uint8;
 *     }
 *     leaf apm-rand-update-prd {
 *         type apm-rand-update-prd;
 *     }
 *     leaf initialpwr {
 *         type initialpwr;
 *     }
 *     leaf pwr-step {
 *         type pwr-step;
 *     }
 *     leaf num-step {
 *         type uint8;
 *     }
 *     leaf max-cap-size {
 *         type uint8;
 *     }
 *     leaf preamble-size {
 *         type uint8;
 *     }
 *     leaf psist09 {
 *         type uint8;
 *     }
 *     leaf psist10 {
 *         type uint8;
 *     }
 *     leaf psist11 {
 *         type uint8;
 *     }
 *     leaf psist12 {
 *         type uint8;
 *     }
 *     leaf psist13 {
 *         type uint8;
 *     }
 *     leaf psist14 {
 *         type uint8;
 *     }
 *     leaf psist15 {
 *         type uint8;
 *     }
 *     leaf msg-psist {
 *         type uint8;
 *     }
 *     leaf reg-psist {
 *         type uint8;
 *     }
 *     leaf probe-pn-ran {
 *         type uint8;
 *     }
 *     leaf acc-tmo {
 *         type acc-tmo;
 *     }
 *     leaf probe-bkoff {
 *         type probe-bkoff;
 *     }
 *     leaf bkoff {
 *         type bkoff;
 *     }
 *     leaf max-req-seq {
 *         type uint8;
 *     }
 *     leaf max-rsp-seq {
 *         type uint8;
 *     }
 *     uses cdma2000-one-x-ran-access-parameters-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-ran/cdma2000-one-x-ran-access-parameters</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXRanAccessParametersBuilder}.
 * @see Cdma2000OneXRanAccessParametersBuilder
 *
 */
public interface Cdma2000OneXRanAccessParameters
    extends
    ChildOf<Cdma2000OneXRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanAccessParameters>,
    Cdma2000OneXRanAccessParametersG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-access-parameters").intern();


}

