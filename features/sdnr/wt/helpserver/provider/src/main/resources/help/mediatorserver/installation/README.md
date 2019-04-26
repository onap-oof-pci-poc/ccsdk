# MediatorServer

## Manual Installation

### Install prerequisites

```
sudo apt-get install jq curl
```
Installing Java

for production
```
sudo apt-get install openjdk-8-jre

```

for development
```
sudo apt-get install openjdk-8-jdk
sudo apt-get install git maven

```

### Create user
```
useradd mediators
```

### Choose a home directory for all mediatorserver files
```
mkdir /opt/snmp

```

### Create folder infrastructure
```
cd /opt/snmp
mkdir bin
mkdir mediators
mkdir nemodel
mkdir yang
mkdir source (only for dev-env)

```

### Copy files to folders
```
bin/control.sh
bin/clean_all.sh
bin/debug.sh
bin/mediatorserver.sh
bin/Netconf2SNMPMediator.sh
bin/Netconf2SNMPMediator.jar
bin/init_script.sh
bin/firewall_status.sh
bin/unlock_all.sh
bin/firewall.sh
bin/MediatorServer.jar
bin/stop_all.sh
bin/start_all.sh
```

```
nemodel/DragonWave-HCP.xml
nemodel/ActionTEC_ECB6200.xml
nemodel/ActionTEC_ECB6000.xml
nemodel/DVM_MWCore12_BasicAir.xml
nemodel/DragonWave-HQ.xml
nemodel/DragonWave-HQdev.xml
nemodel/CommScope.xml
```

```
yang/yangNeModel
yang/yangNeModel/G_874_1_model-Imported_Information_Object_Classes-Q_822@2016-08-11.yang
yang/yangNeModel/MicrowaveModel-ObjectClasses-PureEthernetStructure@2016-09-02.yang
yang/yangNeModel/yuma-proc@2012-10-10.yang
yang/yangNeModel/nc-notifications@2008-07-14.yang
yang/yangNeModel/CoreModel-CoreFoundationModule-TypeDefinitions@2016-07-01.yang
yang/yangNeModel/ietf-inet-types@2010-09-24.yang
yang/yangNeModel/onf-ptp-dataset@2017-05-08.yang
yang/yangNeModel/yuma-system@2014-11-27.yang
yang/yangNeModel/onf-ethernet-conditional-packages@2017-04-02.yang
yang/yangNeModel/MicrowaveModel-ObjectClasses-SuperClasses@2016-08-09.yang
yang/yangNeModel/ietf-ptp-dataset@2017-02-08.yang
yang/yangNeModel/MicrowaveModel-ObjectClasses-TdmContainer@2016-09-02.yang
yang/yangNeModel/ietf-netconf-acm@2012-02-22.yang
yang/yangNeModel/MicrowaveModel-Notifications@2016-08-09.yang
yang/yangNeModel/MicrowaveModel-ObjectClasses-HybridMwStructure@2016-09-02.yang
yang/yangNeModel/microwave-model@2017-03-24.yang
yang/yangNeModel/MicrowaveModel-ObjectClasses-AirInterfaceDiversity@2016-09-02.yang
yang/yangNeModel/G_874_1_model-Type_Definitions@2016-07-10.yang
yang/yangNeModel/CoreModel-CoreFoundationModule-StateModel@2016-08-09.yang
yang/yangNeModel/G_874_1_model-Imported_Information_Object_Classes-X_739@2016-07-10.yang
yang/yangNeModel/ietf-system@2014-08-06.yang
yang/yangNeModel/G_874_1_model-Imported_Information_Object_Classes-X_721@2016-07-10.yang
yang/yangNeModel/MicrowaveModel-ObjectClasses-AirInterface@2016-09-01.yang
yang/yangNeModel/onf-core-model-conditional-packages@2017-04-02.yang
yang/yangNeModel/MicrowaveModel-NetworkElement-CurrentProblemList@2016-11-20.yang
yang/yangNeModel/core-model@2017-03-20.yang
yang/yangNeModel/g.874.1-model@2017-03-20.yang
yang/yangNeModel/ietf-yang-library@2016-04-09.yang
yang/yangNeModel/yuma-time-filter@2011-08-13.yang
yang/yangNeModel/yuma-mysession@2010-05-10.yang
yang/yangNeModel/G_874_1_model-Imported_Data_Types@2016-07-10.yang
yang/yangNeModel/yuma-ncx@2012-01-13.yang
yang/yangNeModel/ietf-yang-types@2013-07-15.yang
yang/yangNeModel/MicrowaveModel-ObjectClasses-EthernetContainer@2016-09-02.yang
yang/yangNeModel/notifications@2008-07-14.yang
yang/yangNeModel/ietf-netconf-monitoring@2010-10-04.yang
yang/yangNeModel/CoreModel-CoreFoundationModule-SuperClassesAndCommonPackages@2016-07-10.yang
yang/yangNeModel/ietf-restconf@2013-10-19.yang
yang/yangNeModel/yuma-app-common@2012-08-16.yang
yang/yangNeModel/yuma-types@2012-06-01.yang
yang/yangNeModel/CoreModel-CoreNetworkModule-ObjectClasses@2016-08-11.yang
yang/yangNeModel/MicrowaveModel-TypeDefinitions@2016-09-02.yang
yang/yangNeModel/ietf-netconf-with-defaults@2011-06-01.yang
yang/yangNeModel/ietf-netconf@2011-06-01.yang
yang/yangNeModel/ietf-netconf-partial-lock@2009-10-19.yang
yang/yangNeModel/G_874_1_model-Object_Classes@2016-07-10.yang
yang/yangNeModel/ietf-inet-types@2013-07-15.yang
yang/yangNeModel/CoreModel-CoreNetworkModule-TypeDefinitions@2016-07-10.yang
yang/yangNeModel/yuma-arp@2012-01-13.yang
yang/yangNeModel/iana-crypt-hash@2014-04-04.yang
yang/notification
yang/notification/readme.md
yang/notification/notifications@2008-07-14.yang
```

