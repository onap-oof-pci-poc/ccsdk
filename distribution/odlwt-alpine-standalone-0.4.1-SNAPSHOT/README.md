# Wireless transport micro services (wt)

This distribution uses the ONAP ODL image "onap/ccsdk-odl-fluorine-alpine-image" to create the ONAP WT Container.
There is no dependency to other ONAP Servers.
This version is including 0.4.1-SNAPSHOT features.

Configuration used by this container
- Linux alpine as OS
- ODL as single node or cluster node
- Added bundles are Repository: 'ccsdk/features'/sdnr
- ENTRYPOINT /opt/onap/ccsdk/bin/startSdnr.sh
- ODLUX Login:
    - ODL Default is user here: admin/admin

## Creation of 0.4.1-SNAPSHOUT Version for ODL Flurine SR1

The ONAP Dublin parents 1.2.1-SNAPSHOT and 1.2.1 are creating the bundles for ODL Flourine SR1.
Parents with higher version number are creating bundles for ODL Floutine SR2.

Prerequ: Ubuntu with development setup for ONAP with access to ONAP Nexus.

Steps to create a Flourine SR1 Version, by example for using 0.4.2-SNAPSHOT:

     cd features/sdnr/wt
     cp -r wt wt-0.4.1
     cd wt-0.4.1
     sed -i 's#<version>1.2.2-SNAPSHOT</version>#<version>1.2.1-SNAPSHOT</version>#g' $(find . -name "pom.xml")
     sed -i 's#<version>0.4.2-SNAPSHOT</version>#<version>0.4.1-SNAPSHOT</version>#g' $(find . -name "pom.xml")

Hint: It could occur that the versin number is used by something in the pom.xml.
As a check use grep command with the version nmumbers to replace:

     grep "<version>1\.2\.1-SNAPSHOT</version>" $(find . -name pom.xml)


## Parameters

* SDNRWT true|false
    - Switch on the SDNRWT feature.

### Cluster specific

* Node index, provided via host-name
    - Format name-n
    - n defines the host index. Starts with 0 .. N-1. Index of the cluster node that is started.

* --env SDNC_REPLICAS=n
    - n Number of cluster members.

* --env PEER_ODL_CLUSTER="true"
    - Set to any value for non GEO redundant setup.

* --env ENABLE_ODL_CLUSTER="true"
    - Mandatory to enable cluster configuration

### Examples

#### Start single node

 docker run imageName

#### Start three node clusters

 docker run imageName --env NODE_INDEX="1" --env NODE_LIST="10.42.167.43 10.42.168.2 192.168.178.65"
 docker run imageName --env NODE_INDEX="2" --env NODE_LIST="10.42.167.43 10.42.168.2 192.168.178.65"
 docker run imageName --env NODE_INDEX="3" --env NODE_LIST="10.42.167.43 10.42.168.2 192.168.178.65"


### Reference
  [Opendaylight cluster configuration](https://docs.opendaylight.org/en/stable-nitrogen/getting-started-guide/common-features/clustering.html)

## Container ports

    docker run --detach --network="yaml_default" \
      --link ccsdk_db_container:dbhost --link ccsdk_db_container:sdnctldb01 --link ccsdk_db_container:sdnctldb02 \
      --publish 8181:8181 \
      --publish 8185:8185 \
      --publish 8085:8085 \
      --publish 9200:9200 \
      --env MYSQL_ROOT_PASSWORD=openECOMP1.0 \
      --env SDNC_CONFIG_DIR=/opt/onap/ccsdk/data/properties \

      --name sdnr \
    "$IMAGE"


