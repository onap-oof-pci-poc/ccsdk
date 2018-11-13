package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping air-interface-diversity-status-g {
 *     leaf snir-cur {
 *         type snir-cur;
 *     }
 *     leaf air-interface-diversity-status {
 *         type air-interface-diversity-status;
 *     }
 *     leaf last-status-change {
 *         type last-status-change;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-diversity-status-g</i>
 *
 */
public interface AirInterfaceDiversityStatusG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "air-interface-diversity-status-g").intern();

    /**
     * Currently measured signal to (noise+interference) ratio of the combined signals.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>snirCur</code>, or <code>null</code> if not present
     */
    java.lang.Byte getSnirCur();
    
    /**
     * Status of the air interface bundle. 
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceDiversityStatusType</code> <code>airInterfaceDiversityStatus</code>, or <code>null</code> if not present
     */
    AirInterfaceDiversityStatusType getAirInterfaceDiversityStatus();
    
    /**
     * Time the Diversity Group entered its current operational status. 
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime</code> <code>lastStatusChange</code>, or <code>null</code> if not present
     */
    DateAndTime getLastStatusChange();

}

