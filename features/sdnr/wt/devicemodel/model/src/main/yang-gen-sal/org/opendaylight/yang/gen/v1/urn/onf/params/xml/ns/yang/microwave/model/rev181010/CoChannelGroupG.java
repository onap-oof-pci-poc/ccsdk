package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * Required for configuring XPIC, MIMO and ALIC.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping co-channel-group-g {
 *     leaf co-channel-group-id {
 *         type universal-id;
 *     }
 *     leaf-list air-interface-list {
 *         type leafref;
 *     }
 *     leaf sort-of-co-channel-group {
 *         type sort-of-co-channel-group;
 *     }
 *     leaf-list logical-termination-point {
 *         type leafref;
 *         status DEPRECATED;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/co-channel-group-g</i>
 *
 */
public interface CoChannelGroupG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "co-channel-group-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>coChannelGroupId</code>, or <code>null</code> if not present
     */
    UniversalId getCoChannelGroupId();
    
    /**
     * List of air interfaces, which are part of the co-channel (XPIC, MIMO, ALIC) 
     * group.
     *
     *
     *
     * @return <code>java.util.List</code> <code>airInterfaceList</code>, or <code>null</code> if not present
     */
    List<UniversalId> getAirInterfaceList();
    
    /**
     * Type of group of air interfaces with the same transmit and receive frequency. 
     * The values shall be chosen from the following _list:'XPIC', 'MIMO', 'ALIC';
     *
     *
     *
     * @return <code>java.lang.String</code> <code>sortOfCoChannelGroup</code>, or <code>null</code> if not present
     */
    java.lang.String getSortOfCoChannelGroup();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>logicalTerminationPoint</code>, or <code>null</code> if not present
     */
    @Deprecated
    List<UniversalId> getLogicalTerminationPoint();

}

