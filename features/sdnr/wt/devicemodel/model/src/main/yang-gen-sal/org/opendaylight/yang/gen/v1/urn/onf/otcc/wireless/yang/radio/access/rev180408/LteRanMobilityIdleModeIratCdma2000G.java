package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * This object contains parameters relating to the idle mode mobility 
 * for inter-RAT (Radio Access Technology) re-selection, specifically for 
 * re-selection to CDMA2000 system scenario (see {{bibref|3GPP-TS.32.592|Section 
 * 6.1.5.1.8}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-mobility-idle-mode-irat-cdma2000-g {
 *     leaf-list search-window-size {
 *         type string;
 *     }
 *     leaf-list t-reselection-cdma2000 {
 *         type string;
 *     }
 *     leaf t-reselection-cdma2000-sf-medium {
 *         type uint8;
 *     }
 *     leaf t-reselection-cdma2000-sf-high {
 *         type uint8;
 *     }
 *     leaf max-cdma2000-band-entries {
 *         type uint64;
 *     }
 *     leaf cdma2000-band-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-mobility-idle-mode-irat-cdma2000-g</i>
 *
 */
public interface LteRanMobilityIdleModeIratCdma2000G
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-irat-cdma2000-g").intern();

    /**
     * {{list}} Each item is a CDMA2000 parameter affecting the search for neighbouring
     * pilots, with a numeric range between 0 and 15 inclusive. In case there is more 
     * than one item in the list, the first item contains the most preferred value. 
     * Corresponds to parameter searchWindowSize in SIB8 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP2-C.S0005-A|Table 
     * 2.6.6.2.1-1}} and {{bibref|3GPP2-C.S0024-A|Table 8.7.6.2-4}}. The multiplicity 
     * of the {{param}} values can also be expressed by defining a range using ".." 
     * (two periods) between two values. In this case, the combination of two values 
     * defines the lower-bound and upper-bound of the range inclusive. If this notation
     * is used, then the list contains at least 2 items: 
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
     * @return <code>java.util.List</code> <code>searchWindowSize</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getSearchWindowSize();
    
    /**
     * {{list}} Each item is a cell re-selection timer for a CDMA2000 band, specified 
     * in seconds, with a numeric range between 0 and 7 inclusive. In case there is 
     * more than one item in the list, the first item contains the most preferred 
     * value. Corresponds to parameter t-ReselectionCDMA2000 specified in SIB8 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and to TreselectionCDMA_HRPD or 
     * TreselectionCDMA_1xRTT in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}. The 
     * multiplicity of the {{param}} values can also be expressed by defining a range 
     * using ".." (two periods) between two values. In this case, the combination of 
     * two values defines the lower-bound and upper-bound of the range inclusive. If 
     * this notation is used, then the list contains at least 2 items: 
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
     * @return <code>java.util.List</code> <code>tReselectionCdma2000</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getTReselectionCdma2000();
    
    /**
     * Scaling factor for TReselectionCDMA2000 for inter-RAT re-selection to CDMA2000 
     * in Medium-mobility state. The value of {{param}} divided by 100 yields the 
     * actual SF value. Corresponds to parameter t-ReselectionCDMA2000-SF:sf-Medium 
     * specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in 
     * {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tReselectionCdma2000SfMedium</code>, or <code>null</code> if not present
     */
    java.lang.Short getTReselectionCdma2000SfMedium();
    
    /**
     * Scaling factor for TReselectionCDMA2000 for inter-RAT re-selection to CDMA2000 
     * in High-mobility state. The value of {{param}} divided by 100 yields the actual 
     * SF value. Corresponds to parameter t-ReselectionCDMA2000-SF:sf-High specified in
     * SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in 
     * {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tReselectionCdma2000SfHigh</code>, or <code>null</code> if not present
     */
    java.lang.Short getTReselectionCdma2000SfHigh();
    
    /**
     * The maximum number of entries in the 
     * {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000.CDMA2000Band.{i}.}}
     * table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxCdma2000BandEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxCdma2000BandEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cdma2000BandNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getCdma2000BandNumberOfEntries();

}

