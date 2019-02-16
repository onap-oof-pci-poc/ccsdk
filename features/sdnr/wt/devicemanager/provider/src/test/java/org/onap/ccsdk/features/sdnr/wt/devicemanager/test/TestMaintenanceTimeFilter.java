/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.time.ZonedDateTime;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.maintenance.database.types.EsMaintenanceFilter;

public class TestMaintenanceTimeFilter {

    private static String DEFAULT1 = "EsMaintenanceFilter [start=1970-01-01T00:00Z[UTC], end=1970-01-01T00:00Z[UTC], definition=EsMaintenanceFilterDefinition [objectIdRef=, problem=], description=]";
    private static String DEFAULT2 = "EsMaintenanceFilter [start=1970-01-01T00:00Z[UTC], end=2018-01-01T10:00+05:00, definition=EsMaintenanceFilterDefinition [objectIdRef=, problem=], description=]";

    @Test
    public void test1() {
        EsMaintenanceFilter fi = new EsMaintenanceFilter();
        String fiAsString;

        fiAsString = fi.toString();
        System.out.println("Default 1: " + fiAsString);
        if (! fiAsString.equals(DEFAULT1)) {
            fail("Time conversion not OK");
        }
    }
    @Test
    public void test2() {
        EsMaintenanceFilter fi = new EsMaintenanceFilter();
        String fiAsString;

        fi.setEndAsString("2018-01-01T10:00:00+05:00");
        fiAsString = fi.toString();
        System.out.println("Default 2: " + fi);
        System.out.println("As String: " + fi.getEndAsString());
        if (! fiAsString.equals(DEFAULT2)) {
            fail("Time conversion not OK");
        }
    }
    @Test
    public void test3() {

        boolean res;

        ZonedDateTime start = ZonedDateTime.parse("2018-01-01T10:00:00+05:00");
        ZonedDateTime end = ZonedDateTime.parse("2019-01-01T10:00:00+05:00");
        ZonedDateTime now;

        now = ZonedDateTime.parse("2017-05-01T10:00:00+05:00");
        res = EsMaintenanceFilter.isInPeriod(start, end, now);
        System.out.println("Before: " + res);
        assertFalse("before period", res);

        now = ZonedDateTime.parse("2018-05-01T10:00:00+05:00");
        res = EsMaintenanceFilter.isInPeriod(start, end, now);
        System.out.println("Within: " + res);
        assertTrue("within period",res);

        now = ZonedDateTime.parse("2019-05-01T10:00:00+05:00");
        res = EsMaintenanceFilter.isInPeriod(start, end, now);
        System.out.println("After: " + res);
        assertFalse("after period", res);

    }

}
