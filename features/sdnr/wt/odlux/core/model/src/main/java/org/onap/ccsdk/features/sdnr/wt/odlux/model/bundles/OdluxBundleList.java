package org.onap.ccsdk.features.sdnr.wt.odlux.model.bundles;

import java.util.ArrayList;
import java.util.List;

public class OdluxBundleList extends ArrayList<OdluxBundle>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8365348398621906220L;

	public List<String> getNames(){
		final List<String> names=new ArrayList<String>();
		for(OdluxBundle b:this)
			names.add(b.getBundleName());
		return names;
	}

}
