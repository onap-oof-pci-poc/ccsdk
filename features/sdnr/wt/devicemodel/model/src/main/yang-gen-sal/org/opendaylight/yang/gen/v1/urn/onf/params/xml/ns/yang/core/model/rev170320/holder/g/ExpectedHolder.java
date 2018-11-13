package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExpectedHolderG;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container expected-holder {
 *     uses expected-holder-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/holder-g/expected-holder</i>
 *
 * <p>To create instances of this class use {@link ExpectedHolderBuilder}.
 * @see ExpectedHolderBuilder
 *
 */
public interface ExpectedHolder
    extends
    ChildOf<HolderG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>,
    ExpectedHolderG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "expected-holder").intern();


}

