package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-otn-odu-conditional-packages</b>
 * <pre>
 * grouping odu-payload-type-g {
 *     leaf named-payload-type {
 *         type odu-named-payload-type;
 *     }
 *     leaf hex-payload-type {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-otn-odu-conditional-packages/odu-payload-type-g</i>
 *
 */
public interface OduPayloadTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-otn-odu-conditional-packages",
        "2017-10-20", "odu-payload-type-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OduNamedPayloadType</code> <code>namedPayloadType</code>, or <code>null</code> if not present
     */
    OduNamedPayloadType getNamedPayloadType();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>hexPayloadType</code>, or <code>null</code> if not present
     */
    BigInteger getHexPayloadType();

}

