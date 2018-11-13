package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.capability.g.SupportedChannelPlanList;
import java.util.List;

/**
 * Describes the 'analog' capabilities of modem and transmitter of the microwave 
 * device. Value ranges of attributes are not independently (e.g. min. and max. 
 * transmit power depends on modulation). Legal combinations of values are 
 * expressed in transmissionModeTypes.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping air-interface-capability-g {
 *     leaf type-of-equipment {
 *         type type-of-equipment;
 *     }
 *     leaf tx-frequency-min {
 *         type tx-frequency-min;
 *     }
 *     leaf tx-frequency-max {
 *         type tx-frequency-max;
 *     }
 *     leaf rx-frequency-min {
 *         type rx-frequency-min;
 *     }
 *     leaf rx-frequency-max {
 *         type rx-frequency-max;
 *     }
 *     leaf adaptive-modulation-is-avail {
 *         type adaptive-modulation-is-avail;
 *     }
 *     leaf mimo-is-avail {
 *         type mimo-is-avail;
 *     }
 *     leaf mimo-channels {
 *         type mimo-channels;
 *     }
 *     leaf alic-is-avail {
 *         type alic-is-avail;
 *     }
 *     leaf atpc-is-avail {
 *         type atpc-is-avail;
 *     }
 *     leaf atpc-range {
 *         type atpc-range;
 *     }
 *     leaf encryption-is-avail {
 *         type encryption-is-avail;
 *     }
 *     leaf-list supported-loop-back-kind-list {
 *         type loop-back-type;
 *     }
 *     leaf maintenance-timer-range {
 *         type maintenance-timer-range;
 *     }
 *     leaf-list supported-alarm-list {
 *         type string;
 *     }
 *     leaf supported-alarms {
 *         type supported-alarms;
 *         status DEPRECATED;
 *     }
 *     list supported-channel-plan-list {
 *         key "supported-channel-plan";
 *         leaf supported-channel-plan {
 *             type string;
 *         }
 *         leaf duplex-distance-is-variable {
 *             type duplex-distance-is-variable;
 *         }
 *         leaf-list duplex-distance-list {
 *             type duplex-distance-list;
 *         }
 *         leaf duplex-distance {
 *             type duplex-distance;
 *             status DEPRECATED;
 *         }
 *         leaf auto-freq-select-is-avail {
 *             type auto-freq-select-is-avail;
 *         }
 *         list transmission-mode-list {
 *             key "transmission-mode-id";
 *             leaf transmission-mode-id {
 *                 type universal-id;
 *             }
 *             leaf transmission-mode-name {
 *                 type transmission-mode-name;
 *             }
 *             leaf channel-bandwidth {
 *                 type channel-bandwidth;
 *             }
 *             leaf modulation-scheme {
 *                 type modulation-scheme;
 *             }
 *             leaf code-rate {
 *                 type code-rate;
 *             }
 *             leaf symbol-rate-reduction-factor {
 *                 type symbol-rate-reduction-factor;
 *             }
 *             leaf tx-power-min {
 *                 type tx-power-min;
 *             }
 *             leaf tx-power-max {
 *                 type tx-power-max;
 *             }
 *             leaf rx-threshold {
 *                 type rx-threshold;
 *             }
 *             leaf am-upshift-level {
 *                 type am-upshift-level;
 *             }
 *             leaf am-downshift-level {
 *                 type am-downshift-level;
 *             }
 *             leaf xpic-is-avail {
 *                 type xpic-is-avail;
 *             }
 *             uses transmission-mode-type-g;
 *         }
 *         uses channel-plan-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-capability-g</i>
 *
 */
