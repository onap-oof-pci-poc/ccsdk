package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * Old Local IP access object, included on special request.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping access-mgmt-legacy-local-ip-access-g {
 *     leaf enable {
 *         type enable;
 *     }
 *     leaf max-rules-entries {
 *         type uint64;
 *     }
 *     leaf rule-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/access-mgmt-legacy-local-ip-access-g</i>
 *
 */
public interface AccessMgmtLegacyLocalIpAccessG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-legacy-local-ip-access-g").intern();

    /**
     * Enables/disables the Local IP Access (LIPA) functionality.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnable();
    
    /**
     * The maximum number of entries available in the 
     * {{object|.AccessMgmt.Legacy.LocalIPAccess.Rule.{i}.}} table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxRulesEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxRulesEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>ruleNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getRuleNumberOfEntries();

}

