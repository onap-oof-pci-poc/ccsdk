package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping signal-ref-pt-g {
 *     leaf ltp {
 *         type leafref;
 *     }
 *     leaf-list elemental-signals {
 *         type universal-id;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/signal-ref-pt-g</i>
 *
 */
public interface SignalRefPtG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "signal-ref-pt-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>ltp</code>, or <code>null</code> if not present
     */
    UniversalId getLtp();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>elementalSignals</code>, or <code>null</code> if not present
     */
    List<UniversalId> getElementalSignals();

}

