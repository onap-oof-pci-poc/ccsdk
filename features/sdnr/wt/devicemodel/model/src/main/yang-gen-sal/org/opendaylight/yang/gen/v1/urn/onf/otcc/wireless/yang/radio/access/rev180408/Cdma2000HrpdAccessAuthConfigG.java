package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * HRPD A12-related service stats.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-hrpd-access-auth-config-g {
 *     leaf a12-access-authentication-enable {
 *         type int64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-hrpd-access-auth-config-g</i>
 *
 */
public interface Cdma2000HrpdAccessAuthConfigG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-access-auth-config-g").intern();

    /**
     * Flag to enable/Disable HRPD Access Authentication. {{true}} - Enabled, {{false}}
     * - Disabled.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>a12AccessAuthenticationEnable</code>, or <code>null</code> if not present
     */
    java.lang.Long getA12AccessAuthenticationEnable();

}

