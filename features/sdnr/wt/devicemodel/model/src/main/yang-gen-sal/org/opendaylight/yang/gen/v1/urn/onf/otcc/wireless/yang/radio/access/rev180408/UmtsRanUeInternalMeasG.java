package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the UE internal measurement control 
 * parameters.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-ue-internal-meas-g {
 *     leaf filter-coefficient {
 *         type uint8;
 *     }
 *     leaf ue-tx-pwr-threshold-event6a {
 *         type ue-tx-pwr-threshold-event6a;
 *     }
 *     leaf time-to-trigger-event6a {
 *         type time-to-trigger-event6a;
 *     }
 *     leaf ue-tx-pwr-threshold-event6b {
 *         type ue-tx-pwr-threshold-event6b;
 *     }
 *     leaf time-to-trigger-event6b {
 *         type time-to-trigger-event6b;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-ue-internal-meas-g</i>
 *
 */
public interface UmtsRanUeInternalMeasG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-ue-internal-meas-g").intern();

    /**
     * Defines the filter coefficient for UE internal measurement. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.79}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>filterCoefficient</code>, or <code>null</code> if not present
     */
    java.lang.Short getFilterCoefficient();
    
    /**
     * Defines the threshold for UE transmit power above which Event 6a is reported. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>ueTxPwrThresholdEvent6a</code>, or <code>null</code> if not present
     */
    java.lang.Long getUeTxPwrThresholdEvent6a();
    
    /**
     * Defines the period in {{units}} between detection of Event 6a and sending of 
     * Measurement Report. Only the specified values are considered valid, any value 
     * other than those and the CPE MUST reject the request. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timeToTriggerEvent6a</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimeToTriggerEvent6a();
    
    /**
     * Defines the threshold for UE transmit power above which Event 6b is reported. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>ueTxPwrThresholdEvent6b</code>, or <code>null</code> if not present
     */
    java.lang.Long getUeTxPwrThresholdEvent6b();
    
    /**
     * Defines the period in {{units}} between detection of Event 6b and sending of 
     * Measurement Report. Only the specified values are considered valid, any value 
     * other than those and the CPE MUST reject the request. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timeToTriggerEvent6b</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimeToTriggerEvent6b();

}

