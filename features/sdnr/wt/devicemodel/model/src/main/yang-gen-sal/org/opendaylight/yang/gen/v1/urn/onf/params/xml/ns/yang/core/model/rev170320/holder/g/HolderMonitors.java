package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderMonitorsG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container holder-monitors {
 *     leaf is-active {
 *         type boolean;
 *     }
 *     leaf is-actual-mismatch-with-expected {
 *         type boolean;
 *     }
 *     leaf aggregate-function {
 *         type string;
 *     }
 *     uses holder-monitors-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/holder-g/holder-monitors</i>
 *
 * <p>To create instances of this class use {@link HolderMonitorsBuilder}.
 * @see HolderMonitorsBuilder
 *
 */
public interface HolderMonitors
    extends
    ChildOf<HolderG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>,
    HolderMonitorsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "holder-monitors").intern();


}

