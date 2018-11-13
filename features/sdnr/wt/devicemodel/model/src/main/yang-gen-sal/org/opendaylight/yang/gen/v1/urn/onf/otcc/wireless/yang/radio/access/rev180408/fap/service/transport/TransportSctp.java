package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpG;

/**
 * Container for object class FAPService.{i}.Transport.SCTP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container transport-sctp {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf hb-interval {
 *         type hb-interval;
 *     }
 *     leaf max-association-retransmits {
 *         type max-association-retransmits;
 *     }
 *     leaf max-init-retransmits {
 *         type max-init-retransmits;
 *     }
 *     leaf max-path-retransmits {
 *         type max-path-retransmits;
 *     }
 *     leaf rto-initial {
 *         type rto-initial;
 *     }
 *     leaf rto-max {
 *         type rto-max;
 *     }
 *     leaf rto-min {
 *         type rto-min;
 *     }
 *     leaf val-cookie-life {
 *         type val-cookie-life;
 *     }
 *     leaf out-of-blues {
 *         type uint64;
 *     }
 *     leaf checksum-errors {
 *         type uint64;
 *     }
 *     leaf out-ctrl-chunks {
 *         type uint64;
 *     }
 *     leaf out-order-chunks {
 *         type uint64;
 *     }
 *     leaf out-unorder-chunks {
 *         type uint64;
 *     }
 *     leaf in-ctrl-chunks {
 *         type uint64;
 *     }
 *     leaf in-order-chunks {
 *         type uint64;
 *     }
 *     leaf in-unorder-chunks {
 *         type uint64;
 *     }
 *     leaf frag-usr-msgs {
 *         type uint64;
 *     }
 *     leaf reasm-usr-msgs {
 *         type uint64;
 *     }
 *     leaf out-sctp-packs {
 *         type uint64;
 *     }
 *     leaf in-sctp-packs {
 *         type uint64;
 *     }
 *     leaf discontinuity {
 *         type date-and-time;
 *     }
 *     leaf assoc-number-of-entries {
 *         type uint64;
 *     }
 *     list transport-sctp-assoc {
 *         key "primary-peer-address" "local-port";
 *         leaf status {
 *             type enumeration;
 *         }
 *         leaf primary-peer-address {
 *             type ip-address;
 *         }
 *         leaf local-port {
 *             type uint16;
 *         }
 *         leaf in-streams {
 *             type uint64;
 *         }
 *         leaf out-streams {
 *             type uint64;
 *         }
 *         leaf start-time {
 *             type date-and-time;
 *         }
 *         leaf discontinuity {
 *             type date-and-time;
 *         }
 *         uses transport-sctp-assoc-g;
 *     }
 *     uses transport-sctp-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/transport/transport-sctp</i>
 *
 * <p>To create instances of this class use {@link TransportSctpBuilder}.
 * @see TransportSctpBuilder
 *
 */
public interface TransportSctp
    extends
    ChildOf<Transport>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp>,
    TransportSctpG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport-sctp").intern();

    /**
     * List of object class FAPService.{i}.Transport.SCTP.Assoc.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>transportSctpAssoc</code>, or <code>null</code> if not present
     */
    List<TransportSctpAssoc> getTransportSctpAssoc();

}

