package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.and._class.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameAndClassG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameAndValueG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container name {
 *     leaf value-name {
 *         type string;
 *     }
 *     leaf value {
 *         type string;
 *     }
 *     uses name-and-value-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/name-and-class-g/name</i>
 *
 * <p>To create instances of this class use {@link NameBuilder}.
 * @see NameBuilder
 *
 */
public interface Name
    extends
    ChildOf<NameAndClassG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.and._class.g.Name>,
    NameAndValueG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "name").intern();


}

