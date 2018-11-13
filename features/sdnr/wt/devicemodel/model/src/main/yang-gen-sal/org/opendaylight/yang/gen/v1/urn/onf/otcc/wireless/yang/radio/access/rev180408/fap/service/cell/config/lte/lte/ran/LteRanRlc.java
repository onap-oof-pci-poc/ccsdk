package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRlcG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb1;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.RLC.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-rlc {
 *     container lte-ran-rlc-srb1 {
 *         leaf default-configuration {
 *             type boolean;
 *         }
 *         leaf-list t-poll-retransmit {
 *             type string;
 *         }
 *         leaf-list poll-pdu {
 *             type uint16;
 *         }
 *         leaf-list poll-byte {
 *             type uint16;
 *         }
 *         leaf-list max-retx-threshold {
 *             type uint8;
 *         }
 *         leaf-list t-reordering {
 *             type string;
 *         }
 *         leaf-list t-status-prohibit {
 *             type string;
 *         }
 *         uses lte-ran-rlc-srb1-g;
 *     }
 *     container lte-ran-rlc-srb2 {
 *         leaf default-configuration {
 *             type boolean;
 *         }
 *         leaf-list t-poll-retransmit {
 *             type string;
 *         }
 *         leaf-list poll-pdu {
 *             type uint16;
 *         }
 *         leaf-list poll-byte {
 *             type uint16;
 *         }
 *         leaf-list max-retx-threshold {
 *             type uint8;
 *         }
 *         leaf-list t-reordering {
 *             type string;
 *         }
 *         leaf-list t-status-prohibit {
 *             type string;
 *         }
 *         uses lte-ran-rlc-srb2-g;
 *     }
 *     uses lte-ran-rlc-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-rlc</i>
 *
 * <p>To create instances of this class use {@link LteRanRlcBuilder}.
 * @see LteRanRlcBuilder
 *
 */
public interface LteRanRlc
    extends
    ChildOf<LteRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRlc>,
    LteRanRlcG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-rlc").intern();

    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.RLC.SRB1.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb1</code> <code>lteRanRlcSrb1</code>, or <code>null</code> if not present
     */
    LteRanRlcSrb1 getLteRanRlcSrb1();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.RLC.SRB2.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb2</code> <code>lteRanRlcSrb2</code>, or <code>null</code> if not present
     */
    LteRanRlcSrb2 getLteRanRlcSrb2();

}

