package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping signal-ordering-type-g {
 *     leaf signal-ordering-kind-name {
 *         type string;
 *     }
 *     leaf-list signal-list {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/signal-ordering-type-g</i>
 *
 */
public interface SignalOrderingTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "signal-ordering-type-g").intern();

    /**
     * To be filled according to TR-541. Must be unique for referencing during 
     * configuration of the interface.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>signalOrderingKindName</code>, or <code>null</code> if not present
     */
    java.lang.String getSignalOrderingKindName();
    
    /**
     * Desciption of the signals on the Media Dependent Interface (MDI), might be e.g. 
     * 'TX+' in case of e.g. 10BASE-T, might be e.g. '1,295.56 nm' in case of e.g. 
     * 100GBASE-LR4
     *
     *
     *
     * @return <code>java.util.List</code> <code>signalList</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getSignalList();

}

