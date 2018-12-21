/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.onap.ccsdk.features.sdnr.wt.odlux.loader.exception;

public class OdluxLoaderException extends Exception {

    public OdluxLoaderException(final String message) {
        super(message);
    }

    public OdluxLoaderException(final String message, final Throwable throwable) {
        super(message, throwable);
    }
}