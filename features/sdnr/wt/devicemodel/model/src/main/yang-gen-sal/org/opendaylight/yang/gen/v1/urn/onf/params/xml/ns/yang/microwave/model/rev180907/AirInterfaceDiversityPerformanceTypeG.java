package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Consolidated performance information of the air interface diversity group.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping air-interface-diversity-performance-type-g {
 *     leaf snir-min {
 *         type snir-min;
 *     }
 *     leaf snir-max {
 *         type snir-max;
 *     }
 *     leaf snir-avg {
 *         type snir-avg;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-diversity-performance-type-g</i>
 *
 */
public interface AirInterfaceDiversityPerformanceTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "air-interface-diversity-performance-type-g").intern();

    /**
     * Minimum signal to (noise+interference) ratio of the combined signals.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>snirMin</code>, or <code>null</code> if not present
     */
    java.lang.Byte getSnirMin();
    
    /**
     * Maximum signal to (noise+interference) ratio of the combined signals.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>snirMax</code>, or <code>null</code> if not present
     */
    java.lang.Byte getSnirMax();
    
    /**
     * Average signal to (noise+interference) ratio of the combined signals.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>snirAvg</code>, or <code>null</code> if not present
     */
    java.lang.Byte getSnirAvg();

}

