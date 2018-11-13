package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * Describes the logical structuring of the physical capacity provided by a pure 
 * Ethernet microwave device. Segmentation is not available. No fixed segment 
 * No TDM transport.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping pure-ethernet-structure-capability-g {
 *     leaf structure-id {
 *         type universal-id;
 *     }
 *     leaf supported-alarms {
 *         type supported-alarms;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/pure-ethernet-structure-capability-g</i>
 *
 */
public interface PureEthernetStructureCapabilityG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "pure-ethernet-structure-capability-g").intern();

    /**
     * Identifies the Structure for bundling and container.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>structureId</code>, or <code>null</code> if not present
     */
    UniversalId getStructureId();
    
    /**
     * Available alarms to be listed. Mandatory:non. Names are to be separated by 
     * commas. Further alarms might be added by the device.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>supportedAlarms</code>, or <code>null</code> if not present
     */
    java.lang.String getSupportedAlarms();

}

