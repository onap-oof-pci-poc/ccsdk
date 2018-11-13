package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping swapability-g {
 *     leaf is-hot-swappable {
 *         type is-hot-swappable;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/swapability-g</i>
 *
 */
public interface SwapabilityG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "swapability-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isHotSwappable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsHotSwappable();

}

