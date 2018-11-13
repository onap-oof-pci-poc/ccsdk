package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.tdm.container.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TdmContainerCapabilityG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwTdmContainerPac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container tdm-container-capability {
 *     list supported-tdm-container-types-list {
 *         key "tdm-container-name";
 *         leaf tdm-container-name {
 *             type tdm-container-name;
 *         }
 *         leaf tdm-container-size {
 *             type tdm-container-size;
 *         }
 *         uses tdm-container-type-g;
 *     }
 *     leaf supported-alarms {
 *         type supported-alarms;
 *     }
 *     uses tdm-container-capability-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-tdm-container-pac/tdm-container-capability</i>
 *
 * <p>To create instances of this class use {@link TdmContainerCapabilityBuilder}.
 * @see TdmContainerCapabilityBuilder
 *
 */
public interface TdmContainerCapability
    extends
    ChildOf<MwTdmContainerPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.tdm.container.pac.TdmContainerCapability>,
    TdmContainerCapabilityG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "tdm-container-capability").intern();


}

