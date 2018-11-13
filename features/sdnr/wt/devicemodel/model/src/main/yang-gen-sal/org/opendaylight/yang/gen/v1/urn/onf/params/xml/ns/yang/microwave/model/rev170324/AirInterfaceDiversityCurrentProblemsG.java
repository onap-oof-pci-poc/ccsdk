package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.current.problems.g.CurrentProblemList;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping air-interface-diversity-current-problems-g {
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
 *         uses air-interface-diversity-current-problem-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-diversity-current-problems-g</i>
 *
 */
public interface AirInterfaceDiversityCurrentProblemsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "air-interface-diversity-current-problems-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>currentProblemList</code>, or <code>null</code> if not present
     */
    List<CurrentProblemList> getCurrentProblemList();

}

