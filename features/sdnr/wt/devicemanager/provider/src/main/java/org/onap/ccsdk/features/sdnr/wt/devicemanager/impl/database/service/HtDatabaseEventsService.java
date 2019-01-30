/*******************************************************************************
 * ============LICENSE_START========================================================================
 * ONAP : ccsdk feature sdnr wt
 * =================================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property. All rights reserved.
 * =================================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * ============LICENSE_END==========================================================================
 ******************************************************************************/
package org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDataBaseReaderAndWriter;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseClientAbstract;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseNode;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.IndexClientBuilder;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.ONFCoreNetworkElement12Equipment;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.types.EsEventBase;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.types.EsFaultCurrent;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.types.EsFaultLog;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.types.equipment.EsEquipment;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.types.equipment.EsToplevelEquipment;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.types.equipment.ExtendedEquipment;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.AttributeValueChangedNotificationXml;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.MwtNotificationBase;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ObjectCreationNotificationXml;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ObjectDeletionNotificationXml;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ProblemNotificationXml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Event service, writing all events into the database into the appropriate index.
 *
 * @author herbert
 */
public class HtDatabaseEventsService {
    private static final Logger LOG = LoggerFactory.getLogger(HtDatabaseEventsService.class);

    ///** Filename in the resources with maven initialized version information  */
    //private static final String RESOURCENAME = "version.properties"; // could also be a constant
    ///** Index name to be used */
    private static final String INDEX = "sdnevents";
    private static final String MAPPING = "/elasticsearch/index/sdnevents/sdneventsMapping.json";

    private HtDatabaseClientAbstract client;
    private HtDataBaseReaderAndWriter<EsEventBase> eventRWEventLog;
    private HtDataBaseReaderAndWriter<EsFaultCurrent> eventRWFaultCurrent;
    private HtDataBaseReaderAndWriter<EsFaultLog> eventRWFaultLog;
    private HtDataBaseReaderAndWriter<EsEquipment> eventRWEquipment;
    private HtDataBaseReaderAndWriter<EsToplevelEquipment> eventRWToplevelEquipment;


    // --- Construct and initialize

    public HtDatabaseEventsService(HtDatabaseNode database) {

        LOG.info("Create {} start", HtDatabaseEventsService.class);

        try {
            // Create control structure
            IndexClientBuilder clientBuilder = IndexClientBuilder.getBuilder(INDEX).setMappingSettingJsonFileName(MAPPING);
            client = clientBuilder.create(database);
            clientBuilder.close();

            eventRWEventLog = new HtDataBaseReaderAndWriter<>(client, EsEventBase.ESDATATYPENAME, EsEventBase.class);
            eventRWFaultLog = new HtDataBaseReaderAndWriter<>(client, EsFaultLog.ESDATATYPENAME, EsFaultLog.class);
            eventRWFaultCurrent = new HtDataBaseReaderAndWriter<>(client, EsFaultCurrent.ESDATATYPENAME, EsFaultCurrent.class);
            eventRWToplevelEquipment = new HtDataBaseReaderAndWriter<>(client, EsToplevelEquipment.ESDATATYPENAME, EsToplevelEquipment.class);
            eventRWEquipment = new HtDataBaseReaderAndWriter<>(client, EsEquipment.ESDATATYPENAME, EsEquipment.class);


        } catch (Exception e) {
            LOG.error("Can not start database client. Exception: {}", e.getMessage());
        }
        LOG.info("Create {} finished. DB Service {} started.", HtDatabaseEventsService.class,  client != null ? "sucessfully" : "not" );
    }

    // --- Function

    public void writeEventLog(ObjectCreationNotificationXml event) {
        writeEventGeneric(event);
    }

    public void writeEventLog(ObjectDeletionNotificationXml event) {
        writeEventGeneric(event);
    }

    public void writeEventLog(AttributeValueChangedNotificationXml event) {
        writeEventGeneric(event);
    }

    private void writeEventGeneric(MwtNotificationBase event) {
        if (client == null) {
            LOG.debug("No DB, can not write: {}",event.toString());
            return;
        }

        LOG.debug("Write event: {}",event.toString());
        EsEventBase eventBase = new EsEventBase();
        eventBase.setProblem(event);
        eventRWEventLog.doWrite(eventBase);
    }

