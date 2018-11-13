package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object is applicable to TDD mode only. This object contains parameters 
 * relating to the TDD frame structure configuration (see 
 * {{bibref|3GPP-TS.32.592|Section 6.1.1.10}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-phy-tdd-frame-g {
 *     leaf sub-frame-assignment {
 *         type uint8;
 *     }
 *     leaf special-subframe-patterns {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-phy-tdd-frame-g</i>
 *
 */
public interface LteRanPhyTddFrameG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-tdd-frame-g").intern();

    /**
     * Defines the DL/UL sub-frame configuration. Corresponds to subframAssignment 
     * specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and 
     * {{bibref|3GPP-TS.36.211|Table 4.2.2}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>subFrameAssignment</code>, or <code>null</code> if not present
     */
    java.lang.Short getSubFrameAssignment();
    
    /**
     * Defines the configuration of the special sub-frame that contains the guard 
     * period between the downlink and uplink transmissions. Corresponds to the 
     * specialSubframePatterns specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and
     * {{bibref|3GPP-TS.36.211|Table 4.2.1}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>specialSubframePatterns</code>, or <code>null</code> if not present
     */
    java.lang.Short getSpecialSubframePatterns();

}

