package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.security.TransportSecuritySecret;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSecurityG;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.Transport.Security.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container transport-security {
 *     leaf secret-number-of-entries {
 *         type uint64;
 *     }
 *     list transport-security-secret {
 *         key "uicc-card-id";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf type {
 *             type enumeration;
 *         }
 *         leaf status {
 *             type enumeration;
 *         }
 *         leaf uicc-card-id {
 *             type string;
 *         }
 *         uses transport-security-secret-g;
 *     }
 *     uses transport-security-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/transport/transport-security</i>
 *
 * <p>To create instances of this class use {@link TransportSecurityBuilder}.
 * @see TransportSecurityBuilder
 *
 */
public interface TransportSecurity
    extends
    ChildOf<Transport>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSecurity>,
    TransportSecurityG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport-security").intern();

    /**
     * List of object class FAPService.{i}.Transport.Security.Secret.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>transportSecuritySecret</code>, or <code>null</code> if not present
     */
    List<TransportSecuritySecret> getTransportSecuritySecret();

}

