package org.onap.ccsdk.features.sdnr.wt.devicemodel.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NetworkElement;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NetworkElementBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.g.Name;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.g.NameBuilder;

public class Test1 {

    @Test
    public void test() {

        NetworkElementBuilder networkElementBuilder = new NetworkElementBuilder();

        NameBuilder nameBuilder = new NameBuilder();
        nameBuilder.setValueName("name");
        nameBuilder.setValue("Device1");
        List<Name> nameList = new ArrayList<>();
        nameList.add(nameBuilder.build());
        networkElementBuilder.setName(nameList);


        NetworkElement ne = networkElementBuilder.build();

        System.out.println(ne.toString());

        //fail("Not yet implemented");
    }

}
