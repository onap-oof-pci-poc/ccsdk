package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to the ULRS (Uplink Reference Signal) 
 * of PUSCH (Physical Uplink Shared Channel) configuration (see 
 * {{bibref|3GPP-TS.32.592|Section 6.1.1.6.1}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-phy-pusch-ulrs-g {
 *     leaf group-hopping-enabled {
 *         type boolean;
 *     }
 *     leaf group-assignment-pusch {
 *         type uint8;
 *     }
 *     leaf sequence-hopping-enabled {
 *         type boolean;
 *     }
 *     leaf cyclic-shift {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-phy-pusch-ulrs-g</i>
 *
 */
public interface LteRanPhyPuschUlrsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-pusch-ulrs-g").intern();

    /**
     * Indicates whether group hopping is enabled or not. If {{true}}, group hopping is
     * enabled. If {{false}}, group hopping is not enabled. Corresponds to 
     * groupHoppingEnabled parameter specified in {{bibref|3GPP-TS.36.331|Section 
     * 6.3.2}}.and in {{bibref|3GPP-TS.36.211|Section 5.5.1.3}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>groupHoppingEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isGroupHoppingEnabled();
    
    /**
     * Corresponds to parameter groupAssignmentPUSCH specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>groupAssignmentPusch</code>, or <code>null</code> if not present
     */
    java.lang.Short getGroupAssignmentPusch();
    
    /**
     * Indicates whether sequence hopping is enabled or not. If {{true}}, sequence 
     * hopping is enabled. If {{false}}, sequence hopping is not enabled. Corresponds 
     * to sequenceHoppingEnabled parameter specified in {{bibref|3GPP-TS.36.331|Section
     * 6.3.2}}.and in {{bibref|3GPP-TS.36.211|Section 5.5.1.4}}.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>sequenceHoppingEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isSequenceHoppingEnabled();
    
    /**
     * Corresponds to parameter cyclcShift specified in {{bibref|3GPP-TS.36.331|Section
     * 6.3.2}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>cyclicShift</code>, or <code>null</code> if not present
     */
    java.lang.Short getCyclicShift();

}

