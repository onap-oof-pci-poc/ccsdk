package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping universal-id-authority-g {
 *     leaf uuid {
 *         type universal-id;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/universal-id-authority-g</i>
 *
 */
public interface UniversalIdAuthorityG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "universal-id-authority-g").intern();

    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>uuid</code>, or <code>null</code> if not present
     */
    UniversalId getUuid();

}

