/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test.mock;

import org.opendaylight.controller.md.sal.binding.api.NotificationService;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.yang.binding.NotificationListener;

public class NotificationServiceMock implements NotificationService {

    @Override
    public <T extends NotificationListener> ListenerRegistration<T> registerNotificationListener(T listener) {
        return null;
    }

}
