package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerStatusG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container tdm-container-status {
 *     leaf last-status-change {
 *         type last-status-change;
 *     }
 *     uses tdm-container-status-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-tdm-container-pac/tdm-container-status</i>
 *
 * <p>To create instances of this class use {@link TdmContainerStatusBuilder}.
 * @see TdmContainerStatusBuilder
 *
 */
public interface TdmContainerStatus
    extends
    ChildOf<MwTdmContainerPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerStatus>,
    TdmContainerStatusG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "tdm-container-status").intern();


}

