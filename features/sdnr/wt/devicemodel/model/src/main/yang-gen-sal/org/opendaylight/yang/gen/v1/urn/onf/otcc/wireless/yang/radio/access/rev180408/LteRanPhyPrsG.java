package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains parameters relating to the PRS (Positioning Reference 
 * Signal) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.9}}).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-phy-prs-g {
 *     leaf num-prs-resource-blocks {
 *         type num-prs-resource-blocks;
 *     }
 *     leaf prs-configuration-index {
 *         type uint16;
 *     }
 *     leaf num-consecutive-prs-subfames {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-phy-prs-g</i>
 *
 */
public interface LteRanPhyPrsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-prs-g").intern();

    /**
     * Defines the number of RBs ({{units}}) used for PRS. Corresponds to the parameter
     * NRBPRS in {{bibref|3GPP-TS.36.211|Section 6.10.4.1}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numPrsResourceBlocks</code>, or <code>null</code> if not present
     */
    BigInteger getNumPrsResourceBlocks();
    
    /**
     * Corresponds to the PRS configuration index defined as parameter IPRS in 
     * {{bibref|3GPP-TS.36.211|Section 6.10.4.3 and Table 6.10.4.3.-1}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>prsConfigurationIndex</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPrsConfigurationIndex();
    
    /**
     * Defines the number of consecutive positioning sub-frames. Corresponds to the 
     * parameter NPRS in {{bibref|3GPP-TS.36.211|Section 6.10.4.3}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>numConsecutivePrsSubfames</code>, or <code>null</code> if not present
     */
    java.lang.Short getNumConsecutivePrsSubfames();

}

