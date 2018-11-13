package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.TdmContainerCurrentProblemsG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwTdmContainerPac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container tdm-container-current-problems {
 *     list current-problem-list {
 *         key "sequence-number";
 *         leaf problem-name {
 *             type problem-name;
 *         }
 *         leaf sequence-number {
 *             type int32;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf problem-severity {
 *             type problem-severity;
 *         }
 *         uses container-current-problem-type-g;
 *     }
 *     uses tdm-container-current-problems-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-tdm-container-pac/tdm-container-current-problems</i>
 *
 * <p>To create instances of this class use {@link TdmContainerCurrentProblemsBuilder}.
 * @see TdmContainerCurrentProblemsBuilder
 *
 */
public interface TdmContainerCurrentProblems
    extends
    ChildOf<MwTdmContainerPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerCurrentProblems>,
    TdmContainerCurrentProblemsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "tdm-container-current-problems").intern();


}

