package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.current.problems.g.CurrentProblemList;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping air-interface-current-problems-g {
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
 *         uses air-interface-current-problem-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-current-problems-g</i>
 *
 */
public interface AirInterfaceCurrentProblemsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "air-interface-current-problems-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>currentProblemList</code>, or <code>null</code> if not present
     */
    List<CurrentProblemList> getCurrentProblemList();

}

