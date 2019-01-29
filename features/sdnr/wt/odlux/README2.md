## Running in Karaf ccsdk container

### Install

Using karaf cmd line

     feature:repo-add mvn:org.onap.ccsdk.features.sdnr.wt/sdnr-wt-odlux-core-feature/0.3.2/xml/features
     feature:install sdnr-wt-odlux-core-feature
     bundle:install -s mvn:org.onap.ccsdk.features.sdnr.wt/sdnr-wt-odlux-app-connectApp/0.3.2
     bundle:install -s mvn:org.onap.ccsdk.features.sdnr.wt/sdnr-wt-odlux-app-faultApp/0.3.2
     bundle:install -s mvn:org.onap.ccsdk.features.sdnr.wt/sdnr-wt-odlux-app-inventoryApp/0.3.2

