package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanRfG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.RF.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x-ran-rf {
 *     leaf-list rfcnfl {
 *         type string;
 *     }
 *     leaf rfcnfl-band-in-use {
 *         type string;
 *     }
 *     leaf rfcnfl-in-use {
 *         type uint64;
 *     }
 *     leaf-list pilot-pn {
 *         type string;
 *     }
 *     leaf pilot-pn-in-use {
 *         type pilot-pn-in-use;
 *     }
 *     leaf maxfap-tx-power {
 *         type string;
 *     }
 *     leaf maxfap-tx-power-in-use {
 *         type maxfap-tx-power-in-use;
 *     }
 *     leaf pch-pwr-percentage {
 *         type pch-pwr-percentage;
 *     }
 *     leaf pilot-pwr-percentage {
 *         type pilot-pwr-percentage;
 *     }
 *     leaf sync-pwr-percentage {
 *         type sync-pwr-percentage;
 *     }
 *     uses cdma2000-one-x-ran-rf-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-ran/cdma2000-one-x-ran-rf</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXRanRfBuilder}.
 * @see Cdma2000OneXRanRfBuilder
 *
 */
public interface Cdma2000OneXRanRf
    extends
    ChildOf<Cdma2000OneXRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanRf>,
    Cdma2000OneXRanRfG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-rf").intern();


}

