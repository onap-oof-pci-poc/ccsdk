package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.HybridMwStructureConfigurationG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container hybrid-mw-structure-configuration {
 *     container structure-type {
 *         leaf tdm-structure-name {
 *             type tdm-structure-name;
 *         }
 *         leaf tdm-segment-size {
 *             type tdm-segment-size;
 *         }
 *         leaf max-number-of-segments-reservable {
 *             type max-number-of-segments-reservable;
 *         }
 *         uses tdm-structure-type-g;
 *     }
 *     leaf number-of-tdm-segments-to-be-reserved {
 *         type number-of-tdm-segments-to-be-reserved;
 *     }
 *     list problem-kind-severity-list {
 *         key "problem-kind-name";
 *         leaf problem-kind-name {
 *             type problem-kind-name;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *         uses structure-problem-severity-type-g;
 *     }
 *     uses hybrid-mw-structure-configuration-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-hybrid-mw-structure-pac/hybrid-mw-structure-configuration</i>
 *
 * <p>To create instances of this class use {@link HybridMwStructureConfigurationBuilder}.
 * @see HybridMwStructureConfigurationBuilder
 *
 */
public interface HybridMwStructureConfiguration
    extends
    ChildOf<MwHybridMwStructurePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>,
    HybridMwStructureConfigurationG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "hybrid-mw-structure-configuration").intern();


}

