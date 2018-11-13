package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.MAC.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-mac {
 *     container lte-ran-mac-rach {
 *         leaf-list number-of-ra-preambles {
 *             type uint8;
 *         }
 *         leaf-list size-of-ra-group-a {
 *             type uint8;
 *         }
 *         leaf-list message-size-group-a {
 *             type uint16;
 *         }
 *         leaf-list message-power-offset-group-b {
 *             type int64;
 *         }
 *         leaf-list power-ramping-step {
 *             type uint8;
 *         }
 *         leaf-list preamble-initial-received-target-power {
 *             type int64;
 *         }
 *         leaf-list preamble-trans-max {
 *             type string;
 *         }
 *         leaf-list response-window-size {
 *             type string;
 *         }
 *         leaf-list contention-resolution-timer {
 *             type uint8;
 *         }
 *         leaf-list max-harq-msg3-tx {
 *             type string;
 *         }
 *         uses lte-ran-mac-rach-g;
 *     }
 *     container lte-ran-mac-drx {
 *         leaf drx-enabled {
 *             type boolean;
 *         }
 *         leaf-list on-duration-timer {
 *             type string;
 *         }
 *         leaf-list drx-inactivity-timer {
 *             type string;
 *         }
 *         leaf-list drx-retransmission-timer {
 *             type uint8;
 *         }
 *         leaf-list long-drx-cycle {
 *             type uint16;
 *         }
 *         leaf-list drx-start-offset {
 *             type string;
 *         }
 *         leaf-list short-drx-cycle {
 *             type uint16;
 *         }
 *         leaf-list drx-short-cycle-timer {
 *             type string;
 *         }
 *         uses lte-ran-mac-drx-g;
 *     }
 *     container lte-ran-mac-ulsch {
 *         leaf max-harq-tx {
 *             type uint8;
 *         }
 *         leaf periodic-bsr-timer {
 *             type periodic-bsr-timer;
 *         }
 *         leaf retx-bsr-timer {
 *             type retx-bsr-timer;
 *         }
 *         leaf tti-bundling {
 *             type boolean;
 *         }
 *         uses lte-ran-mac-ulsch-g;
 *     }
 *     uses lte-ran-mac-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mac</i>
 *
 * <p>To create instances of this class use {@link LteRanMacBuilder}.
 * @see LteRanMacBuilder
 *
 */
public interface LteRanMac
    extends
    ChildOf<LteRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanMac>,
    LteRanMacG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mac").intern();

    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.MAC.RACH.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach</code> <code>lteRanMacRach</code>, or <code>null</code> if not present
     */
    LteRanMacRach getLteRanMacRach();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.MAC.DRX.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx</code> <code>lteRanMacDrx</code>, or <code>null</code> if not present
     */
    LteRanMacDrx getLteRanMacDrx();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.MAC.ULSCH.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch</code> <code>lteRanMacUlsch</code>, or <code>null</code> if not present
     */
    LteRanMacUlsch getLteRanMacUlsch();

}

