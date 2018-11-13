package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object can be configured only if 
 * {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to 
 * {{true}}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-ran-appim-g {
 *     leaf lifetime {
 *         type uint8;
 *     }
 *     leaf numappirec {
 *         type uint16;
 *     }
 *     leaf appirec-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-appim-g</i>
 *
 */
public interface Cdma2000OneXRanAppimG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-appim-g").intern();

    /**
     * Lifetime of the information in the access point pilot information record. Refer 
     * {{bibref|3GPP2-C.S0005}} for definitions
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>lifetime</code>, or <code>null</code> if not present
     */
    java.lang.Short getLifetime();
    
    /**
     * The number of entries for 
     * {{object|.CellConfig.CDMA2000.OneX.RAN.APPIM.APPIREC.{i}.}}
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>numappirec</code>, or <code>null</code> if not present
     */
    java.lang.Integer getNumappirec();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>appirecNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getAppirecNumberOfEntries();

}

