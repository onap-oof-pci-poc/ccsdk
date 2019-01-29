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
import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.Resources;

public class ResTest {

    private static void testDuplicateKeyJSON()
    {
        try
        {
            String str=Resources.getFileContent("/elasticsearch/index/mwtn/modelDescription/CoreModel-ForMicrowave.json");

            JSONObject o=new JSONObject(str) {

                @Override
                public JSONObject putOnce(String key, Object value) throws JSONException {


                        Object storedValue;
                        if (key != null && value != null) {
                            if ((storedValue = this.opt(key)) != null ) {
                                if(!storedValue.equals(value)) {                         //Only through Exception for different values with same key
                                    //Replace
                                    System.out.println("duplicate found");
                                    this.remove(key);
                                    this.put(key, value);

                                } else {
                                    return this;
                                }
                            } else {
                                this.put(key, value);
                            }
                        }
                        return this;
                }
            };
            System.out.println(o.toString());
        }
        catch(IOException err)
        {
                err.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        JSONObject o=Resources.getJSONFile("/elasticsearch/index/sdnevents/sdneventsMapping.json");
        System.out.println(o==null?"null":o.toString());

        List<JSONObject> list=Resources.getJSONFiles("/elasticsearch/index", true);
        System.out.println("found "+list.size()+" valid json files");

        testDuplicateKeyJSON();

    }
}
