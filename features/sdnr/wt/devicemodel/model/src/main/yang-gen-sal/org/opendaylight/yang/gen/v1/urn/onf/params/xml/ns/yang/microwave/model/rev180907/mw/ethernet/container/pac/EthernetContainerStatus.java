package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerStatusG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container ethernet-container-status {
 *     leaf last-status-change {
 *         type last-status-change;
 *     }
 *     uses ethernet-container-status-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-ethernet-container-pac/ethernet-container-status</i>
 *
 * <p>To create instances of this class use {@link EthernetContainerStatusBuilder}.
 * @see EthernetContainerStatusBuilder
 *
 */
public interface EthernetContainerStatus
    extends
    ChildOf<MwEthernetContainerPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerStatus>,
    EthernetContainerStatusG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "ethernet-container-status").intern();


}

