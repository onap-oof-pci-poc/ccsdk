package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderCapabilityG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * container holder-capability {
 *     leaf-list supported-alarms {
 *         type string;
 *     }
 *     uses holder-capability-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/holder-pac/holder-capability</i>
 *
 * <p>To create instances of this class use {@link HolderCapabilityBuilder}.
 * @see HolderCapabilityBuilder
 *
 */
public interface HolderCapability
    extends
    ChildOf<HolderPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac.HolderCapability>,
    HolderCapabilityG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "holder-capability").intern();


}

