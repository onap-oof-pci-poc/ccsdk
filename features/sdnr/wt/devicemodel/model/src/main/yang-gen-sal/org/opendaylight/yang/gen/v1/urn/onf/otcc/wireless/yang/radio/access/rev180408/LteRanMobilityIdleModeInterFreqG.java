package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains parameters relating to the idle mode mobility 
 * for inter-freq re-selection scenario .
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-mobility-idle-mode-inter-freq-g {
 *     leaf max-carrier-entries {
 *         type uint64;
 *     }
 *     leaf carrier-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-mobility-idle-mode-inter-freq-g</i>
 *
 */
public interface LteRanMobilityIdleModeInterFreqG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-inter-freq-g").intern();

    /**
     * The maximum number of entries in the 
     * {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.InterFreq.Carrier.{i}.}} table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxCarrierEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxCarrierEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>carrierNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getCarrierNumberOfEntries();

}

