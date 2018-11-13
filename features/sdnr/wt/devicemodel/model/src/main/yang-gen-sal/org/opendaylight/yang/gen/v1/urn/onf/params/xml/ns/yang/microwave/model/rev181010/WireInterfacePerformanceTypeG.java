package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping wire-interface-performance-type-g {
 *     leaf es {
 *         type es;
 *     }
 *     leaf ses {
 *         type ses;
 *     }
 *     leaf symbol-error-during-carrier {
 *         type symbol-error-during-carrier;
 *     }
 *     leaf low-power-idle-transmitter-ms {
 *         type low-power-idle-transmitter-ms;
 *     }
 *     leaf low-power-idle-receiver-ms {
 *         type low-power-idle-receiver-ms;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/wire-interface-performance-type-g</i>
 *
 */
public interface WireInterfacePerformanceTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "wire-interface-performance-type-g").intern();

    /**
     * 802.3 30.8.1.1.13 aLineESsNumber of errored seconds
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>es</code>, or <code>null</code> if not present
     */
    java.lang.Integer getEs();
    
    /**
     * 802.3 30.8.1.1.12 aLineSESsNumber of severely errored seconds
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>ses</code>, or <code>null</code> if not present
     */
    java.lang.Integer getSes();
    
    /**
     * 802.3 according to 30.3.2.1.5 aSymbolErrorDuringCarrierNumber of times when 
     * valid carrier was present and an invalid data symbol occured.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>symbolErrorDuringCarrier</code>, or <code>null</code> if not present
     */
    java.lang.Integer getSymbolErrorDuringCarrier();
    
    /**
     * 802.3 similar to 30.3.2.1.8 aTransmitLPIMicrosecondsNumber of milliseconds 
     * (original counter expresses microseconds), during which the transmitter was in 
     * power save mode
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>lowPowerIdleTransmitterMs</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLowPowerIdleTransmitterMs();
    
    /**
     * 802.3 similar to 30.3.2.1.9 aReceiveLPIMicrosecondsNumber of milliseconds 
     * (original counter expresses microseconds), during which the receiver was in 
     * power save mode
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>lowPowerIdleReceiverMs</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLowPowerIdleReceiverMs();

}

