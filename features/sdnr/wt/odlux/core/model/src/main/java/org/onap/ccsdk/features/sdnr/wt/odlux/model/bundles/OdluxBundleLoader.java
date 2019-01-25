package org.onap.ccsdk.features.sdnr.wt.odlux.model.bundles;
       
public interface OdluxBundleLoader {

    public void addBundle(OdluxBundle bundle);

    public void removeBundle(OdluxBundle bundle);
}