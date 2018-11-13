package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSip;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSipFcsG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.Transport.SIP.FCS.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container transport-sip-fcs {
 *     leaf fcsuri {
 *         type string;
 *     }
 *     leaf out-going-proxy-uri {
 *         type string;
 *     }
 *     leaf p-access-net-info-header {
 *         type string;
 *     }
 *     leaf realm {
 *         type string;
 *     }
 *     leaf impu {
 *         type string;
 *     }
 *     leaf impi {
 *         type string;
 *     }
 *     leaf sip-password {
 *         type string;
 *     }
 *     leaf-list sip-auth-capability {
 *         type enumeration;
 *     }
 *     leaf sip-auth-method {
 *         type string;
 *     }
 *     leaf sip-local-port {
 *         type uint16;
 *     }
 *     leaf rtp-port-low-limit {
 *         type uint16;
 *     }
 *     leaf rtp-port-high-limit {
 *         type uint16;
 *     }
 *     leaf sip-reg-expiry {
 *         type uint64;
 *     }
 *     leaf sip-session-expiry {
 *         type sip-session-expiry;
 *     }
 *     leaf-list emergency-numbers-list {
 *         type string;
 *     }
 *     leaf timer-t1 {
 *         type timer-t1;
 *     }
 *     leaf timer-t2 {
 *         type timer-t2;
 *     }
 *     leaf timer-t4 {
 *         type timer-t4;
 *     }
 *     leaf t3210 {
 *         type t3210;
 *     }
 *     uses transport-sip-fcs-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/transport/transport-sip/transport-sip-fcs</i>
 *
 * <p>To create instances of this class use {@link TransportSipFcsBuilder}.
 * @see TransportSipFcsBuilder
 *
 */
public interface TransportSipFcs
    extends
    ChildOf<TransportSip>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sip.TransportSipFcs>,
    TransportSipFcsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport-sip-fcs").intern();


}

