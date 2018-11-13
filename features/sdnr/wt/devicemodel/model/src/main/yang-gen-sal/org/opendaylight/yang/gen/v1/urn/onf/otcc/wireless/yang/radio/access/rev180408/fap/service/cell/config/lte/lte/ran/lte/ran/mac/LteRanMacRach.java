package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanMac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.MAC.RACH.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-mac-rach {
 *     leaf-list number-of-ra-preambles {
 *         type uint8;
 *     }
 *     leaf-list size-of-ra-group-a {
 *         type uint8;
 *     }
 *     leaf-list message-size-group-a {
 *         type uint16;
 *     }
 *     leaf-list message-power-offset-group-b {
 *         type int64;
 *     }
 *     leaf-list power-ramping-step {
 *         type uint8;
 *     }
 *     leaf-list preamble-initial-received-target-power {
 *         type int64;
 *     }
 *     leaf-list preamble-trans-max {
 *         type string;
 *     }
 *     leaf-list response-window-size {
 *         type string;
 *     }
 *     leaf-list contention-resolution-timer {
 *         type uint8;
 *     }
 *     leaf-list max-harq-msg3-tx {
 *         type string;
 *     }
 *     uses lte-ran-mac-rach-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mac/lte-ran-mac-rach</i>
 *
 * <p>To create instances of this class use {@link LteRanMacRachBuilder}.
 * @see LteRanMacRachBuilder
 *
 */
public interface LteRanMacRach
    extends
    ChildOf<LteRanMac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>,
    LteRanMacRachG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mac-rach").intern();


}

