package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the SRB1 (Signaling Radio Bearer 1) 
 * configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.3.1}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-rlc-srb1-g {
 *     leaf default-configuration {
 *         type boolean;
 *     }
 *     leaf-list t-poll-retransmit {
 *         type string;
 *     }
 *     leaf-list poll-pdu {
 *         type uint16;
 *     }
 *     leaf-list poll-byte {
 *         type uint16;
 *     }
 *     leaf-list max-retx-threshold {
 *         type uint8;
 *     }
 *     leaf-list t-reordering {
 *         type string;
 *     }
 *     leaf-list t-status-prohibit {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-rlc-srb1-g</i>
 *
 */
public interface LteRanRlcSrb1G
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-rlc-srb1-g").intern();

    /**
     * Indicates the whether default RLC configuration for SRB1 is used or not. If 
     * {{true}}, the default RLC configuration is used as specified in 
     * {{bibref|3GPP-TS.36.331|Section 9.2.1.1}}. In this case, rest of the parameters 
     * defined under the current object are ignored by the CPE. If {{false}}, rest of 
     * the parameters defined under the current object are used by the CPE for RLC 
     * configuration.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>defaultConfiguration</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isDefaultConfiguration();
    
    /**
     * {{list}} Each item is a timer between successive poll transmissions, specified 
     * in milliseconds, specified in milliseconds, with a numeric range between 5 and 
     * 500 inclusive. Only the multiple of 5 are valid in the range between 5 and 250 
     * inclusive (i.e. 5, 10, 15, 20,... 250), and only the multiple of 50 are valid in
     * the range between 300 and 500 inclusive (i.e., 300, 350, 400, 450, 500). If the 
     * value is other than these, the CPE MUST reject the value. In case there is more 
     * than one item in the list, the first item contains the most preferred value. 
     * This parameter is valid only if {{param|DefaultConfiguration}} paramter under 
     * the current object is set to {{false}}. Corresponds to t-PollRetransmit IE 
     * specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in 
     * {{bibref|3GPP-TS.36.322|Section 5.2.2}}. The multiplicity of the {{param}} 
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
     * @return <code>java.util.List</code> <code>tPollRetransmit</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getTPollRetransmit();
    
    /**
     * {{list}} Each item is a counter of PDUs between successive poll transmissions, 
     * specified in the number of PDUs. In case there is more than one item in the 
     * list, the first item contains the most preferred value. This parameter is valid 
     * only if {{param|DefaultConfiguration}} paramter under the current object is set 
     * to {{false}}. Corresponds to pollPDU IE specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 
     * 5.2.2.1}}. Value of 0 indicates "infinity." If supports self-configuration 
     * capability for {{param}} and more than one item is configured, then is expected 
     * to select one from the list and overwrite this parameter containing only the one
     * selected. If does not support self-configuration capability for {{param}} and 
     * more than one item is configured, then accepts the first value and ignore the 
     * rest. If only one item is configured regardless of the self-configuration 
     * capability of , accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>pollPdu</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getPollPdu();
    
    /**
     * {{list}} Each item is a counter of PDU bytes transmitted between successive poll
     * transmissions, specified in kilobytes. In case there is more than one item in 
     * the list, the first item contains the most preferred value. This parameter is 
     * valid only if {{param|DefaultConfiguration}} paramter under the current object 
     * is set to {{false}}. Corresponds to pollByte IE specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 
     * 5.2.2.1}}. Value of 0 indicates infinite amount of kilobytes. If supports 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then is expected to select one from the list and overwrite this 
     * parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>pollByte</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getPollByte();
    
    /**
     * {{list}} Each item defines the maximum number of transmission retry used by the 
     * RLC entity to limit the number of retransmissions of an AMD PDU. In case there 
     * is more than one item in the list, the first item contains the most preferred 
     * value. This parameter is valid only if {{param|DefaultConfiguration}} paramter 
     * under the current object is set to {{false}}. Corresponds to maxRetxThreshold IE
     * specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in 
     * {{bibref|3GPP-TS.36.322|Section 5.2.1}}. If supports self-configuration 
     * capability for {{param}} and more than one item is configured, then is expected 
     * to select one from the list and overwrite this parameter containing only the one
     * selected. If does not support self-configuration capability for {{param}} and 
     * more than one item is configured, then accepts the first value and ignore the 
     * rest. If only one item is configured regardless of the self-configuration 
     * capability of , accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>maxRetxThreshold</code>, or <code>null</code> if not present
     */
    List<java.lang.Short> getMaxRetxThreshold();
    
    /**
     * {{list}} Each item defines a timer used by the receiving side of an RLC entity 
     * in order to detect loss of RLC PDUs at lower layer, specified in milliseconds, 
     * with a numeric range between 0 and 200 inclusive. Only the multiple of 5 are 
     * valid in the range between 0 and 100 inclusive (i.e. 0, 5, 10, 15,...,100), and 
     * only the multiple of 10 are valid in the range between 110 and 200 inclusive 
     * (110, 120, 130,...,200). If the value is other than these, the CPE MUST reject 
     * the value. In case there is more than one item in the list, the first item 
     * contains the most preferred value. This parameter is valid only if 
     * {{param|DefaultConfiguration}} paramter under the current object is set to 
     * {{false}}. Corresponds to t-Reordering IE specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 
     * 5.1.2.2. and 5.1.3.2}}. The multiplicity of the {{param}} values can also be 
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
     * @return <code>java.util.List</code> <code>tReordering</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getTReordering();
    
    /**
     * {{list}} Each item defines a timer used by the receiving side of an AM RLC 
     * entity in order to prohibit transmission of a STATUS PDU, specified in 
     * milliseconds, with a numeric range between 0 and 500 inclusive. Only the 
     * multiple of 5 are valid in the range between 0 and 250 inclusive (i.e. 0, 5, 10,
     * 15,...,250), and only the multiple of 50 are valid in the range between 300 and 
     * 500 inclusive (i.e. 300, 350, 400, 450, 500). If the value is other than these, 
     * the CPE MUST reject the value. In case there is more than one item in the list, 
     * the first item contains the most preferred value. This parameter is valid only 
     * if {{param|DefaultConfiguration}} paramter under the current object is set to 
     * {{false}}. Corresponds to t-StatusProhibit IE specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 
     * 5.2.3}}. The multiplicity of the {{param}} values can also be expressed by 
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
     * @return <code>java.util.List</code> <code>tStatusProhibit</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getTStatusProhibit();

}

