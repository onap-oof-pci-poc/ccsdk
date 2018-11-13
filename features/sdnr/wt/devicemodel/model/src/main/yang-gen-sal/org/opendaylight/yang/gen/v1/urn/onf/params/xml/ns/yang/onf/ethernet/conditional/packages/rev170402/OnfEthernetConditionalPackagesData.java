package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.DataRoot;
import java.util.List;

/**
 * This model adds conditional packages to the ONF CoreModel in order address 
 * Ethernet use cases.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-ethernet-conditional-packages</b>
 * <pre>
 * module onf-ethernet-conditional-packages {
 *     yang-version 1;
 *     namespace "urn:onf:params:xml:ns:yang:onf-ethernet-conditional-packages";
 *     prefix "onf-ethernet-conditional-packages";
 *
 *     import core-model { prefix "core-model"; }
 *     revision 2017-04-02 {
 *         description "This model adds conditional packages to the ONF CoreModel in order address 
 *                     Ethernet use cases.
 *         ";
 *     }
 *
 *     list ethernet-pac {
 *         key "layer-protocol";
 *         leaf layer-protocol {
 *             type leafref;
 *         }
 *         container ethernet-capability {
 *             uses ethernet-capability-g;
 *         }
 *         container ethernet-configuration {
 *             leaf vlan-id {
 *                 type int16;
 *             }
 *             uses ethernet-configuration-g;
 *         }
 *         container ethernet-status {
 *             uses ethernet-status-g;
 *         }
 *         container ethernet-current-problems {
 *             uses ethernet-current-problems-g;
 *         }
 *         container ethernet-current-performance {
 *             uses ethernet-current-performance-g;
 *         }
 *         container ethernet-historical-performances {
 *             uses ethernet-historical-performances-g;
 *         }
 *     }
 *
 *     grouping ethernet-current-performance-g {
 *     }
 *     grouping ethernet-status-g {
 *     }
 *     grouping ethernet-current-problems-g {
 *     }
 *     grouping ethernet-configuration-g {
 *         leaf vlan-id {
 *             type int16;
 *         }
 *     }
 *     grouping ethernet-historical-performances-g {
 *     }
 *     grouping ethernet-capability-g {
 *     }
 * }
 * </pre>
 *
 */
public interface OnfEthernetConditionalPackagesData
    extends
    DataRoot
{




    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>ethernetPac</code>, or <code>null</code> if not present
     */
    List<EthernetPac> getEthernetPac();

}

