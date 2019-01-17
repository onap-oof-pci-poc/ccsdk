package org.onap.ccsdk.features.sdnr.wt.devicemanager.maintenance.database.types;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import org.onap.ccsdk.features.sdnr.wt.database.base.EsObject;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.MaintenanceModeG;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.maintenance.mode.g.Filter;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Database record entry for maintenance mode, as specified.
 * Used for read operations
 * Structure:
 *    _id : Contains the mountpoint name, must be specified before read.
 *    startTime:  String representing Java LocalDateTime with absolute UTC Time
 *    endTime: String representing Java LocalDateTime with absolute UTC Time
 * JSON Structure example
     {
        "_index": "mwtn_v1",
        "_type": "maintenancemode",
        "_id": "LumpiWave-Z3",
        "_score": 1,
        "_source": {
            "node": "LumpiWave-Z3",
            "filter": [
                   {
                       "definition": {
                               "object-id-ref": "",
                               "problem": ""
                       },
                          "description": "",
                       "start": "2018-01-01T10:00+00:00",
                       "end": "2018-10-10T10:00+00:00"
                   },
                   {
                       "definition": {
                               "object-id-ref": "network-element",
                               "problem": "power-alarm"
                           },
                       "description": "",
                       "start": "2018-01-01T10:00+00:00",
                       "end": "2018-10-10T10:00+00:00"
                   }
           ]
        }
    },

 * Two filters for all element and one for network-element power-alarm
 */

public class EsMaintenanceMode extends EsObject implements MaintenanceModeG {

    @SuppressWarnings("unused")
    private static final Logger LOG = LoggerFactory.getLogger(EsMaintenanceMode.class);

    public static final String ESDATATYPENAME = "maintenancemode";

    private static final EsMaintenanceMode NOT_IN_MAINTENANCE = new EsMaintenanceMode("notinmaintenance");

    private String node;

    @JsonDeserialize(as = ArrayList.class)
    private List<EsMaintenanceFilter> filter;

    private boolean active;

    //for jackson
    public EsMaintenanceMode() {
        this.active=false;
        this.filter = new ArrayList<>();
    }

    public EsMaintenanceMode(String mountpoint) {
        this();
        this.setEsId(mountpoint);
        this.node = mountpoint;
    }

    public EsMaintenanceMode(MaintenanceModeG maintenanceModeG) {
        this.setEsId(maintenanceModeG.getMountpointName());
        this.node = maintenanceModeG.getNodeName();
        List<Filter> filters = maintenanceModeG.getFilter();
        if (filter != null) {
            for (Filter oneFilter : filters) {
                this.filter.add(new EsMaintenanceFilter(oneFilter));
            }
        }
    }


    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public List<EsMaintenanceFilter> getFilter2() {
        return filter;
    }

    public void setActive(boolean a)
    {this.active=a;}

    /**
     * Replace list with new one.
     * @param filterList new filter list
     */
    public void setFilter(List<EsMaintenanceFilter> filterList) {
        this.filter = filterList;
    }

    /**
     * Add one filter to internal list
     * @param pFilter the Filter
     */
    public void addFilter(EsMaintenanceFilter pFilter) {
        this.filter.add(pFilter);
    }

    /**
     * Verify maintenance status for objects problem.
     * @param objectIdRef object to check
     * @param problem to check
     * @param now actual time
     * @return true if in maintenance status, false if not in maintenance status
     */
    public boolean isONFObjectInMaintenance(String objectIdRef, String problem, ZonedDateTime now) {
        if(!active) {
            return false;
        }
        boolean res = false;
        if (this != NOT_IN_MAINTENANCE) {
            for (EsMaintenanceFilter oneFilter : filter) {
                if (oneFilter.isInMaintenance(objectIdRef, problem, now)) {
                    res = true;
                }
                    break;
            }
        }
        return res;
    }

    /** Shortcut **/
    public boolean isONFObjectInMaintenance(String objectIdRef, String problem) {
        return isONFObjectInMaintenance(objectIdRef, problem, EsMaintenanceFilter.getNow());
    }

    @Override
    public String toString() {
        return "EsMaintenanceMode [node=" + node + ", filter=" + filter + ", active=" + active + "]";
    }

    public static EsMaintenanceMode getNotInMaintenance() {
        return NOT_IN_MAINTENANCE;
    }

    /*---------------------------------------------
     * yang tools related functions
     */

    @Override
    public Class<? extends DataContainer> getImplementedInterface() {
        return MaintenanceModeG.class;
    }

    @Override
    public String getMountpointName() {
        return this.getEsId();
    }

     @Override
    public String getNodeName() {
        return node;
    }

    @Override
    public List<Filter> getFilter() {
        return filter.isEmpty() ? null : new ArrayList<>(filter);
    }

 }
