package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcQoSG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.CellConfig.LTE.EPC.QoS.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list lte-epc-qo-s {
 *     key "qci";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf qci {
 *         type uint8;
 *     }
 *     leaf type {
 *         type enumeration;
 *     }
 *     leaf priority {
 *         type uint8;
 *     }
 *     leaf packet-delay-budget {
 *         type packet-delay-budget;
 *     }
 *     uses lte-epc-qo-s-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-epc/lte-epc-qo-s</i>
 *
 * <p>To create instances of this class use {@link LteEpcQoSBuilder}.
 * @see LteEpcQoSBuilder
 * @see LteEpcQoSKey
 *
 */
public interface LteEpcQoS
    extends
    ChildOf<LteEpc>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS>,
    LteEpcQoSG,
    Identifiable<LteEpcQoSKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-epc-qo-s").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoSKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LteEpcQoSKey getKey();

}

