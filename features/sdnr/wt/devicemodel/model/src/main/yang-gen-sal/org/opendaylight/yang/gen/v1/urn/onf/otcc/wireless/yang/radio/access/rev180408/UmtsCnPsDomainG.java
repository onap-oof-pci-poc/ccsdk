package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to configuring the PS domain of the 
 * UMTS CN.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-cn-ps-domain-g {
 *     leaf network-mode-operation-combined {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-cn-ps-domain-g</i>
 *
 */
public interface UmtsCnPsDomainG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-cn-ps-domain-g").intern();

    /**
     * Network Mode of Operation of the CN. {{bibref|3GPP-TS.23.060}} 
     * {{bibref|3GPP-TS.24.008}} If {{true}} (Network Mode of Operation II) Combined 
     * procedures between CS and PS domain are not supported (i.e. Gs interface is not 
     * present). If {{false}} (Network Mode of Operation I) Combined procedures between
     * CS and PS domain are supported (i.e. Gs interface is present).
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>networkModeOperationCombined</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isNetworkModeOperationCombined();

}

