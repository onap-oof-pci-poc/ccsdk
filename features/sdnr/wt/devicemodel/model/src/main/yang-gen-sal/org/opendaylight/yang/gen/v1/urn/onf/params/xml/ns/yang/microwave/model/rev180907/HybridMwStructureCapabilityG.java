package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * Describes the logical structuring of the physical capacity provided by a hybrid 
 * microwave device (TDM + Ethernet). Segmentation is available. TDM transport is 
 * available.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping hybrid-mw-structure-capability-g {
 *     leaf structure-id {
 *         type universal-id;
 *     }
 *     list supported-tdm-structure-types-list {
 *         key "tdm-structure-name";
 *         leaf tdm-structure-name {
 *             type string;
 *         }
 *         leaf tdm-segment-size {
 *             type tdm-segment-size;
 *         }
 *         leaf max-number-of-segments-reservable {
 *             type max-number-of-segments-reservable;
 *         }
 *         uses tdm-structure-type-g;
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
 * <i>microwave-model/hybrid-mw-structure-capability-g</i>
 *
 */
public interface HybridMwStructureCapabilityG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "hybrid-mw-structure-capability-g").intern();

    /**
     * Identifies the Structure for bundling and container.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>structureId</code>, or <code>null</code> if not present
     */
    UniversalId getStructureId();
    
    /**
     * Lists the TDM frame types that are supported.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedTdmStructureTypesList</code>, or <code>null</code> if not present
     */
    List<SupportedTdmStructureTypesList> getSupportedTdmStructureTypesList();
    
    /**
     * Available alarms to be listed. Mandatory:non. Names are to be separated by 
     * commas. Further alarms might be added by the vendor.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedAlarmList</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getSupportedAlarmList();
    
    /**
     * Available alarms to be listed. Mandatory:non. Names are to be separated by 
     * commas. Further alarms might be added by the device.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>supportedAlarms</code>, or <code>null</code> if not present
     */
    @Deprecated
    java.lang.String getSupportedAlarms();

}

