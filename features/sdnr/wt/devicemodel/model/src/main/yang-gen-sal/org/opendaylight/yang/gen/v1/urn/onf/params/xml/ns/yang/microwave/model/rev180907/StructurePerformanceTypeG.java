package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Consolidated performance information of the Structure.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping structure-performance-type-g {
 *     leaf time-period {
 *         type time-period;
 *     }
 *     leaf es {
 *         type es;
 *     }
 *     leaf ses {
 *         type ses;
 *     }
 *     leaf cses {
 *         type cses;
 *     }
 *     leaf unavailability {
 *         type unavailability;
 *     }
 *     leaf rx-level-min {
 *         type rx-level-min;
 *     }
 *     leaf rx-level-max {
 *         type rx-level-max;
 *     }
 *     leaf rx-level-avg {
 *         type rx-level-avg;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/structure-performance-type-g</i>
 *
 */
public interface StructurePerformanceTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "structure-performance-type-g").intern();

    /**
     * Total length of the measurement period in seconds.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timePeriod</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimePeriod();
    
    /**
     * Number of errored seconds. 1+0: Same value as for single air interface. 1+1 and 
     * Diversity: Value representing the combined signals.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>es</code>, or <code>null</code> if not present
     */
    java.lang.Integer getEs();
    
    /**
     * Number of severely errored seconds. 1+0: Same value as for single air interface.
     * 1+1 and Diversity: Value representing the combined signals.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>ses</code>, or <code>null</code> if not present
     */
    java.lang.Integer getSes();
    
    /**
     * Number of consecutive severely errored seconds. 1+0: Same value as for single 
     * air interface. 1+1 and Diversity: Value representing the combined signals.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>cses</code>, or <code>null</code> if not present
     */
    java.lang.Integer getCses();
    
    /**
     * Total time of unavailability in seconds. 1+0: Same value as for single air 
     * interface. 1+1 and Diversity: Value representing the combined signals.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>unavailability</code>, or <code>null</code> if not present
     */
    java.lang.Integer getUnavailability();
    
    /**
     * Minimum receive level. 1+0: Same value as for single air interface. 1+1: Value 
     * representing the combined signals. Diversity: To be left on default value.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>rxLevelMin</code>, or <code>null</code> if not present
     */
    java.lang.Byte getRxLevelMin();
    
    /**
     * Maximum receive level. 1+0: Same value as for single air interface. 1+1: Value 
     * representing the combined signals. Diversity: To be left on default value.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>rxLevelMax</code>, or <code>null</code> if not present
     */
    java.lang.Byte getRxLevelMax();
    
    /**
     * Averaged receive level. 1+0: Same value as for single air interface. 1+1: Value 
     * representing the combined signals. Diversity: To be left on default value.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>rxLevelAvg</code>, or <code>null</code> if not present
     */
    java.lang.Byte getRxLevelAvg();

}

