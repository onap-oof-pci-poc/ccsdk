/*******************************************************************************
 * ============LICENSE_START=======================================================
 * ONAP : ccsdk feature sdnr wt
 *  ================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property.
 * All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 ******************************************************************************/
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.toggleAlarmFilter;

public class NotificationWithServerTimeStamp<T2> {
    private final T2 alarmNotification;
    private T2 contraAlarmNotification;
    private final long timestampStart;
    private long timestamp;

    public NotificationWithServerTimeStamp(T2 n) {
        this(n, System.currentTimeMillis());
    }

    public NotificationWithServerTimeStamp(T2 n, long ts) {
        this.alarmNotification = n;
        this.contraAlarmNotification = null;
        this.timestamp = ts;
        this.timestampStart=ts;
    }

    @SuppressWarnings("unused")
    public long getStartTime() {
        return this.timestampStart;
    }
    public void refresh() {
        this.refresh(System.currentTimeMillis());
    }

    public void refresh(long ts) {
        this.timestamp = ts;
    }

    public void setContraEvent(T2 notification) {
        this.contraAlarmNotification = notification;
        this.refresh();
    }

    public void clrContraEvent() {
        this.contraAlarmNotification = null;
        this.refresh();
    }

    public boolean isStable(long now) {
        return this.timestamp + NotificationDelayFilter.getDelay() < now;
    }

    @SuppressWarnings("unused")
    public T2 getAlarmNotification() {
        return this.alarmNotification;
    }

    public T2 getContraAlarmNotification() {
        return this.contraAlarmNotification;
    }

    @Override
    public String toString() {
        return "NotificationWithServerTimeStamp [alarmNotification=" + alarmNotification
                + ", contraAlarmNotification=" + contraAlarmNotification + ", timestampStart=" + timestampStart
                + ", timestamp=" + timestamp + "]";
    }
}
