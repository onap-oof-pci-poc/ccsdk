package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping diversity-type-g {
 *     leaf diversity-name {
 *         type string;
 *     }
 *     leaf number-of-air-interfaces-max {
 *         type number-of-air-interfaces-max;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/diversity-type-g</i>
 *
 */
public interface DiversityTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "diversity-type-g").intern();

    /**
     * Names to be chosen from the following list: 'spaceDiversity', 
     * 'frequencyDiversity'
     *
     *
     *
     * @return <code>java.lang.String</code> <code>diversityName</code>, or <code>null</code> if not present
     */
    java.lang.String getDiversityName();
    
    /**
     * Maximum number of air interfaces that could be part of this kind of diversity.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>numberOfAirInterfacesMax</code>, or <code>null</code> if not present
     */
    java.lang.Byte getNumberOfAirInterfacesMax();

}

