package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationCapability;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationCurrentProblems;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationStatus;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationConfiguration;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationHistoricalPerformances;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationCurrentPerformance;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-otn-odu-conditional-packages</b>
 * <pre>
 * list otn-odu-termination-pac {
 *     key "layer-protocol";
 *     leaf layer-protocol {
 *         type leafref;
 *     }
 *     container otn-odu-termination-capability {
 *         uses otn-odu-termination-capability-g;
 *     }
 *     container otn-odu-termination-configuration {
 *         leaf odu-type {
 *             type odu-type;
 *         }
 *         leaf odu-rate {
 *             type uint64;
 *         }
 *         leaf odu-rate-tolerance {
 *             type odu-rate-tolerance;
 *         }
 *         uses otn-odu-termination-configuration-g;
 *     }
 *     container otn-odu-termination-status {
 *         uses otn-odu-termination-status-g;
 *     }
 *     container otn-odu-termination-current-problems {
 *         uses otn-odu-termination-current-problems-g;
 *     }
 *     container otn-odu-termination-current-performance {
 *         uses otn-odu-termination-current-performance-g;
 *     }
 *     container otn-odu-termination-historical-performances {
 *         uses otn-odu-termination-historical-performances-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-otn-odu-conditional-packages/otn-odu-termination-pac</i>
 *
 * <p>To create instances of this class use {@link OtnOduTerminationPacBuilder}.
 * @see OtnOduTerminationPacBuilder
 * @see OtnOduTerminationPacKey
 *
 */
public interface OtnOduTerminationPac
    extends
    ChildOf<OnfOtnOduConditionalPackagesData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>,
    Identifiable<OtnOduTerminationPacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-otn-odu-conditional-packages",
        "2017-10-20", "otn-odu-termination-pac").intern();

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
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationCapability</code> <code>otnOduTerminationCapability</code>, or <code>null</code> if not present
     */
    OtnOduTerminationCapability getOtnOduTerminationCapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationConfiguration</code> <code>otnOduTerminationConfiguration</code>, or <code>null</code> if not present
     */
    OtnOduTerminationConfiguration getOtnOduTerminationConfiguration();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationStatus</code> <code>otnOduTerminationStatus</code>, or <code>null</code> if not present
     */
    OtnOduTerminationStatus getOtnOduTerminationStatus();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationCurrentProblems</code> <code>otnOduTerminationCurrentProblems</code>, or <code>null</code> if not present
     */
    OtnOduTerminationCurrentProblems getOtnOduTerminationCurrentProblems();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationCurrentPerformance</code> <code>otnOduTerminationCurrentPerformance</code>, or <code>null</code> if not present
     */
    OtnOduTerminationCurrentPerformance getOtnOduTerminationCurrentPerformance();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationHistoricalPerformances</code> <code>otnOduTerminationHistoricalPerformances</code>, or <code>null</code> if not present
     */
    OtnOduTerminationHistoricalPerformances getOtnOduTerminationHistoricalPerformances();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    OtnOduTerminationPacKey getKey();

}

