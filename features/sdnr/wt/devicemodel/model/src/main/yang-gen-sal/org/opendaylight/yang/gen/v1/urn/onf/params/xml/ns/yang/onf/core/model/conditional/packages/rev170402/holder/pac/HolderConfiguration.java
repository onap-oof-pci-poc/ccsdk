package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderConfigurationG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * container holder-configuration {
 *     list problem-type-severity-list {
 *         key "problem-type-name";
 *         leaf problem-type-name {
 *             type string;
 *         }
 *         leaf problem-type-severity {
 *             type severity-type;
 *         }
 *         uses problem-severity-type-g;
 *     }
 *     uses holder-configuration-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/holder-pac/holder-configuration</i>
 *
 * <p>To create instances of this class use {@link HolderConfigurationBuilder}.
 * @see HolderConfigurationBuilder
 *
 */
public interface HolderConfiguration
    extends
    ChildOf<HolderPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac.HolderConfiguration>,
    HolderConfigurationG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "holder-configuration").intern();


}

