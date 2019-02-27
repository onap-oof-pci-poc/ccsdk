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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.container.ONFLayerProtocolName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.extension.g.Extension;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.extension.g.ExtensionBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.LpBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.LpKey;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.network.element.Ltp;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.network.element.LtpBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.network.element.LtpKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.netconf.node.connection.status.AvailableCapabilitiesBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.netconf.node.connection.status.available.capabilities.AvailableCapability;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.netconf.node.connection.status.available.capabilities.AvailableCapabilityBuilder;
import org.opendaylight.yangtools.yang.common.QName;

public class ObjectBuilder {

    static AvailableCapabilitiesBuilder getAvailableCababilitiesList(QName... qNames) {
        return getAvailableCababilitiesList(null, qNames);
    }

    static AvailableCapabilitiesBuilder getAvailableCababilitiesList(AvailableCapabilitiesBuilder valueBuilder,
            QName... qNames) {
        if (valueBuilder == null) {
            valueBuilder = new AvailableCapabilitiesBuilder();
        }
        List<AvailableCapability> capabilites = new ArrayList<>();
        for (QName s : qNames) {
            AvailableCapabilityBuilder capabilityBuilder = new AvailableCapabilityBuilder();
            capabilityBuilder.setCapability(s.toString());
            capabilites.add(capabilityBuilder.build());
        }
        valueBuilder.setAvailableCapability(capabilites);
        return valueBuilder;
    }

    static Extension getExtension(String valueName, String value) {
        ExtensionBuilder lpExtension = new ExtensionBuilder();
        lpExtension.setValueName(valueName);
        lpExtension.setValue(value);
        return lpExtension.build();
    }

    static Ltp getLtp(Class<?> clazz, QName qname, ONFLayerProtocolName onflayerProtocolName) {
        String baseName = clazz.getSimpleName();
        LpBuilder lpBuilder = new LpBuilder();
        lpBuilder.setKey(new LpKey(new UniversalId(baseName + "LpKey")));
        lpBuilder.setLayerProtocolName(new LayerProtocolName(onflayerProtocolName.getValue()));
        lpBuilder.setExtension(Arrays.asList(getExtension("capability", qname.getNamespace().toString()),
                getExtension("revision", qname.getRevision().get().toString()),
                getExtension("conditional-package", qname.getLocalName())));

        LtpBuilder ltpBuilder = new LtpBuilder();
        ltpBuilder.setUuid(new UniversalId(baseName));
        ltpBuilder.setLp(Arrays.asList(lpBuilder.build()));
        ltpBuilder.setKey(new LtpKey(new UniversalId(baseName + "LtpKey")));
        return ltpBuilder.build();
    }

}
