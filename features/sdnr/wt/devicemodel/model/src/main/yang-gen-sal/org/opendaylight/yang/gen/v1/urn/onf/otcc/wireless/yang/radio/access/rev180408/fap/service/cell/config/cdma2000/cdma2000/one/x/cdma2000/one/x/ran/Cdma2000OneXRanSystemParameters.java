package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanSystemParametersG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.SystemParameters.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x-ran-system-parameters {
 *     leaf reg-zone {
 *         type uint16;
 *     }
 *     leaf total-zones {
 *         type uint8;
 *     }
 *     leaf zone-timer {
 *         type uint8;
 *     }
 *     leaf reg-period {
 *         type uint8;
 *     }
 *     leaf srch-win-a {
 *         type uint8;
 *     }
 *     leaf srch-win-n {
 *         type uint8;
 *     }
 *     leaf srch-win-r {
 *         type uint8;
 *     }
 *     leaf nghbr-max-age {
 *         type uint8;
 *     }
 *     leaf pwr-rep-thresh {
 *         type uint8;
 *     }
 *     leaf pwr-rep-frames {
 *         type uint8;
 *     }
 *     leaf pwr-thresh-enable {
 *         type uint8;
 *     }
 *     leaf pwr-period-enable {
 *         type uint8;
 *     }
 *     leaf pwr-rep-delay {
 *         type uint8;
 *     }
 *     leaf rescan {
 *         type uint8;
 *     }
 *     leaf tadd {
 *         type tadd;
 *     }
 *     leaf tdrop {
 *         type tdrop;
 *     }
 *     leaf tcomp {
 *         type tcomp;
 *     }
 *     leaf t-tdrop {
 *         type uint8;
 *     }
 *     leaf in-traffic-tadd {
 *         type in-traffic-tadd;
 *     }
 *     leaf in-traffic-tdrop {
 *         type in-traffic-tdrop;
 *     }
 *     leaf in-traffic-tcomp {
 *         type in-traffic-tcomp;
 *     }
 *     leaf in-traffic-ttdrop {
 *         type uint8;
 *     }
 *     uses cdma2000-one-x-ran-system-parameters-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-ran/cdma2000-one-x-ran-system-parameters</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXRanSystemParametersBuilder}.
 * @see Cdma2000OneXRanSystemParametersBuilder
 *
 */
public interface Cdma2000OneXRanSystemParameters
    extends
    ChildOf<Cdma2000OneXRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanSystemParameters>,
    Cdma2000OneXRanSystemParametersG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-system-parameters").intern();


}

