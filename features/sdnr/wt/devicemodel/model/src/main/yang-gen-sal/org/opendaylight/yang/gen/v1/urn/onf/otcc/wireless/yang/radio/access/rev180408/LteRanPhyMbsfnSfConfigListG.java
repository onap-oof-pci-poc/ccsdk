package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the sub-frame that are reserved for 
 * MBSFN (Multimedia Broadcast multicast service Single Frequency Network) in 
 * downlink direction. For FDD mode, only one entry can exist in this table. For 
 * TDD mode, at most one entry can exist with a given value of stratumID (see 
 * {{bibref|3GPP-TS.32.592|Section 6.1.1.8}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-phy-mbsfn-sf-config-list-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf sync-stratum-id {
 *         type uint8;
 *     }
 *     leaf radio-frame-allocation-period {
 *         type uint8;
 *     }
 *     leaf radioframe-allocation-offset {
 *         type uint8;
 *     }
 *     leaf radio-frame-allocation-size {
 *         type uint8;
 *     }
 *     leaf-list sub-frame-allocations {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-phy-mbsfn-sf-config-list-g</i>
 *
 */
public interface LteRanPhyMbsfnSfConfigListG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-mbsfn-sf-config-list-g").intern();

    /**
     * Enables or disables this entry.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnable();
    
    /**
     * {{datatype|expand}}
     *
     *
     *
     * @return <code>java.lang.String</code> <code>alias</code>, or <code>null</code> if not present
     */
    java.lang.String getAlias();
    
    /**
     * This parameter is applicable to TDD mode only. Defines the synchronization 
     * stratum level to which the MBSFN configuration applies.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>syncStratumId</code>, or <code>null</code> if not present
     */
    java.lang.Short getSyncStratumId();
    
    /**
     * Defines the period where MBSFN sub-frames occur in the radio frames. Radio 
     * frames contain MBSFN sub-frame when the following condition is met: ((SFN mod 
     * {{param}}) = {{param|RadioframeAllocationOffset}}). The value of 1 and 2 are 
     * only meaningful when the value of {{param|RadioFrameAllocationSize}} parameter 
     * is 1. Corresponds to radioFrameAllocationPeriod IE specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>radioFrameAllocationPeriod</code>, or <code>null</code> if not present
     */
    java.lang.Short getRadioFrameAllocationPeriod();
    
    /**
     * Defines the offset where MBSFN sub-frames occur in the radio frames. Radio 
     * frames contain MBSFN sub-frame when the following condition is met: ((SFN mod 
     * {{param|RadioFrameAllocationPeriod}}) = {{param}}). Corresponds to 
     * radioFrameAllocationOffset IE specified in {{bibref|3GPP-TS.36.331|Section 
     * 6.3.1}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>radioframeAllocationOffset</code>, or <code>null</code> if not present
     */
    java.lang.Short getRadioframeAllocationOffset();
    
    /**
     * Defines the number of connsecutive frames that the MBSFN allocation pertains to 
     * defined by the combination of {{param|RadioFrameAllocationPeriod}} and 
     * {{param|RadioframeAllocationOffset}} parameters.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>radioFrameAllocationSize</code>, or <code>null</code> if not present
     */
    java.lang.Short getRadioFrameAllocationSize();
    
    /**
     * {{list}} The value of "1" indicates the position of sub-frames that is allocated
     * to MBSFN within the radio frame. First item defines the MBSFN allocation for 
     * sub-frame #1, second item for #2, third item for #3, fourth item for #6, fifth 
     * item for #7, sixth item for #8. If the value of 
     * {{param|RadioFrameAllocationSize}} is 4, then this pattern repeats in the 
     * sequence of the four radio frames. The actual size of this parameter depends on 
     * the value of {{param|RadioFrameAllocationSize}} parameter. If the value of 
     * {{param|RadioFrameAllocationSize}} is 1, then the size of this parameter is 6; 
     * if the size {{param|RadioFrameAllocationSize}} is 4, then the size of this 
     * parameter is 24. Corresponds to subframeAllocation IE specified in 
     * {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>subFrameAllocations</code>, or <code>null</code> if not present
     */
    List<java.lang.Short> getSubFrameAllocations();

}

