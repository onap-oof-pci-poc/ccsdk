package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Table containing the intra-frequency cell list.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-neighbor-list-in-use-intra-freq-cell-g {
 *     leaf plmnid {
 *         type string;
 *     }
 *     leaf rncid {
 *         type uint16;
 *     }
 *     leaf cid {
 *         type uint16;
 *     }
 *     leaf lac {
 *         type uint16;
 *     }
 *     leaf rac {
 *         type uint8;
 *     }
 *     leaf ura {
 *         type uint16;
 *     }
 *     leaf pcpich-scrambling-code {
 *         type uint16;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-neighbor-list-in-use-intra-freq-cell-g</i>
 *
 */
public interface UmtsRanNeighborListInUseIntraFreqCellG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-neighbor-list-in-use-intra-freq-cell-g").intern();

    /**
     * PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) 
     * {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}. Mobile Country Code 
     * consists of three digits and uniquely identifies the country of domicile of the 
     * subscriber. Mobile Network Code consists of two or three digits and identifies 
     * the Home PLMN within a country. For a 2-digit MNC the total string length of 
     * {{param}} is 5.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>plmnid</code>, or <code>null</code> if not present
     */
    java.lang.String getPlmnid();
    
    /**
     * RNC-ID of an intra-freq neighbor cell. It uniquely identifies an RNC within a 
     * PLMN. Normally, RNC-ID consists of 12 bits (i.e. a range of [0:4095]). However, 
     * if the value is larger than 4095, then Extended RNC-ID (range of [4096:65535]) 
     * is used in RANAP. The RNC-ID and Extended RNC-ID are combined into a single 
     * parameter here as there is no explicit need to have them separated. 
     * {{bibref|3GPP-TS.25.413|Section 9.2.1.39}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>rncid</code>, or <code>null</code> if not present
     */
    java.lang.Integer getRncid();
    
    /**
     * C-ID of the intra-freq neighbour cell {{bibref|3GPP-TS.25.401|Section 6.1.5}}. 
     * If {{param|RNCID}} is larger than 4095, then {{param}} will be 12 bits (i.e. a 
     * range of [0:4095]), else {{param}} is 16 bits long (i.e. range of [4096:65535]).
     * This is needed to facilitate Femto to Macro handover. Used in 
     * {{bibref|3GPP-TS.25.413|Section 9.2.1.28}} as part of Target Cell ID.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>cid</code>, or <code>null</code> if not present
     */
    java.lang.Integer getCid();
    
    /**
     * Location Area Code (LAC). The concatenation of PLMN ID (MCC+MNC) and LAC 
     * uniquely identifies the Location Area ID (LAI). {{bibref|3GPP-TS.23.003|Section 
     * 4.1}} {{bibref|3GPP-TS.25.413|Section 9.2.3.6}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>lac</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLac();
    
    /**
     * Routing Area Code (RAC). The concatenation of PLMN ID (MCC+MNC), LAC, and RAC 
     * uniquely identifies the Routing Area ID (RAI). {{bibref|3GPP-TS.23.003|Section 
     * 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>rac</code>, or <code>null</code> if not present
     */
    java.lang.Short getRac();
    
    /**
     * UTRAN Registration Area (URA) {{bibref|3GPP-TS.23.401}}. Indicates to the UE 
     * which {{param}} it shall use in case of overlapping URAs. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.2.6}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>ura</code>, or <code>null</code> if not present
     */
    java.lang.Integer getUra();
    
    /**
     * Primary CPICH scrambling code.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>pcpichScramblingCode</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPcpichScramblingCode();

}

