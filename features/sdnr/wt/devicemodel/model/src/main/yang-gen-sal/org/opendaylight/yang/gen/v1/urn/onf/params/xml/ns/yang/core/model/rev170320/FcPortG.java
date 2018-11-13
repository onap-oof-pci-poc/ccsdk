package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping fc-port-g {
 *     leaf-list ltp {
 *         type leafref;
 *     }
 *     leaf role {
 *         type port-role;
 *     }
 *     leaf fc-port-direction {
 *         type port-direction;
 *     }
 *     leaf is-protection-lock-out {
 *         type boolean;
 *     }
 *     leaf selection-priority {
 *         type int64;
 *     }
 *     leaf is-internal-port {
 *         type boolean;
 *     }
 *     leaf-list fc-route-feeds-fc-port-egress {
 *         type string;
 *     }
 *     list local-id {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     leaf uuid {
 *         type universal-id;
 *     }
 *     list extension {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     leaf operational-state {
 *         type operational-state;
 *     }
 *     leaf administrative-control {
 *         type administrative-control;
 *     }
 *     leaf administrative-state {
 *         type administrative-state;
 *     }
 *     leaf lifecycle-state {
 *         type lifecycle-state;
 *     }
 *     list name {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     list label {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/fc-port-g</i>
 *
 */
public interface FcPortG
    extends
    DataObject,
    LocalClassG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "fc-port-g").intern();

    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>ltp</code>, or <code>null</code> if not present
     */
    List<UniversalId> getLtp();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PortRole</code> <code>role</code>, or <code>null</code> if not present
     */
    PortRole getRole();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PortDirection</code> <code>fcPortDirection</code>, or <code>null</code> if not present
     */
    PortDirection getFcPortDirection();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isProtectionLockOut</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsProtectionLockOut();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>selectionPriority</code>, or <code>null</code> if not present
     */
    java.lang.Long getSelectionPriority();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isInternalPort</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsInternalPort();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>fcRouteFeedsFcPortEgress</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getFcRouteFeedsFcPortEgress();

}

