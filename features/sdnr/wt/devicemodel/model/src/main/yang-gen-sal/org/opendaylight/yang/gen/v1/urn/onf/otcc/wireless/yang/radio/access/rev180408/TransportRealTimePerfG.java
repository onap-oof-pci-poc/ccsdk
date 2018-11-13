package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains performances relating to Real Time Transport using RTP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping transport-real-time-perf-g {
 *     leaf lost-rcv-packets {
 *         type uint64;
 *     }
 *     leaf lost-far-end-packets {
 *         type uint64;
 *     }
 *     leaf overruns {
 *         type uint64;
 *     }
 *     leaf underruns {
 *         type uint64;
 *     }
 *     leaf mean-rtt {
 *         type mean-rtt;
 *     }
 *     leaf max-rtt {
 *         type max-rtt;
 *     }
 *     leaf mean-receive-jitter {
 *         type mean-receive-jitter;
 *     }
 *     leaf max-receive-jitter {
 *         type max-receive-jitter;
 *     }
 *     leaf mean-far-end-jitter {
 *         type mean-far-end-jitter;
 *     }
 *     leaf max-far-end-jitter {
 *         type max-far-end-jitter;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/transport-real-time-perf-g</i>
 *
 */
public interface TransportRealTimePerfG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport-real-time-perf-g").intern();

    /**
     * The number of Lost RTP packets in reception.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>lostRcvPackets</code>, or <code>null</code> if not present
     */
    BigInteger getLostRcvPackets();
    
    /**
     * The number of Far End Lost RTP packets.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>lostFarEndPackets</code>, or <code>null</code> if not present
     */
    BigInteger getLostFarEndPackets();
    
    /**
     * Total number of times the receive jitter buffer has overrun.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>overruns</code>, or <code>null</code> if not present
     */
    BigInteger getOverruns();
    
    /**
     * Total number of times the receive jitter buffer has underrun for a CS-domain 
     * RAB.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>underruns</code>, or <code>null</code> if not present
     */
    BigInteger getUnderruns();
    
    /**
     * The mean Round Trip Time in {{units}} as computed by the source. 
     * {{bibref|RFC3550}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>meanRtt</code>, or <code>null</code> if not present
     */
    BigInteger getMeanRtt();
    
    /**
     * The maximum Round Trip Time in {{units}} as computed by the source. 
     * {{bibref|RFC3550}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxRtt</code>, or <code>null</code> if not present
     */
    BigInteger getMaxRtt();
    
    /**
     * The mean receive jitter in {{units}} as computed by the source. 
     * {{bibref|RFC3550}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>meanReceiveJitter</code>, or <code>null</code> if not present
     */
    BigInteger getMeanReceiveJitter();
    
    /**
     * The maximum receive jitter in {{units}} as computed by the source. 
     * {{bibref|RFC3550}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxReceiveJitter</code>, or <code>null</code> if not present
     */
    BigInteger getMaxReceiveJitter();
    
    /**
     * The mean far end jitter in {{units}} as computed by the source. 
     * {{bibref|RFC3550}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>meanFarEndJitter</code>, or <code>null</code> if not present
     */
    BigInteger getMeanFarEndJitter();
    
    /**
     * The maximum far end jitter in {{units}} as computed by the source. 
     * {{bibref|RFC3550}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxFarEndJitter</code>, or <code>null</code> if not present
     */
    BigInteger getMaxFarEndJitter();

}

