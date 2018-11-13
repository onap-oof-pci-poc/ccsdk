package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping wire-interface-status-g {
 *     leaf interface-is-up {
 *         type interface-is-up;
 *     }
 *     leaf-list receive-signal-is-detected {
 *         type boolean;
 *     }
 *     leaf pmd-is-up {
 *         type pmd-is-up;
 *     }
 *     leaf pmd-cur {
 *         type pmd-cur;
 *     }
 *     container signal-ordering-kind-cur {
 *         leaf signal-ordering-kind-name {
 *             type string;
 *         }
 *         leaf-list signal-list {
 *             type string;
 *         }
 *         uses signal-ordering-type-g;
 *     }
 *     leaf eee-is-up {
 *         type eee-is-up;
 *     }
 *     leaf link-is-up {
 *         type link-is-up;
 *     }
 *     leaf link-is-idle {
 *         type link-is-idle;
 *     }
 *     leaf tx-level-cur {
 *         type tx-level-cur;
 *     }
 *     leaf-list rx-level-cur {
 *         type rx-level-cur;
 *     }
 *     leaf temp-cur {
 *         type temp-cur;
 *     }
 *     leaf loop-back-kind-up {
 *         type loop-back-kind-up;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/wire-interface-status-g</i>
 *
 */
public interface WireInterfaceStatusG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "wire-interface-status-g").intern();

    /**
     * 802.3 according 30.3.2.1.7 aPhyAdminState1 = A Physical layer entity (PHY) 
     * exists (including Medium Attachment Unit (e.g. SFP) ) and it is powered and can 
     * be managed
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>interfaceIsUp</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isInterfaceIsUp();
    
    /**
     * 802.3 45.2.1.9 PMD receive signal detect1 = Receiver (e.g. laser) detects 
     * signal; receiveSignalIsDetected[0]:total interface; 
     * receiveSignalIsDetected[1..10] different lanes of a multilane Medium Attachment 
     * Unit (MAU)
     *
     *
     *
     * @return <code>java.util.List</code> <code>receiveSignalIsDetected</code>, or <code>null</code> if not present
     */
    List<java.lang.Boolean> getReceiveSignalIsDetected();
    
    /**
     * Inverse of 802.3 45.2.1.2.3 Fault (1.1.7)If (interfaceIsUp=1) BUT 0 = there is a
     * fault in either transmit or receive path
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>pmdIsUp</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPmdIsUp();
    
    /**
     * Indicates the kind of Physical Medium Dependent (PMD) currently operated at this
     * interface
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.PmdNameType</code> <code>pmdCur</code>, or <code>null</code> if not present
     */
    PmdNameType getPmdCur();
    
    /**
     * Reference on a SignalOrderingType for expressing the currently active way of 
     * ordering the signals on the physical medium. Must contain a value as defined in 
     * TypeDefinitions::SignalOrderingType::signalOrderingKindName
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur</code> <code>signalOrderingKindCur</code>, or <code>null</code> if not present
     */
    SignalOrderingKindCur getSignalOrderingKindCur();
    
    /**
     * 1 = Energy Efficient Ethernet is supported at both ends of the link and it is 
     * activated
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>eeeIsUp</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEeeIsUp();
    
    /**
     * Parameter1 = (transceiverIsUp=1) AND communication is established to the remote 
     * site
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>linkIsUp</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLinkIsUp();
    
    /**
     * 1 = (linkIsUp=1) AND (eeeIsAvail=1) AND (eeeIsOn=1) AND link is currently in 
     * idle mode. If Energy Efficient Ethernet is not supported or switched off, this 
     * attribute must be 0.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>linkIsIdle</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLinkIsIdle();
    
    /**
     * Current transmit power
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>txLevelCur</code>, or <code>null</code> if not present
     */
    java.lang.Byte getTxLevelCur();
    
    /**
     * Current receive power; Also used for receive signal power measured at the Medium
     * Dependent Interface (MDI) of 10GBASE-T during training as described in 802.3 
     * 55.4.3.1
     *
     *
     *
     * @return <code>java.util.List</code> <code>rxLevelCur</code>, or <code>null</code> if not present
     */
    List<java.lang.Byte> getRxLevelCur();
    
    /**
     * Current temperature (in degree Celsius) inside the transceiverTo be moved to 
     * CoreModel::CorePhysicalModel-Initial::EquipmentDetail::ObjectClasses::DynamicDetails::PhysicalProperties
     *
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>tempCur</code>, or <code>null</code> if not present
     */
    java.lang.Byte getTempCur();
    
    /**
     * Paramter and MW IMThe currently active (not just configured) type of looping 
     * back of the wire interface header shall be expressed here. The received header 
     * is returned to the remote site.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.LoopBackType</code> <code>loopBackKindUp</code>, or <code>null</code> if not present
     */
    LoopBackType getLoopBackKindUp();

}

