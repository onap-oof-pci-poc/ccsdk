package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimeG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.Transport.RealTime.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container transport-real-time {
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
 *     container transport-real-time-perf {
 *         leaf lost-rcv-packets {
 *             type uint64;
 *         }
 *         leaf lost-far-end-packets {
 *             type uint64;
 *         }
 *         leaf overruns {
 *             type uint64;
 *         }
 *         leaf underruns {
 *             type uint64;
 *         }
 *         leaf mean-rtt {
 *             type mean-rtt;
 *         }
 *         leaf max-rtt {
 *             type max-rtt;
 *         }
 *         leaf mean-receive-jitter {
 *             type mean-receive-jitter;
 *         }
 *         leaf max-receive-jitter {
 *             type max-receive-jitter;
 *         }
 *         leaf mean-far-end-jitter {
 *             type mean-far-end-jitter;
 *         }
 *         leaf max-far-end-jitter {
 *             type max-far-end-jitter;
 *         }
 *         uses transport-real-time-perf-g;
 *     }
 *     uses transport-real-time-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/transport/transport-real-time</i>
 *
 * <p>To create instances of this class use {@link TransportRealTimeBuilder}.
 * @see TransportRealTimeBuilder
 *
 */
public interface TransportRealTime
    extends
    ChildOf<Transport>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>,
    TransportRealTimeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport-real-time").intern();

    /**
     * Container for object class FAPService.{i}.Transport.RealTime.Perf.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf</code> <code>transportRealTimePerf</code>, or <code>null</code> if not present
     */
    TransportRealTimePerf getTransportRealTimePerf();

}

