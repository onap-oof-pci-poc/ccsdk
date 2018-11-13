package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the RF, see 
 * {{bibref|3GPP-TS.32.592|Section 6.1.7.1}}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-rf-g {
 *     leaf-list earfcndl {
 *         type uint16;
 *     }
 *     leaf-list earfcnul {
 *         type uint16;
 *     }
 *     leaf freq-band-indicator {
 *         type uint8;
 *     }
 *     leaf-list dl-bandwidth {
 *         type uint8;
 *     }
 *     leaf-list ul-bandwidth {
 *         type uint8;
 *     }
 *     leaf-list reference-signal-power {
 *         type string;
 *     }
 *     leaf-list phy-cell-id {
 *         type string;
 *     }
 *     leaf-list psch-power-offset {
 *         type string;
 *     }
 *     leaf-list ssch-power-offset {
 *         type string;
 *     }
 *     leaf-list pbch-power-offset {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-rf-g</i>
 *
 */
public interface LteRanRfG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-rf-g").intern();

    /**
     * {{list}} Each item is an E-UTRA Absolute Radio Frequency Channel Number in the 
     * downlink direction. In case there is more than one item in the list, the first 
     * item contains the most preferred value. Corresponds to parameter NDL specified 
     * in {{bibref|3GPP-TS.36.104|Table 5.7.3.1}}. If LTE FAP supports 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then LTE FAP is expected to select one from the list and overwrite 
     * this parameter containing only the one selected. If LTE FAP does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then LTE FAP accepts the first value and ignore the rest. If only 
     * one item is configured regardless of the self-configuration capability of LTE 
     * FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>earfcndl</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getEarfcndl();
    
    /**
     * {{list}} Each item is an E-UTRA Absolute Radio Frequency Channel Number in the 
     * uplink direction. In case there is more than one item in the list, the first 
     * item contains the most preferred value. Corresponds to parameter NUL specified 
     * in {{bibref|3GPP-TS.36.104|Table 5.7.3.1}}. If LTE FAP supports 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then LTE FAP is expected to select one from the list and overwrite 
     * this parameter containing only the one selected. If LTE FAP does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then LTE FAP accepts the first value and ignore the rest. If only 
     * one item is configured regardless of the self-configuration capability of LTE 
     * FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>earfcnul</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getEarfcnul();
    
    /**
     * Frequency band indicator. Corresponds to parameter freqBandIndicator in SIB1 in 
     * {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>freqBandIndicator</code>, or <code>null</code> if not present
     */
    java.lang.Short getFreqBandIndicator();
    
    /**
     * {{list}} Each item is a downlink transmission bandwidth, specified in number of 
     * Resource Blocks. In case there is more than one item in the list, the first item
     * contains the most preferred value. Corresponds to parameter dl_Bandwidth in MIB 
     * (Master Information Block) in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. and to 
     * parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}. If LTE FAP supports 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then LTE FAP is expected to select one from the list and overwrite 
     * this parameter containing only the one selected. If LTE FAP does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then LTE FAP accepts the first value and ignore the rest. If only 
     * one item is configured regardless of the self-configuration capability of LTE 
     * FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>dlBandwidth</code>, or <code>null</code> if not present
     */
    List<java.lang.Short> getDlBandwidth();
    
    /**
     * {{list}} Each item is an uplink transmission bandwidth, specified in number of 
     * Resource Blocks. In case there is more than one item in the list, the first item
     * contains the most preferred value. Corresponds to parameter ul_Bandwidth in SIB2
     * in {{bibref|3GPP-TS.36.331|Section 6.3.1}}. and to parameter NRB in 
     * {{bibref|3GPP-TS.36.101|Table 5.6-1}}. If LTE FAP supports self-configuration 
     * capability for {{param}} and more than one item is configured, then LTE FAP is 
     * expected to select one from the list and overwrite this parameter containing 
     * only the one selected. If LTE FAP does not support self-configuration capability
     * for {{param}} and more than one item is configured, then LTE FAP accepts the 
     * first value and ignore the rest. If only one item is configured regardless of 
     * the self-configuration capability of LTE FAP, LTE FAP accepts the value as an 
     * explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>ulBandwidth</code>, or <code>null</code> if not present
     */
    List<java.lang.Short> getUlBandwidth();
    
    /**
     * {{list}} Each item is a downlink reference-signal transmit power, specified in 
     * dBm, with a numeric range between -60 and 50 inclusive. In case there is more 
     * than one item in the list, the first item contains the most preferred value. 
     * Defined as the linear average over the power contributions (in W) of all 
     * resource elements that carry cell-specific reference signals within the 
     * operating system bandwidth. Corresponds to parameter referenceSignalPower in 
     * PDSCH-Config IE in {{bibref|3GPP-TS.36.331|Section 6.3.2}}. The multiplicity of 
     * the {{param}} values can also be expressed by defining a range using ".." (two 
     * periods) between two values. In this case, the combination of two values defines
     * the lower-bound and upper-bound of the range inclusive. If this notation is 
     * used, then the list contains at least 2 items: 
     * "&amp;lt;preferred-value&amp;gt;,&amp;lt;lower-bound&amp;gt;..&amp;lt;upper-bound&amp;gt;".
     * If LTE FAP supports self-configuration capability for {{param}} and more than 
     * one item is configured, then LTE FAP is expected to select one from the list and
     * overwrite this parameter containing only the one selected. If LTE FAP does not 
     * support self-configuration capability for {{param}} and more than one item is 
     * configured, then LTE FAP accepts the first value and ignore the rest. If only 
     * one item is configured regardless of the self-configuration capability of LTE 
     * FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>referenceSignalPower</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getReferenceSignalPower();
    
    /**
     * {{list}} Each item is a physical cell ID with a numeric range between 0 and 503 
     * inclusive. Represents the list of physical cell identities LTE FAP to choose 
     * from. In case there is more than one item in the list, the first item contains 
     * the most preferred value. As specified in {{bibref|3GPP-TS.36.211|Section 
     * 6.11}}. The multiplicity of the {{param}} values can also be expressed by 
     * defining a range using ".." (two periods) between two values. In this case, the 
     * combination of two values defines the lower-bound and upper-bound of the range 
     * inclusive. If this notation is used, then the list contains at least 2 items: 
     * "&amp;lt;preferred-value&amp;gt;,&amp;lt;lower-bound&amp;gt;..&amp;lt;upper-bound&amp;gt;".
     * If LTE FAP supports self-configuration capability for {{param}} and more than 
     * one item is configured, then LTE FAP is expected to select one from the list and
     * overwrite this parameter containing only the one selected. If LTE FAP does not 
     * support self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>phyCellId</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getPhyCellId();
    
    /**
     * {{list}} Each item is a power offset, specified in dB, of the Primary 
     * Synchronization Channel with respect to the ReferenceSignalPower, with a numeric
     * range between -350 and 150 inclusive. In case there is more than one item in the
     * list, the first item contains the most preferred value. The value of {{param}} 
     * divided by 10 yields the actual value. The multiplicity of the {{param}} values 
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
     * @return <code>java.util.List</code> <code>pschPowerOffset</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getPschPowerOffset();
    
    /**
     * {{list}} Each item is a power offset, specified in dB, of the Secondary 
     * Synchronization Channel with respect to the ReferenceSignalPower, with a numeric
     * range between -350 and 150 inclusive. In case there is more than one item in the
     * list, the first item contains the most preferred value. The value of {{param}} 
     * divided by 10 yields the actual value. The multiplicity of the {{param}} values 
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
     * @return <code>java.util.List</code> <code>sschPowerOffset</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getSschPowerOffset();
    
    /**
     * {{list}} Each item is a power offset, specified in dB, of the Physical Broadcast
     * Channel with respect to the ReferenceSignalPower, with a numeric range between 
     * -350 and 150 inclusive. In case there is more than one item in the list, the 
     * first item contains the most preferred value. The value of {{param}} divided by 
     * 10 yields the actual value. The multiplicity of the {{param}} values can also be
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
     * @return <code>java.util.List</code> <code>pbchPowerOffset</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getPbchPowerOffset();

}

