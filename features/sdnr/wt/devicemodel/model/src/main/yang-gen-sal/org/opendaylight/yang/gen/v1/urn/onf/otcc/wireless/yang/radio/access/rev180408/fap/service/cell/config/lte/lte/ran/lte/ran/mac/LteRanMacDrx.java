package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacDrxG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanMac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.MAC.DRX.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-mac-drx {
 *     leaf drx-enabled {
 *         type boolean;
 *     }
 *     leaf-list on-duration-timer {
 *         type string;
 *     }
 *     leaf-list drx-inactivity-timer {
 *         type string;
 *     }
 *     leaf-list drx-retransmission-timer {
 *         type uint8;
 *     }
 *     leaf-list long-drx-cycle {
 *         type uint16;
 *     }
 *     leaf-list drx-start-offset {
 *         type string;
 *     }
 *     leaf-list short-drx-cycle {
 *         type uint16;
 *     }
 *     leaf-list drx-short-cycle-timer {
 *         type string;
 *     }
 *     uses lte-ran-mac-drx-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mac/lte-ran-mac-drx</i>
 *
 * <p>To create instances of this class use {@link LteRanMacDrxBuilder}.
 * @see LteRanMacDrxBuilder
 *
 */
public interface LteRanMacDrx
    extends
    ChildOf<LteRanMac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>,
    LteRanMacDrxG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mac-drx").intern();


}

