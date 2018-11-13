package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public interface PortDsList1
    extends
    DataObject,
    Augmentation<PortDsList>
{




    /**
     * Indicates that port can only be a master.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>masterOnly</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMasterOnly();
    
    /**
     * Local priority as used for alternate BMCA
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>localPriority</code>, or <code>null</code> if not present
     */
    java.lang.Short getLocalPriority();
    
    /**
     * A PTP Port needs to be enabled by management.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>designatedEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isDesignatedEnabled();
    
    /**
     * As per PTPKnown path asymmetry in ns.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>delayAsymmetry</code>, or <code>null</code> if not present
     */
    java.lang.Long getDelayAsymmetry();
    
    /**
     * A reference to a LTP of layer-protocol-name 'ETY' or 'MWPS', which is usedto 
     * discover the PTP topology.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>logicalTerminationPoint</code>, or <code>null</code> if not present
     */
    UniversalId getLogicalTerminationPoint();

}

