/*
 * Copyright (c) 2014, 2015 Inocybe Technologies, and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.onap.ccsdk.features.sdnr.wt.odlux.loader;

/**
 * Service to register module with dlux.
 */
public interface OdluxModuleLoader {

    public void addModule(Module module);

    public void removeModule(Module module);
}