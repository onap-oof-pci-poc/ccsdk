package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping spatial-properties-of-type-g {
 *     leaf height {
 *         type to-be-defined;
 *     }
 *     leaf width {
 *         type to-be-defined;
 *     }
 *     leaf length {
 *         type to-be-defined;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/spatial-properties-of-type-g</i>
 *
 */
public interface SpatialPropertiesOfTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "spatial-properties-of-type-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined</code> <code>height</code>, or <code>null</code> if not present
     */
    ToBeDefined getHeight();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined</code> <code>width</code>, or <code>null</code> if not present
     */
    ToBeDefined getWidth();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined</code> <code>length</code>, or <code>null</code> if not present
     */
    ToBeDefined getLength();

}

