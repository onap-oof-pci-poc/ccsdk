package org.onap.ccsdk.features.sdnr.wt.helpserver.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.helpserver.data.ExtactBundleResource;
import org.onap.ccsdk.features.sdnr.wt.helpserver.data.HelpInfrastructureObject;

public class TestHelpInfObject {

    private static final String GETHELPDIRECTORYBASE = "data";
    private static final String ROOT = "tmp";
    private static final String CONTENT = "abc";

    @Before
    public void init() {
        try {
            ExtactBundleResource.deleteRecursively(new File(GETHELPDIRECTORYBASE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @After
    public void deinit() {
        this.init();
    }
    @Test
    public void test() {
        File root=new File(HelpInfrastructureObject.getHelpDirectoryBase()+"/"+ROOT);
        TestMyServlet.createHelpFile("/"+ROOT+"/test/0.4.0/README.md", CONTENT);
        TestMyServlet.createHelpFile("/"+ROOT+"/test2/0.4.0/README.md", CONTENT);
        TestMyServlet.createHelpFile("/"+ROOT+"/test3/abc/0.4.0/README.md", CONTENT);
        TestMyServlet.createHelpFile("/"+ROOT+"/test3/abc1/0.4.0/README.md", CONTENT);
        TestMyServlet.createHelpFile("/"+ROOT+"/test5/0.4.0/README.md", CONTENT);

        try {
            new HelpInfrastructureObject(root.toPath());
        } catch (URISyntaxException e) {
            fail(e.getMessage());
        }


    }


}
