package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRabG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.Umts;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.RAB.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-rab {
 *     leaf rab-succ-estab-cs {
 *         type uint64;
 *     }
 *     leaf rab-fail-estab-cs {
 *         type uint64;
 *     }
 *     leaf rab-succ-estab-ps {
 *         type uint64;
 *     }
 *     leaf rab-fail-estab-ps {
 *         type uint64;
 *     }
 *     leaf rabcs-setup-time-mean {
 *         type rabcs-setup-time-mean;
 *     }
 *     leaf rabcs-setup-time-max {
 *         type rabcs-setup-time-max;
 *     }
 *     leaf rabps-setup-time-mean {
 *         type rabps-setup-time-mean;
 *     }
 *     leaf rabps-setup-time-max {
 *         type rabps-setup-time-max;
 *     }
 *     leaf fail-ho {
 *         type uint64;
 *     }
 *     leaf succ-ho {
 *         type uint64;
 *     }
 *     uses umts-rab-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-rab</i>
 *
 * <p>To create instances of this class use {@link UmtsRabBuilder}.
 * @see UmtsRabBuilder
 *
 */
public interface UmtsRab
    extends
    ChildOf<Umts>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRab>,
    UmtsRabG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-rab").intern();


}

