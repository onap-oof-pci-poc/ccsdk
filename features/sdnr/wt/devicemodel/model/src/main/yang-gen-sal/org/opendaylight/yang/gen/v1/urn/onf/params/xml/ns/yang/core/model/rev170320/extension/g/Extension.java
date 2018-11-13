package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.extension.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameAndValueG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * list extension {
 *     key "value-name";
 *     leaf value-name {
 *         type string;
 *     }
 *     leaf value {
 *         type string;
 *     }
 *     uses name-and-value-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/extension-g/extension</i>
 *
 * <p>To create instances of this class use {@link ExtensionBuilder}.
 * @see ExtensionBuilder
 * @see ExtensionKey
 *
 */
public interface Extension
    extends
    ChildOf<ExtensionG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.extension.g.Extension>,
    NameAndValueG,
    Identifiable<ExtensionKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "extension").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.extension.g.ExtensionKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ExtensionKey getKey();

}

