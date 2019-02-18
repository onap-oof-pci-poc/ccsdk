/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test;

import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.toggleAlarmFilter.NotificationWithServerTimeStamp;

public class TestNotification {

    @Test
    public void test() {

        NotificationWithServerTimeStamp<Integer> test = new NotificationWithServerTimeStamp<>(1000);

        test.refresh(1000);
        test.getStartTime();

        System.out.println(test);

    }

}
