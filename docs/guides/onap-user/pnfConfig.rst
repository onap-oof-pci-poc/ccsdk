.. contents::
   :depth: 3
..

Configuration
=============

The application shows the actual values of all attributes of the
ONF-TR-532 for a selected physical network function (PNF). Each view of
a functional element is divide into capabilities, configuration, status,
current problem, current performance and history performance information
according to TR-532.

A separate window is available for modifying the configuration. All
changes made are sent to the device in a single NetConf bulk request.
The operator is notified about successfully configuring the device.

Implementation
--------------

The applications are implemented as OpenDaylight-DLUX web application
using the RestConf northbound interface of the SDN controller. The key
frameworks are: Maven, Angular.js, Bootstrap and UI-Grid.

Connections status information are updated automatically due to a web
socket for notifications from OpenDaylight to the browser.

Video
-----

https://youtu.be/QhchzRV2tac
