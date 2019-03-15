import { requestRest } from '../../../../framework/src/services/restService';
import { Result } from '../../../../framework/src/models/elasticSearch';

import { ConnectedNetworkElements } from '../models/connectedNetworkElements';
import { DistinctLtp, Ltp } from '../models/availableLtps';
import { Topology, TopologyNode } from '../models/topologyNetConf';

/** 
 * Represents a web api accessor service for Network elements actions.
 */
class PerformanceService {

  private static networkElementTopology = (mountPoint: TopologyNode) => {
    const mountId = mountPoint["node-id"];
    return {
      mountId: mountId,
    }
  }

  /**
   * Get all connected network elements from restconf.
   */
  public async getConnectedNetworkElementsList(): Promise<ConnectedNetworkElements[] | null> {
    const path = "restconf/operational/network-topology:network-topology/topology/topology-netconf";
    const topologyRequestPomise = requestRest<{ topology: Topology[] | null }>(path, { method: "GET" }, true);
    const [netconfResponse] = await Promise.all([topologyRequestPomise]);
    const topologyNetconf = netconfResponse && netconfResponse.topology && netconfResponse.topology.find(topology => topology["topology-id"] === "topology-netconf");
    let mountPoints = topologyNetconf && topologyNetconf.node && topologyNetconf.node.filter(
      mountPoint => mountPoint["netconf-node-topology:connection-status"] == "connected").map(mountedElement => {
        return PerformanceService.networkElementTopology(mountedElement);
      });
    return mountPoints || [];
  }

  /**
   * Get distinct ltps based on the selected network element and time period from the historicalperformance15min database table.
   */
  public async getDistinctLtpsFrom15minDatabase(networkElement: string): Promise<Ltp[] | null> {
    const path = 'database/sdnperformance/historicalperformance15min/_search';
    const query = {
      "size": 0,
      "query": {
        "match": {
          "node-name": networkElement
        }
      },
      "aggs": {
        "uuid-interface": {
          "terms": {
            "field": "uuid-interface"
          }
        }
      }
    };
    const result = await requestRest<Result<DistinctLtp>>(path, { method: "POST", body: JSON.stringify(query) });
    if(result && result.aggregations) {
    }
    return result && result.aggregations && result.aggregations["uuid-interface"].buckets.map(ne=>({
      key:ne.key
    }))|| null;
  }

  /**
   * Get distinct ltps based on the selected network element and time period from the historicalperformance24h database table.
   */
  public async getDistinctLtpsFrom24hoursDatabase(networkElement: string): Promise<Ltp[] | null> {
    const path = 'database/sdnperformance/historicalperformance24h/_search';
    const query = {
      "size": 0,
      "query": {
        "match": {
          "node-name": networkElement
        }
      },
      "aggs": {
        "uuid-interface": {
          "terms": {
            "field": "uuid-interface"
          }
        }
      }
    };
    const result = await requestRest<Result<DistinctLtp>>(path, { method: "POST", body: JSON.stringify(query) });
    if(result && result.aggregations) {
    }
    return result && result.aggregations && result.aggregations["uuid-interface"].buckets.map(ne=>({
      key:ne.key
    }))|| null;
  }
}

export const PerformanceHistoryService = new PerformanceService();
export default PerformanceHistoryService;
