package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Consolidated performance information of the Container.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping container-performance-type-g {
 *     leaf tx-ethernet-bytes-max-s {
 *         type tx-ethernet-bytes-max-s;
 *     }
 *     leaf tx-ethernet-bytes-max-m {
 *         type tx-ethernet-bytes-max-m;
 *     }
 *     leaf tx-ethernet-bytes-sum {
 *         type tx-ethernet-bytes-sum;
 *     }
 *     leaf time-period {
 *         type time-period;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/container-performance-type-g</i>
 *
 */
public interface ContainerPerformanceTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "container-performance-type-g").intern();

    /**
     * Counts the number of Bytes of Ethernet traffic (before header compression) 
     * transmitted within a second and keeps the highest value within the measurement 
     * period. Field to be left blank for all types of TDM containers.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>txEthernetBytesMaxS</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTxEthernetBytesMaxS();
    
    /**
     * Counts the number of Bytes of Ethernet traffic (before header compression) 
     * transmitted within a minute and keeps the highest value with in the measurement 
     * period. Field to be left blank for all types of TDM containers.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>txEthernetBytesMaxM</code>, or <code>null</code> if not present
     */
    java.lang.Long getTxEthernetBytesMaxM();
    
    /**
     * Total number of Bytes of Ethernet traffic (before header compression) 
     * transmitted (in direction out of the device) during the measurement period. 
     * Field to be left blank for all types of TDM containers.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>txEthernetBytesSum</code>, or <code>null</code> if not present
     */
    java.lang.Long getTxEthernetBytesSum();
    
    /**
     * Total length of the measurement period in seconds.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>timePeriod</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTimePeriod();

}

