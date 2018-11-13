package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionCapabilityG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OduPayloadTypeG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * This attribute is applicable when the ODU CTP objectinstance represents a lower 
 * order ODU CTP Sink at theclient layer of the ODUP/ODU[i]j or ODUP/ODUj-21 
 * adaptationfunction.This attribute is a 2-digit Hex code that indicates the 
 * newaccepted payload type.Valid values are defined in Table 15-8 of 
 * ITU-TRecommendation G.709 with one additional valueUN_INTERPRETABLE.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-otn-odu-conditional-packages</b>
 * <pre>
 * container accepted-payload-type {
 *     leaf named-payload-type {
 *         type odu-named-payload-type;
 *     }
 *     leaf hex-payload-type {
 *         type uint64;
 *     }
 *     uses odu-payload-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-otn-odu-conditional-packages/otn-odu-connection-capability-g/accepted-payload-type</i>
 *
 * <p>To create instances of this class use {@link AcceptedPayloadTypeBuilder}.
 * @see AcceptedPayloadTypeBuilder
 *
 */
public interface AcceptedPayloadType
    extends
    ChildOf<OtnOduConnectionCapabilityG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>,
    OduPayloadTypeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-otn-odu-conditional-packages",
        "2017-10-20", "accepted-payload-type").intern();


}

