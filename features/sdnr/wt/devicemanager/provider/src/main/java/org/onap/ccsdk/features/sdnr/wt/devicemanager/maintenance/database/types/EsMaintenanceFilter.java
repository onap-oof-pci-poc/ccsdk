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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.maintenance.database.types;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.maintenance.mode.g.Filter;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.maintenance.mode.g.filter.Definition;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * One filter element to describe a maintenance status for an object referenced by definition.
 * TODO: Merge Filter and ES driven implementation
 */
public class EsMaintenanceFilter implements Filter {

    private static final Logger LOG = LoggerFactory.getLogger(EsMaintenanceFilter.class);

    private static ZoneId EsMaintenanceFilterTimeZone = ZoneId.of("UTC");
    //private static DateTimeFormatter FORMAT = DateTimeFormatter.ISO_DATE_TIME;       // "1986-04-08T12:30:00"
    private static DateTimeFormatter FORMAT = DateTimeFormatter.ISO_OFFSET_DATE_TIME;       // 2011-12-03T10:15:30+01:00
    private static ZonedDateTime EMPTYDATETIME = ZonedDateTime.ofInstant(Instant.EPOCH, EsMaintenanceFilterTimeZone);
    private static String EMPTY = "";

    //yang tools
    @JsonIgnore
    private final Map<java.lang.Class<? extends Augmentation<Filter>>, Augmentation<Filter>> augmentation = Collections.emptyMap();

    @JsonIgnore
    private ZonedDateTime start = EMPTYDATETIME;
    @JsonIgnore
    private ZonedDateTime end = EMPTYDATETIME;

    private EsMaintenanceFilterDefinition definition = new EsMaintenanceFilterDefinition();
    private String description = EMPTY;

    // For jackson
    public EsMaintenanceFilter() {
    }

    public EsMaintenanceFilter(Filter filter) {
        setStartAsString(filter.getStartDate());
        setEndAsString(filter.getEndDate());
        description = filter.getDescription();
        definition = new EsMaintenanceFilterDefinition(filter.getDefinition());
    }

    /*------
     * start
     */
    public ZonedDateTime getStart() {
        return start;
    }
    @JsonGetter("start")
    public String getStartAsString() {
        return toString(start);
    }
    public void setStart(ZonedDateTime start) {
        this.start = start;
    }
    @JsonSetter("start")
    public void setStartAsString(String startAsString) {
        this.start = valueOf(startAsString);
    }

    /*------
     * end
     */
    public ZonedDateTime getEnd() {
        return end;
    }
    @JsonGetter("end")
    public String getEndAsString() {
        return toString(end);
    }
    public void setEnd(ZonedDateTime end) {
        this.end = end;
    }
    @JsonSetter("end")
    public void setEndAsString(String endAsString) {
        this.end = valueOf(endAsString);
    }

    /*-----------------
     * other parameters
     */

    public EsMaintenanceFilterDefinition getDefinition2() {
        return definition;
    }
    public void setDefinition(EsMaintenanceFilterDefinition definition) {
        this.definition = definition;
    }
    @Override
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the actual time in the Filter time zone.
     * @return actual Time
     */
    public static ZonedDateTime getNow() {
        return ZonedDateTime.now(EsMaintenanceFilterTimeZone);
    }


    /**
     * Verify if the filter is active for an object
     * @param now point of time to verify
     * @return if the object is covered by filter and now within point of time
     */
    public boolean isInMaintenance(String objectIdRef, String problem, ZonedDateTime now) {
        return definition.appliesToObjectReference(objectIdRef, problem) && isInPeriod(start, end, now);
    }

    @Override
    public String toString() {
        return "EsMaintenanceFilter [start=" + start + ", end=" + end + ", definition=" + definition + ", description="
                + description + "]";
    }

    /*---------------------------------------------
     * YANG tools related functions for interface
     */

    @Override
    public Class<? extends DataContainer> getImplementedInterface() {
        return Filter.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <E extends Augmentation<Filter>> E getAugmentation(Class<E> augmentationType) {
        return (E) augmentation.get(augmentationType);
    }

    @Override
    public Definition getDefinition() {
        return definition;
    }

    @Override
    public String getStartDate() {
        return getStartAsString();
    }

    @Override
    public String getEndDate() {
        return getEndAsString();
    }

    /*---------------------------------------------
     * private static helper functions to verify
     */

    /**
     * Compare the if probe is within the range of start and end.
     * @param start of range
     * @param end of range
     * @param probe time to verify
     * @return boolean result true if (start <= probe <= end)
     */
    public static boolean isInPeriod(ZonedDateTime start, ZonedDateTime end, ZonedDateTime probe) {
          return start.compareTo(end) < 0 && start.compareTo(probe) <= 0 && end.compareTo(probe) >= 0;
        }

    /**
     * Convert to time value to String
     * @param ldt ZonedDateTime format
     * @return String output
     */
    public static String toString(ZonedDateTime ldt) {
        if(ldt==null) {
            return "";
        }
        return ldt.format(FORMAT);
    }

    /**
     * Convert String to time value
     * @param zoneTimeString with time
     * @return ZonedDateTime string
     */
    public static ZonedDateTime valueOf(String zoneTimeString) {
        if (zoneTimeString == null || zoneTimeString.isEmpty()) {
            LOG.warn("Null or empty zoneTimeString");
            return EMPTYDATETIME;
        }
        try {
            return ZonedDateTime.parse(zoneTimeString, FORMAT);
        } catch (DateTimeParseException e) {
            LOG.warn("Can not parse zoneTimeString '{}'",zoneTimeString);
            return EMPTYDATETIME;
        }
    }

}
