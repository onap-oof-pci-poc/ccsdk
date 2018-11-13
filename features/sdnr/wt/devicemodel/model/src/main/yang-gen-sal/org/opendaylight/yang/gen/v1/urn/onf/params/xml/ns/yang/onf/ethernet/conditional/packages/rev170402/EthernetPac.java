package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetStatus;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetCapability;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetConfiguration;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetHistoricalPerformances;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetCurrentProblems;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetCurrentPerformance;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-ethernet-conditional-packages</b>
 * <pre>
 * list ethernet-pac {
 *     key "layer-protocol";
 *     leaf layer-protocol {
 *         type leafref;
 *     }
 *     container ethernet-capability {
 *         uses ethernet-capability-g;
 *     }
 *     container ethernet-configuration {
 *         leaf vlan-id {
 *             type int16;
 *         }
 *         uses ethernet-configuration-g;
 *     }
 *     container ethernet-status {
 *         uses ethernet-status-g;
 *     }
 *     container ethernet-current-problems {
 *         uses ethernet-current-problems-g;
 *     }
 *     container ethernet-current-performance {
 *         uses ethernet-current-performance-g;
 *     }
 *     container ethernet-historical-performances {
 *         uses ethernet-historical-performances-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-ethernet-conditional-packages/ethernet-pac</i>
 *
 * <p>To create instances of this class use {@link EthernetPacBuilder}.
 * @see EthernetPacBuilder
 * @see EthernetPacKey
 *
 */
public interface EthernetPac
    extends
    ChildOf<OnfEthernetConditionalPackagesData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>,
    Identifiable<EthernetPacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-ethernet-conditional-packages",
        "2017-04-02", "ethernet-pac").intern();

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
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetCapability</code> <code>ethernetCapability</code>, or <code>null</code> if not present
     */
    EthernetCapability getEthernetCapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetConfiguration</code> <code>ethernetConfiguration</code>, or <code>null</code> if not present
     */
    EthernetConfiguration getEthernetConfiguration();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetStatus</code> <code>ethernetStatus</code>, or <code>null</code> if not present
     */
    EthernetStatus getEthernetStatus();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetCurrentProblems</code> <code>ethernetCurrentProblems</code>, or <code>null</code> if not present
     */
    EthernetCurrentProblems getEthernetCurrentProblems();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetCurrentPerformance</code> <code>ethernetCurrentPerformance</code>, or <code>null</code> if not present
     */
    EthernetCurrentPerformance getEthernetCurrentPerformance();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetHistoricalPerformances</code> <code>ethernetHistoricalPerformances</code>, or <code>null</code> if not present
     */
    EthernetHistoricalPerformances getEthernetHistoricalPerformances();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    EthernetPacKey getKey();

}

