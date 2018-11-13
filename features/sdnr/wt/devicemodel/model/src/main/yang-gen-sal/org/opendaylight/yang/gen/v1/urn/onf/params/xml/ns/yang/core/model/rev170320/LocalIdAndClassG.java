package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.local.id.and._class.g.LocalId;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping local-id-and-class-g {
 *     leaf class-of-instance {
 *         type string;
 *     }
 *     container local-id {
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/local-id-and-class-g</i>
 *
 */
public interface LocalIdAndClassG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "local-id-and-class-g").intern();

    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.String</code> <code>classOfInstance</code>, or <code>null</code> if not present
     */
    java.lang.String getClassOfInstance();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.local.id.and._class.g.LocalId</code> <code>localId</code>, or <code>null</code> if not present
     */
    LocalId getLocalId();

}

