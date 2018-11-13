package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains parameters relating to Real Time Transport using RTP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping transport-real-time-g {
 *     leaf rtcp-enable {
 *         type boolean;
 *     }
 *     leaf sent-packets {
 *         type uint64;
 *     }
 *     leaf rcv-packets {
 *         type uint64;
 *     }
 *     leaf bytes-sent {
 *         type uint64;
 *     }
 *     leaf bytes-received {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/transport-real-time-g</i>
 *
 */
public interface TransportRealTimeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport-real-time-g").intern();

    /**
     * Enable or disable RTCP.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>rtcpEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isRtcpEnable();
    
    /**
     * The number of sent RTP packets.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sentPackets</code>, or <code>null</code> if not present
     */
    BigInteger getSentPackets();
    
    /**
     * The number of received RTP packets.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rcvPackets</code>, or <code>null</code> if not present
     */
    BigInteger getRcvPackets();
    
    /**
     * Total number of RTP payload bytes sent.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>bytesSent</code>, or <code>null</code> if not present
     */
    BigInteger getBytesSent();
    
    /**
     * Total number of RTP payload bytes received.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>bytesReceived</code>, or <code>null</code> if not present
     */
    BigInteger getBytesReceived();

}

