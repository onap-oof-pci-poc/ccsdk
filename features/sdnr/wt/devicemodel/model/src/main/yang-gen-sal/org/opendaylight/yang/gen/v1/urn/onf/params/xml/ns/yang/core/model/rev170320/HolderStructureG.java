package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping holder-structure-g {
 *     leaf holder-category {
 *         type holder-category;
 *     }
 *     leaf is-captive {
 *         type boolean;
 *     }
 *     leaf is-guided {
 *         type boolean;
 *     }
 *     leaf is-quantized-space {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/holder-structure-g</i>
 *
 */
public interface HolderStructureG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "holder-structure-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderCategory</code> <code>holderCategory</code>, or <code>null</code> if not present
     */
    HolderCategory getHolderCategory();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isCaptive</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsCaptive();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isGuided</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsGuided();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isQuantizedSpace</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsQuantizedSpace();

}

