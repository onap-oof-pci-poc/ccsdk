package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcG;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.Lte;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoS;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.EPC.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-epc {
 *     leaf-list allowed-ciphering-algorithm-list {
 *         type enumeration;
 *     }
 *     leaf-list allowed-integrity-protection-algorithm-list {
 *         type enumeration;
 *     }
 *     leaf tac {
 *         type uint16;
 *     }
 *     leaf eaid {
 *         type uint32;
 *     }
 *     leaf max-plmn-list-entries {
 *         type uint64;
 *     }
 *     leaf plmn-list-number-of-entries {
 *         type uint64;
 *     }
 *     leaf max-qo-s-entries {
 *         type uint64;
 *     }
 *     leaf qo-s-number-of-entries {
 *         type uint64;
 *     }
 *     list lte-epc-plmn-list {
 *         key "plmnid";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf is-primary {
 *             type boolean;
 *         }
 *         leaf plmnid {
 *             type string;
 *         }
 *         leaf cell-reserved-for-operator-use {
 *             type boolean;
 *         }
 *         uses lte-epc-plmn-list-g;
 *     }
 *     list lte-epc-qo-s {
 *         key "qci";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf qci {
 *             type uint8;
 *         }
 *         leaf type {
 *             type enumeration;
 *         }
 *         leaf priority {
 *             type uint8;
 *         }
 *         leaf packet-delay-budget {
 *             type packet-delay-budget;
 *         }
 *         uses lte-epc-qo-s-g;
 *     }
 *     uses lte-epc-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-epc</i>
 *
 * <p>To create instances of this class use {@link LteEpcBuilder}.
 * @see LteEpcBuilder
 *
 */
public interface LteEpc
    extends
    ChildOf<Lte>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteEpc>,
    LteEpcG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-epc").intern();

    /**
     * List of object class FAPService.{i}.CellConfig.LTE.EPC.PLMNList.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>lteEpcPlmnList</code>, or <code>null</code> if not present
     */
    List<LteEpcPlmnList> getLteEpcPlmnList();
    
    /**
     * List of object class FAPService.{i}.CellConfig.LTE.EPC.QoS.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>lteEpcQoS</code>, or <code>null</code> if not present
     */
    List<LteEpcQoS> getLteEpcQoS();

}

