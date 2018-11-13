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
 * grouping signal-ref-pt-group-g {
 *     leaf pin-group {
 *         type universal-id;
 *     }
 *     leaf-list signal-ref-pt {
 *         type universal-id;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/signal-ref-pt-group-g</i>
 *
 */
public interface SignalRefPtGroupG
    extends
    DataObject,
    PortG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "signal-ref-pt-group-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>pinGroup</code>, or <code>null</code> if not present
     */
    UniversalId getPinGroup();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>signalRefPt</code>, or <code>null</code> if not present
     */
    List<UniversalId> getSignalRefPt();

}

