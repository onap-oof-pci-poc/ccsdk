package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.and._class.g.Name;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping name-and-class-g {
 *     leaf class-of-instance {
 *         type string;
 *     }
 *     container name {
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
 * <i>core-model/name-and-class-g</i>
 *
 */
public interface NameAndClassG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "name-and-class-g").intern();

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
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.and._class.g.Name</code> <code>name</code>, or <code>null</code> if not present
     */
    Name getName();

}

