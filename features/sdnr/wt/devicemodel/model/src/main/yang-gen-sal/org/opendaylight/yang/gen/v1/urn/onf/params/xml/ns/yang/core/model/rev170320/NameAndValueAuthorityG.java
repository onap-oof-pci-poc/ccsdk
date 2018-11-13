package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping name-and-value-authority-g {
 *     leaf uuid {
 *         type universal-id;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/name-and-value-authority-g</i>
 *
 */
public interface NameAndValueAuthorityG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "name-and-value-authority-g").intern();

    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>uuid</code>, or <code>null</code> if not present
     */
    UniversalId getUuid();

}

