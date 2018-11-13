package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping transmission-mode-type-g {
 *     leaf transmission-mode-id {
 *         type universal-id;
 *     }
 *     leaf transmission-mode-name {
 *         type transmission-mode-name;
 *     }
 *     leaf channel-bandwidth {
 *         type channel-bandwidth;
 *     }
 *     leaf modulation-scheme {
 *         type modulation-scheme;
 *     }
 *     leaf code-rate {
 *         type code-rate;
 *     }
 *     leaf symbol-rate-reduction-factor {
 *         type symbol-rate-reduction-factor;
 *     }
 *     leaf tx-power-min {
 *         type tx-power-min;
 *     }
 *     leaf tx-power-max {
 *         type tx-power-max;
 *     }
 *     leaf rx-threshold {
 *         type rx-threshold;
 *     }
 *     leaf am-upshift-level {
 *         type am-upshift-level;
 *     }
 *     leaf am-downshift-level {
 *         type am-downshift-level;
 *     }
 *     leaf xpic-is-avail {
 *         type xpic-is-avail;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/transmission-mode-type-g</i>
 *
 */
public interface TransmissionModeTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "transmission-mode-type-g").intern();

    /**
     * Indentifies the transmissionMode for internal reference.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>transmissionModeId</code>, or <code>null</code> if not present
     */
    UniversalId getTransmissionModeId();
    
    /**
     * Name of the transmission mode. BBBB-m*-i&#42;&#47;t*-r*. B=four digits of 
     * channel bandwidth in MHz. m*=required number of digits for modulation name. 
     * (i&#42;&#47;t*=code rate.) i*=required number of digits for number of 
     * information bits. t*=required number of digits for total bits. r*=required 
     * number of digits for rate reduction factor. Example: 028-4QAM-188/204-1
     *
     *
     *
     * @return <code>java.lang.String</code> <code>transmissionModeName</code>, or <code>null</code> if not present
     */
    java.lang.String getTransmissionModeName();
    
    /**
     * Bandwidth of the transmit channel. The value shall be expressed explicitly 
     * (means in kHz) not as a reference to an international agreement. The values 
     * shall be chosen from the following _list: 3.500, 7.000, 14.000, 27.500, 28.000, 
     * 29.000, 29.650, 30.000, 40.000, 50.000, 55.000, 56.000, 59.300, 60.000, 80.000, 
     * 100.000, 112.000, 120.000, 150.000, 200.000, 250.000, 500.000, 750.000, 
     * 1.000.000, 1.250.000, 1.500.000, 1.750.000, 2.000.000;
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>channelBandwidth</code>, or <code>null</code> if not present
     */
    java.lang.Integer getChannelBandwidth();
    
    /**
     * Modulation scheme, which is base to the other characteristics described in the 
     * same transmissionModeType data type. The modulation scheme shall be described by
     * the number of states in the phase diagram (e.g. BPSK-&amp;gt;'2' or 
     * 256QAM-&amp;gt;'256').
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>modulationScheme</code>, or <code>null</code> if not present
     */
    java.lang.Short getModulationScheme();
    
    /**
     * Code rate of the coding scheme in % (Net bit rate ≤ Gross bit rate · code rate).
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>codeRate</code>, or <code>null</code> if not present
     */
    java.lang.Byte getCodeRate();
    
    /**
     * Reduction factor for the symbol rate. Example: value would be 4 for 1/4BPSK.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>symbolRateReductionFactor</code>, or <code>null</code> if not present
     */
    java.lang.Byte getSymbolRateReductionFactor();
    
    /**
     * Value of the minimum transmit power the modem can operate in dBm.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>txPowerMin</code>, or <code>null</code> if not present
     */
    java.lang.Byte getTxPowerMin();
    
    /**
     * Value of the maximum transmit power the modem can operate in dBm.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>txPowerMax</code>, or <code>null</code> if not present
     */
    java.lang.Byte getTxPowerMax();
    
    /**
     * Value of the receive level required to decode the received signal with a Bit 
     * Error Rate of 1e-6 or less.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>rxThreshold</code>, or <code>null</code> if not present
     */
    java.lang.Short getRxThreshold();
    
    /**
     * Value of the receive level that has to be exceeded to shift into a higher 
     * modulation scheme.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>amUpshiftLevel</code>, or <code>null</code> if not present
     */
    java.lang.Byte getAmUpshiftLevel();
    
    /**
     * Value of the receive level that has to be exceeded for not shifting into a lower
     * modulation scheme.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>amDownshiftLevel</code>, or <code>null</code> if not present
     */
    java.lang.Byte getAmDownshiftLevel();
    
    /**
     * In case this air interface type is capable of XPIC, this field shall contain a 
     * 'true'. This information shall purely relate to capabilities of the equipment 
     * type, but not to the operational capability of a specific hardware composition 
     * on site. Means for example that this attribute might contain a 'true' statement,
     * even if an additional cable would have been required to actually operate XPIC in
     * a specific case.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>xpicIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isXpicIsAvail();

}

