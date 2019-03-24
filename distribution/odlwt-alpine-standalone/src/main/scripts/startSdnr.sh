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


function enable_odl_cluster(){

  if [ -z $CCSDK_REPLICAS ]; then
     echo "SDNC_REPLICAS is not configured in Env field"
     exit
  fi

  echo "Installing Opendaylight cluster features"
  mv $ODL_HOME/etc/org.apache.karaf.features.cfg $ODL_HOME/etc/org.apache.karaf.features.cfg.orig
  cat $ODL_HOME/etc/org.apache.karaf.features.cfg.orig | sed -e "\|featuresBoot=config|s|$|,odl-mdsal-clustering,odl-jolokia|" > $ODL_HOME/etc/org.apache.karaf.features.cfg
  #${ODL_HOME}/bin/client feature:install odl-mdsal-clustering
  #${ODL_HOME}/bin/client feature:install odl-jolokia

  echo "Update cluster information statically"
  hm=$(hostname)
  echo "Get current Hostname ${hm}"

  node=($(echo ${hm} | tr '-' '\n'))
  node_name=${node[0]}
  node_index=${node[1]}

  if [ -z $PEER_ODL_CLUSTER ]; then
    echo "This is a local cluster"
    node_list="";
    for ((i=0;i<${SDNC_REPLICAS};i++));
    do
      node_list="${node_list} ${node_name}-$i.$DOMAIN"
    done
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
SDNRWT=${SDNRWT:-true}
ENABLE_ODL_CLUSTER=${ENABLE_ODL_CLUSTER:-false}
CCSDK_REPLICAS=${CCSDK_REPLICAS:-1}
DOMAIN=${DOMAIN:-"sdnhost-cluster.onap.svc.cluster.local"}


if [ ! -d ${INSTALLED_DIR} ]
then
    mkdir -p ${INSTALLED_DIR}
fi

if [ ! -f ${INSTALLED_DIR}/.installed ]
then

    if $ENABLE_ODL_CLUSTER ; then enable_odl_cluster ; fi

    echo "Installed at `date`" > ${INSTALLED_DIR}/.installed
fi

#exec ${ODL_HOME}/bin/karaf server

# Prepare features
if [ -z "$SDNRWT" ] ; then
    ${CCSDK_HOME}/bin/prepareSdnrWt.sh
fi

# Start ODL Controller in background
$ODLBIN/start
# Wait till container is running
sleep 20

# Install additional features
if [ -z "$SDNRWT" ] ; then
    echo "Install SDNR"
    ${CCSDK_HOME}/installFeatureSdnrWt.sh
fi
# Start client that is running till odl terminates
exec $ODLBIN/client

