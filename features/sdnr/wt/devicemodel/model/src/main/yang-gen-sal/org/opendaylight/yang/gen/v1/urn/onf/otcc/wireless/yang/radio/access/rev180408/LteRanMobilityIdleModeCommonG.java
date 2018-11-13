package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the idle mode mobility 
 * that is common to all cell re-selection scenarios (intra/inter-freq, inter-RAT 
 * to UTRA (UMTS), GERAN (GSM) and CDMA2000) (see {{bibref|3GPP-TS.32.592|Section 
 * 6.1.5.1.1}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-mobility-idle-mode-common-g {
 *     leaf-list qhyst {
 *         type string;
 *     }
 *     leaf q-hyst-sf-medium {
 *         type q-hyst-sf-medium;
 *     }
 *     leaf q-hyst-sf-high {
 *         type q-hyst-sf-high;
 *     }
 *     leaf t-evaluation {
 *         type t-evaluation;
 *     }
 *     leaf t-hyst-normal {
 *         type t-hyst-normal;
 *     }
 *     leaf n-cell-change-medium {
 *         type uint8;
 *     }
 *     leaf n-cell-change-high {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-mobility-idle-mode-common-g</i>
 *
 */
public interface LteRanMobilityIdleModeCommonG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-common-g").intern();

    /**
     * {{list}} Each item is a hysteresis value applied to serving cell for evaluating 
     * cell ranking criteria specified in dB, with a numeric range between 0 and 24 
     * inclusive. For the value greater than 6, only even numbers are valid. If the 
     * value is other than these, the CPE MUST reject the value. In case there is more 
     * than one item in the list, the first item contains the most preferred value. 
     * Corresponds to parameter q-Hyst specified in SIB3 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.4.7}}. The multiplicity of the {{param}} values can also be expressed by 
     * defining a range using ".." (two periods) between two values. In this case, the 
     * combination of two values defines the lower-bound and upper-bound of the range 
     * inclusive. If this notation is used, then the list contains at least 2 items: 
     * "&amp;lt;preferred-value&amp;gt;,&amp;lt;lower-bound&amp;gt;..&amp;lt;upper-bound&amp;gt;".
     * If supports self-configuration capability for {{param}} and more than one item 
     * is configured, then is expected to select one from the list and overwrite this 
     * parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>qhyst</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getQhyst();
    
    /**
     * Speed-dependent scaling factor for Qhyst in Medium-mobility state, specified in 
     * {{units}}. Corresponds to parameter q-HystSF:sf-Medium specified in SIB3 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>qHystSfMedium</code>, or <code>null</code> if not present
     */
    java.lang.Long getQHystSfMedium();
    
    /**
     * Speed-dependent scaling factor for Qhyst in High-mobility state, specified in 
     * {{units}}. Corresponds to parameter q-HystSF:sf-High specified in SIB3 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>qHystSfHigh</code>, or <code>null</code> if not present
     */
    java.lang.Long getQHystSfHigh();
    
    /**
     * Duration for evaluating allowed amount of cell re-selection(s) required to enter
     * mobility states, specified in {{units}}. Corresponds to parameter t-Evaluation 
     * specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter 
     * TCRmax specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tEvaluation</code>, or <code>null</code> if not present
     */
    java.lang.Short getTEvaluation();
    
    /**
     * Additional duration for evaluating criteria to enter normal mobility state, 
     * specified in {{units}}. Specifies the additional time period for evaluating 
     * criteria to enter Normal-mobility state. Corresponds to parameter t-HystNormal 
     * specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter 
     * TCRmaxHyst specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tHystNormal</code>, or <code>null</code> if not present
     */
    java.lang.Short getTHystNormal();
    
    /**
     * Defines the number of cell re-selections within TEvaluation to enter 
     * Medium-mobility state. Corresponds to parameter n-cellChangeMedium specified in 
     * SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter NCR_M specified
     * in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>nCellChangeMedium</code>, or <code>null</code> if not present
     */
    java.lang.Short getNCellChangeMedium();
    
    /**
     * Defines the number of cell re-selections within TEvaluation to enter 
     * High-mobility state. Corresponds to parameter n-cellChangeHigh specified in SIB3
     * in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter NCR_H specified in 
     * {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>nCellChangeHigh</code>, or <code>null</code> if not present
     */
    java.lang.Short getNCellChangeHigh();

}

