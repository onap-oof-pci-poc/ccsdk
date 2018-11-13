package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This is the top level of managed object class hierarchy and every other managed 
 * object class is a specialization of either this generic class (top) or a 
 * specialization of subclass of top. The parameter miscellaneousError is to be 
 * used when a processing failure has occurred and the error condition encountered 
 * does not match any of object's defined specific error types.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>g.874.1-model</b>
 * <pre>
 * grouping x.721-top-g {
 *     leaf object-class {
 *         type object-identifier;
 *     }
 *     leaf name-binding {
 *         type object-identifier;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>g.874.1-model/x.721-top-g</i>
 *
 */
public interface X721TopG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:g.874.1-model",
        "2017-03-20", "x.721-top-g").intern();

    /**
     * ObjectClass ::= CHOICE{ globalForm [0] OBJECT IDENTIFIER,localForm [1] INTEGER}
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.ObjectIdentifier</code> <code>objectClass</code>, or <code>null</code> if not present
     */
    ObjectIdentifier getObjectClass();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.ObjectIdentifier</code> <code>nameBinding</code>, or <code>null</code> if not present
     */
    ObjectIdentifier getNameBinding();

}

