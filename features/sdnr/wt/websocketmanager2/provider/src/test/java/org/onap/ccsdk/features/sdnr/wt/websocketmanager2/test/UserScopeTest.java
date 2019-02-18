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
