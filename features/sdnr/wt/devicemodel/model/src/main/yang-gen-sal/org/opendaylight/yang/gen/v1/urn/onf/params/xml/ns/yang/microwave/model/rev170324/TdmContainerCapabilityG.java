package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.tdm.container.capability.g.SupportedTdmContainerTypesList;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * Bundling is not available.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping tdm-container-capability-g {
 *     list supported-tdm-container-types-list {
 *         key "tdm-container-name";
 *         leaf tdm-container-name {
 *             type tdm-container-name;
 *         }
 *         leaf tdm-container-size {
 *             type tdm-container-size;
 *         }
 *         uses tdm-container-type-g;
 *     }
 *     leaf supported-alarms {
 *         type supported-alarms;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/tdm-container-capability-g</i>
 *
 */
public interface TdmContainerCapabilityG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "tdm-container-capability-g").intern();

    /**
     * Lists the TDM containers that are supported.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedTdmContainerTypesList</code>, or <code>null</code> if not present
     */
    List<SupportedTdmContainerTypesList> getSupportedTdmContainerTypesList();
    
    /**
     * Available alarms to be listed. Mandatory:'framingIsFaulty' and 
     * 'containerIsDown'. Further alarms might be added by the device.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>supportedAlarms</code>, or <code>null</code> if not present
     */
    java.lang.String getSupportedAlarms();

}

