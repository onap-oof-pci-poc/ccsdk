# MediatorServer

## Description
The mediator server is the physical device on which multiple instances of the [mediators](mediator/README.md) are running. Additionally a small webserver provides an API to control and create the mediators via HTTP-API. These mediators are translating the requests and responses between the SDN-Controller(netconf) and the device(snmp). Because of the restricted snmp protocol (port 162 only) we have to implement a prerouting automatism that forwards the alarms sent by the devices to another local port so that each mediator only gets the alarms of its device.



## Config-File

```
/etc/mediatorserver.conf
```

```
#global config file for mediatorserver

#Home Directory
home=/opt/snmp

#HOST IP
host=192.168.178.89
port=7071

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
loglevel=DEBUG
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
```

## HTTP-API

```
http://<host>:<port>/api/?task=<task>
```

| Task | additional Parameters | Description | Response (Success) |
| ---- | --------------------- | ----------- | ------------------ |
| create       | config=&lt;config-object&gt;  | create new mediator instance | {"code":1,"data":"&lt;string&gt;"}|
| delete       | name=&lt;name&gt; | delete mediator instance | \{"code":1,"data":&lt;string&gt;"} |
| start        | name=&lt;name&gt; | start mediator instance | \{"code":1,"data":"&lt;string&gt;"} |
| stop         | name=&lt;name&gt; | stop mediator instance | \{"code":1,"data":"&lt;string&gt;"} |
| getconfig    | name=&lt;name&gt;(optional) | Get current Config for all instances / named mediator instance | \{"code":1,"data":[&lt;config-objects&gt;]}|
| getlog       | name=&lt;name&gt;(optional) | Get LogEntries for all instances / named mediator instance | \{"code":1,"data":[]} |
| clearlock    | name=&lt;name&gt; | Clear Mediator Lock File | \{"code":1,"data":"&lt;string&gt;"} |
| getnemodels  | - | get all Network Element Template Filenames | \{"code":1,"data":[&lt;string-array&gt;]} |
| getncports   | limit=&lt;limit&gt;(optional) | get next free ports for Netconf Connections | \{"code":1,"data":[&lt;int-array&gt;]} |
| getsnmpports | limit=&lt;limit&gt;(optional) | get next free ports for SNMP Traps | \{"code":1,"data":[&lt;int-array&gt;]} |
| version      | - | get version info of server and mediator |  \{"code":1,"data":\{"server":"0.1.0","mediator":"0.1.1"\}\}|
| repair       | - | try to fix corrupted configs | \{"code":1,"data":[&lt;config-status-objects&gt;]}|

HTTP-Response is always a json-formatted String with 2 Elements:

* code ... 1:success 0:failure
* data ... if code==0: &lt;string&gt; else &lt;string | object&gt;


### JSON-Objects

Config-Object
```
{
  Name:<String>,
  DeviceType:<enum>,
  DeviceIp:<String>,
  DevicePort: <int>,
  TrapsPort:<Int>,
  NeModel:<XML Filename>,
  NcPort:<int>,
  ODLConfig:[
    {
      Server:<String>,
      Port:<int>,
      User:<String>,
      Password:<String>
    }
  ],
  PID:<int>,
  IsLocked:<boolean>,
  AutoRun:<boolean>,
  FwActive:<boolean>,
  IsNetconfConnected:<boolean>,
  IsNeConnected:<boolean>
}
```

Log-Object
```
{
  ts:"<Timestamp>",
  lvl:"<LogLevel>",
  src:"<Source>",
  msg:"<Message"
}
```


## Usage

All functionality which is not automated can be executed by the control script
```
bin/control.sh
```

| parameter     | description                                      |
| ------------- | ------------------------------------------------ |
|checkout       | get latest code from git repo                    |
|cpsrc          | copy binary files from source                    |
|cpxml          | copy xml files from source                       |
|build          | build sources                                    |
|make           | build sources and install bins and ressources    |
|start          | start server                                     |
|stop           | stop server                                      |
|stopall        | stop all mediators, then the server              |
|startmed [med] | start mediator with name [med]                   |
|stopmed [med]  | stop mediator with name [med]                    |
|status         | print status                                     |
|repair         | repair config files if corrupted                 |

