###
# ============LICENSE_START=======================================================
# ONAP : CCSDK
# ================================================================================
# Copyright (C) 2018 AT&T Intellectual Property. All rights
# 							reserved.
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
ODL_HOME=${ODL_HOME:-/opt/opendaylight/current}
if [ ! -f ${ODL_HOME}/etc/host.key ]
then
	echo "Installing karaf host key"
	umask 022
    mv ${ODL_HOME}/etc/org.apache.karaf.shell.cfg ${ODL_HOME}/etc/org.apache.karaf.shell.cfg.sav
    cat ${ODL_HOME}/etc/org.apache.karaf.shell.cfg.sav | sed -e "s/hostKeyFormat = simple/hostKeyFormat = PEM/" > ${ODL_HOME}/etc/org.apache.karaf.shell.cfg
    openssl genrsa -out /opt/opendaylight/current/etc/host.key 4096
fi