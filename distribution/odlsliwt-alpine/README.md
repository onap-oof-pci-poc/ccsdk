# Wireless transport micro services (wt)

This distribution uses the ONAP SLI image "onap/ccsdk-odlsli-alpine-image" to create the ONAP SLI WT Container

Configuration used by this container
- Linux alpine as OS
- ODL as single node
- Added bundles are Repository: 'ccsdk/features'/sdnr

## startup configuration

    featuresBoot=config,standard,region,package,kar,ssh,management,
          odl-mdsal-all,odl-netconf-all,odl-netconf-connector-all,adl-restconf-all,odl-mdsal-apidocs,odl-daexim-all,
          ccsdk-sli-core-all,ccsdk-sli-adaptors-all,ccsdk-sli-northbound-all,ccsdk-sli-plugins-all,ccsdk-features-all,
          sdnr-wt-feature-aggregator        

