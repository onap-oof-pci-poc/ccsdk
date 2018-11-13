package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping equipment-type-g {
 *     leaf description {
 *         type string;
 *     }
 *     leaf model-identifier {
 *         type string;
 *     }
 *     leaf part-type-identifier {
 *         type string;
 *     }
 *     leaf type-name {
 *         type string;
 *     }
 *     leaf version {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/equipment-type-g</i>
 *
 */
public interface EquipmentTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "equipment-type-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.String</code> <code>modelIdentifier</code>, or <code>null</code> if not present
     */
    java.lang.String getModelIdentifier();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.String</code> <code>partTypeIdentifier</code>, or <code>null</code> if not present
     */
    java.lang.String getPartTypeIdentifier();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.String</code> <code>typeName</code>, or <code>null</code> if not present
     */
    java.lang.String getTypeName();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    java.lang.String getVersion();

}

