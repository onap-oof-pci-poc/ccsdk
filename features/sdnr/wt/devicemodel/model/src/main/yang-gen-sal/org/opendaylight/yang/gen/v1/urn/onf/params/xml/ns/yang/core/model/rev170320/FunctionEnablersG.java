package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping function-enablers-g {
 *     leaf power-state {
 *         type to-be-defined;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/function-enablers-g</i>
 *
 */
public interface FunctionEnablersG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "function-enablers-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined</code> <code>powerState</code>, or <code>null</code> if not present
     */
    ToBeDefined getPowerState();

}

