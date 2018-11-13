package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationalState;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping segment-status-type-g {
 *     leaf segment-status-type-id {
 *         type int16;
 *     }
 *     leaf segment-is-reserved-for-tdm {
 *         type segment-is-reserved-for-tdm;
 *     }
 *     leaf operational-status {
 *         type operational-status;
 *     }
 *     leaf obsolete-priority-class {
 *         type obsolete-priority-class;
 *     }
 *     leaf obsolete-drop-order-rank {
 *         type obsolete-drop-order-rank;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/segment-status-type-g</i>
 *
 */
public interface SegmentStatusTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "segment-status-type-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>segmentStatusTypeId</code>, or <code>null</code> if not present
     */
    java.lang.Short getSegmentStatusTypeId();
    
    /**
     * The number of segments, which is configured by 
     * Structure::StructureConfiguration::tdmReservedNumberOfSegements, has to be 
     * reserved for TDM. Starting from the lowest index value, these segments have to 
     * be marked with a 'true' in segmentIsReservedForTdm.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>segmentIsReservedForTdm</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isSegmentIsReservedForTdm();
    
    /**
     * Current operational status of each segment.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationalState</code> <code>operationalStatus</code>, or <code>null</code> if not present
     */
    OperationalState getOperationalStatus();
    
    /**
     * PriorityClass as inherited from the associated 
     * Container::ContainerConfiguration::priorityClass. In case the device is capable 
     * of adapting the sequence, in which segments are being dropped in case of 
     * decreasing capacity of the air interface, priorityClass shall be considered, 
     * while calculating the dropOrderRank.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>obsoletePriorityClass</code>, or <code>null</code> if not present
     */
    java.lang.Byte getObsoletePriorityClass();
    
    /**
     * In case the device is NOT capable of adapting the sequence, in which segments 
     * are being dropped in case of decreasing capacity of the air interface, 
     * dropOrderRank is number of segments minus sequence number of the segment. In 
     * case the device is capable of adapting the sequence, dropOrderRank has to be 
     * calculated by the device in dependency to the assigned priorityClass._unique: 
     * within Structure::StructureStatus::segmentStatusList
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>obsoleteDropOrderRank</code>, or <code>null</code> if not present
     */
    java.lang.Short getObsoleteDropOrderRank();

}