public interface AirInterfaceCapabilityG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "air-interface-capability-g").intern();

    /**
     * This parameter indicates the equipment type. Instead of uploading the complete 
     * set of capabilities, capabilities of the same equipment type could be reused. 
     * Should be unique for a combination of modem, radio and their respective 
     * firmware.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>typeOfEquipment</code>, or <code>null</code> if not present
     */
    java.lang.String getTypeOfEquipment();
    
    /**
     * Value of the minimum transmit frequency tunable at the air interface.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>txFrequencyMin</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTxFrequencyMin();
    
    /**
     * Value of the maximum transmit frequency tunable at the air interface.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>txFrequencyMax</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTxFrequencyMax();
    
    /**
     * Value of the minimum receive frequency tunable at the air interface.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>rxFrequencyMin</code>, or <code>null</code> if not present
     */
    java.lang.Integer getRxFrequencyMin();
    
    /**
     * Value of the maximum receive frequency tunable at the air interface.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>rxFrequencyMax</code>, or <code>null</code> if not present
     */
    java.lang.Integer getRxFrequencyMax();
    
    /**
     * In case the device is capable of adaptive modulation, this field shall contain a
     * 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>adaptiveModulationIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAdaptiveModulationIsAvail();
    
    /**
     * In case the device is capable of MIMO, this field shall contain a 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mimoIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMimoIsAvail();
    
    /**
     * Maximum number (n) of spatial multiplexing streams that can be conveyed by an n 
     * x n MIMO configuration.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>mimoChannels</code>, or <code>null</code> if not present
     */
    java.lang.Byte getMimoChannels();
    
    /**
     * In case the microwave radio is capable of Adjacent Link Interference Cancelation
     * (canceling of interference cause by transmitters located at the same site), this
     * field shall contain a 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>alicIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAlicIsAvail();
    
    /**
     * In case the microwave radio is capable of ATPC, this field shall contain a 
     * 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>atpcIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAtpcIsAvail();
    
    /**
     * Extent of the ATPC range. This value represents a device specific maximum value.
     * The actual range of the ATPC at a specific link might be limited by the 
     * difference between configured transmit power 
     * (AirInterface::AirInterfaceConfiguration::txPower) and minimum transmit power of
     * the device (TypeDefinitions::TransmissionModeType::txPowerMin).
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>atpcRange</code>, or <code>null</code> if not present
     */
    java.lang.Byte getAtpcRange();
    
    /**
     * Shall be marked 'true', if payload encryption is available.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>encryptionIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEncryptionIsAvail();
    
    /**
     * List of supported kinds of looping back of header information to the remote 
     * site.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedLoopBackKindList</code>, or <code>null</code> if not present
     */
    List<LoopBackType> getSupportedLoopBackKindList();
    
    /**
     * Available time periods for maintenance configurations (e.g. the loop back of 
     * microwave header information) to be described. Concrete values shall be 
     * separated by commas (e.g. '10, 60, 360'). Ranges shall be expressed as two 
     * values separated by a minus (e.g. '10-360').
     *
     *
     *
     * @return <code>java.lang.String</code> <code>maintenanceTimerRange</code>, or <code>null</code> if not present
     */
    java.lang.String getMaintenanceTimerRange();
    
    /**
     * Available alarms to be listed. 
     * Mandatory:'signalIsLost','rslIsExceeded','signalIDMismatching','temperatureIsExceeded','modemIsFaulty','radioIsFaulty'
     * and 'modulationIsDownShifted'. Further alarms might be added by the vendor.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedAlarmList</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getSupportedAlarmList();
    
    /**
     * Available alarms to be listed. 
     * Mandatory:'signalIsLost','rslIsExceeded','temperatureIsExceeded','modemIsFaulty','radioIsFaulty'
     * and 'modulationIsDownShifted'. Further alarms might be added by the device. 
     * Names are to be separated by commas.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>supportedAlarms</code>, or <code>null</code> if not present
     */
    @Deprecated
    java.lang.String getSupportedAlarms();
    
    /**
     * List of channel spacing that are supported by the device.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedChannelPlanList</code>, or <code>null</code> if not present
     */
    List<SupportedChannelPlanList> getSupportedChannelPlanList();

}

