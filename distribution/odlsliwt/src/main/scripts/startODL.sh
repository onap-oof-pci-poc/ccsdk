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


# Install SDN-C platform components if not already installed and start container

ODL_HOME=${ODL_HOME:-/opt/opendaylight}
ODL_ADMIN_PASSWORD=${ODL_ADMIN_PASSWORD:-Kp8bJ4SXszM0WXlhak3eHlcse2gAw84vaoGGmJvUy2U}
CCSDK_HOME=${CCSDK_HOME:-/opt/onap/ccsdk}
SLEEP_TIME=${SLEEP_TIME:-120}
MYSQL_PASSWD=${MYSQL_PASSWD:-openECOMP1.0}


#
# Wait for database
#
if [ ! ${SDNR_STANDALONE} ]; then
    echo "Waiting for mysql"
    until mysql -h dbhost -u root -p${MYSQL_PASSWD} mysql &> /dev/null
    do
      printf "."
      sleep 1
    done
    echo -e "\nmysql ready"
fi
if [ ! -f ${CCSDK_HOME}/.installed ]
then
    echo "Installing SDN-C database"
    ${CCSDK_HOME}/bin/installSdncDb.sh
    # echo "Installing OpenDaylight host key"
    # ${CCSDK_HOME}/bin/installOdlHostKey.sh
    if [ -x ${CCSDK_HOME}/svclogic/bin/install.sh ]
    then
        echo "Installing directed graphs"
        ${CCSDK_HOME}/svclogic/bin/install.sh
    fi
    echo "Installed at `date`" > ${CCSDK_HOME}/.installed
fi

exec ${ODL_HOME}/bin/karaf server
