package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208._default.ds.entry.ClockQuality;

/**
 * Collection of members of the default data set.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * grouping default-ds-entry {
 *     leaf two-step-flag {
 *         type boolean;
 *     }
 *     leaf clock-identity {
 *         type clock-identity-type;
 *     }
 *     leaf number-ports {
 *         type uint16;
 *     }
 *     container clock-quality {
 *         leaf clock-class {
 *             type clock-class;
 *         }
 *         leaf clock-accuracy {
 *             type uint8;
 *         }
 *         leaf offset-scaled-log-variance {
 *             type uint16;
 *         }
 *         uses clock-quality-grouping;
 *     }
 *     leaf priority1 {
 *         type uint8;
 *     }
 *     leaf priority2 {
 *         type uint8;
 *     }
 *     leaf domain-number {
 *         type uint8;
 *     }
 *     leaf slave-only {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/default-ds-entry</i>
 *
 */
public interface DefaultDsEntry
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "default-ds-entry").intern();

    /**
     * When set, the clock is a two-step clock; otherwise,the clock is a one-step 
     * clock.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>twoStepFlag</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isTwoStepFlag();
    
    /**
     * The clockIdentity of the local clock
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ClockIdentityType</code> <code>clockIdentity</code>, or <code>null</code> if not present
     */
    ClockIdentityType getClockIdentity();
    
    /**
     * The number of PTP ports on the device.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>numberPorts</code>, or <code>null</code> if not present
     */
    java.lang.Integer getNumberPorts();
    
    /**
     * The clockQuality of the local clock.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208._default.ds.entry.ClockQuality</code> <code>clockQuality</code>, or <code>null</code> if not present
     */
    ClockQuality getClockQuality();
    
    /**
     * The priority1 attribute of the local clock.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>priority1</code>, or <code>null</code> if not present
     */
    java.lang.Short getPriority1();
    
    /**
     * The priority2 attribute of the local clock. 
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>priority2</code>, or <code>null</code> if not present
     */
    java.lang.Short getPriority2();
    
    /**
     * The domain number of the current syntonizationdomain.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>domainNumber</code>, or <code>null</code> if not present
     */
    java.lang.Short getDomainNumber();
    
    /**
     * When set, the clock is a slave-only clock.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>slaveOnly</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isSlaveOnly();

}

