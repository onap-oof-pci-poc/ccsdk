package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpAssocG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.Transport.SCTP.Assoc.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list transport-sctp-assoc {
 *     key "primary-peer-address" "local-port";
 *     leaf status {
 *         type enumeration;
 *     }
 *     leaf primary-peer-address {
 *         type ip-address;
 *     }
 *     leaf local-port {
 *         type uint16;
 *     }
 *     leaf in-streams {
 *         type uint64;
 *     }
 *     leaf out-streams {
 *         type uint64;
 *     }
 *     leaf start-time {
 *         type date-and-time;
 *     }
 *     leaf discontinuity {
 *         type date-and-time;
 *     }
 *     uses transport-sctp-assoc-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/transport/transport-sctp/transport-sctp-assoc</i>
 *
 * <p>To create instances of this class use {@link TransportSctpAssocBuilder}.
 * @see TransportSctpAssocBuilder
 * @see TransportSctpAssocKey
 *
 */
public interface TransportSctpAssoc
    extends
    ChildOf<TransportSctp>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>,
    TransportSctpAssocG,
    Identifiable<TransportSctpAssocKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport-sctp-assoc").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssocKey</code> <code>key</code>, or <code>null</code> if not present
     */
    TransportSctpAssocKey getKey();

}

