package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.cn;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnCsDomainG;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.CN.CSDomain.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-cn-cs-domain {
 *     leaf t3212 {
 *         type t3212;
 *     }
 *     leaf imsi-attach-detach-enable {
 *         type boolean;
 *     }
 *     uses umts-cn-cs-domain-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-cn/umts-cn-cs-domain</i>
 *
 * <p>To create instances of this class use {@link UmtsCnCsDomainBuilder}.
 * @see UmtsCnCsDomainBuilder
 *
 */
public interface UmtsCnCsDomain
    extends
    ChildOf<UmtsCn>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.cn.UmtsCnCsDomain>,
    UmtsCnCsDomainG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-cn-cs-domain").intern();


}

