package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping physical-properties-g {
 *     leaf temperature {
 *         type to-be-defined;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/physical-properties-g</i>
 *
 */
public interface PhysicalPropertiesG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "physical-properties-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined</code> <code>temperature</code>, or <code>null</code> if not present
     */
    ToBeDefined getTemperature();

}