    public void writeFaultLog(ProblemNotificationXml fault) {
        if (client == null) {
            LOG.debug("No DB, can not write: {}",fault.toString());
            return;
        }

        LOG.debug("Write fault to faultlog: {}",fault.toString());
        EsFaultLog eventProblem = new EsFaultLog();
        eventProblem.setProblem(fault);
        eventRWFaultLog.doWrite(eventProblem);
    }

    public void updateFaultCurrent(ProblemNotificationXml fault) {
        if (client == null) {
            LOG.debug("No DB, can not write: {}",fault.toString());
            return;
        }

        if (!fault.isNotManagedAsCurrentProblem()) {
            EsFaultCurrent eventProblem = new EsFaultCurrent();
            eventProblem.setProblem(fault);

            if (eventProblem.isNoAlarmIndication()) {
                LOG.debug("Remove from currentFaults: {}",fault.toString());
                eventRWFaultCurrent.doRemove(eventProblem);
            } else {
                LOG.debug("Write to currentFaults: {}",fault.toString());
                eventRWFaultCurrent.doWrite(eventProblem);
            }
        } else {
            LOG.debug("Ingnore for currentFaults: {}",fault.toString());
        }
    }

    /**
     * Remove all entries for one node
     * @param nodeName contains the mountpointname
     * @return number of deleted entries
     */
    public int clearFaultsCurrentOfNode(String nodeName) {
        if (client == null) {
            LOG.debug("No DB, can not delete for node: {}", nodeName);
            return -1;
        }
        LOG.debug("Remove from currentFaults all faults for node: {}", nodeName);
        return eventRWFaultCurrent.doRemoveByQuery(EsFaultCurrent.getQueryForOneNode(nodeName));
    }

    /**
     * Remove all entries for one node
     * @param nodeName contains the mountpointname
     * @param objectId of element to be deleted
     * @return number of deleted entries
     */
    public int clearFaultsCurrentOfNodeWithObjectId(String nodeName, String objectId) {
        if (client == null) {
            LOG.debug("No DB, can not delete for node: {}", nodeName);
            return -1;
        }
        LOG.debug("Remove from currentFaults all faults for node/objectId: {}/{}", nodeName, objectId);
        return eventRWFaultCurrent.doRemoveByQuery(EsFaultCurrent.getQueryForOneNodeAndObjectId(nodeName, objectId));

    }

    /**
     * Deliver list with all mountpoint/node-names in the database.
     * @return List of all mountpoint/node-names the had active alarms.
     */
    public @Nonnull List<String> getAllNodesWithCurrentAlarms() {
        if (client == null) {
            LOG.debug("No DB, can not delete for all nodes");
            return new ArrayList<>();
        }
        LOG.debug("Remove from currentFaults faults for all node");
        List<String> nodeNames = new ArrayList<>();

        for (EsFaultCurrent fault : eventRWFaultCurrent.doReadAll()) {
            String nodeName = fault.getProblem().getNodeName();
            if (!nodeNames.contains(nodeName)) {
                //this.clearFaultsCurrentOfNode(nodeName); -> Function shifted
                nodeNames.add(nodeName);
            }
        }
        return nodeNames;
    }


    /**
     * Write inventory to DB
     * @param equipment all equipment of network element
     */
    public void writeInventory(ONFCoreNetworkElement12Equipment equipment) {
        if (client == null) {
            LOG.debug("No DB, can not write for mountpoint: {}",equipment.getMountpoint());
            return;
        }

        LOG.debug("Write inventory to database for mountpoint: {}",equipment.getMountpoint());

        EsToplevelEquipment esToplevelEquipment = new EsToplevelEquipment();
        esToplevelEquipment.set(equipment);
        eventRWToplevelEquipment.doWrite(esToplevelEquipment);

        List<ExtendedEquipment> equipmentList = equipment.getEquipmentList();
        EsEquipment esEquipment;
        for (ExtendedEquipment equipment1 : equipmentList) {
            esEquipment = new EsEquipment();
            esEquipment.set(equipment.getMountpoint(), equipment1);
            eventRWEquipment.doWrite(esEquipment);
        }
    }


}
