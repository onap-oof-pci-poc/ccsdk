export interface UnavailableCapability {
  capability: string;
  "failure-reason": string;
}

export interface NetconfNodeTopologyUnavailableCapabilities {
  "unavailable-capability": UnavailableCapability[];
}

export interface AvailableCapability {
  "capability-origin": string;
  capability: string;
}

export interface NetconfNodeTopologyAvailableCapabilities {
  "available-capability": AvailableCapability[];
}

export interface NetconfNodeTopologyClusteredConnectionStatus {
  "netconf-master-node": string
}

export interface TopologyNode {
  "node-id": string;
  "netconf-node-topology:clustered-connection-status": NetconfNodeTopologyClusteredConnectionStatus;
  "netconf-node-topology:unavailable-capabilities": NetconfNodeTopologyUnavailableCapabilities;
  "netconf-node-topology:available-capabilities": NetconfNodeTopologyAvailableCapabilities;
  "netconf-node-topology:host": string;
  "netconf-node-topology:connection-status": string;
  "netconf-node-topology:port": number;
}

export interface Topology {
  "topology-id": string;
  node: TopologyNode[];
}
