package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderStructureG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container holder-structure {
 *     leaf holder-category {
 *         type holder-category;
 *     }
 *     leaf is-captive {
 *         type boolean;
 *     }
 *     leaf is-guided {
 *         type boolean;
 *     }
 *     leaf is-quantized-space {
 *         type boolean;
 *     }
 *     uses holder-structure-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/holder-g/holder-structure</i>
 *
 * <p>To create instances of this class use {@link HolderStructureBuilder}.
 * @see HolderStructureBuilder
 *
 */
public interface HolderStructure
    extends
    ChildOf<HolderG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>,
    HolderStructureG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "holder-structure").intern();


}

