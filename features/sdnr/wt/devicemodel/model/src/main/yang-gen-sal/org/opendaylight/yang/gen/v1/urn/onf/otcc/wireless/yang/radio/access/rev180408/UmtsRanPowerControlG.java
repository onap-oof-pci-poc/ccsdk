package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters related to power control and RACH.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-power-control-g {
 *     leaf constant-value {
 *         type constant-value;
 *     }
 *     leaf power-ramp-step-up {
 *         type power-ramp-step-up;
 *     }
 *     leaf preamble-retrans-max {
 *         type uint8;
 *     }
 *     leaf persistence-scale-factor {
 *         type uint8;
 *     }
 *     leaf m-max {
 *         type uint8;
 *     }
 *     leaf nb01-min {
 *         type uint8;
 *     }
 *     leaf nb01-max {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-power-control-g</i>
 *
 */
public interface UmtsRanPowerControlG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-power-control-g").intern();

    /**
     * Used by the UE to calculate the initial output power, specified in {{units}}, on
     * PRACH according to the open loop power control procedure. Parameter in SIB5. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.6.11}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>constantValue</code>, or <code>null</code> if not present
     */
    java.lang.Long getConstantValue();
    
    /**
     * Used for the Uplink Common Channel. Defines the Power ramp setup, specified in 
     * {{units}}, on PRACH preamble when no acquisition indicator (AI) is detected by 
     * the UE. Parameter in SIB5. {{bibref|3GPP-TS.25.331|Section 10.3.6.54}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>powerRampStepUp</code>, or <code>null</code> if not present
     */
    java.lang.Short getPowerRampStepUp();
    
    /**
     * Used for the Uplink Common Channel. Defines the maximum number of preambles 
     * allowed in one preamble ramping cycle. PRACH Preamble Retrans Max is part of 
     * "PRACH power offset" which is part of "PRACH system information list". Parameter
     * in SIB5. {{bibref|3GPP-TS.25.331|Section 10.3.6.54}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>preambleRetransMax</code>, or <code>null</code> if not present
     */
    java.lang.Short getPreambleRetransMax();
    
    /**
     * Persistence Scaling Factor for overload control. Parameter in SIB5. The value is
     * the scaling factor multiplied by 10, e.g. 2 is a scaling factor of 0.2
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>persistenceScaleFactor</code>, or <code>null</code> if not present
     */
    java.lang.Short getPersistenceScaleFactor();
    
    /**
     * Maximum number of RACH preamble cycles. Defines how many times the PRACH 
     * preamble ramping procedure can be repeated before UE MAC reports a failure on 
     * RACH transmission to higher layers. Maximum number of RACH preamble cycles is 
     * part of "RACH transmission parameters" which is part of "PRACH system 
     * information list" which is part of SIB5. {{bibref|3GPP-TS.25.331|Section 
     * 10.3.6.67}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>mMax</code>, or <code>null</code> if not present
     */
    java.lang.Short getMMax();
    
    /**
     * RACH random back-off lower bound. {{param}} is the lower bound of the waiting 
     * time in 10 millisecond increments (i.e. 1 corresponds to 10 ms and 50 
     * corresponds to 500 ms). {{param}} is part of "RACH transmission parameters" 
     * which is part of "PRACH system information list" which is part of SIB5. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.6.67}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>nb01Min</code>, or <code>null</code> if not present
     */
    java.lang.Short getNb01Min();
    
    /**
     * RACH random back-off upper bound. {{param}} is the Upper bound of the waiting 
     * time in 10 millisecond increments (i.e. 1 corresponds to 10 ms and 50 
     * corresponds to 500 ms). {{param}} is part of "RACH transmission parameters" 
     * which is part of "PRACH system information list" which is part of SIB5. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.6.67}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>nb01Max</code>, or <code>null</code> if not present
     */
    java.lang.Short getNb01Max();

}

