package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.local._class.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalClassG;
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
 * list local-id {
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
 * <i>core-model/local-class-g/local-id</i>
 *
 * <p>To create instances of this class use {@link LocalIdBuilder}.
 * @see LocalIdBuilder
 * @see LocalIdKey
 *
 */
public interface LocalId
    extends
    ChildOf<LocalClassG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.local._class.g.LocalId>,
    NameAndValueG,
    Identifiable<LocalIdKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "local-id").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.local._class.g.LocalIdKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LocalIdKey getKey();

}

