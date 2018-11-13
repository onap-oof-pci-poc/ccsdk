package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Table indicating the components of the discovered cells.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping rem-umts-wcdma-cell-g {
 *     leaf rem-umts-wcdma-cell-key {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/rem-umts-wcdma-cell-g</i>
 *
 */
public interface RemUmtsWcdmaCellG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-umts-wcdma-cell-g").intern();

    /**
     * Key value for this object, which could be an item of a list.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>remUmtsWcdmaCellKey</code>, or <code>null</code> if not present
     */
    java.lang.String getRemUmtsWcdmaCellKey();

}

