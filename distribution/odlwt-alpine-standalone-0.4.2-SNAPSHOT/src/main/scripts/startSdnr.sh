#!/bin/bash

###
# ============LICENSE_START=======================================================
# openECOMP : SDN-C
# ================================================================================
# Copyright (C) 2017 AT&T Intellectual Property. All rights
#                             reserved.
# ================================================================================
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
# ============LICENSE_END=========================================================
###

# Add features to featureBoot karaf file
# $1 additional feature to be added
# $2 repositories to be added (optional)
function addToFeatureBoot() {
  CFG=$ODL_HOME/etc/org.apache.karaf.features.cfg
  ORIG=$CFG.orig
  if [ -n "$2" ] ; then
    echo "Add repository: $2"
    mv $CFG $ORIG
    cat $ORIG | sed -e "\|featuresRepositories|s|$|,$2|" > $CFG
  fi
  echo "Add boot feature: $1"
  mv $CFG $ORIG
  cat $ORIG | sed -e "\|featuresBoot *=|s|$|,$1|" > $CFG
}

# Install SDNR functionality and activate netconf for cluster or single node setup
# Par $ENABLE_ODL_CLUSTER: true for cluster setup or false for single node setup
# Par $SDNRWT_REPOSITORY: (optional) Repository for sdnr wt features
# Par $SDNRWT_BOOTFEATURES: Override SDNRWT_BOOTFEATURES
function install_sdnr_wt() {
  if [ -n "$SDNRWT_BOOTFEATURES" ] ; then
      BOOTFEATURES="$SDNRWT_BOOTFEATURES"
  else
	  if $ENABLE_ODL_CLUSTER ; then
	    BOOTFEATURES="odl-netconf-clustered-topology,sdnr-wt-feature-aggregator"
	  else
	    BOOTFEATURES="odl-netconf-topology,sdnr-wt-feature-aggregator"
	  fi
  fi
  addToFeatureBoot "$BOOTFEATURES" $SDNRWT_REPOSITORY
}

function enable_odl_cluster(){
  if [ -z $SDNC_REPLICAS ]; then
     echo "SDNC_REPLICAS is not configured in Env field"
     exit
  fi

  echo "Installing Opendaylight cluster features"
  mv $ODL_HOME/etc/org.apache.karaf.features.cfg $ODL_HOME/etc/org.apache.karaf.features.cfg.orig
  cat $ODL_HOME/etc/org.apache.karaf.features.cfg.orig | sed -e "\|featuresBoot *=|s|$|,odl-mdsal-clustering,odl-jolokia|" > $ODL_HOME/etc/org.apache.karaf.features.cfg
  #${ODL_HOME}/bin/client feature:install odl-mdsal-clustering
  #${ODL_HOME}/bin/client feature:install odl-jolokia

  echo "Update cluster information statically"
  hm=$(hostname)
  echo "Get current Hostname ${hm}"

  node=($(echo ${hm} | tr '-' '\n'))
  node_name=${node[0]}
  node_index=${node[1]}
  if [ -z ${DOMAIN+x} ]; then
     node_domain=".sdnhost-cluster.onap.svc.cluster.local"
  else
     if [ -z "$DOMAIN" ] ; then
        node_domain=""
     else
        node_domain=".$DOMAIN"
     fi
  fi

  if [ -z $PEER_ODL_CLUSTER ]; then
    echo "This is a local cluster"
    node_list="";
    for ((i=0;i<${SDNC_REPLICAS};i++));
    do
      node_list="${node_list} ${node_name}-$i$node_domain"
    done
    echo "Node list: ${node_list[@]}"
    /opt/opendaylight/current/bin/configure_cluster.sh $((node_index+1)) ${node_list}
  fi

}

# Install SDN-C platform components if not already installed and start container

ODL_HOME=${ODL_HOME:-/opt/opendaylight}
ODL_ADMIN_PASSWORD=${ODL_ADMIN_PASSWORD:-Kp8bJ4SXszM0WXlhak3eHlcse2gAw84vaoGGmJvUy2U}
CCSDK_HOME=${CCSDK_HOME:-/opt/onap/ccsdk}
SLEEP_TIME=${SLEEP_TIME:-120}
MYSQL_PASSWD=${MYSQL_PASSWD:-openECOMP1.0}
INSTALLED_DIR=${INSTALLED_FILE:-/opt/opendaylight/current/daexim}
ENABLE_ODL_CLUSTER=${ENABLE_ODL_CLUSTER:-false}
SDNC_REPLICAS=${SDNC_REPLICAS:-1}

SDNRWT=${SDNRWT:-true}
SDNRWT_REPOSITORY=${SDNRWT_REPOSITORY}
SDNRWT_BOOTFEATURES=${SDNRWT_BOOTFEATURES}

echo "Settings:"
echo "  ENABLE_ODL_CLUSTER=$ENABLE_ODL_CLUSTER"
echo "  SDNC_REPLICAS=$SDNC_REPLICAS"
echo "  SDNRWT=$SDNRWT"

if [ ! -d ${INSTALLED_DIR} ]
then
    mkdir -p ${INSTALLED_DIR}
fi

if [ ! -f ${INSTALLED_DIR}/.installed ]
then
	# Prepare ODL boot configuration and features
    if $ENABLE_ODL_CLUSTER ; then enable_odl_cluster ; fi
	if $SDNRWT ; then install_sdnr_wt ; fi
    echo "Installed at `date`" > ${INSTALLED_DIR}/.installed
fi

# Start ODL Controller
$ODL_HOME/bin/karaf server
