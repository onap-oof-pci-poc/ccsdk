package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.wrapperc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InternalDateAndTime;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InternalSeverity;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.ONFCOreNetworkElementCoreData;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.util.GenericTransactionUtils;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ProblemNotificationXml;
import org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.CurrentProblemTypeG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPacKey;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentCurrentProblems;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.common.QName;

public class WrapperEquipmentPacRev170402 implements OnfInterfacePac {

    private static final Logger LOG = LoggerFactory.getLogger(WrapperEquipmentPacRev170402.class);
	public static final QName QNAME = EquipmentPac.QNAME;

    ONFCOreNetworkElementCoreData coreData;

    public WrapperEquipmentPacRev170402(ONFCOreNetworkElementCoreData coreData) {
    	this.coreData = coreData;
    }

    /**
     * Read problems of specific interfaces. TODO Goal for future implementation
     * without usage of explicit new. Key is generated by newInstance() function
     * here to verify this approach.
     *
     * @param uuId Universal index of onf interface-pac
     * @return list of alarms
     */
    public List<ProblemNotificationXml> readTheFaults(UniversalId interfacePacUuid,
            @Nonnull List<ProblemNotificationXml> resultList) {

        final Class<EquipmentPac> clazzPac = EquipmentPac.class;
        final Class<EquipmentPacKey> clazzPacKey = EquipmentPacKey.class;
        final Class<EquipmentCurrentProblems> clazzProblems = EquipmentCurrentProblems.class;
        // final Class<ContainerCurrentProblemTypeG> clazzProblem =
        // ContainerCurrentProblemTypeG.class;

        LOG.info("DBRead Get problems for class {} from mountpoint {} for uuid {}", clazzPac.getSimpleName(),
        		coreData.getMountpoint(), interfacePacUuid.getValue());

        try {
        	if (resultList == null) {
        		resultList = new ArrayList<>();
        	}
            // -- Specific part 1
            Constructor<EquipmentPacKey> cons = clazzPacKey.getConstructor(UniversalId.class); // Avoid new()
            InstanceIdentifier<EquipmentCurrentProblems>interfaceIID = InstanceIdentifier
                    .builder(clazzPac, cons.newInstance(interfacePacUuid)).child(clazzProblems).build();

            // -- Specific part 2
            EquipmentCurrentProblems problems = GenericTransactionUtils.readData(coreData.getDataBroker(),
                    LogicalDatastoreType.OPERATIONAL, interfaceIID);
            if (problems == null) {
                LOG.debug("DBRead Id {} no {}", interfacePacUuid, clazzProblems, clazzProblems.getName());
            } else if (problems.getCurrentProblemList() == null) {
                LOG.debug("DBRead Id {} no list {}", interfacePacUuid, clazzProblems.getName());
            } else {
                // -- Specific part 3
                for (CurrentProblemTypeG problem : problems.getCurrentProblemList()) {
                    resultList.add(new ProblemNotificationXml(coreData.getMountpoint(), interfacePacUuid.getValue(),
                            problem.getProblemName(), InternalSeverity.valueOf(problem.getProblemSeverity()),
                            problem.getSequenceNumber().toString(),
                            InternalDateAndTime.valueOf(problem.getTimeStamp())));
                }
            }
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException e) {
            LOG.warn("Could not reade instance of MwTdmContainerPacKey: ", e);
        }
        return resultList;
    }

    /**
     * Read problems of specific interfaces
     *
     * @param interfacePacUuid Universal index of Equipmentpac
     * @return EquipmentPac or null
     */
    public @Nullable EquipmentPac readEquipmentPac(UniversalId interfacePacUuid) {

        final Class<?> clazzPac = EquipmentPac.class;

        LOG.info("DBRead Get problems for class {} from mountpoint {} for uuid {}", clazzPac.getSimpleName(),
        		coreData.getMountpoint(), interfacePacUuid.getValue());

        InstanceIdentifier<EquipmentPac> equipmentIID = InstanceIdentifier
                .builder(EquipmentPac.class, new EquipmentPacKey(interfacePacUuid)).build();

        EquipmentPac res = GenericTransactionUtils.readData(coreData.getDataBroker(), LogicalDatastoreType.OPERATIONAL,
                equipmentIID);

        return res;
    }

}