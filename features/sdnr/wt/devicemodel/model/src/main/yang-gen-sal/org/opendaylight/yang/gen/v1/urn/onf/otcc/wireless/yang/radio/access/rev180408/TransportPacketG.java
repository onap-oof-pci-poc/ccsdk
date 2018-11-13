package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains parameters relating to Packet Transport using GTP-U.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping transport-packet-g {
 *     leaf echo-interval {
 *         type echo-interval;
 *     }
 *     leaf sent-packets {
 *         type uint64;
 *     }
 *     leaf rcv-packets {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/transport-packet-g</i>
 *
 */
public interface TransportPacketG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport-packet-g").intern();

    /**
     * Echo interval in {{units}}. An Echo interval value of zero means echo is 
     * disabled.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>echoInterval</code>, or <code>null</code> if not present
     */
    BigInteger getEchoInterval();
    
    /**
     * The number of sent GTP-U packets.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sentPackets</code>, or <code>null</code> if not present
     */
    BigInteger getSentPackets();
    
    /**
     * The number of received GTP-U packets.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rcvPackets</code>, or <code>null</code> if not present
     */
    BigInteger getRcvPackets();

}

