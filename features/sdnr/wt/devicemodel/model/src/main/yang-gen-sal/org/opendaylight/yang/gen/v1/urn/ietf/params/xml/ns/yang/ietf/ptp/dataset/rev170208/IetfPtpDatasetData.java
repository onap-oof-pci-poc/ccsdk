package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.DataRoot;
import java.util.List;

/**
 * This YANG module defines a data model for the configurationof IEEE 1588-2008 
 * clocks, and also for retrieval of the statedata of IEEE 1588-2008 clocks.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * module ietf-ptp-dataset {
 *     yang-version 1;
 *     namespace "urn:ietf:params:xml:ns:yang:ietf-ptp-dataset";
 *     prefix "ptp-dataset";
 *
 *     revision 2017-02-08 {
 *         description "This YANG module defines a data model for the configurationof IEEE 1588-2008 
 *                     clocks, and also for retrieval of the statedata of IEEE 1588-2008 clocks.
 *         ";
 *     }
 *
 *     list instance-list {
 *         key "instance-number";
 *         leaf instance-number {
 *             type uint16;
 *         }
 *         container default-ds {
 *             leaf two-step-flag {
 *                 type boolean;
 *             }
 *             leaf clock-identity {
 *                 type clock-identity-type;
 *             }
 *             leaf number-ports {
 *                 type uint16;
 *             }
 *             container clock-quality {
 *                 leaf clock-class {
 *                     type clock-class;
 *                 }
 *                 leaf clock-accuracy {
 *                     type uint8;
 *                 }
 *                 leaf offset-scaled-log-variance {
 *                     type uint16;
 *                 }
 *                 uses clock-quality-grouping;
 *             }
 *             leaf priority1 {
 *                 type uint8;
 *             }
 *             leaf priority2 {
 *                 type uint8;
 *             }
 *             leaf domain-number {
 *                 type uint8;
 *             }
 *             leaf slave-only {
 *                 type boolean;
 *             }
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
 *             augment \(urn:ietf:params:xml:ns:yang:ietf-ptp-dataset)instance-list\(urn:ietf:params:xml:ns:yang:ietf-ptp-dataset)default-ds {
 *                 when "Optional.empty";
 *                 description
 *                     "Addition of data nodes for the default data set of the clock.";
 *                 status CURRENT;
 *                 leaf local-priority {
 *                     type local-priority;
 *                 }
 *                 leaf max-steps-removed {
 *                     type max-steps-removed;
 *                 }
 *                 leaf multicast-mac-address {
 *                     type mac-address;
 *                 }
 *                 leaf designated-enabled {
 *                     type designated-enabled;
 *                 }
 *             }
 *             uses default-ds-entry;
 *         }
 *         container current-ds {
 *             leaf steps-removed {
 *                 type steps-removed;
 *             }
 *             leaf offset-from-master {
 *                 type time-interval-type;
 *             }
 *             leaf mean-path-delay {
 *                 type time-interval-type;
 *             }
 *             uses current-ds-entry;
 *         }
 *         container parent-ds {
 *             container parent-port-identity {
 *                 leaf clock-identity {
 *                     type clock-identity-type;
 *                 }
 *                 leaf port-number {
 *                     type uint16;
 *                 }
 *                 uses port-identity-grouping;
 *             }
 *             leaf parent-stats {
 *                 type parent-stats;
 *             }
 *             leaf observed-parent-offset-scaled-log-variance {
 *                 type observed-parent-offset-scaled-log-variance;
 *             }
 *             leaf observed-parent-clock-phase-change-rate {
 *                 type int32;
 *             }
 *             leaf grandmaster-identity {
 *                 type binary;
 *             }
 *             container grandmaster-clock-quality {
 *                 leaf clock-class {
 *                     type clock-class;
 *                 }
 *                 leaf clock-accuracy {
 *                     type uint8;
 *                 }
 *                 leaf offset-scaled-log-variance {
 *                     type uint16;
 *                 }
 *                 uses clock-quality-grouping;
 *             }
 *             leaf grandmaster-priority1 {
 *                 type uint8;
 *             }
 *             leaf grandmaster-priority2 {
 *                 type uint8;
 *             }
 *             uses parent-ds-entry;
 *         }
 *         container time-properties-ds {
 *             leaf current-utc-offset-valid {
 *                 type boolean;
 *             }
 *             leaf current-utc-offset {
 *                 type int16;
 *             }
 *             leaf leap59 {
 *                 type boolean;
 *             }
 *             leaf leap61 {
 *                 type boolean;
 *             }
 *             leaf time-traceable {
 *                 type boolean;
 *             }
 *             leaf frequency-traceable {
 *                 type boolean;
 *             }
 *             leaf ptp-timescale {
 *                 type boolean;
 *             }
 *             leaf time-source {
 *                 type uint8;
 *             }
 *             uses time-properties-ds-entry;
 *         }
 *         list port-ds-list {
 *             key "port-number";
 *             leaf port-number {
 *                 type leafref;
 *             }
 *             container port-identity {
 *                 leaf clock-identity {
 *                     type clock-identity-type;
 *                 }
 *                 leaf port-number {
 *                     type uint16;
 *                 }
 *                 uses port-identity-grouping;
 *             }
 *             leaf port-state {
 *                 type port-state;
 *             }
 *             leaf log-min-delay-req-interval {
 *                 type int8;
 *             }
 *             leaf peer-mean-path-delay {
 *                 type peer-mean-path-delay;
 *             }
 *             leaf log-announce-interval {
 *                 type int8;
 *             }
 *             leaf announce-receipt-timeout {
 *                 type uint8;
 *             }
 *             leaf log-sync-interval {
 *                 type int8;
 *             }
 *             leaf delay-mechanism {
 *                 type delay-mechanism-enumeration;
 *             }
 *             leaf log-min-pdelay-req-interval {
 *                 type int8;
 *             }
 *             leaf version-number {
 *                 type uint8;
 *             }
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
 *             augment \(urn:ietf:params:xml:ns:yang:ietf-ptp-dataset)instance-list\(urn:ietf:params:xml:ns:yang:ietf-ptp-dataset)port-ds-list {
 *                 when "Optional.empty";
 *                 description
 *                     "Addition of data nodes for the default data set of the clock.";
 *                 status CURRENT;
 *                 leaf master-only {
 *                     type master-only;
 *                 }
 *                 leaf local-priority {
 *                     type local-priority;
 *                 }
 *                 leaf designated-enabled {
 *                     type designated-enabled;
 *                 }
 *                 leaf delay-asymmetry {
 *                     type delay-asymmetry;
 *                 }
 *                 leaf logical-termination-point {
 *                     type leafref;
 *                 }
 *             }
 *             uses port-ds-entry;
 *         }
 *     }
 *     container transparent-clock-default-ds {
 *         leaf clock-identity {
 *             type clock-identity-type;
 *         }
 *         leaf number-ports {
 *             type uint16;
 *         }
 *         leaf delay-mechanism {
 *             type delay-mechanism-enumeration;
 *         }
 *         leaf primary-domain {
 *             type primary-domain;
 *         }
 *         uses transparent-clock-default-ds-entry;
 *     }
 *     list transparent-clock-port-ds-list {
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
 *         leaf log-min-pdelay-req-interval {
 *             type int8;
 *         }
 *         leaf faulty-flag {
 *             type faulty-flag;
 *         }
 *         leaf peer-mean-path-delay {
 *             type peer-mean-path-delay;
 *         }
 *         uses transparent-clock-port-ds-entry;
 *     }
 *
 *     grouping default-ds-entry {
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
 *     }
 *     grouping parent-ds-entry {
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
 *     }
 *     grouping time-properties-ds-entry {
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
 *     }
 *     grouping transparent-clock-port-ds-entry {
 *         container port-identity {
 *             leaf clock-identity {
 *                 type clock-identity-type;
 *             }
 *             leaf port-number {
 *                 type uint16;
 *             }
 *             uses port-identity-grouping;
 *         }
 *         leaf log-min-pdelay-req-interval {
 *             type int8;
 *         }
 *         leaf faulty-flag {
 *             type faulty-flag;
 *         }
 *         leaf peer-mean-path-delay {
 *             type peer-mean-path-delay;
 *         }
 *     }
 *     grouping clock-quality-grouping {
 *         leaf clock-class {
 *             type clock-class;
 *         }
 *         leaf clock-accuracy {
 *             type uint8;
 *         }
 *         leaf offset-scaled-log-variance {
 *             type uint16;
 *         }
 *     }
 *     grouping transparent-clock-default-ds-entry {
 *         leaf clock-identity {
 *             type clock-identity-type;
 *         }
 *         leaf number-ports {
 *             type uint16;
 *         }
 *         leaf delay-mechanism {
 *             type delay-mechanism-enumeration;
 *         }
 *         leaf primary-domain {
 *             type primary-domain;
 *         }
 *     }
 *     grouping current-ds-entry {
 *         leaf steps-removed {
 *             type steps-removed;
 *         }
 *         leaf offset-from-master {
 *             type time-interval-type;
 *         }
 *         leaf mean-path-delay {
 *             type time-interval-type;
 *         }
 *     }
 *     grouping port-ds-entry {
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
 *     }
 *     grouping port-identity-grouping {
 *         leaf clock-identity {
 *             type clock-identity-type;
 *         }
 *         leaf port-number {
 *             type uint16;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface IetfPtpDatasetData
    extends
    DataRoot
{




    /**
     * List of one or more PTP datasets in the device, one foreach domain (see IEEE 
     * 1588-2008 subclause 6.3).Each PTP dataset represents a distinct instance ofPTP 
     * implementation in the device (i.e. distinctOrdinary Clock or Boundary Clock).
     *
     *
     *
     * @return <code>java.util.List</code> <code>instanceList</code>, or <code>null</code> if not present
     */
    List<InstanceList> getInstanceList();
    
    /**
     * The members of the transparentClockDefault Data Set
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs</code> <code>transparentClockDefaultDs</code>, or <code>null</code> if not present
     */
    TransparentClockDefaultDs getTransparentClockDefaultDs();
    
    /**
     * List of transparentClockPort data setsof the transparent clock.
     *
     *
     *
     * @return <code>java.util.List</code> <code>transparentClockPortDsList</code>, or <code>null</code> if not present
     */
    List<TransparentClockPortDsList> getTransparentClockPortDsList();

}

