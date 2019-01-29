# Mediator

## Description


The mediator is a piece of software to translate get and set requests between the SDN-Controller and the device. In our case we translate from netconf to snmp and back. Additionally the mediator is listening for snmp traps to push them forward to the SDN-Controller.

## Usage

Standalone:
```
./Netconf2SNMPMediator.sh [--cli] ../test.config ../yang/yangNeModel
```
[MediatorServer](../../mediatorserver/):
```
./mediators/<name>/start.sh
```

## Config-File
```
{
    "Name":"<mediatorname-in-odl>",
    "DeviceType":<int-of-enum of device type>,
    "DeviceIP":"<remote Ip Address>",
    "TrapPort":<trap port>,
    "NeXMLFile":"<rel-path-to-xml-ne-filename>",
    "NcPort":<netconf-port>,
    "ODLConfig":[{"Server":"<odl-server-ip>","Port":<odl-http-port>,"User":"<odl-username>","Password":"<odl-password>"}],
    "IsNCConnected":false
}
```

## XML Ne File

The xml network element file is the central element of the mediator. It contains all information about the interfaces, their capabilities and everything else of information which get requested through netconf. To connect specific netconf values to device specific snmp values we use the xml attributes of the node element.

Attributes:

|Name | Value | Description |
| ----| ----  | ----------  |
|oid | &lt;oid dotted string&gt; | Attribute with SNMP mapping for given oid. For NETCONF-get, request content from Device|
|access | read-only / read-write | decides if only snmp-get or get and set-requests are allowed|
|conversion | &lt;conv-method&gt; | Convert the snmp-value to netconf-value and back|
|default | &lt;any value&gt; | the default netconf value if there is no response from the device |
|validator | regex | to validate the netconf value to avoid protocol errors |


Conversion methods:

Hint: All conversations shown here are the snmp-to-netconf value conversations. Some of these are working in both directions, some not.


| Conversion | bi-directional | Description | Example |
| ---------- |: -------------- :| ----------- | ------- |
|int-to-boolean | yes | Convert 1-true and not 1-false between boolean and int| 1=\>true, 0=\>false |
|int-to-boolean-dd,dd,dd-true | no | Convert listed numbers to true | |
|int-to-boolean-dd,dd,dd-false | no | Convert listed numbers to false|  |
|if-dd,dd,dd-term1-term2 | no | if value listed, result is *term1*, if not *term2*| |
|map-dd1,dd2,dd3-term1-term2 | yes | Bidirectional map dd1 to term1, dd2 to term2 and soon | |
|divide-dd1 | yes | Divide value by dd1| divide-10: 99 =\> 9.9 =\> 10|
|dividen-dd1 | yes | Divide value by (-1*dd1)| dividen-10: 99 =\> -9.9 =\> -10|
|internal | yes | use inernally hardcoded conversion method | qpsk =\> 4, 16qam =\> 16 |


## Alarms

