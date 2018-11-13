package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the PDSCH (Physical Downlink Shared 
 * Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.2}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-phy-pdsch-g {
 *     leaf-list pb {
 *         type string;
 *     }
 *     leaf-list pa {
 *         type int64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-phy-pdsch-g</i>
 *
 */
public interface LteRanPhyPdschG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-pdsch-g").intern();

    /**
     * {{list}} Each item is a Eb/Ea value with a numeric range between 0 and 3 
     * inclusive. In case there is more than one item in the list, the first item 
     * contains the most preferred value. The value of this parameter is the same for 
     * all UEs in the cell. Eb repsents EPRE of PDSCH REs type B, i.e. REs in OFDM 
     * symbols that include reference symbols, as specified in 
     * {{bibref|3GPP-TS.36.213|Section 5.2}}. The multiplicity of the {{param}} values 
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
     * @return <code>java.util.List</code> <code>pb</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getPb();
    
    /**
     * {{list}} Each item is a Ea/Ers value. In case there is more than one item in the
     * list, the first item contains the most preferred value. Ea represents EPRE of 
     * PDSCH REs type A, i.e. REs in OFDM symbols that do not include reference 
     * symbols. Ers represents EPRE of reference symbols REs. Specified in 
     * {{bibref|3GPP-TS.36.213|Section 5.2}}. Actual values of range are -6.00 to 
     * 3.00dB. The value of each item in {{param}} divided by 100 yields the actual 
     * value. If supports self-configuration capability for {{param}} and more than one
     * item is configured, then is expected to select one from the list and overwrite 
     * this parameter containing only the one selected. If does not support 
     * self-configuration capability for {{param}} and more than one item is 
     * configured, then accepts the first value and ignore the rest. If only one item 
     * is configured regardless of the self-configuration capability of , accepts the 
     * value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>pa</code>, or <code>null</code> if not present
     */
    List<java.lang.Long> getPa();

}

