package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.hybrid.mw.structure.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwHybridMwStructurePac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.HybridMwStructureCapabilityG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container hybrid-mw-structure-capability {
 *     leaf structure-id {
 *         type universal-id;
 *     }
 *     list supported-tdm-structure-types-list {
 *         key "tdm-structure-name";
 *         leaf tdm-structure-name {
 *             type string;
 *         }
 *         leaf tdm-segment-size {
 *             type tdm-segment-size;
 *         }
 *         leaf max-number-of-segments-reservable {
 *             type max-number-of-segments-reservable;
 *         }
 *         uses tdm-structure-type-g;
 *     }
 *     leaf-list supported-alarm-list {
 *         type string;
 *     }
 *     leaf supported-alarms {
 *         type supported-alarms;
 *         status DEPRECATED;
 *     }
 *     uses hybrid-mw-structure-capability-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-hybrid-mw-structure-pac/hybrid-mw-structure-capability</i>
 *
 * <p>To create instances of this class use {@link HybridMwStructureCapabilityBuilder}.
 * @see HybridMwStructureCapabilityBuilder
 *
 */
public interface HybridMwStructureCapability
    extends
    ChildOf<MwHybridMwStructurePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.hybrid.mw.structure.pac.HybridMwStructureCapability>,
    HybridMwStructureCapabilityG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "hybrid-mw-structure-capability").intern();


}

