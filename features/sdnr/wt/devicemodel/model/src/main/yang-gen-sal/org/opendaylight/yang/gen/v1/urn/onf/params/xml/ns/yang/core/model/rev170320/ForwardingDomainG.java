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
 * grouping forwarding-domain-g {
 *     leaf-list layer-protocol-name {
 *         type layer-protocol-name;
 *     }
 *     leaf-list lower-level-fd {
 *         type leafref;
 *     }
 *     leaf-list fc {
 *         type leafref;
 *     }
 *     leaf-list ltp {
 *         type leafref;
 *     }
 *     leaf-list lower-level-link {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/forwarding-domain-g</i>
 *
 */
public interface ForwardingDomainG
    extends
    DataObject,
    GlobalClassG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "forwarding-domain-g").intern();

    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>layerProtocolName</code>, or <code>null</code> if not present
     */
    List<LayerProtocolName> getLayerProtocolName();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>lowerLevelFd</code>, or <code>null</code> if not present
     */
    List<UniversalId> getLowerLevelFd();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>fc</code>, or <code>null</code> if not present
     */
    List<UniversalId> getFc();
    
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
     * @return <code>java.util.List</code> <code>lowerLevelLink</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getLowerLevelLink();

}

