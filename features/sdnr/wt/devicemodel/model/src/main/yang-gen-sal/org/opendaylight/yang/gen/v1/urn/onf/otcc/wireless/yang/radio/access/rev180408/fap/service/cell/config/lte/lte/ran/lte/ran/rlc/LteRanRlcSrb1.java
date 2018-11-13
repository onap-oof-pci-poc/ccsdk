package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRlc;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRlcSrb1G;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.RLC.SRB1.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-rlc-srb1 {
 *     leaf default-configuration {
 *         type boolean;
 *     }
 *     leaf-list t-poll-retransmit {
 *         type string;
 *     }
 *     leaf-list poll-pdu {
 *         type uint16;
 *     }
 *     leaf-list poll-byte {
 *         type uint16;
 *     }
 *     leaf-list max-retx-threshold {
 *         type uint8;
 *     }
 *     leaf-list t-reordering {
 *         type string;
 *     }
 *     leaf-list t-status-prohibit {
 *         type string;
 *     }
 *     uses lte-ran-rlc-srb1-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-rlc/lte-ran-rlc-srb1</i>
 *
 * <p>To create instances of this class use {@link LteRanRlcSrb1Builder}.
 * @see LteRanRlcSrb1Builder
 *
 */
public interface LteRanRlcSrb1
    extends
    ChildOf<LteRanRlc>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.rlc.LteRanRlcSrb1>,
    LteRanRlcSrb1G
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-rlc-srb1").intern();


}

