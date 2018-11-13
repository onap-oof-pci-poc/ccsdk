package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionCurrentProblems;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionCurrentPerformance;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionCapability;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionHistoricalPerformances;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionStatus;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-otn-odu-conditional-packages</b>
 * <pre>
 * list otn-odu-connection-pac {
 *     key "layer-protocol";
 *     leaf layer-protocol {
 *         type leafref;
 *     }
 *     container otn-odu-connection-capability {
 *         container accepted-payload-type {
 *             leaf named-payload-type {
 *                 type odu-named-payload-type;
 *             }
 *             leaf hex-payload-type {
 *                 type uint64;
 *             }
 *             uses odu-payload-type-g;
 *         }
 *         uses otn-odu-connection-capability-g;
 *     }
 *     container otn-odu-connection-configuration {
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
 *         uses otn-odu-connection-configuration-g;
 *     }
 *     container otn-odu-connection-status {
 *         uses otn-odu-connection-status-g;
 *     }
 *     container otn-odu-connection-current-problems {
 *         uses otn-odu-connection-current-problems-g;
 *     }
 *     container otn-odu-connection-current-performance {
 *         uses otn-odu-connection-current-performance-g;
 *     }
 *     container otn-odu-connection-historical-performances {
 *         uses otn-odu-connection-historical-performances-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-otn-odu-conditional-packages/otn-odu-connection-pac</i>
 *
 * <p>To create instances of this class use {@link OtnOduConnectionPacBuilder}.
 * @see OtnOduConnectionPacBuilder
 * @see OtnOduConnectionPacKey
 *
 */
public interface OtnOduConnectionPac
    extends
    ChildOf<OnfOtnOduConditionalPackagesData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>,
    Identifiable<OtnOduConnectionPacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-otn-odu-conditional-packages",
        "2017-10-20", "otn-odu-connection-pac").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>layerProtocol</code>, or <code>null</code> if not present
     */
    UniversalId getLayerProtocol();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionCapability</code> <code>otnOduConnectionCapability</code>, or <code>null</code> if not present
     */
    OtnOduConnectionCapability getOtnOduConnectionCapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration</code> <code>otnOduConnectionConfiguration</code>, or <code>null</code> if not present
     */
    OtnOduConnectionConfiguration getOtnOduConnectionConfiguration();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionStatus</code> <code>otnOduConnectionStatus</code>, or <code>null</code> if not present
     */
    OtnOduConnectionStatus getOtnOduConnectionStatus();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionCurrentProblems</code> <code>otnOduConnectionCurrentProblems</code>, or <code>null</code> if not present
     */
    OtnOduConnectionCurrentProblems getOtnOduConnectionCurrentProblems();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionCurrentPerformance</code> <code>otnOduConnectionCurrentPerformance</code>, or <code>null</code> if not present
     */
    OtnOduConnectionCurrentPerformance getOtnOduConnectionCurrentPerformance();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionHistoricalPerformances</code> <code>otnOduConnectionHistoricalPerformances</code>, or <code>null</code> if not present
     */
    OtnOduConnectionHistoricalPerformances getOtnOduConnectionHistoricalPerformances();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    OtnOduConnectionPacKey getKey();

}

