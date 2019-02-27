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
package org.onap.ccsdk.features.sdnr.wt.websocketmanager2.test;

import static org.junit.Assert.*;

import org.json.JSONArray;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.utils.UserScopes;

public class UserScopeTest {

    private static final String SCOPE1 ="scope1";
    private static final String SCOPE2 ="scope2";
    private static final String SCOPE3 ="scope3";
    private static final String SCOPE4 ="scope4";

    @Test
    public void test() {
        UserScopes scopes1 = new UserScopes();
        JSONArray json1=new JSONArray();
        json1.put(SCOPE1);
        json1.put(SCOPE2);
        json1.put(SCOPE3);
        scopes1.setScopes(json1);

        assertTrue(scopes1.hasScope(SCOPE1));
        assertFalse(scopes1.hasScope(SCOPE4));
    }

}
