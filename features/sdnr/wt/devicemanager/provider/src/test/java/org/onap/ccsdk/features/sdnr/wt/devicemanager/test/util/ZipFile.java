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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile implements AutoCloseable {

    private final ZipOutputStream zos;
    private final FileOutputStream fos;

    public ZipFile(String zipPath) throws FileNotFoundException {
        fos = new FileOutputStream(zipPath);
        zos = new ZipOutputStream(fos);
    }

    public void addToZipFile(String fileName) throws FileNotFoundException, IOException {

        System.out.println("Writing '" + fileName + "' to zip file");

        InputStream fis = ZipFile.class.getClassLoader().getResourceAsStream(fileName);
        if (fis == null) {
            throw new FileNotFoundException("Resource not found: " + fileName);
        }

        ZipEntry zipEntry = new ZipEntry(fileName);
        zos.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zos.write(bytes, 0, length);
        }
        zos.closeEntry();
        fis.close();
    }

    @Override
    public void close() throws IOException {
        zos.close();
        fos.close();
    }

}
