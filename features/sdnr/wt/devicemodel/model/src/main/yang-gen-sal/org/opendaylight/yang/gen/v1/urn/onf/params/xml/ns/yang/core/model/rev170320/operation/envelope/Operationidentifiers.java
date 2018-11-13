package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationIdentifiersG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container operationidentifiers {
 *     uses operation-identifiers-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/operation-envelope/operationidentifiers</i>
 *
 * <p>To create instances of this class use {@link OperationidentifiersBuilder}.
 * @see OperationidentifiersBuilder
 *
 */
public interface Operationidentifiers
    extends
    ChildOf<OperationEnvelope>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.Operationidentifiers>,
    OperationIdentifiersG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "operationidentifiers").intern();


}

