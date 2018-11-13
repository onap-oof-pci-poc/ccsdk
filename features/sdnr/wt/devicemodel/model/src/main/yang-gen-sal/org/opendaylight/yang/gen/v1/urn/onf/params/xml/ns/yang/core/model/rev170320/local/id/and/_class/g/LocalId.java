package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.local.id.and._class.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameAndValueG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalIdAndClassG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container local-id {
 *     leaf value-name {
 *         type string;
 *     }
 *     leaf value {
 *         type string;
 *     }
 *     uses name-and-value-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/local-id-and-class-g/local-id</i>
 *
 * <p>To create instances of this class use {@link LocalIdBuilder}.
 * @see LocalIdBuilder
 *
 */
public interface LocalId
    extends
    ChildOf<LocalIdAndClassG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.local.id.and._class.g.LocalId>,
    NameAndValueG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "local-id").intern();


}

