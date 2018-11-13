package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.cn.UmtsCnPsDomain;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.cn.UmtsCnCsDomain;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.Umts;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.CN.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-cn {
 *     leaf plmn-type {
 *         type enumeration;
 *     }
 *     leaf plmnid {
 *         type string;
 *     }
 *     leaf-list equiv-plmnid {
 *         type string;
 *     }
 *     leaf sac {
 *         type uint16;
 *     }
 *     leaf broadcast-sac {
 *         type uint16;
 *     }
 *     leaf-list lacrac {
 *         type string;
 *     }
 *     leaf lac-in-use {
 *         type uint16;
 *     }
 *     leaf rac-in-use {
 *         type uint8;
 *     }
 *     container umts-cn-cs-domain {
 *         leaf t3212 {
 *             type t3212;
 *         }
 *         leaf imsi-attach-detach-enable {
 *             type boolean;
 *         }
 *         uses umts-cn-cs-domain-g;
 *     }
 *     container umts-cn-ps-domain {
 *         leaf network-mode-operation-combined {
 *             type boolean;
 *         }
 *         uses umts-cn-ps-domain-g;
 *     }
 *     uses umts-cn-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-cn</i>
 *
 * <p>To create instances of this class use {@link UmtsCnBuilder}.
 * @see UmtsCnBuilder
 *
 */
public interface UmtsCn
    extends
    ChildOf<Umts>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>,
    UmtsCnG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-cn").intern();

    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.CN.CSDomain.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.cn.UmtsCnCsDomain</code> <code>umtsCnCsDomain</code>, or <code>null</code> if not present
     */
    UmtsCnCsDomain getUmtsCnCsDomain();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.UMTS.CN.PSDomain.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.cn.UmtsCnPsDomain</code> <code>umtsCnPsDomain</code>, or <code>null</code> if not present
     */
    UmtsCnPsDomain getUmtsCnPsDomain();

}

