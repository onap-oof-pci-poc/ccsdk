package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping time-x-states-type-g {
 *     leaf transmission-mode {
 *         type leafref;
 *     }
 *     leaf time {
 *         type time;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/time-x-states-type-g</i>
 *
 */
public interface TimeXStatesTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "time-x-states-type-g").intern();

    /**
     * Operated transmission mode.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>transmissionMode</code>, or <code>null</code> if not present
     */
    UniversalId getTransmissionMode();
    
    /**
     * Sum of all seconds the transmitter operated the transmission mode.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>time</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTime();

}

