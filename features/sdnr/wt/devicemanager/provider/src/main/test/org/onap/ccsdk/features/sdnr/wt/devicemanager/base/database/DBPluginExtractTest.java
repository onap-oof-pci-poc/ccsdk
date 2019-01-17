package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database;

import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtDatabaseNode;

public class DBPluginExtractTest {

    public static void main(String[] args)
    {
        HtDatabaseNode.checkorcreateplugins("/home/herbert/test");
    }
}
