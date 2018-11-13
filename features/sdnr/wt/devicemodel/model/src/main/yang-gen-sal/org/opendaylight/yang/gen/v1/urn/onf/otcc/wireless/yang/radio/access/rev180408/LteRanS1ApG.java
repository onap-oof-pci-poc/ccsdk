package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * This object contains parameters relating to the S1AP configuration.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping lte-ran-s1-ap-g {
 *     leaf-list t-reloc-prep {
 *         type string;
 *     }
 *     leaf-list t-reloc-overall {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/lte-ran-s1-ap-g</i>
 *
 */
public interface LteRanS1ApG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-s1-ap-g").intern();

    /**
     * {{list}} Each item is a maximum time for the Handover Preparation procedure in 
     * the source LTE FAP, specified in seconds, with a numeric range between 0 and 300
     * inclusive. Only values in multiple of 5 are valid; use of other values within 
     * the defined range MUST be rejected by the CPE. In case there is more than one 
     * item in the list, the first item contains the most preferred value. The value of
     * {{param}} divided by 10 yields the actual value. The timer is started when the 
     * LTE FAP sends the HANDOVER REQUIRED message. Upon reception of the HANDOVER 
     * COMMAND message the LTE FAP shall stop the timer. Corresponds to parameter 
     * TS1RELOCprep defined in {{bibref|3GPP-TS.36.413|Section 8.4.1.2}}. The 
     * multiplicity of the {{param}} values can also be expressed by defining a range 
     * using ".." (two periods) between two values. In this case, the combination of 
     * two values defines the lower-bound and upper-bound of the range inclusive. If 
     * this notation is used, then the list contains at least 2 items: 
     * "&amp;lt;preferred-value&amp;gt;,&amp;lt;lower-bound&amp;gt;..&amp;lt;upper-bound&amp;gt;".
     * If the LTE FAP supports self-configuration capability for {{param}} and more 
     * than one item is configured, then the LTE FAP is expected to select one from the
     * list and overwrite this parameter containing only the one selected. If the LTE 
     * FAP does not support self-configuration capability for {{param}} and more than 
     * one item is configured, then the LTE FAP accepts the first value and ignore the 
     * rest. If only one item is configured regardless of the self-configuration 
     * capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by
     * the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>tRelocPrep</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getTRelocPrep();
    
    /**
     * {{list}} Each item is a maximum time for the protection of the overall handover 
     * procedure in the source LTE FAP, specified in seconds, with a numeric range 
     * between 0 and 300 inclusive. Only values in multiple of 5 are valid; use of 
     * other values within the defined range MUST be rejected by the CPE. In case there
     * is more than one item in the list, the first item contains the most preferred 
     * value. The value of {{param}} divided by 10 yields the actual value. The timer 
     * is started reception of the HANDOVER COMMAND message. Corresponds to parameter 
     * TS1RELOCOverall defined in {{bibref|3GPP-TS.36.413|Section 8.4.1.2}}. The 
     * multiplicity of the {{param}} values can also be expressed by defining a range 
     * using ".." (two periods) between two values. In this case, the combination of 
     * two values defines the lower-bound and upper-bound of the range inclusive. If 
     * this notation is used, then the list contains at least 2 items: 
     * "&amp;lt;preferred-value&amp;gt;,&amp;lt;lower-bound&amp;gt;..&amp;lt;upper-bound&amp;gt;".
     * If LTE FAP supports self-configuration capability for {{param}} and more than 
     * one item is configured, then LTE FAP is expected to select one from the list and
     * overwrite this parameter containing only the one selected. If LTE FAP does not 
     * support self-configuration capability for {{param}} and more than one item is 
     * configured, then LTE FAP accepts the first value and ignore the rest. If only 
     * one item is configured regardless of the self-configuration capability of LTE 
     * FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>tRelocOverall</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getTRelocOverall();

}

