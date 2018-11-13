package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacUlschG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanMac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.MAC.ULSCH.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-mac-ulsch {
 *     leaf max-harq-tx {
 *         type uint8;
 *     }
 *     leaf periodic-bsr-timer {
 *         type periodic-bsr-timer;
 *     }
 *     leaf retx-bsr-timer {
 *         type retx-bsr-timer;
 *     }
 *     leaf tti-bundling {
 *         type boolean;
 *     }
 *     uses lte-ran-mac-ulsch-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mac/lte-ran-mac-ulsch</i>
 *
 * <p>To create instances of this class use {@link LteRanMacUlschBuilder}.
 * @see LteRanMacUlschBuilder
 *
 */
public interface LteRanMacUlsch
    extends
    ChildOf<LteRanMac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>,
    LteRanMacUlschG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mac-ulsch").intern();


}

