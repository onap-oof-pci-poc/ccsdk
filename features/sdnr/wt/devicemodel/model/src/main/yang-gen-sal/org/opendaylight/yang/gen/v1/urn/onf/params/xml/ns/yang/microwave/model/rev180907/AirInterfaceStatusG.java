package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * Measurements of current values on the air interface and operational status of 
 * the device.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping air-interface-status-g {
 *     leaf tx-frequency-cur {
 *         type tx-frequency-cur;
 *     }
 *     leaf rx-frequency-cur {
 *         type rx-frequency-cur;
 *     }
 *     leaf tx-level-cur {
 *         type tx-level-cur;
 *     }
 *     leaf rx-level-cur {
 *         type rx-level-cur;
 *     }
 *     leaf transmission-mode-cur {
 *         type leafref;
 *     }
 *     leaf modulation-cur {
 *         type modulation-cur;
 *         status DEPRECATED;
 *     }
 *     leaf code-rate-cur {
 *         type code-rate-cur;
 *         status DEPRECATED;
 *     }
 *     leaf received-signal-id {
 *         type received-signal-id;
 *     }
 *     leaf snir-cur {
 *         type snir-cur;
 *     }
 *     leaf xpd-cur {
 *         type xpd-cur;
 *     }
 *     leaf rf-temp-cur {
 *         type rf-temp-cur;
 *     }
 *     leaf last-status-change {
 *         type last-status-change;
 *     }
 *     leaf radio-power-is-up {
 *         type radio-power-is-up;
 *     }
 *     leaf link-is-up {
 *         type link-is-up;
 *     }
 *     leaf xpic-is-up {
 *         type xpic-is-up;
 *     }
 *     leaf mimo-is-up {
 *         type mimo-is-up;
 *     }
 *     leaf alic-is-up {
 *         type alic-is-up;
 *     }
 *     leaf atpc-is-up {
 *         type atpc-is-up;
 *     }
 *     leaf auto-freq-select-is-up {
 *         type auto-freq-select-is-up;
 *     }
 *     leaf loop-back-kind-up {
 *         type loop-back-kind-up;
 *     }
 *     leaf local-end-point-id {
 *         type local-end-point-id;
 *     }
 *     leaf remote-end-point-id {
 *         type remote-end-point-id;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-status-g</i>
 *
 */
public interface AirInterfaceStatusG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "air-interface-status-g").intern();

    /**
     * Center frequency of the currently operated transmit channel.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>txFrequencyCur</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTxFrequencyCur();
    
    /**
     * Center frequency of the currently operated receive channel.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>rxFrequencyCur</code>, or <code>null</code> if not present
     */
    java.lang.Integer getRxFrequencyCur();
    
    /**
     * Current transmit level.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>txLevelCur</code>, or <code>null</code> if not present
     */
    java.lang.Byte getTxLevelCur();
    
    /**
     * Current receive level.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>rxLevelCur</code>, or <code>null</code> if not present
     */
    java.lang.Byte getRxLevelCur();
    
    /**
     * Currently operated transmission mode according to definitions in Capabilities.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>transmissionModeCur</code>, or <code>null</code> if not present
     */
    UniversalId getTransmissionModeCur();
    
    /**
     * Currently operated modulation on transmit path. The modulation scheme shall be 
     * described by the number of states in the phase diagram (e.g. BPSK-&amp;gt;'2' or
     * 256QAM-&amp;gt;'256'). Allowed values are defined in 
     * TypeDefinitions::transmissionModeType::modulationScheme.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>modulationCur</code>, or <code>null</code> if not present
     */
    @Deprecated
    java.lang.Short getModulationCur();
    
    /**
     * Code rate of the currently operated coding scheme (Net bit rate ? Gross bit rate
     * ? code rate).
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>codeRateCur</code>, or <code>null</code> if not present
     */
    @Deprecated
    java.lang.Byte getCodeRateCur();
    
    /**
     * ID of the signal, which the receiver is currently synchronized on.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>receivedSignalId</code>, or <code>null</code> if not present
     */
    java.lang.Short getReceivedSignalId();
    
    /**
     * Currently measured signal to (noise+interference) ratio.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>snirCur</code>, or <code>null</code> if not present
     */
    java.lang.Byte getSnirCur();
    
    /**
     * Currently measured cross polarization discrimination.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>xpdCur</code>, or <code>null</code> if not present
     */
    java.lang.Byte getXpdCur();
    
    /**
     * Current temperature (in degree Celsius) of the radio module inside the outdoor 
     * unit.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>rfTempCur</code>, or <code>null</code> if not present
     */
    java.lang.Byte getRfTempCur();
    
    /**
     * Time the Air Interface entered its current operational status. 
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime</code> <code>lastStatusChange</code>, or <code>null</code> if not present
     */
    DateAndTime getLastStatusChange();
    
    /**
     * If the radio unit has power and is switched on, this shall be expressed as a 
     * 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>radioPowerIsUp</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isRadioPowerIsUp();
    
    /**
     * If connection is established to the remote site with the same linkID, this shall
     * be expressed as a 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>linkIsUp</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLinkIsUp();
    
    /**
     * If XPIC is currently actually working (not just configured), this shall be 
     * expressed as a 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>xpicIsUp</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isXpicIsUp();
    
    /**
     * If MIMO is currently actually working (not just configured), this shall be 
     * expressed as a 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mimoIsUp</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMimoIsUp();
    
    /**
     * If Adjacent Link Interference Cancelation (ALIC) is currently actually working 
     * (not just configured), this shall be expressed as a 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>alicIsUp</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAlicIsUp();
    
    /**
     * If ATPC is currently actually working (not just configured), this shall be 
     * expressed as a 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>atpcIsUp</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAtpcIsUp();
    
    /**
     * If automated frequency selection is currently actually working (not just 
     * configured), this shall be expressed as a 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>autoFreqSelectIsUp</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAutoFreqSelectIsUp();
    
    /**
     * The currently active (not just configured) type of looping back of the air 
     * interface header shall be expressed here. The received header is returned to the
     * remote site.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.LoopBackType</code> <code>loopBackKindUp</code>, or <code>null</code> if not present
     */
    LoopBackType getLoopBackKindUp();
    
    /**
     * The value of the localEndPointId is a vendor specific identifier of the air 
     * interface, used by the node to discover a microwave radio link.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>localEndPointId</code>, or <code>null</code> if not present
     */
    java.lang.String getLocalEndPointId();
    
    /**
     * The value of the remoteEndPointId is a vendor specific identifier or the 
     * airinterface at the remote side, used to by the node to discover a microwave 
     * radio link.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>remoteEndPointId</code>, or <code>null</code> if not present
     */
    java.lang.String getRemoteEndPointId();

}

