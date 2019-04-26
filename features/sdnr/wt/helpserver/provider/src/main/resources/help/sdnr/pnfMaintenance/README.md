# Maintenance

The 'Maintenance' application on the OpenDaylight provides the information of the Network Elements which are set for Maintenance, currently or in the future.
User can manage devices to set the maintenance mode so that no unnecessary alarms are created. 
When the device is in Maintenace alarms are not forwarded to DCAE and when the device maintenance is turned off the alarms will start flowing again.

'Active' field in this application shows if the Network Element is in maintenance mode currently or not.
If it is 'active' it means the Network Element is currently undergoing maintenance, If 'not active' it means maintenance might have been set for future or maintenance is already completed.

Users have access to disable the Maintenance mode or change the maintenance start and end dates at any point of time by using the  available options in actions column.
