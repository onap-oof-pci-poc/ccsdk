package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.security;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSecuritySecretG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSecurity;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.Transport.Security.Secret.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list transport-security-secret {
 *     key "uicc-card-id";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf type {
 *         type enumeration;
 *     }
 *     leaf status {
 *         type enumeration;
 *     }
 *     leaf uicc-card-id {
 *         type string;
 *     }
 *     uses transport-security-secret-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/transport/transport-security/transport-security-secret</i>
 *
 * <p>To create instances of this class use {@link TransportSecuritySecretBuilder}.
 * @see TransportSecuritySecretBuilder
 * @see TransportSecuritySecretKey
 *
 */
public interface TransportSecuritySecret
    extends
    ChildOf<TransportSecurity>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.security.TransportSecuritySecret>,
    TransportSecuritySecretG,
    Identifiable<TransportSecuritySecretKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport-security-secret").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.security.TransportSecuritySecretKey</code> <code>key</code>, or <code>null</code> if not present
     */
    TransportSecuritySecretKey getKey();

}

