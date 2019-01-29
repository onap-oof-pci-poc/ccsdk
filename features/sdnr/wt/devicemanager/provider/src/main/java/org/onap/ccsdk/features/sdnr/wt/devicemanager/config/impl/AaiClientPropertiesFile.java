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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AaiClientPropertiesFile{

    private final File mFile;
    private String mPCKS12CertFilename;
    private String mPCKS12Passphrase;
    private boolean mTrustInsecureSSL;
    private String mApplicationIdentifier;
    private String mRemoteUrl;
    private int mConnectionTimeout;
    private int mReadTimeout;

    public String getFilename()
    { return this.mFile.getAbsolutePath();    }
    public String getPCKS12CertFilename()
    {return this.mPCKS12CertFilename;}
    public String getPCKS12Passphrase()
    {return this.mPCKS12Passphrase;    }
    public boolean trustInsecureSSL()
    {return this.mTrustInsecureSSL;}
    public String getApplicationIdentifier()
    {return this.mApplicationIdentifier;}
    public String getRemoteUrl()
    {return this.mRemoteUrl;}
    public int getConnectionTimeout()
    {return this.mConnectionTimeout;}
    public int getReadTimeout()
    {return this.mReadTimeout;}

    public boolean exists()
    {return this.mFile.exists();}
    public AaiClientPropertiesFile(String filename)
    {
        this.mFile=new File(filename);
    }
    public void load() throws IOException,NumberFormatException
    {
        Properties defaultProps = new Properties();
        FileInputStream in = new FileInputStream(this.mFile);
        defaultProps.load(in);
        this.mPCKS12CertFilename=defaultProps.getProperty("org.onap.ccsdk.sli.adaptors.aai.ssl.key",null);
        this.mPCKS12Passphrase=defaultProps.getProperty("org.onap.ccsdk.sli.adaptors.aai.ssl.key.psswd",null);
        this.mTrustInsecureSSL=defaultProps.getProperty("org.onap.ccsdk.sli.adaptors.aai.host.certificate.ignore","false").equals("true");
        this.mApplicationIdentifier=defaultProps.getProperty("org.onap.ccsdk.sli.adaptors.aai.application",null);
        this.mRemoteUrl=defaultProps.getProperty("org.onap.ccsdk.sli.adaptors.aai.uri",null);
        this.mConnectionTimeout=Integer.parseInt(defaultProps.getProperty("connection.timeout","60000"));
        this.mReadTimeout=Integer.parseInt(defaultProps.getProperty("read.timeout","60000"));
        in.close();
    }

}
