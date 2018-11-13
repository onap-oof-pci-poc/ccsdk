package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-otn-odu-conditional-packages</b>
 * <pre>
 * grouping otn-odu-termination-configuration-g {
 *     leaf odu-type {
 *         type odu-type;
 *     }
 *     leaf odu-rate {
 *         type uint64;
 *     }
 *     leaf odu-rate-tolerance {
 *         type odu-rate-tolerance;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-otn-odu-conditional-packages/otn-odu-termination-configuration-g</i>
 *
 */
public interface OtnOduTerminationConfigurationG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-otn-odu-conditional-packages",
        "2017-10-20", "otn-odu-termination-configuration-g").intern();

    /**
     * This attribute specifies the type of the ODUtermination point.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OduType</code> <code>oduType</code>, or <code>null</code> if not present
     */
    OduType getOduType();
    
    /**
     * This attribute indicates the rate of the ODUterminatinon point.This attribute is
     * Set at create; i.e., once createdit cannot be changed directly.In case of 
     * resizable ODU flex, its value can bechanged via HAO (not directly on the 
     * attribute).
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>oduRate</code>, or <code>null</code> if not present
     */
    BigInteger getOduRate();
    
    /**
     * This attribute indicates the rate tolerance of theODU termination point.Valid 
     * values are real value in the unit of ppm.Standardized values are defined in 
     * Table 7-2/G.709.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>oduRateTolerance</code>, or <code>null</code> if not present
     */
    BigInteger getOduRateTolerance();

}

