package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfpdsn;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnAuxA10StatsG;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.HRPD.PCFPDSN.{i}.AuxA10Stats.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-hrpd-pcfpdsn-aux-a10-stats {
 *     leaf pdsn-number-aux-a10-perf {
 *         type int64;
 *     }
 *     leaf pdsnip-address-aux-a10-perf {
 *         type ip-address;
 *     }
 *     leaf aux-a10-connections-created-in-first-reg-req-pdsn {
 *         type uint64;
 *     }
 *     leaf aux-a10-connections-created-in-subsequent-reg-req-pdsn {
 *         type uint64;
 *     }
 *     leaf aux-a10-fwd-ip-flows-created-pdsn {
 *         type uint64;
 *     }
 *     leaf aux-a10-rev-ip-flows-created-pdsn {
 *         type uint64;
 *     }
 *     leaf aux-a10-ip-flow-accounting-reg-requests-pdsn {
 *         type uint64;
 *     }
 *     uses cdma2000-hrpd-pcfpdsn-aux-a10-stats-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-hrpd/cdma2000-hrpd-pcfpdsn/cdma2000-hrpd-pcfpdsn-aux-a10-stats</i>
 *
 * <p>To create instances of this class use {@link Cdma2000HrpdPcfpdsnAuxA10StatsBuilder}.
 * @see Cdma2000HrpdPcfpdsnAuxA10StatsBuilder
 *
 */
public interface Cdma2000HrpdPcfpdsnAuxA10Stats
    extends
    ChildOf<Cdma2000HrpdPcfpdsn>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnAuxA10Stats>,
    Cdma2000HrpdPcfpdsnAuxA10StatsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-pcfpdsn-aux-a10-stats").intern();


}

