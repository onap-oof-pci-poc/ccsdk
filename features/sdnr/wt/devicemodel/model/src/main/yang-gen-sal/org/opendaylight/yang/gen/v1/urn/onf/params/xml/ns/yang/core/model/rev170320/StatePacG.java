package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping state-pac-g {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/state-pac-g</i>
 *
 */
public interface StatePacG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "state-pac-g").intern();

    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationalState</code> <code>operationalState</code>, or <code>null</code> if not present
     */
    OperationalState getOperationalState();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AdministrativeControl</code> <code>administrativeControl</code>, or <code>null</code> if not present
     */
    AdministrativeControl getAdministrativeControl();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AdministrativeState</code> <code>administrativeState</code>, or <code>null</code> if not present
     */
    AdministrativeState getAdministrativeState();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LifecycleState</code> <code>lifecycleState</code>, or <code>null</code> if not present
     */
    LifecycleState getLifecycleState();

}

