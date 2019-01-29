# Connect

The 'Connect' application on OpenDaylight provides up-to-date connectivity information about the wireless devices in the network. It automatically displays new network elements and their connection status. Despite the network elements usually automatically mount themselves, an additional small window allows manually mounting devices/mediators. For better understanding alarms and status, a connection status log lists all the connection status changes of OpenDaylight mount points.

## Views

The graphical user interfaces is divided in four sections.

### Required Network Elements

Required Network Elements are physical network functions, which are planned or expected in the network. This means the identifier, IP addresses and its required configuration is well-known and available in a planning database or in ONAP A&AI.

### Unknown Network Elements

Most of the physical network function support an automatic registration procedure to the SDN controller. It may  happen, that devices are connected to the SDN Controller but not available in planning data. 

It might be a normal occurrence for very cheap devices, where an entire planning process to too expensive. But is may also happen that the identifier used in planning process differ from the identifier currently configured in the device. 

### Mount NetConf Server

The view offer manually configuration of a device. The SDN controller will then start connecting the NetConf server. 

### Connection Status Log

The log lists the connections status changes between SDN Controller and NetConf servers (devices).


## Video

https://youtu.be/QhchzRV2tac