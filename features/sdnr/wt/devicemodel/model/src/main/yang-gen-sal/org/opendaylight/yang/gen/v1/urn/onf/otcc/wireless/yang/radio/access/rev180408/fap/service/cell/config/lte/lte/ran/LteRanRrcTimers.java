package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRrcTimersG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.RRCTimers.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-rrc-timers {
 *     leaf-list t300 {
 *         type uint16;
 *     }
 *     leaf-list t301 {
 *         type uint16;
 *     }
 *     leaf t302 {
 *         type t302;
 *     }
 *     leaf-list t304-eutra {
 *         type uint16;
 *     }
 *     leaf-list t304-irat {
 *         type uint16;
 *     }
 *     leaf-list t310 {
 *         type uint16;
 *     }
 *     leaf-list t311 {
 *         type uint16;
 *     }
 *     leaf t320 {
 *         type t320;
 *     }
 *     leaf n310 {
 *         type uint8;
 *     }
 *     leaf n311 {
 *         type uint8;
 *     }
 *     uses lte-ran-rrc-timers-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-rrc-timers</i>
 *
 * <p>To create instances of this class use {@link LteRanRrcTimersBuilder}.
 * @see LteRanRrcTimersBuilder
 *
 */
public interface LteRanRrcTimers
    extends
    ChildOf<LteRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers>,
    LteRanRrcTimersG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-rrc-timers").intern();


}

