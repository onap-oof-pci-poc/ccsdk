package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * To be sent when a new MW_AirInterface_Pac, MW_AirInterfaceDiversity_Pac, 
 * MW_Structure_Pac, MW_PureEthernetStructure_Pac, MW_HybridMwStructure_Pac, 
 * MW_Container_Pac, MW_EthernetContainer_Pac or MW_TdmContainer_Pac instance has 
 * to be deleted in the controller.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping object-deletion-notification-g {
 *     leaf counter {
 *         type counter;
 *     }
 *     leaf time-stamp {
 *         type time-stamp;
 *     }
 *     leaf object-id-ref {
 *         type universal-id;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/object-deletion-notification-g</i>
 *
 */
public interface ObjectDeletionNotificationG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "object-deletion-notification-g").intern();

    /**
     * Counts object deletion notifications.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>counter</code>, or <code>null</code> if not present
     */
    java.lang.Integer getCounter();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime</code> <code>timeStamp</code>, or <code>null</code> if not present
     */
    DateAndTime getTimeStamp();
    
    /**
     * ID of the affected MW_AirInterface_Pac, MW_AirInterfaceDiversity_Pac, 
     * MW_Structure_Pac, MW_PureEthernetStructure_Pac, MW_HybridMwStructure_Pac, 
     * MW_Container_Pac, MW_EthernetContainer_Pac or MW_TdmContainer_Pac.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>objectIdRef</code>, or <code>null</code> if not present
     */
    UniversalId getObjectIdRef();

}

