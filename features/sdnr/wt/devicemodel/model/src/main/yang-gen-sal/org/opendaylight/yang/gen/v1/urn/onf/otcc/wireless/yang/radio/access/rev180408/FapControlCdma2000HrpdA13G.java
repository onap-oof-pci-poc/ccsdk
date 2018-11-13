package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains attributes related to A13 Session Transfer
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping fap-control-cdma2000-hrpd-a13-g {
 *     leaf color-code-to-uati104-number-of-entries {
 *         type uint64;
 *     }
 *     leaf hrpd-subnet-to-ip-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-control-cdma2000-hrpd-a13-g</i>
 *
 */
public interface FapControlCdma2000HrpdA13G
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-hrpd-a13-g").intern();

    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>colorCodeToUati104NumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getColorCodeToUati104NumberOfEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>hrpdSubnetToIpNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getHrpdSubnetToIpNumberOfEntries();

}

