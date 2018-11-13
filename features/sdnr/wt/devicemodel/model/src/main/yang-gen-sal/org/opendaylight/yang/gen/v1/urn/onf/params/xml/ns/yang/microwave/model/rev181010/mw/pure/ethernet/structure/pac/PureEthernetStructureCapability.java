package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.PureEthernetStructureCapabilityG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwPureEthernetStructurePac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container pure-ethernet-structure-capability {
 *     leaf structure-id {
 *         type universal-id;
 *     }
 *     leaf-list supported-alarm-list {
 *         type string;
 *     }
 *     leaf supported-alarms {
 *         type supported-alarms;
 *         status DEPRECATED;
 *     }
 *     uses pure-ethernet-structure-capability-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-pure-ethernet-structure-pac/pure-ethernet-structure-capability</i>
 *
 * <p>To create instances of this class use {@link PureEthernetStructureCapabilityBuilder}.
 * @see PureEthernetStructureCapabilityBuilder
 *
 */
public interface PureEthernetStructureCapability
    extends
    ChildOf<MwPureEthernetStructurePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureCapability>,
    PureEthernetStructureCapabilityG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "pure-ethernet-structure-capability").intern();


}

