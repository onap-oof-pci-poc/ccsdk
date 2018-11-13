package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * This object models SIP Femtocell Convergence Server (FCS) parameters.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping transport-sip-fcs-g {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/transport-sip-fcs-g</i>
 *
 */
public interface TransportSipFcsG
    extends
    DataObject
{


    public enum SipAuthCapability {
        /**
         * none
         *
         */
        Tna(1, "tna"),
        
        /**
         * none
         *
         */
        SipDigest(2, "sip-digest")
        ;
    
        private static final java.util.Map<java.lang.Integer, SipAuthCapability> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, SipAuthCapability> b = com.google.common.collect.ImmutableMap.builder();
            for (SipAuthCapability enumItem : SipAuthCapability.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private SipAuthCapability(int value, java.lang.String name) {
            this.value = value;
            this.name = name;
        }
    
        /**
         * Returns the name of the enumeration item as it is specified in the input yang.
         *
         * @return the name of the enumeration item as it is specified in the input yang
         */
        public java.lang.String getName() {
            return name;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg integer value
         * @return corresponding SipAuthCapability item
         */
        public static SipAuthCapability forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport-sip-fcs-g").intern();

    /**
     * The request URI for MESSAGE method sent to Femtocell Convergence Server (FCS). 
     * The string MUST contain a URI as defined in {{bibref|RFC3986}}. The device MUST 
     * support SIP URI and MAY support other URI schemes.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>fcsuri</code>, or <code>null</code> if not present
     */
    java.lang.String getFcsuri();
    
    /**
     * The request URI for Outgoing Proxy. The string MUST contain a URI as defined in 
     * {{bibref|RFC3986}}. The device MUST support SIP URI and MAY support other URI 
     * schemes.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>outGoingProxyUri</code>, or <code>null</code> if not present
     */
    java.lang.String getOutGoingProxyUri();
    
    /**
     * This string will be populated as the value for P-Access-Network-Info header. 
     * This header is generated by the device. See {{bibref|3GPP2-X.S0059}} and 
     * {{bibref|RFC3455}}.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>pAccessNetInfoHeader</code>, or <code>null</code> if not present
     */
    java.lang.String getPAccessNetInfoHeader();
    
    /**
     * The FQDN or IP Address representing the Home Domain of the device. The request 
     * URI for REGISTER will be formed by prefixing "sip:" to this value.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>realm</code>, or <code>null</code> if not present
     */
    java.lang.String getRealm();
    
    /**
     * The "IP Multimedia Public User" (IMPU) Identity.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>impu</code>, or <code>null</code> if not present
     */
    java.lang.String getImpu();
    
    /**
     * The "IP Multimedia Private Identity" (IMPI). This value is ignored when 
     * {{param|SIPAuthMethod}} is set to {{enum|TNA|SIPAuthMethod}}.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>impi</code>, or <code>null</code> if not present
     */
    java.lang.String getImpi();
    
    /**
     * Password to Authenticate the IMS core. This value is ignored when 
     * {{param|SIPAuthMethod}} is set to {{enum|TNA|SIPAuthMethod}}.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>sipPassword</code>, or <code>null</code> if not present
     */
    java.lang.String getSipPassword();
    
    /**
     * Represents the SIP authentication mechanisms supported by this device.
     *
     *
     *
     * @return <code>java.util.List</code> <code>sipAuthCapability</code>, or <code>null</code> if not present
     */
    List<SipAuthCapability> getSipAuthCapability();
    
    /**
     * Represents the authentication method used by this device for SIP registration. 
     * If value is {{enum|SIPDigest}}, the {{param|SIPPassword}} MUST not be {{empty}}.
     * If value is {{enum|TNA}}, {{param|SIPPassword}} and {{param|IMPI}} are ignored.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>sipAuthMethod</code>, or <code>null</code> if not present
     */
    java.lang.String getSipAuthMethod();
    
    /**
     * Local port number for initiating SIP traffic.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>sipLocalPort</code>, or <code>null</code> if not present
     */
    java.lang.Integer getSipLocalPort();
    
    /**
     * The low limit of port number for originating and receiving RTP/RTCP traffic.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>rtpPortLowLimit</code>, or <code>null</code> if not present
     */
    java.lang.Integer getRtpPortLowLimit();
    
    /**
     * The high limit of port number for originating and receiving RTP/RTCP traffic.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>rtpPortHighLimit</code>, or <code>null</code> if not present
     */
    java.lang.Integer getRtpPortHighLimit();
    
    /**
     * SIP registration expiry value, as defined in {{bibref|RFC3261}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sipRegExpiry</code>, or <code>null</code> if not present
     */
    BigInteger getSipRegExpiry();
    
    /**
     * SIP session timer expiry value, in {{units}}, as defined in {{bibref|RFC4028}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sipSessionExpiry</code>, or <code>null</code> if not present
     */
    BigInteger getSipSessionExpiry();
    
    /**
     * Indicates the dialed digit pattern matching strings used to determine if the 
     * call is an emergency call that MAY bypass access control and receive priority 
     * treatment.
     *
     *
     *
     * @return <code>java.util.List</code> <code>emergencyNumbersList</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getEmergencyNumbersList();
    
    /**
     * Value of SIP timer T1, in {{units}}, as defined in {{bibref|RFC3261}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>timerT1</code>, or <code>null</code> if not present
     */
    BigInteger getTimerT1();
    
    /**
     * Value of SIP timer T2, in {{units}}, as defined in {{bibref|RFC3261}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>timerT2</code>, or <code>null</code> if not present
     */
    BigInteger getTimerT2();
    
    /**
     * Value of SIP timer T4, in {{units}}, as defined in {{bibref|RFC3261}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>timerT4</code>, or <code>null</code> if not present
     */
    BigInteger getTimerT4();
    
    /**
     * This value specifies how much time to wait, in {{units}}, before time out on 
     * location update accept/reject. See {{bibref|3GPP2-A.S0014}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>t3210</code>, or <code>null</code> if not present
     */
    java.lang.Short getT3210();

}

