package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GeneralDirectivesG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container generaldirectives {
 *     uses general-directives-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/operation-envelope/generaldirectives</i>
 *
 * <p>To create instances of this class use {@link GeneraldirectivesBuilder}.
 * @see GeneraldirectivesBuilder
 *
 */
public interface Generaldirectives
    extends
    ChildOf<OperationEnvelope>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.Generaldirectives>,
    GeneralDirectivesG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "generaldirectives").intern();


}

