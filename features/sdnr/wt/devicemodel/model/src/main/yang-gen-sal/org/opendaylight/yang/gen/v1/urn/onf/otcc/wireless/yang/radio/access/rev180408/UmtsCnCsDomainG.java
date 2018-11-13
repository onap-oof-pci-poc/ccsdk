package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters relating to configuring the CS domain of the 
 * UMTS CN.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-cn-cs-domain-g {
 *     leaf t3212 {
 *         type t3212;
 *     }
 *     leaf imsi-attach-detach-enable {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-cn-cs-domain-g</i>
 *
 */
public interface UmtsCnCsDomainG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-cn-cs-domain-g").intern();

    /**
     * T3212 timeout value specified in {{units}} {{bibref|3GPP-TS.24.008|section 
     * 10.5.1.12.2}}. The values are implemented by steps of 360 {{units}}, which 
     * aligns with values in decihours in {{bibref|3GPP-TS.24.008}}. The value of 0 is 
     * used for infinite timeout value i.e. periodic updating shall not be used.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>t3212</code>, or <code>null</code> if not present
     */
    java.lang.Long getT3212();
    
    /**
     * Indicates the UE behavior regarding IMSI attach/detach procedure to the CN 
     * {{bibref|3GPP-TS.24.008}}. If {{true}} UE SHALL apply IMSI attach and detach 
     * procedure If {{false}} UE SHALL NOT apply IMSI attach and detach procedure
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>imsiAttachDetachEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isImsiAttachDetachEnable();

}

