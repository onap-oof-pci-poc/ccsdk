package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSip;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportPacket;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSecurity;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime;

/**
 * Container for object class FAPService.{i}.Transport.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container transport {
 *     container transport-sip {
 *         leaf enable {
 *             type boolean;
 *         }
 *         container transport-sip-fcs {
 *             leaf fcsuri {
 *                 type string;
 *             }
 *             leaf out-going-proxy-uri {
 *                 type string;
 *             }
 *             leaf p-access-net-info-header {
 *                 type string;
 *             }
 *             leaf realm {
 *                 type string;
 *             }
 *             leaf impu {
 *                 type string;
 *             }
 *             leaf impi {
 *                 type string;
 *             }
 *             leaf sip-password {
 *                 type string;
 *             }
 *             leaf-list sip-auth-capability {
 *                 type enumeration;
 *             }
 *             leaf sip-auth-method {
 *                 type string;
 *             }
 *             leaf sip-local-port {
 *                 type uint16;
 *             }
 *             leaf rtp-port-low-limit {
 *                 type uint16;
 *             }
 *             leaf rtp-port-high-limit {
 *                 type uint16;
 *             }
 *             leaf sip-reg-expiry {
 *                 type uint64;
 *             }
 *             leaf sip-session-expiry {
 *                 type sip-session-expiry;
 *             }
 *             leaf-list emergency-numbers-list {
 *                 type string;
 *             }
 *             leaf timer-t1 {
 *                 type timer-t1;
 *             }
 *             leaf timer-t2 {
 *                 type timer-t2;
 *             }
 *             leaf timer-t4 {
 *                 type timer-t4;
 *             }
 *             leaf t3210 {
 *                 type t3210;
 *             }
 *             uses transport-sip-fcs-g;
 *         }
 *         uses transport-sip-g;
 *     }
 *     container transport-sctp {
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf hb-interval {
 *             type hb-interval;
 *         }
 *         leaf max-association-retransmits {
 *             type max-association-retransmits;
 *         }
 *         leaf max-init-retransmits {
 *             type max-init-retransmits;
 *         }
 *         leaf max-path-retransmits {
 *             type max-path-retransmits;
 *         }
 *         leaf rto-initial {
 *             type rto-initial;
 *         }
 *         leaf rto-max {
 *             type rto-max;
 *         }
 *         leaf rto-min {
 *             type rto-min;
 *         }
 *         leaf val-cookie-life {
 *             type val-cookie-life;
 *         }
 *         leaf out-of-blues {
 *             type uint64;
 *         }
 *         leaf checksum-errors {
 *             type uint64;
 *         }
 *         leaf out-ctrl-chunks {
 *             type uint64;
 *         }
 *         leaf out-order-chunks {
 *             type uint64;
 *         }
 *         leaf out-unorder-chunks {
 *             type uint64;
 *         }
 *         leaf in-ctrl-chunks {
 *             type uint64;
 *         }
 *         leaf in-order-chunks {
 *             type uint64;
 *         }
 *         leaf in-unorder-chunks {
 *             type uint64;
 *         }
 *         leaf frag-usr-msgs {
 *             type uint64;
 *         }
 *         leaf reasm-usr-msgs {
 *             type uint64;
 *         }
 *         leaf out-sctp-packs {
 *             type uint64;
 *         }
 *         leaf in-sctp-packs {
 *             type uint64;
 *         }
 *         leaf discontinuity {
 *             type date-and-time;
 *         }
 *         leaf assoc-number-of-entries {
 *             type uint64;
 *         }
 *         list transport-sctp-assoc {
 *             key "primary-peer-address" "local-port";
 *             leaf status {
 *                 type enumeration;
 *             }
 *             leaf primary-peer-address {
 *                 type ip-address;
 *             }
 *             leaf local-port {
 *                 type uint16;
 *             }
 *             leaf in-streams {
 *                 type uint64;
 *             }
 *             leaf out-streams {
 *                 type uint64;
 *             }
 *             leaf start-time {
 *                 type date-and-time;
 *             }
 *             leaf discontinuity {
 *                 type date-and-time;
 *             }
 *             uses transport-sctp-assoc-g;
 *         }
 *         uses transport-sctp-g;
 *     }
 *     container transport-real-time {
 *         leaf rtcp-enable {
 *             type boolean;
 *         }
 *         leaf sent-packets {
 *             type uint64;
 *         }
 *         leaf rcv-packets {
 *             type uint64;
 *         }
 *         leaf bytes-sent {
 *             type uint64;
 *         }
 *         leaf bytes-received {
 *             type uint64;
 *         }
 *         container transport-real-time-perf {
 *             leaf lost-rcv-packets {
 *                 type uint64;
 *             }
 *             leaf lost-far-end-packets {
 *                 type uint64;
 *             }
 *             leaf overruns {
 *                 type uint64;
 *             }
 *             leaf underruns {
 *                 type uint64;
 *             }
 *             leaf mean-rtt {
 *                 type mean-rtt;
 *             }
 *             leaf max-rtt {
 *                 type max-rtt;
 *             }
 *             leaf mean-receive-jitter {
 *                 type mean-receive-jitter;
 *             }
 *             leaf max-receive-jitter {
 *                 type max-receive-jitter;
 *             }
 *             leaf mean-far-end-jitter {
 *                 type mean-far-end-jitter;
 *             }
 *             leaf max-far-end-jitter {
 *                 type max-far-end-jitter;
 *             }
 *             uses transport-real-time-perf-g;
 *         }
 *         uses transport-real-time-g;
 *     }
 *     container transport-packet {
 *         leaf echo-interval {
 *             type echo-interval;
 *         }
 *         leaf sent-packets {
 *             type uint64;
 *         }
 *         leaf rcv-packets {
 *             type uint64;
 *         }
 *         uses transport-packet-g;
 *     }
 *     container transport-security {
 *         leaf secret-number-of-entries {
 *             type uint64;
 *         }
 *         list transport-security-secret {
 *             key "uicc-card-id";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf type {
 *                 type enumeration;
 *             }
 *             leaf status {
 *                 type enumeration;
 *             }
 *             leaf uicc-card-id {
 *                 type string;
 *             }
 *             uses transport-security-secret-g;
 *         }
 *         uses transport-security-g;
 *     }
 *     uses transport-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/transport</i>
 *
 * <p>To create instances of this class use {@link TransportBuilder}.
 * @see TransportBuilder
 *
 */
public interface Transport
    extends
    ChildOf<FapService>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>,
    TransportG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport").intern();

    /**
     * Container for object class FAPService.{i}.Transport.SIP.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSip</code> <code>transportSip</code>, or <code>null</code> if not present
     */
    TransportSip getTransportSip();
    
    /**
     * Container for object class FAPService.{i}.Transport.SCTP.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp</code> <code>transportSctp</code>, or <code>null</code> if not present
     */
    TransportSctp getTransportSctp();
    
    /**
     * Container for object class FAPService.{i}.Transport.RealTime.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime</code> <code>transportRealTime</code>, or <code>null</code> if not present
     */
    TransportRealTime getTransportRealTime();
    
    /**
     * Container for object class FAPService.{i}.Transport.Packet.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportPacket</code> <code>transportPacket</code>, or <code>null</code> if not present
     */
    TransportPacket getTransportPacket();
    
    /**
     * Container for object class FAPService.{i}.Transport.Security.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSecurity</code> <code>transportSecurity</code>, or <code>null</code> if not present
     */
    TransportSecurity getTransportSecurity();

}

