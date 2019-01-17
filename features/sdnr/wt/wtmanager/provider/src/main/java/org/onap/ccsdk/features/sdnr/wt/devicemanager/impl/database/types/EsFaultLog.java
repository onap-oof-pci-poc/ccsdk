package org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.types;

import org.onap.ccsdk.features.sdnr.wt.database.base.EsObject;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ProblemNotificationXml;

/**
 *
 * Event from Network to be recorded in the database
 *
 */

public class EsFaultLog extends EsObject {

    public static final String ESDATATYPENAME = "faultlog";

    private ProblemNotificationXml fault;

    public ProblemNotificationXml getProblem() {
        return fault;
    }

    public void setProblem(ProblemNotificationXml fault) {
        this.fault = fault;
    }

    public static String getEsdatatypename() {
        return ESDATATYPENAME;
    }

 }
