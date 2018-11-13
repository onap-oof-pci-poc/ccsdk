package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.capability.g.AvailableKindsOfDiversity;
import java.util.List;

/**
 * Describes the capabilities in implementing different types of air interface 
 * diversity.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping air-interface-diversity-capability-g {
 *     list available-kinds-of-diversity {
 *         key "diversity-name";
 *         leaf diversity-name {
 *             type string;
 *         }
 *         leaf number-of-air-interfaces-max {
 *             type number-of-air-interfaces-max;
 *         }
 *         uses diversity-type-g;
 *     }
 *     leaf-list supported-alarm-list {
 *         type string;
 *     }
 *     leaf supported-alarms {
 *         type supported-alarms;
 *         status DEPRECATED;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-diversity-capability-g</i>
 *
 */
public interface AirInterfaceDiversityCapabilityG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "air-interface-diversity-capability-g").intern();

    /**
     * Available types of diversity to be listed.
     *
     *
     *
     * @return <code>java.util.List</code> <code>availableKindsOfDiversity</code>, or <code>null</code> if not present
     */
    List<AvailableKindsOfDiversity> getAvailableKindsOfDiversity();
    
    /**
     * Available alarms to be listed. 
     * Mandatory:'airInterfaceDiversityConfigurationIsPartlyDown' (at least one air 
     * interface is down, but not all of them) and 
     * 'airInterfaceDiversityConfigurationIsDown' (all air interfaces are down). 
     * Further alarms might be added by the vendor.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedAlarmList</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getSupportedAlarmList();
    
    /**
     * Available alarms to be listed. 
     * Mandatory:'airInterfaceDiversityConfigurationIsPartlyDown' (at least one air 
     * interface is down, but not all of them) and 
     * 'airInterfaceDiversityConfigurationIsDown' (all air interfaces are down). 
     * Further alarms might be added by the device. Names are to be separated by 
     * commas.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>supportedAlarms</code>, or <code>null</code> if not present
     */
    @Deprecated
    java.lang.String getSupportedAlarms();

}

