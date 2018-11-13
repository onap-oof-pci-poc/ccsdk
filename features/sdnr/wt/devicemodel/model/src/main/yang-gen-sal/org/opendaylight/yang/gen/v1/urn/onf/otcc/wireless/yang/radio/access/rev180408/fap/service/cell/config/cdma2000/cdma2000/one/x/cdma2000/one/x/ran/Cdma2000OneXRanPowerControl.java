package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.PowerControl.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x-ran-power-control {
 *     leaf one-xpcfpc-incl {
 *         type int64;
 *     }
 *     leaf one-xpcfpcfch-min-setpt {
 *         type one-xpcfpcfch-min-setpt;
 *     }
 *     leaf one-xpcfpcfch-max-setpt {
 *         type one-xpcfpcfch-max-setpt;
 *     }
 *     leaf one-xpcrpc-incl {
 *         type int64;
 *     }
 *     leaf one-xpcfch-chan-adj-gain {
 *         type one-xpcfch-chan-adj-gain;
 *     }
 *     leaf one-xpc-pwr-rep-thresh {
 *         type uint8;
 *     }
 *     leaf one-xpc-pwr-rep-frames {
 *         type uint8;
 *     }
 *     leaf one-x-pwr-thresh-enable {
 *         type int64;
 *     }
 *     leaf one-xpc-pwr-period-enable {
 *         type int64;
 *     }
 *     leaf one-xpc-pwr-rep-delay {
 *         type one-xpc-pwr-rep-delay;
 *     }
 *     uses cdma2000-one-x-ran-power-control-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-ran/cdma2000-one-x-ran-power-control</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXRanPowerControlBuilder}.
 * @see Cdma2000OneXRanPowerControlBuilder
 *
 */
public interface Cdma2000OneXRanPowerControl
    extends
    ChildOf<Cdma2000OneXRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>,
    Cdma2000OneXRanPowerControlG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-power-control").intern();


}

