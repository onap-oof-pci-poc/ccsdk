package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains parameters relating to the inter-RAT HO related control 
 * parameters. This is specifically for GERAN system.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-inter-rat-meas-g {
 *     leaf gsm-filter-coefficient {
 *         type uint8;
 *     }
 *     leaf bsic-verification-required {
 *         type boolean;
 *     }
 *     leaf weighting-factor {
 *         type uint8;
 *     }
 *     leaf hysteresis {
 *         type uint8;
 *     }
 *     leaf time-to-trigger {
 *         type time-to-trigger;
 *     }
 *     leaf threshold-own-system {
 *         type int64;
 *     }
 *     leaf threshold-other-system {
 *         type int64;
 *     }
 *     leaf instance-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-inter-rat-meas-g</i>
 *
 */
public interface UmtsRanInterRatMeasG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-inter-rat-meas-g").intern();

    /**
     * Defines the filter coefficient for inter-RAT HO measurement when the UE is in 
     * Cell-DCH state. {{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.29}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>gsmFilterCoefficient</code>, or <code>null</code> if not present
     */
    java.lang.Short getGsmFilterCoefficient();
    
    /**
     * Indicates whether the BSIC verification is required or not for inter-RAT HO 
     * measurement when the UE is in Cell-DCH state. {{bibref|3GPP-TS.25.331|Section 
     * 10.3.7.29}}
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>bsicVerificationRequired</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isBsicVerificationRequired();
    
    /**
     * Defines the weighting factor for inter-RAT HO measurement when the UE is in 
     * Cell-DCH state. Actual values of the weighting factor are 0.0 to 2.0 in steps of
     * 0.1. The value of {{param}} divided by 10 yields the actual value of the 
     * weighting factor. {{bibref|3GPP-TS.25.331|Section 10.3.7.30}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>weightingFactor</code>, or <code>null</code> if not present
     */
    java.lang.Short getWeightingFactor();
    
    /**
     * Defines the hysteresis for inter-RAT HO measurement when the UE is in Cell-DCH 
     * state. Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of 
     * {{param}} divided by 2 yields the actual value of the hysteresis. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.30}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hysteresis</code>, or <code>null</code> if not present
     */
    java.lang.Short getHysteresis();
    
    /**
     * Defines the time-to-trigger in {{units}} for inter-RAT HO measurement when the 
     * UE is in Cell-DCH state. Only the specified values are considered valid, any 
     * value other than those and the CPE MUST reject the request. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timeToTrigger</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimeToTrigger();
    
    /**
     * Defines the reporting threshold for inter-RAT HO measurement when the UE is in 
     * Cell-DCH state. This is the "Threshold own system" as defined in 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.30}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdOwnSystem</code>, or <code>null</code> if not present
     */
    java.lang.Long getThresholdOwnSystem();
    
    /**
     * Defines the reporting threshold for inter-RAT HO measurement when the UE is in 
     * Cell-DCH state. This is the "Threshold other system" as defined in 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.30}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdOtherSystem</code>, or <code>null</code> if not present
     */
    java.lang.Long getThresholdOtherSystem();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>instanceNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getInstanceNumberOfEntries();

}

