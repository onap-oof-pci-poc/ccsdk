package org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.types;

import org.onap.ccsdk.features.sdnr.wt.database.base.EsObject;
import org.onap.ccsdk.features.sdnr.wt.database.query.EsQuery;
import org.onap.ccsdk.features.sdnr.wt.database.query.EsQueryBuilder;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ProblemNotificationXml;

/**
 * Event from Network to be recorded in the database
 *
 */

public class EsFaultCurrent extends EsObject {

    public static final String ESDATATYPENAME = "faultcurrent";
    //private static final String NOALARM = "NonAlarmed";

    private ProblemNotificationXml faultCurrent;

    public ProblemNotificationXml getProblem() {
        return faultCurrent;
    }

    public void setProblem(ProblemNotificationXml fault) {
        this.faultCurrent = fault;
        setEsId(fault.genSpecificEsId());
    }

    public boolean isNoAlarmIndication() {
        return faultCurrent.getSeverity().isNoAlarmIndication();
    }

    /**
     * TODO: termquery to matchquery, termquery with scoring, not exact matching
     * @param nodeName name of the node
     * @return query builder
     */
    public static EsQuery getQueryForOneNode( String nodeName) {
        return EsQueryBuilder.getTermQueryBuilder("faultCurrent.nodeName", nodeName);
    }
    public static EsQuery getQueryForAll() {
        return EsQueryBuilder.getMatchAllQuery();
    }

    public static EsQuery getQueryForOneNodeAndObjectId( String nodeName, String objectId) {
        return EsQueryBuilder.getQueryAandB("faultCurrent.nodeName", nodeName, "faultCurrent.objectId", objectId);
    }

    public static String getEsdatatypename() {
        return ESDATATYPENAME;
    }
 }
