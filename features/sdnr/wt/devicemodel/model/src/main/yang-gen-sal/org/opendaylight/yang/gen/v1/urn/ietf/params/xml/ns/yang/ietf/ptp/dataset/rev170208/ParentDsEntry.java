package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.ParentPortIdentity;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality;

/**
 * Collection of members of the parent data set.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * grouping parent-ds-entry {
 *     container parent-port-identity {
 *         leaf clock-identity {
 *             type clock-identity-type;
 *         }
 *         leaf port-number {
 *             type uint16;
 *         }
 *         uses port-identity-grouping;
 *     }
 *     leaf parent-stats {
 *         type parent-stats;
 *     }
 *     leaf observed-parent-offset-scaled-log-variance {
 *         type observed-parent-offset-scaled-log-variance;
 *     }
 *     leaf observed-parent-clock-phase-change-rate {
 *         type int32;
 *     }
 *     leaf grandmaster-identity {
 *         type binary;
 *     }
 *     container grandmaster-clock-quality {
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
 *     leaf grandmaster-priority1 {
 *         type uint8;
 *     }
 *     leaf grandmaster-priority2 {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/parent-ds-entry</i>
 *
 */
public interface ParentDsEntry
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "parent-ds-entry").intern();

    /**
     * The portIdentity of the port on the master
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.ParentPortIdentity</code> <code>parentPortIdentity</code>, or <code>null</code> if not present
     */
    ParentPortIdentity getParentPortIdentity();
    
    /**
     * When set, the values ofobservedParentOffsetScaledLogVariance 
     * andobservedParentClockPhaseChangeRate of parentDShave been measured and are 
     * valid.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>parentStats</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isParentStats();
    
    /**
     * An estimate of the parent clock's PTP varianceas observed by the slave clock.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>observedParentOffsetScaledLogVariance</code>, or <code>null</code> if not present
     */
    java.lang.Integer getObservedParentOffsetScaledLogVariance();
    
    /**
     * An estimate of the parent clock's phase change rateas observed by the slave 
     * clock.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>observedParentClockPhaseChangeRate</code>, or <code>null</code> if not present
     */
    java.lang.Integer getObservedParentClockPhaseChangeRate();
    
    /**
     * The clockIdentity attribute of the grandmaster clock.
     *
     *
     *
     * @return <code>byte[]</code> <code>grandmasterIdentity</code>, or <code>null</code> if not present
     */
    byte[] getGrandmasterIdentity();
    
    /**
     * The clockQuality of the grandmaster clock.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.parent.ds.entry.GrandmasterClockQuality</code> <code>grandmasterClockQuality</code>, or <code>null</code> if not present
     */
    GrandmasterClockQuality getGrandmasterClockQuality();
    
    /**
     * The priority1 attribute of the grandmaster clock.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>grandmasterPriority1</code>, or <code>null</code> if not present
     */
    java.lang.Short getGrandmasterPriority1();
    
    /**
     * The priority2 attribute of the grandmaster clock.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>grandmasterPriority2</code>, or <code>null</code> if not present
     */
    java.lang.Short getGrandmasterPriority2();

}

