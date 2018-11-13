package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping physical-characteristics-g {
 *     leaf weight-characteristics {
 *         type to-be-defined;
 *     }
 *     leaf fire-characteristics {
 *         type to-be-defined;
 *     }
 *     leaf materials {
 *         type to-be-defined;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/physical-characteristics-g</i>
 *
 */
public interface PhysicalCharacteristicsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "physical-characteristics-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined</code> <code>weightCharacteristics</code>, or <code>null</code> if not present
     */
    ToBeDefined getWeightCharacteristics();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined</code> <code>fireCharacteristics</code>, or <code>null</code> if not present
     */
    ToBeDefined getFireCharacteristics();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined</code> <code>materials</code>, or <code>null</code> if not present
     */
    ToBeDefined getMaterials();

}

