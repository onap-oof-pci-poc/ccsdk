package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ptp.dataset.rev170508;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;

public interface DefaultDs1
    extends
    DataObject,
    Augmentation<DefaultDs>
{




    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>localPriority</code>, or <code>null</code> if not present
     */
    java.lang.Short getLocalPriority();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>maxStepsRemoved</code>, or <code>null</code> if not present
     */
    java.lang.Short getMaxStepsRemoved();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>multicastMacAddress</code>, or <code>null</code> if not present
     */
    MacAddress getMulticastMacAddress();
    
    /**
     * A PTP Clock needs to be enabled by management.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>designatedEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isDesignatedEnabled();

}

