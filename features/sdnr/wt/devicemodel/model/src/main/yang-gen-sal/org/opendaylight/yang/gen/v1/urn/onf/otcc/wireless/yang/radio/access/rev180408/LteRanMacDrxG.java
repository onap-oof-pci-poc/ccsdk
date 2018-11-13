package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the DRX (Discontinuous Reception) 
 * configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.2}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-mac-drx-g {
 *     leaf drx-enabled {
 *         type boolean;
 *     }
 *     leaf-list on-duration-timer {
 *         type string;
 *     }
 *     leaf-list drx-inactivity-timer {
 *         type string;
 *     }
 *     leaf-list drx-retransmission-timer {
 *         type uint8;
 *     }
 *     leaf-list long-drx-cycle {
 *         type uint16;
 *     }
 *     leaf-list drx-start-offset {
 *         type string;
 *     }
 *     leaf-list short-drx-cycle {
 *         type uint16;
 *     }
 *     leaf-list drx-short-cycle-timer {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-mac-drx-g</i>
 *
 */
public interface LteRanMacDrxG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mac-drx-g").intern();

    /**
     * Specifies whether DRX operation is enabled or not. If {{true}}, DRX operation is
     * enabled. If {{false}}, DRX operation is not enabled. Corresponds to 
     * drx-Configuration IE defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>drxEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isDrxEnabled();
    
    /**
     * {{list}} Each item is the DRX cycle during which UE actively monitors PDCCH, 
     * specified in number of PDCCH sub-frames, from the list of 1, 2, 3, 4, 5, 6, 8, 
     * 10, 20, 30, 40, 50, 60, 80, 100, 200. In case there is more than one item in the
     * list, the first item contains the most preferred value. Corresponds to parameter
     * onDurationTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in 
     * {{bibref|3GPP-TS.36.321|Section 5.7}}. The multiplicity of the {{param}} values 
     * can also be expressed by defining a range using ".." (two periods) between two 
     * values. In this case, the combination of two values defines the lower-bound and 
     * upper-bound of the range inclusive. If this notation is used, then the list 
     * contains at least 2 items: 
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
     * @return <code>java.util.List</code> <code>onDurationTimer</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getOnDurationTimer();
    
    /**
     * {{list}} Each item defines the number of inactive consecutive PDCCH sub-frame(s)
     * that will activate short DRX cycle, specified in number of PDCCH sub-frames, 
     * from the list of 1, 2, 3, 4, 5, 6, 8, 10, 20, 30, 40, 50, 60, 80, 100, 200, 300,
     * 500, 750, 1280, 1920, 2560. In case there is more than one item in the list, the
     * first item contains the most preferred value. Corresponds to parameter 
     * drx-InactivityTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in 
     * {{bibref|3GPP-TS.36.321|Section 5.7}}. The multiplicity of the {{param}} values 
     * can also be expressed by defining a range using ".." (two periods) between two 
     * values. In this case, the combination of two values defines the lower-bound and 
     * upper-bound of the range inclusive. If this notation is used, then the list 
     * contains at least 2 items: 
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
     * @return <code>java.util.List</code> <code>drxInactivityTimer</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getDrxInactivityTimer();
    
    /**
     * {{list}} Each item defines the maximum number of consecutive PDCCH sub-frame(s) 
     * UE MUST remain active expecting a DL retransmission, specified in number of 
     * PDCCH sub-frames. In case there is more than one item in the list, the first 
     * item contains the most preferred value. The timer is started when a HARQ RTT 
     * Timer expires and the data in the soft buffer of the corresponding HARQ process 
     * was not successfully decoded. There is one timer for each active HARQ process. 
     * Corresponds to parameter drx-RetransmissionTimer specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 
     * 5.7}}. If supports self-configuration capability for {{param}} and more than one
     * item is configured, then is expected to select one from the list and overwrite 
     * this parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>drxRetransmissionTimer</code>, or <code>null</code> if not present
     */
    List<java.lang.Short> getDrxRetransmissionTimer();
    
    /**
     * {{list}} Each item is long DRX Cycle value, specified in number of sub-frames. 
     * In case there is more than one item in the list, the first item contains the 
     * most preferred value. If shortDRX-Cycle is configured, this value MUST be a 
     * multiple of the {{param|ShortDRXCycle}} value. Corresponds to longDRX-Cycle 
     * parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}} and 
     * longDRX-CycleStartOffset specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}. 
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
     * @return <code>java.util.List</code> <code>longDrxCycle</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getLongDrxCycle();
    
    /**
     * {{list}} Each item defines the starting frame of the DRX cycle within the long 
     * DRX cycle, with a numeric range between 0 and 2559 inclusive. In case there is 
     * more than one item in the list, the first item contains the most preferred 
     * value. The valid value range is dependent on {{param|LongDRXCycle}} parameter 
     * which defines the upper bound of this range, i.e., range definition is [0: 
     * ({{param|LongDRXCycle}}-1)]. Corresponds to drxStartOffset parameter specified 
     * in {{bibref|3GPP-TS.36.321|Section 5.7}}. Use of values bigger than 
     * ({{param|LongDRXCycle}}-1) MUST be rejected by the CPE. The multiplicity of the 
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
     * @return <code>java.util.List</code> <code>drxStartOffset</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getDrxStartOffset();
    
    /**
     * {{list}} Each item is the short DRX Cycle value, specified in number of 
     * sub-frames. In case there is more than one item in the list, the first item 
     * contains the most preferred value. If shortDRX-Cycle is configured, the value of
     * {{param|LongDRXCycle}} MUST be a multiple of the {{param}} value. Corresponds to
     * shortDRX-Cycle parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}}. If 
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
     * @return <code>java.util.List</code> <code>shortDrxCycle</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getShortDrxCycle();
    
    /**
     * {{list}} Each item defined the duration of the short DRX cycle in multiples of 
     * {{param|ShortDRXCycle}} parameter, specified in number of sub-frames, with a 
     * numeric range between 1 and 16 inclusive. In case there is more than one item in
     * the list, the first item contains the most preferred value. Denotes the number 
     * of consecutive sub-frame(s)the UE shall follow the short DRX cycle after the DRX
     * Inactivity Timer has expired. Corresponds to drxShortCycleTimer parameter 
     * specified in {{bibref|3GPP-TS.36.321|Section 5.7}}. The multiplicity of the 
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
     * @return <code>java.util.List</code> <code>drxShortCycleTimer</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getDrxShortCycleTimer();

}

