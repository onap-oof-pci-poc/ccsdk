package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * To be sent when an attribute has changed and one or more controllers have to 
 * update their data.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping attribute-value-changed-notification-g {
 *     leaf counter {
 *         type counter;
 *     }
 *     leaf time-stamp {
 *         type time-stamp;
 *     }
 *     leaf object-id-ref {
 *         type universal-id;
 *     }
 *     leaf attribute-name {
 *         type attribute-name;
 *     }
 *     leaf new-value {
 *         type new-value;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/attribute-value-changed-notification-g</i>
 *
 */
public interface AttributeValueChangedNotificationG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "attribute-value-changed-notification-g").intern();

    /**
     * Counts attribute value changed notifications.
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
    
    /**
     * Name of the attribute that has been changed.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>attributeName</code>, or <code>null</code> if not present
     */
    java.lang.String getAttributeName();
    
    /**
     * Attribute value converted to a string (xml, json, ...)
     *
     *
     *
     * @return <code>java.lang.String</code> <code>newValue</code>, or <code>null</code> if not present
     */
    java.lang.String getNewValue();

}

