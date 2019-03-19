.. contents::
   :depth: 3
..

Fault Management
================

To operate a network, it is important to get an overview about the
currently raised alarms. The application offers basic fault management
of devices supporting ONF-TR-532. The alarms are classified according to
the severity level (warning, minor, major, critical).

Views
-----

The graphical user interface is separated in three views.

Current Alarms
~~~~~~~~~~~~~~

It list all current active faults in the network. In addition is also
list alarms send by the SDN controller itself, which detects connections
losses to the NetConf server (connectionLossOAM) or which detects
connection loss to a devices via a mediator to a device
(connectionLossNeOAM).

Alarm Notifications
~~~~~~~~~~~~~~~~~~~

As long as the view is open, it lists all alarm notification reached by
the SDN Controller. Please note that refreshing the view will start the
collection again. Previous alarm notification can be viewed in the alarm
log.

Alarm Log
~~~~~~~~~

Next to the current active alarms an alarm log list all alarm
notifications of the past.

Implementation
--------------

The application has two parts. While the server is listening for NetConf
notifications to store them in the data base the client retrieves the
information from the data base and displays them in a grid view.

The server synchronizes with the current alarm lists of the devices and
calculates based on raise and clear notifications the current alarm
status of the network. The current alarms are stored in a data base. In
addition all Problem Notifications received by the SDN controller are
stored. There is no logic implemented on the client.

An alarm status bar on top of each graphical user interface informs the
operator about the health status of the network.

The OpenDaylight DLUX web application uses web sockets for updating the
graphical user interface in case of Problem Notification (devices) and
Connection Status Notifications (ODL).

Video
-----

https://youtu.be/vONKAtFZ8wc
