package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping control-parameters-pac-g {
 *     leaf reversion-mode {
 *         type reversion-mode;
 *     }
 *     leaf wait-to-revert-time {
 *         type wait-to-revert-time;
 *     }
 *     leaf prot-type {
 *         type protection-type;
 *     }
 *     leaf hold-off-time {
 *         type int64;
 *     }
 *     leaf network-scheme-specification {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/control-parameters-pac-g</i>
 *
 */
public interface ControlParametersPacG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "control-parameters-pac-g").intern();

    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ReversionMode</code> <code>reversionMode</code>, or <code>null</code> if not present
     */
    ReversionMode getReversionMode();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>waitToRevertTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getWaitToRevertTime();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ProtectionType</code> <code>protType</code>, or <code>null</code> if not present
     */
    ProtectionType getProtType();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>holdOffTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getHoldOffTime();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.String</code> <code>networkSchemeSpecification</code>, or <code>null</code> if not present
     */
    java.lang.String getNetworkSchemeSpecification();

}

