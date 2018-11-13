package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping holder-monitors-g {
 *     leaf is-active {
 *         type boolean;
 *     }
 *     leaf is-actual-mismatch-with-expected {
 *         type boolean;
 *     }
 *     leaf aggregate-function {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/holder-monitors-g</i>
 *
 */
public interface HolderMonitorsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "holder-monitors-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isActive</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsActive();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isActualMismatchWithExpected</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsActualMismatchWithExpected();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.String</code> <code>aggregateFunction</code>, or <code>null</code> if not present
     */
    java.lang.String getAggregateFunction();

}

