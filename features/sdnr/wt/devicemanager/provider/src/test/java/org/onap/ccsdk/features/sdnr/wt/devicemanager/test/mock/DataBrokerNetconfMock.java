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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test.mock;

import org.opendaylight.controller.md.sal.binding.api.BindingTransactionChain;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.DataChangeListener;
import org.opendaylight.controller.md.sal.binding.api.DataTreeChangeListener;
import org.opendaylight.controller.md.sal.binding.api.DataTreeIdentifier;
import org.opendaylight.controller.md.sal.binding.api.ReadOnlyTransaction;
import org.opendaylight.controller.md.sal.binding.api.ReadWriteTransaction;
import org.opendaylight.controller.md.sal.binding.api.WriteTransaction;
import org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType;
import org.opendaylight.controller.md.sal.common.api.data.TransactionChainListener;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

/**
 * @author herbert
 *
 */
@SuppressWarnings("deprecation")
public class DataBrokerNetconfMock implements DataBroker {


    ReadOnlyTransaction readOnlyTransaction;

    public void setReadOnlyTransaction(ReadOnlyTransaction readOnlyTransaction) {
        this.readOnlyTransaction = readOnlyTransaction;
    }

    @Override
    public <T extends DataObject, L extends DataTreeChangeListener<T>> ListenerRegistration<L> registerDataTreeChangeListener(
            DataTreeIdentifier<T> arg0, L arg1) {
        return null;
    }

    @Override
    public BindingTransactionChain createTransactionChain(TransactionChainListener listener) {
        return null;
    }

    @Override
    public ReadOnlyTransaction newReadOnlyTransaction() {
        return readOnlyTransaction;
    }

    @Override
    public ReadWriteTransaction newReadWriteTransaction() {
        return null;
    }

    @Override
    public WriteTransaction newWriteOnlyTransaction() {
        return null;
    }

    @Override
    public ListenerRegistration<DataChangeListener> registerDataChangeListener(LogicalDatastoreType store,
            InstanceIdentifier<?> path, DataChangeListener listener, DataChangeScope triggeringScope) {
        return null;
    }

}
