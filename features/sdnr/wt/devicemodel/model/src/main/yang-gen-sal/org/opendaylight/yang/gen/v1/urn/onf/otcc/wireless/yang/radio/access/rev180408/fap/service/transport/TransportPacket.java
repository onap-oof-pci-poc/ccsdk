package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportPacketG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.Transport.Packet.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container transport-packet {
 *     leaf echo-interval {
 *         type echo-interval;
 *     }
 *     leaf sent-packets {
 *         type uint64;
 *     }
 *     leaf rcv-packets {
 *         type uint64;
 *     }
 *     uses transport-packet-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/transport/transport-packet</i>
 *
 * <p>To create instances of this class use {@link TransportPacketBuilder}.
 * @see TransportPacketBuilder
 *
 */
public interface TransportPacket
    extends
    ChildOf<Transport>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportPacket>,
    TransportPacketG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport-packet").intern();


}

