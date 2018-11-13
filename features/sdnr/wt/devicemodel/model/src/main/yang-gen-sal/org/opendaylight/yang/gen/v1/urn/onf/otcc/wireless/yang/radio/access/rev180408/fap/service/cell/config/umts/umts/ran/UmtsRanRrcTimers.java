package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.RRCTimers.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-rrc-timers {
 *     leaf t300 {
 *         type t300;
 *     }
 *     leaf t301 {
 *         type t301;
 *     }
 *     leaf t302 {
 *         type t302;
 *     }
 *     leaf t304 {
 *         type t304;
 *     }
 *     leaf t305 {
 *         type t305;
 *     }
 *     leaf t307 {
 *         type t307;
 *     }
 *     leaf t308 {
 *         type t308;
 *     }
 *     leaf t309 {
 *         type t309;
 *     }
 *     leaf t310 {
 *         type t310;
 *     }
 *     leaf t311 {
 *         type t311;
 *     }
 *     leaf t312 {
 *         type t312;
 *     }
 *     leaf t313 {
 *         type t313;
 *     }
 *     leaf t314 {
 *         type t314;
 *     }
 *     leaf t315 {
 *         type t315;
 *     }
 *     leaf t316 {
 *         type t316;
 *     }
 *     leaf t317 {
 *         type t317;
 *     }
 *     leaf n300 {
 *         type n300;
 *     }
 *     leaf n301 {
 *         type n301;
 *     }
 *     leaf n302 {
 *         type n302;
 *     }
 *     leaf n304 {
 *         type n304;
 *     }
 *     leaf n310 {
 *         type n310;
 *     }
 *     leaf n312 {
 *         type n312;
 *     }
 *     leaf n313 {
 *         type n313;
 *     }
 *     leaf n315 {
 *         type n315;
 *     }
 *     leaf wait-time {
 *         type wait-time;
 *     }
 *     uses umts-ran-rrc-timers-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-rrc-timers</i>
 *
 * <p>To create instances of this class use {@link UmtsRanRrcTimersBuilder}.
 * @see UmtsRanRrcTimersBuilder
 *
 */
public interface UmtsRanRrcTimers
    extends
    ChildOf<UmtsRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>,
    UmtsRanRrcTimersG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-rrc-timers").intern();


}

