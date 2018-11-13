package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping container-type-g {
 *     leaf container-name {
 *         type string;
 *     }
 *     leaf number-of-time-slots-required {
 *         type number-of-time-slots-required;
 *     }
 *     leaf tdm-time-slots-is-required {
 *         type tdm-time-slots-is-required;
 *     }
 *     leaf bundling-is-avail {
 *         type bundling-is-avail;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/container-type-g</i>
 *
 */
public interface ContainerTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "container-type-g").intern();

    /**
     * Names to be chosen from the following list: 
     * 'ethernet','e1','t1','j1','e3','ds3','stm1','cpri1','cpri2','cpri3','cpri4','cpri5','cpri6'
     * or 'cpri7'
     *
     *
     *
     * @return <code>java.lang.String</code> <code>containerName</code>, or <code>null</code> if not present
     */
    java.lang.String getContainerName();
    
    /**
     * Number of time slots required for transporting this type of container. Value 
     * must be calculated by the vendor after defining the timeSlotCapacity. For 
     * containers of fixed size: numberOfTimeSlotsRequired = required bandwidth of the 
     * container divided by timeSlotCapacity. For containers of variable size the 
     * minimum (most probably 1) is to be stated.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>numberOfTimeSlotsRequired</code>, or <code>null</code> if not present
     */
    java.lang.Short getNumberOfTimeSlotsRequired();
    
    /**
     * Shall be set to '1', if this container type requires bandwidth (times slots) 
     * reserved for TDM transport.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>tdmTimeSlotsIsRequired</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isTdmTimeSlotsIsRequired();
    
    /**
     * If it is possible to combine transport resources of several radio links to 
     * transport this container type, this attribute shall be set to '1'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>bundlingIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isBundlingIsAvail();

}

