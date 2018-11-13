package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import java.util.List;

/**
 * This object contains parameters relating to the idle mode mobility 
 * for inter-RAT (Radio Access Technology) re-selection, specifically for 
 * re-selection to UTRA (UMTS) scenario (see {{bibref|3GPP-TS.32.592|Section 
 * 6.1.5.1.4}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-mobility-idle-mode-irat-utra-g {
 *     leaf-list t-reselection-utra {
 *         type string;
 *     }
 *     leaf t-reselection-utrasf-medium {
 *         type uint8;
 *     }
 *     leaf t-reselection-utrasf-high {
 *         type uint8;
 *     }
 *     leaf max-utranfdd-freq-entries {
 *         type uint64;
 *     }
 *     leaf utranfdd-freq-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-mobility-idle-mode-irat-utra-g</i>
 *
 */
public interface LteRanMobilityIdleModeIratUtraG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-irat-utra-g").intern();

    /**
     * {{list}} Each item is a cell re-selection timer for re-selection to a UTRA 
     * frequency carrier, specified in seconds, with a numeric range between 0 and 7 
     * inclusive. In case there is more than one item in the list, the first item 
     * contains the most preferred value. Corresponds to parameter t-ReselectionUTRA 
     * specified in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in 
     * {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}. The multiplicity of the {{param}} 
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
     * @return <code>java.util.List</code> <code>tReselectionUtra</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getTReselectionUtra();
    
    /**
     * Scaling factor for TreselectionUTRA for inter-RAT re-selection to UTRA in 
     * Medium-mobility state. The value of {{param}} divided by 100 yields the actual 
     * SF value. Corresponds to parameter t-ReselectionUTRA-SF:sf-Medium specified in 
     * SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in 
     * {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tReselectionUtrasfMedium</code>, or <code>null</code> if not present
     */
    java.lang.Short getTReselectionUtrasfMedium();
    
    /**
     * Scaling factor for TreselectionEUTRA for inter-frequency re-selection to this 
     * frequency carrier in High-mobility state. The value of {{param}} divided by 100 
     * yields the actual SF value. Corresponds to parameter 
     * t-ReselectionUTRA-SF:sf-High specified in SIB6 in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 
     * 5.2.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tReselectionUtrasfHigh</code>, or <code>null</code> if not present
     */
    java.lang.Short getTReselectionUtrasfHigh();
    
    /**
     * The maximum number of entries in the 
     * {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.UTRA.UTRANFDDFreq.{i}.}} 
     * table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxUtranfddFreqEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxUtranfddFreqEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>utranfddFreqNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getUtranfddFreqNumberOfEntries();

}

