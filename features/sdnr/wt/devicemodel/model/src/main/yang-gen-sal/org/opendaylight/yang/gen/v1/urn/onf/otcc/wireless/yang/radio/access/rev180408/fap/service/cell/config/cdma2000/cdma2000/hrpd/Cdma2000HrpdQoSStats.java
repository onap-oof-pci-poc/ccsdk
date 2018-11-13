package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdQoSStatsG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.CDMA2000.HRPD.QoSStats.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-hrpd-qo-s-stats {
 *     leaf num-qo-s-subscriber-profile-updates-rcvd {
 *         type uint64;
 *     }
 *     leaf num-pdsnip-flow-updates-msg-rcvd {
 *         type uint64;
 *     }
 *     leaf num-pdsnip-flow-updates-msg-failed {
 *         type uint64;
 *     }
 *     leaf num-qo-s-setup-requests-received {
 *         type uint64;
 *     }
 *     leaf num-qo-s-setup-requests-accepted {
 *         type uint64;
 *     }
 *     leaf num-qo-s-setup-requests-rejected {
 *         type uint64;
 *     }
 *     leaf num-reservation-on-requests-received {
 *         type uint64;
 *     }
 *     leaf num-reservation-on-requests-accepted {
 *         type uint64;
 *     }
 *     leaf num-reservation-on-requests-rejected {
 *         type uint64;
 *     }
 *     leaf num-reservation-on-requests-failed {
 *         type uint64;
 *     }
 *     leaf num-fwd-reservation-on-messages-sent {
 *         type uint64;
 *     }
 *     leaf num-rev-reservation-on-messages-sent {
 *         type uint64;
 *     }
 *     leaf num-reservation-off-requests-received {
 *         type uint64;
 *     }
 *     leaf num-reservation-off-requests-accepted {
 *         type uint64;
 *     }
 *     leaf num-reservation-off-requests-rejected {
 *         type uint64;
 *     }
 *     leaf num-fwd-reservation-off-messages-sent {
 *         type uint64;
 *     }
 *     leaf num-rev-reservation-off-messages-sent {
 *         type uint64;
 *     }
 *     leaf num-qo-s-release-requests-received {
 *         type uint64;
 *     }
 *     leaf num-connection-close-initiated-no-ran-rsr {
 *         type uint64;
 *     }
 *     uses cdma2000-hrpd-qo-s-stats-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-hrpd/cdma2000-hrpd-qo-s-stats</i>
 *
 * <p>To create instances of this class use {@link Cdma2000HrpdQoSStatsBuilder}.
 * @see Cdma2000HrpdQoSStatsBuilder
 *
 */
public interface Cdma2000HrpdQoSStats
    extends
    ChildOf<Cdma2000Hrpd>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats>,
    Cdma2000HrpdQoSStatsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-qo-s-stats").intern();


}

