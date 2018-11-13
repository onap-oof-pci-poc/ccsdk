package org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.goodbyeworld.rev150105;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>goodbyeworld</b>
 * <pre>
 * container input {
 *     leaf salutation {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>goodbyeworld/greeting/input</i>
 *
 * <p>To create instances of this class use {@link GreetingInputBuilder}.
 * @see GreetingInputBuilder
 *
 */
public interface GreetingInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.goodbyeworld.rev150105.GreetingInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("org:onap:ccsdk:features:sdnr:northbound:goodbyeworld",
        "2015-01-05", "input").intern();

    /**
     * @return <code>java.lang.String</code> <code>salutation</code>, or <code>null</code> if not present
     */
    java.lang.String getSalutation();

}

