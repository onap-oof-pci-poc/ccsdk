package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ControlParametersPacG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container control-parameters {
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
 *     uses control-parameters-pac-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/configuration-and-switch-controller-g/control-parameters</i>
 *
 * <p>To create instances of this class use {@link ControlParametersBuilder}.
 * @see ControlParametersBuilder
 *
 */
public interface ControlParameters
    extends
    ChildOf<ConfigurationAndSwitchControllerG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>,
    ControlParametersPacG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "control-parameters").intern();


}

