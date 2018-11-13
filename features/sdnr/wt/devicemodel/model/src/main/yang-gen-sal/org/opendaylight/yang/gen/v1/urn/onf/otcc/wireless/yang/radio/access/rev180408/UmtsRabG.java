package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains parameters relating to Radio Access layers 
 * {{bibref|3GPP-TS.32.405}}
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-rab-g {
 *     leaf rab-succ-estab-cs {
 *         type uint64;
 *     }
 *     leaf rab-fail-estab-cs {
 *         type uint64;
 *     }
 *     leaf rab-succ-estab-ps {
 *         type uint64;
 *     }
 *     leaf rab-fail-estab-ps {
 *         type uint64;
 *     }
 *     leaf rabcs-setup-time-mean {
 *         type rabcs-setup-time-mean;
 *     }
 *     leaf rabcs-setup-time-max {
 *         type rabcs-setup-time-max;
 *     }
 *     leaf rabps-setup-time-mean {
 *         type rabps-setup-time-mean;
 *     }
 *     leaf rabps-setup-time-max {
 *         type rabps-setup-time-max;
 *     }
 *     leaf fail-ho {
 *         type uint64;
 *     }
 *     leaf succ-ho {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-rab-g</i>
 *
 */
public interface UmtsRabG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-rab-g").intern();

    /**
     * The number of successfully established RABs (with or without queueing) for CS 
     * domain.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rabSuccEstabCs</code>, or <code>null</code> if not present
     */
    BigInteger getRabSuccEstabCs();
    
    /**
     * The number of RAB establishment failures for CS domain.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rabFailEstabCs</code>, or <code>null</code> if not present
     */
    BigInteger getRabFailEstabCs();
    
    /**
     * The number of successfully established RABs for PS domain.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rabSuccEstabPs</code>, or <code>null</code> if not present
     */
    BigInteger getRabSuccEstabPs();
    
    /**
     * The number of RABs failed to establish for PS domain.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rabFailEstabPs</code>, or <code>null</code> if not present
     */
    BigInteger getRabFailEstabPs();
    
    /**
     * The mean time in {{units}} for a FAP to establish a RAB CS connection. This 
     * measurement is obtained by accumulating the time intervals for each successful 
     * RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT 
     * REQUEST" message to establish a RAB for CS domain, and the first corresponding 
     * (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" 
     * message for successfully established RABs over a granularity period (Sample 
     * Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}). This end value of the time 
     * will then be divided by the number of successfully established RABs observed in 
     * the granularity period to give the arithmetic mean. The accumulator SHALL be 
     * reinitialized at the beginning of each granularity period.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rabcsSetupTimeMean</code>, or <code>null</code> if not present
     */
    BigInteger getRabcsSetupTimeMean();
    
    /**
     * The maximum time in {{units}} for a FAP to establish a RAB CS connection. This 
     * measurement is obtained by monitoring the time intervals for each successful RAB
     * establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST"
     * message to establish a RAB for CS domain, and the first corresponding (based on 
     * RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for
     * successfully established RABs. The high tide mark of this time will be stored in
     * a gauge; the gauge SHALL be reinitialized at the beginning of each granularity 
     * period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rabcsSetupTimeMax</code>, or <code>null</code> if not present
     */
    BigInteger getRabcsSetupTimeMax();
    
    /**
     * The mean time in {{units}} for a FAP to establish a RAB PS connection. This 
     * measurement is obtained by accumulating the time intervals for each successful 
     * RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT 
     * REQUEST" message to establish a RAB for PS domain, and the first corresponding 
     * (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" 
     * message for successfully established RABs over a granularity period (Sample 
     * Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}). This end value of the time 
     * will then be divided by the number of successfully established RABs observed in 
     * the granularity period to give the arithmetic mean. The accumulator SHALL be 
     * reinitialized at the beginning of each granularity period.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rabpsSetupTimeMean</code>, or <code>null</code> if not present
     */
    BigInteger getRabpsSetupTimeMean();
    
    /**
     * The maximum time in {{units}} for a FAP to establish a RAB PS connection. This 
     * measurement is obtained by monitoring the time intervals for each successful RAB
     * establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST"
     * message to establish a RAB for PS domain, and the first corresponding (based on 
     * RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for
     * successfully established RABs. The high tide mark of this time will be stored in
     * a gauge; the gauge SHALL be reinitialized at the beginning of each granularity 
     * period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rabpsSetupTimeMax</code>, or <code>null</code> if not present
     */
    BigInteger getRabpsSetupTimeMax();
    
    /**
     * The number of failed Handovers.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>failHo</code>, or <code>null</code> if not present
     */
    BigInteger getFailHo();
    
    /**
     * The number of successful Handovers.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>succHo</code>, or <code>null</code> if not present
     */
    BigInteger getSuccHo();

}

