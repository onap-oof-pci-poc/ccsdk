/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onap.ccsdk.features.sdnr.wt.helpserver.test;

import static org.junit.Assert.fail;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.helpserver.data.HelpInfrastructureObject;

public class TestHelpInfrastructure {

    @Test
    public void test() {

        final ClassLoader loader = this.getClass().getClassLoader();
        URL url = loader.getResource("help/meta.json");
        Path path;
        try {
            path = Paths.get(url.toURI());
            HelpInfrastructureObject helpInfrastuctureObject = new HelpInfrastructureObject(path);
            System.out.println("Help: "+helpInfrastuctureObject);
        } catch (URISyntaxException e) {
            fail(e.getMessage());
        }


    }

}
