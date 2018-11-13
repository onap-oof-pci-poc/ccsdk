package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Consolidated performance information of the air interface.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping air-interface-performance-type-g {
 *     leaf es {
 *         type es;
 *     }
 *     leaf ses {
 *         type ses;
 *     }
 *     leaf cses {
 *         type cses;
 *     }
 *     leaf unavailability {
 *         type unavailability;
 *     }
 *     leaf tx-level-min {
 *         type tx-level-min;
 *     }
 *     leaf tx-level-max {
 *         type tx-level-max;
 *     }
 *     leaf tx-level-avg {
 *         type tx-level-avg;
 *     }
 *     leaf rx-level-min {
 *         type rx-level-min;
 *     }
 *     leaf rx-level-max {
 *         type rx-level-max;
 *     }
 *     leaf rx-level-avg {
 *         type rx-level-avg;
 *     }
 *     leaf time2-states {
 *         type time2-states;
 *     }
 *     leaf time4-states-s {
 *         type time4-states-s;
 *     }
 *     leaf time4-states {
 *         type time4-states;
 *     }
 *     leaf time8-states {
 *         type time8-states;
 *     }
 *     leaf time16-states-s {
 *         type time16-states-s;
 *     }
 *     leaf time16-states {
 *         type time16-states;
 *     }
 *     leaf time32-states {
 *         type time32-states;
 *     }
 *     leaf time64-states {
 *         type time64-states;
 *     }
 *     leaf time128-states {
 *         type time128-states;
 *     }
 *     leaf time256-states {
 *         type time256-states;
 *     }
 *     leaf time512-states {
 *         type time512-states;
 *     }
 *     leaf time512-states-l {
 *         type time512-states-l;
 *     }
 *     leaf time1024-states {
 *         type time1024-states;
 *     }
 *     leaf time1024-states-l {
 *         type time1024-states-l;
 *     }
 *     leaf time2048-states {
 *         type time2048-states;
 *     }
 *     leaf time2048-states-l {
 *         type time2048-states-l;
 *     }
 *     leaf time4096-states {
 *         type time4096-states;
 *     }
 *     leaf time4096-states-l {
 *         type time4096-states-l;
 *     }
 *     leaf time8192-states {
 *         type time8192-states;
 *     }
 *     leaf time8192-states-l {
 *         type time8192-states-l;
 *     }
 *     leaf snir-min {
 *         type snir-min;
 *     }
 *     leaf snir-max {
 *         type snir-max;
 *     }
 *     leaf snir-avg {
 *         type snir-avg;
 *     }
 *     leaf xpd-min {
 *         type xpd-min;
 *     }
 *     leaf xpd-max {
 *         type xpd-max;
 *     }
 *     leaf xpd-avg {
 *         type xpd-avg;
 *     }
 *     leaf rf-temp-min {
 *         type rf-temp-min;
 *     }
 *     leaf rf-temp-max {
 *         type rf-temp-max;
 *     }
 *     leaf rf-temp-avg {
 *         type rf-temp-avg;
 *     }
 *     leaf defect-blocks-sum {
 *         type defect-blocks-sum;
 *     }
 *     leaf time-period {
 *         type time-period;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-performance-type-g</i>
 *
 */
public interface AirInterfacePerformanceTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "air-interface-performance-type-g").intern();

    /**
     * Number of errored seconds.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>es</code>, or <code>null</code> if not present
     */
    java.lang.Integer getEs();
    
    /**
     * Number of severely errored seconds.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>ses</code>, or <code>null</code> if not present
     */
    java.lang.Integer getSes();
    
    /**
     * Number of consecutive severely errored seconds.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>cses</code>, or <code>null</code> if not present
     */
    java.lang.Integer getCses();
    
    /**
     * Total time of unavailability in seconds.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>unavailability</code>, or <code>null</code> if not present
     */
    java.lang.Integer getUnavailability();
    
    /**
     * Minimum transmit power. Signed integers are required.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>txLevelMin</code>, or <code>null</code> if not present
     */
    java.lang.Byte getTxLevelMin();
    
    /**
     * Maximum transmit power. Signed integers are required.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>txLevelMax</code>, or <code>null</code> if not present
     */
    java.lang.Byte getTxLevelMax();
    
    /**
     * Averaged transmit power. Signed integers are required.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>txLevelAvg</code>, or <code>null</code> if not present
     */
    java.lang.Byte getTxLevelAvg();
    
    /**
     * Minimum receive level. Signed integers are required.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>rxLevelMin</code>, or <code>null</code> if not present
     */
    java.lang.Byte getRxLevelMin();
    
    /**
     * Maximum receive level. Signed integers are required.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>rxLevelMax</code>, or <code>null</code> if not present
     */
    java.lang.Byte getRxLevelMax();
    
    /**
     * Averaged receive level. Signed integers are required.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>rxLevelAvg</code>, or <code>null</code> if not present
     */
    java.lang.Byte getRxLevelAvg();
    
    /**
     * Sum of all seconds the transmitter operated in e.g. BPSK.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time2States</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime2States();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time4StatesS</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime4StatesS();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time4States</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime4States();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time8States</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime8States();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time16StatesS</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime16StatesS();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time16States</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime16States();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time32States</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime32States();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time64States</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime64States();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time128States</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime128States();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time256States</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime256States();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time512States</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime512States();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time512StatesL</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime512StatesL();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time1024States</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime1024States();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time1024StatesL</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime1024StatesL();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time2048States</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime2048States();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time2048StatesL</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime2048StatesL();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time4096States</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime4096States();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time4096StatesL</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime4096StatesL();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time8192States</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime8192States();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time8192StatesL</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime8192StatesL();
    
    /**
     * Minimum signal to (noise+interference) ratio.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>snirMin</code>, or <code>null</code> if not present
     */
    java.lang.Byte getSnirMin();
    
    /**
     * Maximum signal to (noise+interference) ratio.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>snirMax</code>, or <code>null</code> if not present
     */
    java.lang.Byte getSnirMax();
    
    /**
     * Averaged signal to (noise+interference) ratio.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>snirAvg</code>, or <code>null</code> if not present
     */
    java.lang.Byte getSnirAvg();
    
    /**
     * Minimum cross polarization discrimination.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>xpdMin</code>, or <code>null</code> if not present
     */
    java.lang.Byte getXpdMin();
    
    /**
     * Maximum cross polarization discrimination.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>xpdMax</code>, or <code>null</code> if not present
     */
    java.lang.Byte getXpdMax();
    
    /**
     * Averaged cross polarization discrimination.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>xpdAvg</code>, or <code>null</code> if not present
     */
    java.lang.Byte getXpdAvg();
    
    /**
     * Lowest temperature (in degree Celsius) of the radio module inside the outdoor 
     * unit.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>rfTempMin</code>, or <code>null</code> if not present
     */
    java.lang.Byte getRfTempMin();
    
    /**
     * Highest temperature (in degree Celsius) of the radio module inside the outdoor 
     * unit.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>rfTempMax</code>, or <code>null</code> if not present
     */
    java.lang.Byte getRfTempMax();
    
    /**
     * Averaged temperature (in degree Celsius) of the radio module inside the outdoor 
     * unit.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>rfTempAvg</code>, or <code>null</code> if not present
     */
    java.lang.Byte getRfTempAvg();
    
    /**
     * Total number of blocks that were defect after receiving and could not be 
     * corrected by the FEC.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>defectBlocksSum</code>, or <code>null</code> if not present
     */
    java.lang.Short getDefectBlocksSum();
    
    /**
     * Total length of the measurement period.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timePeriod</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimePeriod();

}

