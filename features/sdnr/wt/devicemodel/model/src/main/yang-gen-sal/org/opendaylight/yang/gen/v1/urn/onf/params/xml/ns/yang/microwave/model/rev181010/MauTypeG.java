package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping mau-type-g {
 *     leaf mau-id {
 *         type universal-id;
 *     }
 *     leaf mii-kind {
 *         type mii-kind;
 *     }
 *     leaf mdi-kind {
 *         type mdi-kind;
 *     }
 *     leaf required-medium-kind {
 *         type required-medium-kind;
 *     }
 *     leaf-list wavelength-min {
 *         type wavelength-min;
 *     }
 *     leaf-list wavelength-max {
 *         type wavelength-max;
 *     }
 *     leaf wavelength-grid-min {
 *         type wavelength-grid-min;
 *     }
 *     leaf link-length-max {
 *         type link-length-max;
 *     }
 *     leaf vendor-name {
 *         type vendor-name;
 *     }
 *     leaf vendor-oui {
 *         type vendor-oui;
 *     }
 *     leaf part-number {
 *         type part-number;
 *     }
 *     leaf revision-number {
 *         type revision-number;
 *     }
 *     leaf serial-number {
 *         type serial-number;
 *     }
 *     leaf date-code {
 *         type date-code;
 *     }
 *     leaf-list pmd-list {
 *         type pmd-name-type;
 *     }
 *     list signal-ordering-list {
 *         key "signal-ordering-kind-name";
 *         leaf signal-ordering-kind-name {
 *             type string;
 *         }
 *         leaf-list signal-list {
 *             type string;
 *         }
 *         uses signal-ordering-type-g;
 *     }
 *     leaf auto-signal-ordering-is-avail {
 *         type auto-signal-ordering-is-avail;
 *     }
 *     leaf short-reach-mode-is-avail {
 *         type short-reach-mode-is-avail;
 *     }
 *     leaf eee-is-avail {
 *         type eee-is-avail;
 *     }
 *     leaf unidirectional-operation-is-avail {
 *         type unidirectional-operation-is-avail;
 *     }
 *     leaf-list supported-alarms {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mau-type-g</i>
 *
 */
public interface MauTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "mau-type-g").intern();

    /**
     * 802.3 according to 30.5.1.1.1 aMAUIDUnique identifier of the Medium Attachment 
     * Unit (MAU) instance within the data about the device
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>mauId</code>, or <code>null</code> if not present
     */
    UniversalId getMauId();
    
    /**
     * SFF8472_SFF8636Kind of Medium Independent Interface (MII) provided by this 
     * Medium Attachment Unit (MAU) (e.g. SFP, moldered port)
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MiiKindType</code> <code>miiKind</code>, or <code>null</code> if not present
     */
    MiiKindType getMiiKind();
    
    /**
     * Kind of Medium Dependent Interface (MDI) provided by this Medium Attachment Unit
     * (MAU)
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MdiKindType</code> <code>mdiKind</code>, or <code>null</code> if not present
     */
    MdiKindType getMdiKind();
    
    /**
     * Kind of medium required for operating this Medium Attachment Unit (MAU), more 
     * like an information field
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MediumKindType</code> <code>requiredMediumKind</code>, or <code>null</code> if not present
     */
    MediumKindType getRequiredMediumKind();
    
    /**
     * SFF-8690Minimum laser wavelength in pico meter, -1 = not applicable, 0 = not 
     * known, wavelengthMax = wavelength cannot be configured; multiplicity=0..3 for 
     * 10GBASE-LX4 according to 802.3 53.5
     *
     *
     *
     * @return <code>java.util.List</code> <code>wavelengthMin</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getWavelengthMin();
    
    /**
     * Maximum laser wavelength in pico meter, -1 = not applicable, 0 = not known, 
     * wavelengthMin = wavelength cannot be configured; multiplicity=0..3 for 
     * 10GBASE-LX4 according to 802.3 53.5SFF-8690
     *
     *
     *
     * @return <code>java.util.List</code> <code>wavelengthMax</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getWavelengthMax();
    
    /**
     * Minimum grid spacing supported by the transceiver, -1 = not applicable, 0 = not 
     * knownSFF-8690
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>wavelengthGridMin</code>, or <code>null</code> if not present
     */
    java.lang.Integer getWavelengthGridMin();
    
    /**
     * Indicates the maximum link length that is supported by the transceiver on the 
     * medium, which is specified in the standard referenced in 
     * TypeDefinitions::phyType::phyKind.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>linkLengthMax</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLinkLengthMax();
    
    /**
     * Name of the vendor of the transceiverWill be moved to 
     * CoreModel::CorePhysicalModel-Initial::EquipmentDetail::ObjectClasses::InvariantDetails::ManufacturerProperties::manufacturerName
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendorName</code>, or <code>null</code> if not present
     */
    java.lang.String getVendorName();
    
    /**
     * Describes the IEEE Company identifier of the vendor of the transceiver (1st part
     * of 802.3 ResourceTypeID)802.3 22.2.4.3.1 PHY Identifier; also referenced in 
     * 45.2.1.13 PMA/PMD package identifierWill be moved to 
     * CoreModel::CorePhysicalModel-Initial::EquipmentDetail::ObjectClasses::InvariantDetails::ManufacturerProperties::manufacturerIdentifier
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendorOui</code>, or <code>null</code> if not present
     */
    java.lang.String getVendorOui();
    
    /**
     * 802.3 22.2.4.3.1 PHY Identifier; also referenced in 45.2.1.13 PMA/PMD package 
     * identifier as six bit model numberUniquely identifies the transceiver in the 
     * vendor's product listsWill be moved to 
     * CoreModel::CorePhysicalModel-Initial::EquipmentDetail::ObjectClasses::InvariantDetails::EquipmentType::partTypeIdentifier
     *
     *
     *
     * @return <code>java.lang.String</code> <code>partNumber</code>, or <code>null</code> if not present
     */
    java.lang.String getPartNumber();
    
    /**
     * Identifies the revision number of the transceiver (3rd part of 802.3 
     * ResourceTypeID)802.3 22.2.4.3.1 PHY Identifier; also referenced in 45.2.1.13 
     * PMA/PMD package identifier as four-bit revision numberWill be moved to 
     * CoreModel::CorePhysicalModel-Initial::EquipmentDetail::ObjectClasses::InvariantDetails::EquipmentType::version
     *
     *
     *
     * @return <code>java.lang.String</code> <code>revisionNumber</code>, or <code>null</code> if not present
     */
    java.lang.String getRevisionNumber();
    
    /**
     * Vendor's serial number for the transceiver. 0 = not applicableWill be moved to 
     * CoreModel::CorePhysicalModel-Initial::EquipmentDetail::ObjectClasses::InvariantDetails::EquipmentInstance::serialNumber
     *
     *
     *
     * @return <code>java.lang.String</code> <code>serialNumber</code>, or <code>null</code> if not present
     */
    java.lang.String getSerialNumber();
    
    /**
     * Vendor's date code for the transceiverWill be moved to 
     * CoreModel::CorePhysicalModel-Initial::EquipmentDetail::ObjectClasses::InvariantDetails::EquipmentInstance::manufactureDate
     *
     *
     *
     * @return <code>java.lang.String</code> <code>dateCode</code>, or <code>null</code> if not present
     */
    java.lang.String getDateCode();
    
    /**
     * List of Physical Medium Dependent (PMD) that can be operated*** In case ordering
     * of the signals depends on the PMD, pmdList has to be put into the datatype for 
     * the signal ordering ***
     *
     *
     *
     * @return <code>java.util.List</code> <code>pmdList</code>, or <code>null</code> if not present
     */
    List<PmdNameType> getPmdList();
    
    /**
     * Describes the different (e.g. MDI, MDI-X) ways of ordering the signals on the 
     * physical medium
     *
     *
     *
     * @return <code>java.util.List</code> <code>signalOrderingList</code>, or <code>null</code> if not present
     */
    List<SignalOrderingList> getSignalOrderingList();
    
    /**
     * 1 = there is a mechanism for automatically crossing over tx and rx implemented
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>autoSignalOrderingIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAutoSignalOrderingIsAvail();
    
    /**
     * 1 = Indicates that Short Reach Mode for 10GBASE-T according to 802.3 45.2.1.64 
     * is available
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>shortReachModeIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isShortReachModeIsAvail();
    
    /**
     * 1 = Indicates that Energy-Efficient Ethernet (EEE) is available at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>eeeIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEeeIsAvail();
    
    /**
     * 1 = Medium Attachment Unit (MAU) able to transmit from Media Independent 
     * Interface (MII) regardless of whether the MAU has determined that a valid link 
     * has been established, 0 = MAU able to transmit from MII only when the MAU has 
     * determined that a valid link has been established802.3
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>unidirectionalOperationIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isUnidirectionalOperationIsAvail();
    
    /**
     * MW IMAvailable alarms to be listed. Mandatory:'txFault', 'rxLos', 'tempHigh', 
     * 'tempLow', 'rxLevelHigh', 'rxLevelLow'. Optional:'vccHigh', 'vccLow', 
     * 'txBiasHigh', 'txBiasLow', 'txPowerHigh', 'txPowerLow', 'laserTempHigh', 
     * 'laserTempLow', 'tecCurrentHigh', 'tecCurrentLow'. Further alarms might be added
     * by the device. Names are to be separated by commas.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedAlarms</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getSupportedAlarms();

}

