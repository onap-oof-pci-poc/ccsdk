package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.CurrentDs;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of one or more PTP datasets in the device, one foreach domain (see IEEE 
 * 1588-2008 subclause 6.3).Each PTP dataset represents a distinct instance ofPTP 
 * implementation in the device (i.e. distinctOrdinary Clock or Boundary Clock).
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * list instance-list {
 *     key "instance-number";
 *     leaf instance-number {
 *         type uint16;
 *     }
 *     container default-ds {
 *         leaf two-step-flag {
 *             type boolean;
 *         }
 *         leaf clock-identity {
 *             type clock-identity-type;
 *         }
 *         leaf number-ports {
 *             type uint16;
 *         }
 *         container clock-quality {
 *             leaf clock-class {
 *                 type clock-class;
 *             }
 *             leaf clock-accuracy {
 *                 type uint8;
 *             }
 *             leaf offset-scaled-log-variance {
 *                 type uint16;
 *             }
 *             uses clock-quality-grouping;
 *         }
 *         leaf priority1 {
 *             type uint8;
 *         }
 *         leaf priority2 {
 *             type uint8;
 *         }
 *         leaf domain-number {
 *             type uint8;
 *         }
 *         leaf slave-only {
 *             type boolean;
 *         }
 *         leaf local-priority {
 *             type local-priority;
 *         }
 *         leaf max-steps-removed {
 *             type max-steps-removed;
 *         }
 *         leaf multicast-mac-address {
 *             type mac-address;
 *         }
 *         leaf designated-enabled {
 *             type designated-enabled;
 *         }
 *         augment \(urn:ietf:params:xml:ns:yang:ietf-ptp-dataset)instance-list\(urn:ietf:params:xml:ns:yang:ietf-ptp-dataset)default-ds {
 *             when "Optional.empty";
 *             description
 *                 "Addition of data nodes for the default data set of the clock.";
 *             status CURRENT;
 *             leaf local-priority {
 *                 type local-priority;
 *             }
 *             leaf max-steps-removed {
 *                 type max-steps-removed;
 *             }
 *             leaf multicast-mac-address {
 *                 type mac-address;
 *             }
 *             leaf designated-enabled {
 *                 type designated-enabled;
 *             }
 *         }
 *         uses default-ds-entry;
 *     }
 *     container current-ds {
 *         leaf steps-removed {
 *             type steps-removed;
 *         }
 *         leaf offset-from-master {
 *             type time-interval-type;
 *         }
 *         leaf mean-path-delay {
 *             type time-interval-type;
 *         }
 *         uses current-ds-entry;
 *     }
 *     container parent-ds {
 *         container parent-port-identity {
 *             leaf clock-identity {
 *                 type clock-identity-type;
 *             }
 *             leaf port-number {
 *                 type uint16;
 *             }
 *             uses port-identity-grouping;
 *         }
 *         leaf parent-stats {
 *             type parent-stats;
 *         }
 *         leaf observed-parent-offset-scaled-log-variance {
 *             type observed-parent-offset-scaled-log-variance;
 *         }
 *         leaf observed-parent-clock-phase-change-rate {
 *             type int32;
 *         }
 *         leaf grandmaster-identity {
 *             type binary;
 *         }
 *         container grandmaster-clock-quality {
 *             leaf clock-class {
 *                 type clock-class;
 *             }
 *             leaf clock-accuracy {
 *                 type uint8;
 *             }
 *             leaf offset-scaled-log-variance {
 *                 type uint16;
 *             }
 *             uses clock-quality-grouping;
 *         }
 *         leaf grandmaster-priority1 {
 *             type uint8;
 *         }
 *         leaf grandmaster-priority2 {
 *             type uint8;
 *         }
 *         uses parent-ds-entry;
 *     }
 *     container time-properties-ds {
 *         leaf current-utc-offset-valid {
 *             type boolean;
 *         }
 *         leaf current-utc-offset {
 *             type int16;
 *         }
 *         leaf leap59 {
 *             type boolean;
 *         }
 *         leaf leap61 {
 *             type boolean;
 *         }
 *         leaf time-traceable {
 *             type boolean;
 *         }
 *         leaf frequency-traceable {
 *             type boolean;
 *         }
 *         leaf ptp-timescale {
 *             type boolean;
 *         }
 *         leaf time-source {
 *             type uint8;
 *         }
 *         uses time-properties-ds-entry;
 *     }
 *     list port-ds-list {
 *         key "port-number";
 *         leaf port-number {
 *             type leafref;
 *         }
 *         container port-identity {
 *             leaf clock-identity {
 *                 type clock-identity-type;
 *             }
 *             leaf port-number {
 *                 type uint16;
 *             }
 *             uses port-identity-grouping;
 *         }
 *         leaf port-state {
 *             type port-state;
 *         }
 *         leaf log-min-delay-req-interval {
 *             type int8;
 *         }
 *         leaf peer-mean-path-delay {
 *             type peer-mean-path-delay;
 *         }
 *         leaf log-announce-interval {
 *             type int8;
 *         }
 *         leaf announce-receipt-timeout {
 *             type uint8;
 *         }
 *         leaf log-sync-interval {
 *             type int8;
 *         }
 *         leaf delay-mechanism {
 *             type delay-mechanism-enumeration;
 *         }
 *         leaf log-min-pdelay-req-interval {
 *             type int8;
 *         }
 *         leaf version-number {
 *             type uint8;
 *         }
 *         leaf master-only {
 *             type master-only;
 *         }
 *         leaf local-priority {
 *             type local-priority;
 *         }
 *         leaf designated-enabled {
 *             type designated-enabled;
 *         }
 *         leaf delay-asymmetry {
 *             type delay-asymmetry;
 *         }
 *         leaf logical-termination-point {
 *             type leafref;
 *         }
 *         augment \(urn:ietf:params:xml:ns:yang:ietf-ptp-dataset)instance-list\(urn:ietf:params:xml:ns:yang:ietf-ptp-dataset)port-ds-list {
 *             when "Optional.empty";
 *             description
 *                 "Addition of data nodes for the default data set of the clock.";
 *             status CURRENT;
 *             leaf master-only {
 *                 type master-only;
 *             }
 *             leaf local-priority {
 *                 type local-priority;
 *             }
 *             leaf designated-enabled {
 *                 type designated-enabled;
 *             }
 *             leaf delay-asymmetry {
 *                 type delay-asymmetry;
 *             }
 *             leaf logical-termination-point {
 *                 type leafref;
 *             }
 *         }
 *         uses port-ds-entry;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/instance-list</i>
 *
 * <p>To create instances of this class use {@link InstanceListBuilder}.
 * @see InstanceListBuilder
 * @see InstanceListKey
 *
 */
public interface InstanceList
    extends
    ChildOf<IetfPtpDatasetData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>,
    Identifiable<InstanceListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "instance-list").intern();

    /**
     * The instance number of the current PTP instance
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>instanceNumber</code>, or <code>null</code> if not present
     */
    java.lang.Integer getInstanceNumber();
    
    /**
     * The default data set of the clock.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs</code> <code>defaultDs</code>, or <code>null</code> if not present
     */
    DefaultDs getDefaultDs();
    
    /**
     * The current data set of the clock.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.CurrentDs</code> <code>currentDs</code>, or <code>null</code> if not present
     */
    CurrentDs getCurrentDs();
    
    /**
     * The parent data set of the clock.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs</code> <code>parentDs</code>, or <code>null</code> if not present
     */
    ParentDs getParentDs();
    
    /**
     * The timeProperties data set of the clock.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs</code> <code>timePropertiesDs</code>, or <code>null</code> if not present
     */
    TimePropertiesDs getTimePropertiesDs();
    
    /**
     * List of port data sets of the clock.
     *
     *
     *
     * @return <code>java.util.List</code> <code>portDsList</code>, or <code>null</code> if not present
     */
    List<PortDsList> getPortDsList();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InstanceListKey getKey();

}

