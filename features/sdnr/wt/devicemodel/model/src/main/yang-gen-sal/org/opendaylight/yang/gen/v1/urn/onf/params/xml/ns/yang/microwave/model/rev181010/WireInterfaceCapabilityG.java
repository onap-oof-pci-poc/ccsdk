package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping wire-interface-capability-g {
 *     list available-mau-list {
 *         key "mau-id";
 *         leaf mau-id {
 *             type universal-id;
 *         }
 *         leaf mii-kind {
 *             type mii-kind;
 *         }
 *         leaf mdi-kind {
 *             type mdi-kind;
 *         }
 *         leaf required-medium-kind {
 *             type required-medium-kind;
 *         }
 *         leaf-list wavelength-min {
 *             type wavelength-min;
 *         }
 *         leaf-list wavelength-max {
 *             type wavelength-max;
 *         }
 *         leaf wavelength-grid-min {
 *             type wavelength-grid-min;
 *         }
 *         leaf link-length-max {
 *             type link-length-max;
 *         }
 *         leaf vendor-name {
 *             type vendor-name;
 *         }
 *         leaf vendor-oui {
 *             type vendor-oui;
 *         }
 *         leaf part-number {
 *             type part-number;
 *         }
 *         leaf revision-number {
 *             type revision-number;
 *         }
 *         leaf serial-number {
 *             type serial-number;
 *         }
 *         leaf date-code {
 *             type date-code;
 *         }
 *         leaf-list pmd-list {
 *             type pmd-name-type;
 *         }
 *         list signal-ordering-list {
 *             key "signal-ordering-kind-name";
 *             leaf signal-ordering-kind-name {
 *                 type string;
 *             }
 *             leaf-list signal-list {
 *                 type string;
 *             }
 *             uses signal-ordering-type-g;
 *         }
 *         leaf auto-signal-ordering-is-avail {
 *             type auto-signal-ordering-is-avail;
 *         }
 *         leaf short-reach-mode-is-avail {
 *             type short-reach-mode-is-avail;
 *         }
 *         leaf eee-is-avail {
 *             type eee-is-avail;
 *         }
 *         leaf unidirectional-operation-is-avail {
 *             type unidirectional-operation-is-avail;
 *         }
 *         leaf-list supported-alarms {
 *             type string;
 *         }
 *         uses mau-type-g;
 *     }
 *     leaf auto-pmd-negotiation-is-avail {
 *         type auto-pmd-negotiation-is-avail;
 *     }
 *     leaf auto-pmd-negotiation-max-is-avail {
 *         type auto-pmd-negotiation-max-is-avail;
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/wire-interface-capability-g</i>
 *
 */
public interface WireInterfaceCapabilityG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "wire-interface-capability-g").intern();

    /**
     * List of Medium Attachment Units (MAUs) that are available for being selected. If
     * rate and service configuration (e.g. SFF-8079) are not supported, the MAU 
     * determined by hardware shall be described.
     *
     *
     *
     * @return <code>java.util.List</code> <code>availableMauList</code>, or <code>null</code> if not present
     */
    List<AvailableMauList> getAvailableMauList();
    
    /**
     * Parameter1 = Indicates that device is supporting Auto-negotiation
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>autoPmdNegotiationIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAutoPmdNegotiationIsAvail();
    
    /**
     * 1 = Indicates that device is supporting definition of the maximum speed/Medium 
     * Attached Unit (MAU) automatically chosen when (autoNegotiationIsOn=1)
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>autoPmdNegotiationMaxIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAutoPmdNegotiationMaxIsAvail();
    
    /**
     * List of supported kinds of looping back of header information to the remote 
     * site.802.3 45.2.1.12.1 PMA remote loopback ability
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedLoopBackKindList</code>, or <code>null</code> if not present
     */
    List<LoopBackType> getSupportedLoopBackKindList();
    
    /**
     * MW IMAvailable time periods for maintenance configurations (e.g. the loop back) 
     * to be described. Concrete values shall be separated by commas (e.g. '10, 60, 
     * 360'). Ranges shall be expressed as two values separated by a minus (e.g. 
     * '10-360').
     *
     *
     *
     * @return <code>java.lang.String</code> <code>maintenanceTimerRange</code>, or <code>null</code> if not present
     */
    java.lang.String getMaintenanceTimerRange();
    
    /**
     * Available alarms to be listed. Mandatory:'txFault', 'rxLos', 'tempHigh', 
     * 'tempLow', 'rxLevelHigh', 'rxLevelLow'. Optional:'vccHigh', 'vccLow', 
     * 'txBiasHigh', 'txBiasLow', 'txPowerHigh', 'txPowerLow', 'laserTempHigh', 
     * 'laserTempLow', 'tecCurrentHigh', 'tecCurrentLow'. Further alarms might be added
     * by the device. Names are to be separated by commas.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedAlarmList</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getSupportedAlarmList();

}

