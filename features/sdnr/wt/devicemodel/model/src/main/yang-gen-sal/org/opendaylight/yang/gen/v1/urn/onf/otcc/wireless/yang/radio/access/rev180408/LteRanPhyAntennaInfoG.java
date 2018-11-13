package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the antenna configuration (see 
 * {{bibref|3GPP-TS.32.592|Section 6.1.1.1}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-phy-antenna-info-g {
 *     leaf antenna-ports-count {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-phy-antenna-info-g</i>
 *
 */
public interface LteRanPhyAntennaInfoG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-antenna-info-g").intern();

    /**
     * Defines the number of cell specific antenna ports according to 
     * {{bibref|3GPP-TS.36.211|Section 6.2.1}}. A UE in IDLE mode acquires the 
     * information about the number of transmit antenna ports according to 
     * {{bibref|3GPP-TS.36.212|Section 5.3.1.1}}. Corresponds to antennaPortsCount IE 
     * specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>antennaPortsCount</code>, or <code>null</code> if not present
     */
    java.lang.Short getAntennaPortsCount();

}

