package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.DataRoot;
import java.util.List;

/**
 * This model adds conditional packages to the ONF CoreModel in order to support 
 * fault management for object classes NetworkElement, Equipment and Holder.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * module onf-core-model-conditional-packages {
 *     yang-version 1;
 *     namespace "urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages";
 *     prefix "onf-core-model-conditional-packages";
 *
 *     import core-model { prefix "core-model"; }
 *     
 *     import microwave-model { prefix "microwave-model"; }
 *     revision 2017-04-02 {
 *         description "This model adds conditional packages to the ONF CoreModel in order to support 
 *                     fault management for object classes NetworkElement, Equipment and Holder.
 *         ";
 *     }
 *
 *     container network-element-pac {
 *         leaf network-element {
 *             type leafref;
 *         }
 *         container network-element-capability {
 *             leaf-list supported-alarms {
 *                 type string;
 *             }
 *             uses network-element-capability-g;
 *         }
 *         container network-element-configuration {
 *             list problem-type-severity-list {
 *                 key "problem-type-name";
 *                 leaf problem-type-name {
 *                     type string;
 *                 }
 *                 leaf problem-type-severity {
 *                     type severity-type;
 *                 }
 *                 uses problem-severity-type-g;
 *             }
 *             leaf trigger-refresh {
 *                 type boolean;
 *             }
 *             uses network-element-configuration-g;
 *         }
 *         container network-element-status {
 *             leaf refresh-status {
 *                 type processing-type;
 *             }
 *             uses network-element-status-g;
 *         }
 *         container network-element-current-problems {
 *             list current-problem-list {
 *                 key "sequence-number";
 *                 leaf problem-name {
 *                     type problem-name;
 *                 }
 *                 leaf object-reference {
 *                     type string;
 *                 }
 *                 leaf sequence-number {
 *                     type int32;
 *                 }
 *                 leaf time-stamp {
 *                     type time-stamp;
 *                 }
 *                 leaf problem-severity {
 *                     type problem-severity;
 *                 }
 *                 uses network-element-current-problem-type-g;
 *             }
 *             uses network-element-current-problems-g;
 *         }
 *     }
 *     list equipment-pac {
 *         key "equipment";
 *         leaf equipment {
 *             type leafref;
 *         }
 *         container equipment-capability {
 *             leaf-list supported-alarms {
 *                 type string;
 *             }
 *             uses equipment-capability-g;
 *         }
 *         container equipment-configuration {
 *             list problem-type-severity-list {
 *                 key "problem-type-name";
 *                 leaf problem-type-name {
 *                     type string;
 *                 }
 *                 leaf problem-type-severity {
 *                     type severity-type;
 *                 }
 *                 uses problem-severity-type-g;
 *             }
 *             uses equipment-configuration-g;
 *         }
 *         container equipment-status {
 *             uses equipment-status-g;
 *         }
 *         container equipment-current-problems {
 *             list current-problem-list {
 *                 key "sequence-number";
 *                 leaf problem-name {
 *                     type problem-name;
 *                 }
 *                 leaf sequence-number {
 *                     type int32;
 *                 }
 *                 leaf time-stamp {
 *                     type time-stamp;
 *                 }
 *                 leaf problem-severity {
 *                     type problem-severity;
 *                 }
 *                 uses current-problem-type-g;
 *             }
 *             uses equipment-current-problems-g;
 *         }
 *     }
 *     list holder-pac {
 *         key "holder";
 *         leaf holder {
 *             type leafref;
 *         }
 *         container holder-capability {
 *             leaf-list supported-alarms {
 *                 type string;
 *             }
 *             uses holder-capability-g;
 *         }
 *         container holder-configuration {
 *             list problem-type-severity-list {
 *                 key "problem-type-name";
 *                 leaf problem-type-name {
 *                     type string;
 *                 }
 *                 leaf problem-type-severity {
 *                     type severity-type;
 *                 }
 *                 uses problem-severity-type-g;
 *             }
 *             uses holder-configuration-g;
 *         }
 *         container holder-status {
 *             uses holder-status-g;
 *         }
 *         container holder-current-problems {
 *             list current-problem-list {
 *                 key "sequence-number";
 *                 leaf problem-name {
 *                     type problem-name;
 *                 }
 *                 leaf sequence-number {
 *                     type int32;
 *                 }
 *                 leaf time-stamp {
 *                     type time-stamp;
 *                 }
 *                 leaf problem-severity {
 *                     type problem-severity;
 *                 }
 *                 uses current-problem-type-g;
 *             }
 *             uses holder-current-problems-g;
 *         }
 *     }
 *     list connector-pac {
 *         key "connector";
 *         leaf connector {
 *             type leafref;
 *         }
 *         container connector-capability {
 *             leaf-list supported-alarms {
 *                 type string;
 *             }
 *             uses connector-capability-g;
 *         }
 *         container connector-configuration {
 *             list problem-type-severity-list {
 *                 key "problem-type-name";
 *                 leaf problem-type-name {
 *                     type string;
 *                 }
 *                 leaf problem-type-severity {
 *                     type severity-type;
 *                 }
 *                 uses problem-severity-type-g;
 *             }
 *             leaf remote-end-point {
 *                 type string;
 *             }
 *             uses connector-configuration-g;
 *         }
 *         container connector-status {
 *             leaf local-end-point {
 *                 type string;
 *             }
 *             uses connector-status-g;
 *         }
 *         container connector-current-problems {
 *             list current-problem-list {
 *                 key "sequence-number";
 *                 leaf problem-name {
 *                     type problem-name;
 *                 }
 *                 leaf sequence-number {
 *                     type int32;
 *                 }
 *                 leaf time-stamp {
 *                     type time-stamp;
 *                 }
 *                 leaf problem-severity {
 *                     type problem-severity;
 *                 }
 *                 uses current-problem-type-g;
 *             }
 *             uses connector-current-problems-g;
 *         }
 *     }
 *
 *     grouping equipment-capability-g {
 *         leaf-list supported-alarms {
 *             type string;
 *         }
 *     }
 *     grouping connector-capability-g {
 *         leaf-list supported-alarms {
 *             type string;
 *         }
 *     }
 *     grouping equipment-status-g {
 *     }
 *     grouping network-element-current-problems-g {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf object-reference {
 *                 type string;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses network-element-current-problem-type-g;
 *         }
 *     }
 *     grouping connector-status-g {
 *         leaf local-end-point {
 *             type string;
 *         }
 *     }
 *     grouping network-element-status-g {
 *         leaf refresh-status {
 *             type processing-type;
 *         }
 *     }
 *     grouping problem-severity-type-g {
 *         leaf problem-type-name {
 *             type string;
 *         }
 *         leaf problem-type-severity {
 *             type severity-type;
 *         }
 *     }
 *     grouping equipment-current-problems-g {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses current-problem-type-g;
 *         }
 *     }
 *     grouping connector-configuration-g {
 *         list problem-type-severity-list {
 *             key "problem-type-name";
 *             leaf problem-type-name {
 *                 type string;
 *             }
 *             leaf problem-type-severity {
 *                 type severity-type;
 *             }
 *             uses problem-severity-type-g;
 *         }
 *         leaf remote-end-point {
 *             type string;
 *         }
 *     }
 *     grouping connector-current-problems-g {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses current-problem-type-g;
 *         }
 *     }
 *     grouping holder-status-g {
 *     }
 *     grouping network-element-current-problem-type-g {
 *         leaf problem-name {
 *             type problem-name;
 *         }
 *         leaf object-reference {
 *             type string;
 *         }
 *         leaf sequence-number {
 *             type int32;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf problem-severity {
 *             type problem-severity;
 *         }
 *     }
 *     grouping network-element-configuration-g {
 *         list problem-type-severity-list {
 *             key "problem-type-name";
 *             leaf problem-type-name {
 *                 type string;
 *             }
 *             leaf problem-type-severity {
 *                 type severity-type;
 *             }
 *             uses problem-severity-type-g;
 *         }
 *         leaf trigger-refresh {
 *             type boolean;
 *         }
 *     }
 *     grouping holder-current-problems-g {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses current-problem-type-g;
 *         }
 *     }
 *     grouping network-element-capability-g {
 *         leaf-list supported-alarms {
 *             type string;
 *         }
 *     }
 *     grouping holder-configuration-g {
 *         list problem-type-severity-list {
 *             key "problem-type-name";
 *             leaf problem-type-name {
 *                 type string;
 *             }
 *             leaf problem-type-severity {
 *                 type severity-type;
 *             }
 *             uses problem-severity-type-g;
 *         }
 *     }
 *     grouping current-problem-type-g {
 *         leaf problem-name {
 *             type problem-name;
 *         }
 *         leaf sequence-number {
 *             type int32;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf problem-severity {
 *             type problem-severity;
 *         }
 *     }
 *     grouping equipment-configuration-g {
 *         list problem-type-severity-list {
 *             key "problem-type-name";
 *             leaf problem-type-name {
 *                 type string;
 *             }
 *             leaf problem-type-severity {
 *                 type severity-type;
 *             }
 *             uses problem-severity-type-g;
 *         }
 *     }
 *     grouping holder-capability-g {
 *         leaf-list supported-alarms {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface OnfCoreModelConditionalPackagesData
    extends
    DataRoot
{




    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac</code> <code>networkElementPac</code>, or <code>null</code> if not present
     */
    NetworkElementPac getNetworkElementPac();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>equipmentPac</code>, or <code>null</code> if not present
     */
    List<EquipmentPac> getEquipmentPac();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>holderPac</code>, or <code>null</code> if not present
     */
    List<HolderPac> getHolderPac();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>connectorPac</code>, or <code>null</code> if not present
     */
    List<ConnectorPac> getConnectorPac();

}

