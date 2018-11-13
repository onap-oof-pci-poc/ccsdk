package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the common configuration in LTE RAN.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-common-g {
 *     leaf cell-identity {
 *         type uint32;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-common-g</i>
 *
 */
public interface LteRanCommonG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-common-g").intern();

    /**
     * Cell Identity as specified in {{bibref|3GPP-TS.36.331|Section 6.3.4}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>cellIdentity</code>, or <code>null</code> if not present
     */
    java.lang.Long getCellIdentity();

}

