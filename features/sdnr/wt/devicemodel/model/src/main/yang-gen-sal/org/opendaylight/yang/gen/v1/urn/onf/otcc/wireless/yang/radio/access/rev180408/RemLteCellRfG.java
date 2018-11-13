package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Table indicating the RF aspect of the discovered cells.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-lte-cell-rf-g {
 *     leaf eutra-carrier-arfcn {
 *         type uint16;
 *     }
 *     leaf phy-cell-id {
 *         type uint16;
 *     }
 *     leaf rsrp {
 *         type rsrp;
 *     }
 *     leaf rsrq {
 *         type rsrq;
 *     }
 *     leaf rssi {
 *         type rssi;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-lte-cell-rf-g</i>
 *
 */
public interface RemLteCellRfG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-lte-cell-rf-g").intern();

    /**
     * Indicates the ARFCN of this carrier frequency. Corresponds to parameter 
     * dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and parameter
     * NDL in {{bibref|3GPP-TS.36.101|Section 5.7.3}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>eutraCarrierArfcn</code>, or <code>null</code> if not present
     */
    java.lang.Integer getEutraCarrierArfcn();
    
    /**
     * Physical cell ID of the detected EUTRAN cell, as specified in 
     * {{bibref|3GPP-TS.36.101|Section 5.6}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>phyCellId</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPhyCellId();
    
    /**
     * Received RSRP level of the detected EUTRA cell, specified in {{units}}, as 
     * specified in {{bibref|3GPP-TS.36.214|Section 5.1.1}}. The reporting range is 
     * specified in {{bibref|3GPP-TS.36.133|Section 9.1.4}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>rsrp</code>, or <code>null</code> if not present
     */
    java.lang.Long getRsrp();
    
    /**
     * Received RSRQ level of the detected EUTRA cell, specified in {{units}}, as 
     * specified in {{bibref|3GPP-TS.36.214|Section 5.1.3}}. Actual measured values 
     * range between -24.0 {{units}} and 0.0 {{units}} in steps of 0.5 {{units}}. The 
     * value of {{param}} divided by 10 yields the actual measured value. Only values 
     * in multiple of 5 are valid.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>rsrq</code>, or <code>null</code> if not present
     */
    java.lang.Long getRsrq();
    
    /**
     * E-UTRA Carrier Received Signal Strength Indicator (RSSI), specified in 
     * {{units}}, as specified in {{bibref|3GPP-TS.36.214|Section 5.1.3}}. It comprises
     * the linear average of the total received power (in [W]) observed only in OFDM 
     * symbols containing reference symbols for antenna port 0, in the measurement 
     * bandwidth, over N number of resource blocks by the UE from all sources, 
     * including co-channel serving and non-serving cells, adjacent channel 
     * interference, thermal noise etc.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>rssi</code>, or <code>null</code> if not present
     */
    java.lang.Long getRssi();

}

