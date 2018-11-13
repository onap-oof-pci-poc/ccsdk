package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the RACH (Random Access Channel) 
 * configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.1}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-mac-rach-g {
 *     leaf-list number-of-ra-preambles {
 *         type uint8;
 *     }
 *     leaf-list size-of-ra-group-a {
 *         type uint8;
 *     }
 *     leaf-list message-size-group-a {
 *         type uint16;
 *     }
 *     leaf-list message-power-offset-group-b {
 *         type int64;
 *     }
 *     leaf-list power-ramping-step {
 *         type uint8;
 *     }
 *     leaf-list preamble-initial-received-target-power {
 *         type int64;
 *     }
 *     leaf-list preamble-trans-max {
 *         type string;
 *     }
 *     leaf-list response-window-size {
 *         type string;
 *     }
 *     leaf-list contention-resolution-timer {
 *         type uint8;
 *     }
 *     leaf-list max-harq-msg3-tx {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-mac-rach-g</i>
 *
 */
public interface LteRanMacRachG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mac-rach-g").intern();

    /**
     * {{list}} Each item is a number of non-dedicated random access preambles. Only 
     * values in multiple of 4 are valid (i.e. 4, 8, 12, 16,...64); use of other values
     * within the defined range MUST be rejected by the CPE. In case there is more than
     * one item in the list, the first item contains the most preferred value. 
     * Corresponds to parameter numberOfRA-Preambles specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 
     * 5.1.1}}. If supports self-configuration capability for {{param}} and more than 
     * one item is configured, then is expected to select one from the list and 
     * overwrite this parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>numberOfRaPreambles</code>, or <code>null</code> if not present
     */
    List<java.lang.Short> getNumberOfRaPreambles();
    
    /**
     * {{list}} Each item is a number of non-dedicated random access preambles in 
     * Random Acces Preambles group A. Only values in multiple of 4 are valid (i.e. 4, 
     * 8, 12, 16,...60); use of other values within the defined range MUST be rejected 
     * by the CPE. In case there is more than one item in the list, the first item 
     * contains the most preferred value. Corresponds to parameter 
     * sizeOfRA-PreamblesGroupA specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} 
     * and in {{bibref|3GPP-TS.36.321|Section 5.1.1}}. If supports self-configuration 
     * capability for {{param}} and more than one item is configured, then is expected 
     * to select one from the list and overwrite this parameter containing only the one
     * selected. If does not support self-configuration capability for {{param}} and 
     * more than one item is configured, then accepts the first value and ignore the 
     * rest. If only one item is configured regardless of the self-configuration 
     * capability of , accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>sizeOfRaGroupA</code>, or <code>null</code> if not present
     */
    List<java.lang.Short> getSizeOfRaGroupA();
    
    /**
     * {{list}} Each item is a threshold for preamble selection, specified in bits. In 
     * case there is more than one item in the list, the first item contains the most 
     * preferred value. Defined in {{bibref|3GPP-TS.36.321|Section 5.1.2}}. Corresponds
     * to parameter messageSizeGroupA specified in {{bibref|3GPP-TS.36.331|Section 
     * 6.3.2}}. If supports self-configuration capability for {{param}} and more than 
     * one item is configured, then is expected to select one from the list and 
     * overwrite this parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>messageSizeGroupA</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getMessageSizeGroupA();
    
    /**
     * {{list}} Each item is a threshold for preamble selection, specified in dB. In 
     * case there is more than one item in the list, the first item contains the most 
     * preferred value. Defined in {{bibref|3GPP-TS.36.321|Section 5.1.2}}. Corresponds
     * to parameter messagePowerOffsetGroupB specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}}. Value of -1 indicates "minusinfinity." 
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
     * @return <code>java.util.List</code> <code>messagePowerOffsetGroupB</code>, or <code>null</code> if not present
     */
    List<java.lang.Long> getMessagePowerOffsetGroupB();
    
    /**
     * {{list}} Each item is a power increase factor between subsequent random access 
     * preamble transmissions, specified in dB. In case there is more than one item in 
     * the list, the first item contains the most preferred value. Corresponds to 
     * parameter powerRampingStep specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} 
     * and in {{bibref|3GPP-TS.36.321|Section 5.1.3}}. If supports self-configuration 
     * capability for {{param}} and more than one item is configured, then is expected 
     * to select one from the list and overwrite this parameter containing only the one
     * selected. If does not support self-configuration capability for {{param}} and 
     * more than one item is configured, then accepts the first value and ignore the 
     * rest. If only one item is configured regardless of the self-configuration 
     * capability of , accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>powerRampingStep</code>, or <code>null</code> if not present
     */
    List<java.lang.Short> getPowerRampingStep();
    
    /**
     * {{list}} Each item is a value used as the baseline for computation for random 
     * access transmission power, specified in dBm. Also used as a parameter in the 
     * criteria for preamble selection. Only even values are valid (i.e. -120, -118, 
     * -116,...-90); use of other values within the defined range MUST be rejected by 
     * the CPE. In case there is more than one item in the list, the first item 
     * contains the most preferred value. Corresponds to parameter 
     * preambleInitialReceivedTargetPower specified in {{bibref|3GPP-TS.36.331|Section 
     * 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.2}}. and section 5.1.3. If 
     * supports self-configuration capability for {{param}} and more than one item is 
     * configured, then is expected to select one from the list and overwrite this 
     * parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>preambleInitialReceivedTargetPower</code>, or <code>null</code> if not present
     */
    List<java.lang.Long> getPreambleInitialReceivedTargetPower();
    
    /**
     * {{list}} Each item is a maximum number of random access preamble transmissions, 
     * from the list of 3, 4, 5, 6, 7, 8, 10, 20, 50, 100, 200. In case there is more 
     * than one item in the list, the first item contains the most preferred value. 
     * Corresponds to parameter preambleTransMax specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 
     * 5.1.4 and section 5.1.5}}. The multiplicity of the {{param}} values can also be 
     * expressed by defining a range using ".." (two periods) between two values. In 
     * this case, the combination of two values defines the lower-bound and upper-bound
     * of the range inclusive. If this notation is used, then the list contains at 
     * least 2 items: 
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
     * @return <code>java.util.List</code> <code>preambleTransMax</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getPreambleTransMax();
    
    /**
     * {{list}} Each item is a duration of the random access response window, specified
     * in sub-frames, with a numeric range between 2 and 10 inclusive (except value of 
     * 9). In case there is more than one item in the list, the first item contains the
     * most preferred value. Corresponds to parameter ra-ResponseWindowSize specified 
     * in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in 
     * {{bibref|3GPP-TS.36.321|Section 5.1.4}}. The multiplicity of the {{param}} 
     * values can also be expressed by defining a range using ".." (two periods) 
     * between two values. In this case, the combination of two values defines the 
     * lower-bound and upper-bound of the range inclusive. If this notation is used, 
     * then the list contains at least 2 items: 
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
     * @return <code>java.util.List</code> <code>responseWindowSize</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getResponseWindowSize();
    
    /**
     * {{list}} Each item is a contention resolution timer, specified in sub-frames. 
     * Only values multiple of 8 are valid (i.e. 8, 16, 24,...64); use of other values 
     * within the defined range MUST be rejected by the CPE. In case there is more than
     * one item in the list, the first item contains the most preferred value. 
     * Corresponds to parameter mac-ContentionResolutionTimer specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 
     * 5.1.5}}. If supports self-configuration capability for {{param}} and more than 
     * one item is configured, then is expected to select one from the list and 
     * overwrite this parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>contentionResolutionTimer</code>, or <code>null</code> if not present
     */
    List<java.lang.Short> getContentionResolutionTimer();
    
    /**
     * {{list}} Each item is a maximum number of Msg3 HARQ transmissions by RRC, with a
     * numeric range between 1 and 8 inclusive. In case there is more than one item in 
     * the list, the first item contains the most preferred value. Corresponds to 
     * parameter maxHARQ-Msg3Tx specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} 
     * and in {{bibref|3GPP-TS.36.321|Section 5.4.2.2}}. The multiplicity of the 
     * {{param}} values can also be expressed by defining a range using ".." (two 
     * periods) between two values. In this case, the combination of two values defines
     * the lower-bound and upper-bound of the range inclusive. If this notation is 
     * used, then the list contains at least 2 items: 
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
     * @return <code>java.util.List</code> <code>maxHarqMsg3Tx</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getMaxHarqMsg3Tx();

}

