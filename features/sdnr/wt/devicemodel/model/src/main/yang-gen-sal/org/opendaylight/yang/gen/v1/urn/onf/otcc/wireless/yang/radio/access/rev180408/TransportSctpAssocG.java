package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

/**
 * SCTP Association Table
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping transport-sctp-assoc-g {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/transport-sctp-assoc-g</i>
 *
 */
public interface TransportSctpAssocG
    extends
    DataObject
{


    public enum Status {
        /**
         * none
         *
         */
        Disabled(1, "disabled"),
        
        /**
         * none
         *
         */
        Active(2, "active"),
        
        /**
         * none
         *
         */
        Progressing(3, "progressing"),
        
        /**
         * none
         *
         */
        ShuttingDown(4, "shutting-down"),
        
        /**
         * none
         *
         */
        Error(5, "error")
        ;
    
        private static final java.util.Map<java.lang.Integer, Status> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Status> b = com.google.common.collect.ImmutableMap.builder();
            for (Status enumItem : Status.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private Status(int value, java.lang.String name) {
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
         * @return corresponding Status item
         */
        public static Status forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport-sctp-assoc-g").intern();

    /**
     * The status of this SCTP association entry.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpAssocG.Status</code> <code>status</code>, or <code>null</code> if not present
     */
    Status getStatus();
    
    /**
     * The primary IP address of the peer SCTP association entity.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>primaryPeerAddress</code>, or <code>null</code> if not present
     */
    IpAddress getPrimaryPeerAddress();
    
    /**
     * The local SCTP port number used for this SCTP association.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>localPort</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLocalPort();
    
    /**
     * The number of Inbound Streams according to the negotiation at association 
     * start-up.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>inStreams</code>, or <code>null</code> if not present
     */
    BigInteger getInStreams();
    
    /**
     * The number of Outbound Streams according to the negotiation at association 
     * start-up.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>outStreams</code>, or <code>null</code> if not present
     */
    BigInteger getOutStreams();
    
    /**
     * The start Time for the present SCTP association.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime</code> <code>startTime</code>, or <code>null</code> if not present
     */
    DateAndTime getStartTime();
    
    /**
     * The time of the last discontinuity.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime</code> <code>discontinuity</code>, or <code>null</code> if not present
     */
    DateAndTime getDiscontinuity();

}