and change all rights to the extra created user
```
sudo chown -R mediators:mediators /opt/snmp
```

### Create mediatorserver config file

```
sudo nano /etc/mediatorserver.conf
```
example:
```
#Home Directory
home=/opt/snmp

#HOST IP
host=192.168.178.89
port=7070

#Port range for Netconf
ncrangemin=4000
ncrangemax=6000

#Port Range for SNMP
snmprangemin=10000
snmprangemax=12000

#PortRange for JMX
jmxrangemin=6001
jmxrangemax=7000

#Log (ERROR | WARN | DEBUG | INFO | TRACE )
loglevel=WARN
logfile=/var/log/mediatorserver.log

#=====================================
#global MediatorConfig

#set LogLevel (ERROR | WARN | DEBUG | INFO | TRACE )
MediatorLogLevel=DEBUG

#set ping timeout in milliseconds
MediatorDevicePingTimeout=2000

#set latency for snmp requests
MediatorSnmpLatency=2000

#set java memory for mediator instance
MediatorMemory="-Xmx256m -Xms128m"

#====================================
```


### Create mediatorserver systemd daemon

```
sudo nano /etc/systemd/system/mediatorserver.service
```

```
[Unit]
Description=mediatorserver
After=network.target

[Service]
WorkingDirectory=/opt/snmp/
SyslogIdentifier=MediatorServer
ExecStart=/opt/snmp/bin/mediatorserver.sh
User=mediators
Type=oneshot

[Install]
WantedBy=multi-user.target

```

### Initial create mediator server logfile with correct file permissions
```
sudo touch /var/log/mediatorserver.log
sudo chown mediators:mediators /var/log/mediatorserver.log
```

### Activate mediatorserver systemd daemon
```
systemctl enable mediatorserver.service
systemctl daemon-reload
```

Now you can start and stop the service as you like
```
sudo service mediatorserver [start | stop]
```

### Install cron jobs
```
sudo crontab -e
```
```
*/2 * * * * /bin/bash /opt/snmp/bin/firewall.sh >> /var/log/firewall.log
*/2 * * * * /bin/bash /opt/snmp/bin/clean_all.sh > /dev/null 2>&1
```

### Test Accessibility of the HTTP-API with console 
```
curl http://localhost:7070/api/?task=version
```
or directly in your browser
```
http://<mediator-server-ip>:7070/api/?task=version
```
should respond with something like this:
```
{"code":1,"data":{"server":"0.1.0","mediator":"0.1.1"}}
```

