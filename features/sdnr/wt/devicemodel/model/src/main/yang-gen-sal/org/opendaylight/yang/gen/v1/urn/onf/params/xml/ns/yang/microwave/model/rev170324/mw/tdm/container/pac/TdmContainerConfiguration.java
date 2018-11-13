package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.tdm.container.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwTdmContainerPac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.TdmContainerConfigurationG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container tdm-container-configuration {
 *     leaf container-id {
 *         type container-id;
 *     }
 *     container container-type {
 *         leaf tdm-container-name {
 *             type tdm-container-name;
 *         }
 *         leaf tdm-container-size {
 *             type tdm-container-size;
 *         }
 *         uses tdm-container-type-g;
 *     }
 *     container segment-id {
 *         leaf structure-id-ref {
 *             type universal-id;
 *         }
 *         leaf segment-id-ref {
 *             type int16;
 *         }
 *         uses segment-id-type-g;
 *     }
 *     list problem-kind-severity-list {
 *         key "problem-kind-name";
 *         leaf problem-kind-name {
 *             type problem-kind-name;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *         uses container-problem-severity-type-g;
 *     }
 *     uses tdm-container-configuration-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-tdm-container-pac/tdm-container-configuration</i>
 *
 * <p>To create instances of this class use {@link TdmContainerConfigurationBuilder}.
 * @see TdmContainerConfigurationBuilder
 *
 */
public interface TdmContainerConfiguration
    extends
    ChildOf<MwTdmContainerPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.tdm.container.pac.TdmContainerConfiguration>,
    TdmContainerConfigurationG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "tdm-container-configuration").intern();


}

