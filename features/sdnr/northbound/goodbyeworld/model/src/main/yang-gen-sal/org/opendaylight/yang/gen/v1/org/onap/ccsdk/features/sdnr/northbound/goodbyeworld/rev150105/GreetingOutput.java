package org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.goodbyeworld.rev150105;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>goodbyeworld</b>
 * <pre>
 * container output {
 *     leaf response {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>goodbyeworld/greeting/output</i>
 *
 * <p>To create instances of this class use {@link GreetingOutputBuilder}.
 * @see GreetingOutputBuilder
 *
 */
public interface GreetingOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.goodbyeworld.rev150105.GreetingOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("org:onap:ccsdk:features:sdnr:northbound:goodbyeworld",
        "2015-01-05", "output").intern();

    /**
     * @return <code>java.lang.String</code> <code>response</code>, or <code>null</code> if not present
     */
    java.lang.String getResponse();

}

