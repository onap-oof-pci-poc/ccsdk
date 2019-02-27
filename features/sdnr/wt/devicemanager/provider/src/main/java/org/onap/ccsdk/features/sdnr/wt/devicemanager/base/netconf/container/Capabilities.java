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
/**
 * Convert capabilities of netconfnode into internal format. Boron and Carbon are providing
 * different versions
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.container;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.netconf.node.connection.status.AvailableCapabilities;
import org.opendaylight.yangtools.yang.common.QName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Wrapper class for capabilites for Boron and later releases. Uses generics because yang model was
 * changed from Boron to later version. Interface class:
 * org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.netconf.node.connection.status.available.capabilities.AvailableCapability
 */
public class Capabilities {

    private static final Logger LOG = LoggerFactory.getLogger(Capabilities.class);

    private static final String METHODNAME = "getCapability";
    private final List<String> capabilities = new ArrayList<>();
    private final DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    private Capabilities() {}

    public static Capabilities getAvailableCapabilities(NetconfNode nnode) {
        LOG.info("GetAvailableCapabilities for node");
        Capabilities capabilities = new Capabilities();
        if (nnode != null) {
            AvailableCapabilities availableCapabilites = nnode.getAvailableCapabilities();
            if (availableCapabilites != null) {
                capabilities.constructor(availableCapabilites.getAvailableCapability());
            } else {
                LOG.debug("empty capabilites");
            }
        } else {
            LOG.debug("No node provided");
        }
        return capabilities;
    }

    /**
     * Does all construction steps
     *
     * @param pcapabilities with a list of capabilities. <br>
     *        Type could be <br>
     *        - Boron: List<code><String></code> <br>
     *        - Carbon: List<AvailableCapability>
     */
    private void constructor(List<?> pcapabilities) {
        if (pcapabilities != null) {
            Method methodGetCapability;

            for (Object capability : pcapabilities) {

                if (capability instanceof String) { // ODL Boron specific
                    this.capabilities.add((String) capability);
                } else { // Carbon specific part .. handled via generics
                    try {
                        methodGetCapability = capability.getClass().getDeclaredMethod(METHODNAME);
                        methodGetCapability.setAccessible(true);
                        this.capabilities.add(methodGetCapability.invoke(capability).toString());
                    } catch (NoSuchMethodException | SecurityException | IllegalAccessException
                            | IllegalArgumentException | InvocationTargetException e) {
                        LOG.warn("Capability class with missing interface method {}: {} {} {}", METHODNAME,
                                e.getMessage(), capability.getClass(),
                                Arrays.toString(capability.getClass().getInterfaces()));
                    }
                }
            }
        }
    }

    /**
     * check if the namespace and its revision are supported by the given capabilities
     *
     * @param qCapability capability from the model
     * @return true if supporting the model
     */
    public boolean isSupportingNamespaceAndRevision(QName qCapability) {
        String namespace = qCapability.getNamespace().toString();
        String revision;
        Object revisionObject = qCapability.getRevision();
        if (revisionObject instanceof Optional) {
            if (((Optional<?>) revisionObject).isPresent()) {
                revisionObject = ((Optional<?>) revisionObject).get();
                LOG.info("Unwrapp Optional: {}", revisionObject.getClass());
            }
        }
        if (revisionObject instanceof String) {
            revision = (String) revisionObject;
        } else if (revisionObject instanceof Date) {
            revision = formatter.format((Date) revisionObject);
        } else {
            revision = revisionObject.toString();
            LOG.debug("Revision number type not supported. Use toString().String:{} Class:{} ", revisionObject,
                    revisionObject.getClass().getName());
        }
        LOG.trace("isSupportingNamespaceAndRevision: Model namespace {}?[revision {}]", namespace, revision);
        for (String capability : capabilities) {
            if (capability.contains(namespace) && capability.contains(revision)) {
                LOG.trace("Verify true with: {}", capability);
                return true;
            } else {
                LOG.trace("Verify false with: {}", capability);
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Capabilities [capabilities=" + capabilities + "]";
    }

}
