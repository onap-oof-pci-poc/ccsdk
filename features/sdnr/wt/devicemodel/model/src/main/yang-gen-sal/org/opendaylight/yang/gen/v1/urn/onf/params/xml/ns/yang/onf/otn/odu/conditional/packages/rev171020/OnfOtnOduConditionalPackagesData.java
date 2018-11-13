package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020;
import org.opendaylight.yangtools.yang.binding.DataRoot;
import java.util.List;

/**
 * This model adds conditional packages to the ONF CoreModel 1.2in order address 
 * OTN ODU use cases. It is a temorary model fordemontration purposes and bases on 
 * the ideas an concepts ofTAPI. However, modifications for a pure southbound 
 * werenessesary.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-otn-odu-conditional-packages</b>
 * <pre>
 * module onf-otn-odu-conditional-packages {
 *     yang-version 1;
 *     namespace "urn:onf:params:xml:ns:yang:onf-otn-odu-conditional-packages";
 *     prefix "onf-otn-odu-conditional-packages";
 *
 *     import core-model { prefix "core-model"; }
 *     revision 2017-10-20 {
 *         description "This model adds conditional packages to the ONF CoreModel 1.2in order address 
 *                     OTN ODU use cases. It is a temorary model fordemontration purposes and bases on 
 *                     the ideas an concepts ofTAPI. However, modifications for a pure southbound 
 *                     werenessesary.
 *         ";
 *     }
 *
 *     list otn-odu-connection-pac {
 *         key "layer-protocol";
 *         leaf layer-protocol {
 *             type leafref;
 *         }
 *         container otn-odu-connection-capability {
 *             container accepted-payload-type {
 *                 leaf named-payload-type {
 *                     type odu-named-payload-type;
 *                 }
 *                 leaf hex-payload-type {
 *                     type uint64;
 *                 }
 *                 uses odu-payload-type-g;
 *             }
 *             uses otn-odu-connection-capability-g;
 *         }
 *         container otn-odu-connection-configuration {
 *             leaf-list tributary-slot-list {
 *                 type uint64;
 *             }
 *             leaf tributary-port-number {
 *                 type uint64;
 *             }
 *             leaf accepted-m-si {
 *                 type string;
 *             }
 *             leaf opu-tributary-slot-size {
 *                 type odu-slot-size;
 *             }
 *             leaf auto-payload-type {
 *                 type boolean;
 *             }
 *             leaf configured-mapping-type {
 *                 type mapping-type;
 *             }
 *             leaf configured-client-type {
 *                 type string;
 *             }
 *             uses otn-odu-connection-configuration-g;
 *         }
 *         container otn-odu-connection-status {
 *             uses otn-odu-connection-status-g;
 *         }
 *         container otn-odu-connection-current-problems {
 *             uses otn-odu-connection-current-problems-g;
 *         }
 *         container otn-odu-connection-current-performance {
 *             uses otn-odu-connection-current-performance-g;
 *         }
 *         container otn-odu-connection-historical-performances {
 *             uses otn-odu-connection-historical-performances-g;
 *         }
 *     }
 *     list otn-odu-termination-pac {
 *         key "layer-protocol";
 *         leaf layer-protocol {
 *             type leafref;
 *         }
 *         container otn-odu-termination-capability {
 *             uses otn-odu-termination-capability-g;
 *         }
 *         container otn-odu-termination-configuration {
 *             leaf odu-type {
 *                 type odu-type;
 *             }
 *             leaf odu-rate {
 *                 type uint64;
 *             }
 *             leaf odu-rate-tolerance {
 *                 type odu-rate-tolerance;
 *             }
 *             uses otn-odu-termination-configuration-g;
 *         }
 *         container otn-odu-termination-status {
 *             uses otn-odu-termination-status-g;
 *         }
 *         container otn-odu-termination-current-problems {
 *             uses otn-odu-termination-current-problems-g;
 *         }
 *         container otn-odu-termination-current-performance {
 *             uses otn-odu-termination-current-performance-g;
 *         }
 *         container otn-odu-termination-historical-performances {
 *             uses otn-odu-termination-historical-performances-g;
 *         }
 *     }
 *
 *     grouping otn-odu-termination-status-g {
 *     }
 *     grouping otn-odu-termination-current-performance-g {
 *     }
 *     grouping otn-odu-connection-capability-g {
 *         container accepted-payload-type {
 *             leaf named-payload-type {
 *                 type odu-named-payload-type;
 *             }
 *             leaf hex-payload-type {
 *                 type uint64;
 *             }
 *             uses odu-payload-type-g;
 *         }
 *     }
 *     grouping otn-odu-termination-current-problems-g {
 *     }
 *     grouping otn-odu-termination-capability-g {
 *     }
 *     grouping odu-payload-type-g {
 *         leaf named-payload-type {
 *             type odu-named-payload-type;
 *         }
 *         leaf hex-payload-type {
 *             type uint64;
 *         }
 *     }
 *     grouping otn-odu-connection-current-problems-g {
 *     }
 *     grouping otn-odu-connection-historical-performances-g {
 *     }
 *     grouping otn-odu-termination-historical-performances-g {
 *     }
 *     grouping otn-odu-connection-status-g {
 *     }
 *     grouping otn-odu-connection-configuration-g {
 *         leaf-list tributary-slot-list {
 *             type uint64;
 *         }
 *         leaf tributary-port-number {
 *             type uint64;
 *         }
 *         leaf accepted-m-si {
 *             type string;
 *         }
 *         leaf opu-tributary-slot-size {
 *             type odu-slot-size;
 *         }
 *         leaf auto-payload-type {
 *             type boolean;
 *         }
 *         leaf configured-mapping-type {
 *             type mapping-type;
 *         }
 *         leaf configured-client-type {
 *             type string;
 *         }
 *     }
 *     grouping otn-odu-termination-configuration-g {
 *         leaf odu-type {
 *             type odu-type;
 *         }
 *         leaf odu-rate {
 *             type uint64;
 *         }
 *         leaf odu-rate-tolerance {
 *             type odu-rate-tolerance;
 *         }
 *     }
 *     grouping otn-odu-connection-current-performance-g {
 *     }
 * }
 * </pre>
 *
 */
public interface OnfOtnOduConditionalPackagesData
    extends
    DataRoot
{




    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>otnOduConnectionPac</code>, or <code>null</code> if not present
     */
    List<OtnOduConnectionPac> getOtnOduConnectionPac();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>otnOduTerminationPac</code>, or <code>null</code> if not present
     */
    List<OtnOduTerminationPac> getOtnOduTerminationPac();

}

