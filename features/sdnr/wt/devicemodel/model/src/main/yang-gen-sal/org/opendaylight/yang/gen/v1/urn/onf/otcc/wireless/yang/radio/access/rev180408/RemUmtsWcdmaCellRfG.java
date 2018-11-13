package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Table indicating the RF aspect of the discovered cells.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-umts-wcdma-cell-rf-g {
 *     leaf uarfcndl {
 *         type uint16;
 *     }
 *     leaf cpichrscp {
 *         type cpichrscp;
 *     }
 *     leaf cpich-ec-no {
 *         type cpich-ec-no;
 *     }
 *     leaf rssi {
 *         type rssi;
 *     }
 *     leaf primary-scrambling-code {
 *         type uint16;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-umts-wcdma-cell-rf-g</i>
 *
 */
public interface RemUmtsWcdmaCellRfG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-umts-wcdma-cell-rf-g").intern();

    /**
     * The UTRA Absolute Radio Frequency Channel Number (UARFCN) in the DL direction of
     * an FDD mode cell. {{bibref|3GPP-TS.25.433}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>uarfcndl</code>, or <code>null</code> if not present
     */
    java.lang.Integer getUarfcndl();
    
    /**
     * Received signal level in {{units}} of the CPICH channel. (Ref. 3GPP TS 25.133)
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>cpichrscp</code>, or <code>null</code> if not present
     */
    java.lang.Long getCpichrscp();
    
    /**
     * Measured EcNo. (energy per chip to interference power density) in {{units}} 
     * received in the downlink pilot channel. Actual values of the range are -24.0 
     * {{units}} to 0.0 {{units}} in steps of 0.5 {{units}}. The value of {{param}} 
     * divided by 2 yields the actual value of the range. 
     * {{bibref|3GPP-TS.25.133|Section 9.1.2.3}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>cpichEcNo</code>, or <code>null</code> if not present
     */
    java.lang.Long getCpichEcNo();
    
    /**
     * This measurement is for Inter-frequency handover evaluation, measured in total 
     * {{units}} in the band. {{bibref|3GPP-TS.25.133|Section9.1.3}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>rssi</code>, or <code>null</code> if not present
     */
    java.lang.Long getRssi();
    
    /**
     * Primary scrambling code.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>primaryScramblingCode</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPrimaryScramblingCode();

}

