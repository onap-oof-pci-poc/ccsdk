package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.channel.plan.type.g.TransmissionModeList;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping channel-plan-type-g {
 *     leaf supported-channel-plan {
 *         type string;
 *     }
 *     leaf duplex-distance-is-variable {
 *         type duplex-distance-is-variable;
 *     }
 *     leaf-list duplex-distance-list {
 *         type duplex-distance-list;
 *     }
 *     leaf duplex-distance {
 *         type duplex-distance;
 *         status DEPRECATED;
 *     }
 *     leaf auto-freq-select-is-avail {
 *         type auto-freq-select-is-avail;
 *     }
 *     list transmission-mode-list {
 *         key "transmission-mode-id";
 *         leaf transmission-mode-id {
 *             type universal-id;
 *         }
 *         leaf transmission-mode-name {
 *             type transmission-mode-name;
 *         }
 *         leaf channel-bandwidth {
 *             type channel-bandwidth;
 *         }
 *         leaf modulation-scheme {
 *             type modulation-scheme;
 *         }
 *         leaf code-rate {
 *             type code-rate;
 *         }
 *         leaf symbol-rate-reduction-factor {
 *             type symbol-rate-reduction-factor;
 *         }
 *         leaf tx-power-min {
 *             type tx-power-min;
 *         }
 *         leaf tx-power-max {
 *             type tx-power-max;
 *         }
 *         leaf rx-threshold {
 *             type rx-threshold;
 *         }
 *         leaf am-upshift-level {
 *             type am-upshift-level;
 *         }
 *         leaf am-downshift-level {
 *             type am-downshift-level;
 *         }
 *         leaf xpic-is-avail {
 *             type xpic-is-avail;
 *         }
 *         uses transmission-mode-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/channel-plan-type-g</i>
 *
 */
public interface ChannelPlanTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "channel-plan-type-g").intern();

    /**
     * Unique name (e.g. ECC/REC/(01)04_Annex 5) of a document, which describes a 
     * frequency grid that can be adjusted at the air interface. Corresponding channel 
     * plans to be delivered by the hardware vendor and to be stored by the operator in
     * an controller/application attached database.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>supportedChannelPlan</code>, or <code>null</code> if not present
     */
    java.lang.String getSupportedChannelPlan();
    
    /**
     * To be set on 'true', if the distance between transmitted and received frequency 
     * is variable.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>duplexDistanceIsVariable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isDuplexDistanceIsVariable();
    
    /**
     * Distance between transmitted and received frequency. To be filled with single 
     * value, in case duplex distance is not variable. To be filled with all 
     * configurable values, in case duplex distance is variable.
     *
     *
     *
     * @return <code>java.util.List</code> <code>duplexDistanceList</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getDuplexDistanceList();
    
    /**
     * Distance between transmitted and received frequency.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>duplexDistance</code>, or <code>null</code> if not present
     */
    @Deprecated
    java.lang.Integer getDuplexDistance();
    
    /**
     * In case the microwave radio is capable of automatically selecting the transmit 
     * frequency in unlicensed bands, this field shall contain a 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>autoFreqSelectIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAutoFreqSelectIsAvail();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>transmissionModeList</code>, or <code>null</code> if not present
     */
    List<TransmissionModeList> getTransmissionModeList();

}

