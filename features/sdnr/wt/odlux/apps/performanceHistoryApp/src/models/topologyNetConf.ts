export interface TopologyNode {
  "node-id": string;
  "netconf-node-topology:connection-status": string;
}

/**
 * Represents restConf network element topology.
 */
export interface Topology {
  "topology-id": string;
  "node": TopologyNode[];
}
