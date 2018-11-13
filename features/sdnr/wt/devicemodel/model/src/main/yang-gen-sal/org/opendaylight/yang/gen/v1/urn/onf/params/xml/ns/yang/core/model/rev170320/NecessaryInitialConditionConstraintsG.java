package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping necessary-initial-condition-constraints-g {
 *     leaf is-not {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/necessary-initial-condition-constraints-g</i>
 *
 */
public interface NecessaryInitialConditionConstraintsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "necessary-initial-condition-constraints-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isNot</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsNot();

}

