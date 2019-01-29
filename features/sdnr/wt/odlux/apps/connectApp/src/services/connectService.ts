import { RequiredNetworkElementType } from '../models/requiredNetworkElements';
import { MountedNetworkElementType } from 'models/mountedNetworkElements';
import { Topology, TopologyNode } from 'models/topologyNetconf';

import { requestRest } from '../../../../framework/src/services/restService';
import { Result, HitEntry } from '../../../../framework/src/models/elasticSearch';


/** 
 * Represents a web api accessor service for all Network Elements actions.
 */
class ConnectService {
  /**
    * Gets all known required network elements from the backend.
    */
  public async getAllRequiredNetworkElements(): Promise<(RequiredNetworkElementType & { _id: string })[] | null> {
    const path = 'database/mwtn/required-networkelement/_search';
    const query = { "query": { "match_all": {} } };
    
    const result = await requestRest<Result<RequiredNetworkElementType>>(path, { method: "POST", body: JSON.stringify(query) });
    return result && result.hits && result.hits.hits && result.hits.hits.map(ne => ({
      _id: ne._id,
      mountId: ne._source && ne._source.mountId,
      host: ne._source && ne._source.host,
      port: ne._source && ne._source.port,
      username: ne._source && ne._source.username,
      password: ne._source && ne._source.password,
    })) || null;
  }

  public async getRequiredNetworkElementByMountId(mountId:string): Promise<(RequiredNetworkElementType & { _id: string }) | null> {
    const path = `database/mwtn/required-networkelement/${mountId}`;
    
    const result = await requestRest<HitEntry<RequiredNetworkElementType> & { found: boolean }>(path, { method: "GET" });
    return result && result.found && result._source  && {
      _id: result._id,
      mountId:  result._source.mountId,
      host: result._source.host,
      port: result._source.port,
      username: result._source.username,
      password: result._source.password,
    } || null;

  }

  /**
    * Inserts data into the required network elements table.
    */
  public async insertRequiredNetworkElement(element: RequiredNetworkElementType): Promise<RequiredNetworkElementType | null> {
    const path = `database/mwtn/required-networkelement/${ element.mountId }`;
    const result = await requestRest<RequiredNetworkElementType>(path, { method: "POST", body: JSON.stringify(element) });
    return result || null;
  }

  /**
    * Deletes data from the Required Network Elements backend.
    */
  public async deleteRequiredNetworkElement(element: RequiredNetworkElementType): Promise<RequiredNetworkElementType | null> {
    const path = `database/mwtn/required-networkelement/${ element.mountId }`;
    const result = await requestRest<RequiredNetworkElementType>(path, { method: "DELETE", body: JSON.stringify(element) });
    return result || null;
  }

  

  private static mapTopologyNode = (mountPoint: TopologyNode, required: boolean ) => {
    // handle onfCapabilities
    let onfCapabilities: { module: string, revision: string }[] | undefined = undefined;
    let onfCoreModelRevision: string[] | undefined = undefined;
    let onfAirInterfaceRevision: string[] | undefined = undefined;

    const capId = 'netconf-node-topology:available-capabilities';
    if (mountPoint[capId] && mountPoint[capId]['available-capability']) {
      onfCapabilities = mountPoint[capId]['available-capability'].filter((cap) => {
        return cap.capability.includes('?revision=');
      }).map((cap) => {
        return {
          module: cap.capability.split(')')[1],
          revision: cap.capability.split('?revision=')[1].substring(0, 10)
        };
      }).sort((a, b) => {
        if (a.module < b.module) return -1;
        if (a.module > b.module) return 1;
        return 0;
      });
    }

    // handle clustered-connection-status
    const statusId = 'netconf-node-topology:clustered-connection-status';
    let client = 'localhost';

    if (mountPoint[statusId] && mountPoint[statusId]['netconf-master-node']) {
      let node = mountPoint[statusId]['netconf-master-node'];
      node = node.substring(node.indexOf('@'));
      client = node.substring(1, node.indexOf(':'));
    }
    const mountId = mountPoint["node-id"];
    return {
      mountId: mountId,
      host: mountPoint["netconf-node-topology:host"],
      port: mountPoint["netconf-node-topology:port"],
      connectionStatus: mountPoint['netconf-node-topology:connection-status'],
      capabilities: onfCapabilities || [],
      required: required,
      client
    }
  }

  /** Get all mounted network elements and fills the property required according to the database contents. */
  public async getMountedNetworkElementsList(): Promise<MountedNetworkElementType[] | null> {
    const path = 'restconf/operational/network-topology:network-topology/topology/topology-netconf';
    
    const topologyRequestPomise = requestRest<{ topology: Topology[] | null }>(path, { method: "GET" }, true);
    const requiredNetworkElementsPromise = this.getAllRequiredNetworkElements();

    const [netconfResponse, requiredNetworkElements] = await Promise.all([topologyRequestPomise, requiredNetworkElementsPromise]);

    // process topologyNetconf (get all known network elements)
    const topologyNetconf = netconfResponse && netconfResponse.topology && netconfResponse.topology.find(topology => topology["topology-id"] === 'topology-netconf');
    let mountPoints = topologyNetconf && topologyNetconf.node && topologyNetconf.node.filter(
      mountPoint => mountPoint['node-id'] !== 'controller-config').map(mountedElement => {
        const required = requiredNetworkElements && requiredNetworkElements.some(
          requiredElement => requiredElement.mountId === mountedElement["node-id"]);
        return ConnectService.mapTopologyNode(mountedElement, !!required);
      });

    return mountPoints || [];
  }

  /** Get one mounted network element. */ 
  public async getMountedNetworkElementByMountId(mountId: string): Promise<MountedNetworkElementType | null> {
    const path = 'restconf/operational/network-topology:network-topology/topology/topology-netconf/node/' + mountId;
    const getMountedNetworkElementByMountIdPromise = requestRest<{ node: TopologyNode[] | null }>(path, { method: "GET" }, true);
    const getRequiredNetworkElementByMountIdPromise = this.getRequiredNetworkElementByMountId(mountId);

    const [mountedNetworkElement, requiredNetworkElement] = await Promise.all([getMountedNetworkElementByMountIdPromise, getRequiredNetworkElementByMountIdPromise]);
    return mountedNetworkElement && mountedNetworkElement.node && ConnectService.mapTopologyNode(mountedNetworkElement.node[0], requiredNetworkElement && requiredNetworkElement.mountId === mountedNetworkElement.node[0]["node-id"] || false) || null;
  }
  
  /** Mounts an required network element. */
  public async mountNetworkElement(networkElement: RequiredNetworkElementType): Promise<boolean> {
    const path = 'restconf/config/network-topology:network-topology/topology/topology-netconf/node/' + networkElement.mountId;
    const mountXml = [
      '<node xmlns="urn:TBD:params:xml:ns:yang:network-topology">',
      `<node-id>${ networkElement.mountId }</node-id>`,
      `<host xmlns="urn:opendaylight:netconf-node-topology">${ networkElement.host }</host>`,
      `<port xmlns="urn:opendaylight:netconf-node-topology">${ networkElement.port }</port>`,
      `<username xmlns="urn:opendaylight:netconf-node-topology">${ networkElement.username }</username>`,
      `<password xmlns="urn:opendaylight:netconf-node-topology">${ networkElement.password }</password>`,
      '  <tcp-only xmlns="urn:opendaylight:netconf-node-topology">false</tcp-only>',

      '  <!-- non-mandatory fields with default values, you can safely remove these if you do not wish to override any of these values-->',
      '  <reconnect-on-changed-schema xmlns="urn:opendaylight:netconf-node-topology">false</reconnect-on-changed-schema>',
      '  <connection-timeout-millis xmlns="urn:opendaylight:netconf-node-topology">20000</connection-timeout-millis>',
      '  <max-connection-attempts xmlns="urn:opendaylight:netconf-node-topology">100</max-connection-attempts>',
      '  <between-attempts-timeout-millis xmlns="urn:opendaylight:netconf-node-topology">2000</between-attempts-timeout-millis>',
      '  <sleep-factor xmlns="urn:opendaylight:netconf-node-topology">1.5</sleep-factor>',

      '  <!-- keepalive-delay set to 0 turns off keepalives-->',
      '  <keepalive-delay xmlns="urn:opendaylight:netconf-node-topology">120</keepalive-delay>',
      '</node>'].join('');
    
    try {
      const result = await requestRest<{}>(path, {
        method: 'PUT',
        headers: {
          'Content-Type': 'application/xml',
          'Accept': 'application/xml',
          'Authorization': 'Basic YWRtaW46YWRtaW4='
        },
        body: mountXml
      }, true);
      // expect an empty answer
      return result === null; 
    } catch {
      return false;
    }
  };

  /** Unmounts a network element by its id. */
  public async unmountNetworkElement(mountId: string): Promise<boolean> {
    const path = 'restconf/config/network-topology:network-topology/topology/topology-netconf/node/' + mountId;
  
    try {
      const result = await requestRest<{}>(path, {
        method: 'DELETE',
        headers: {
          'Content-Type': 'application/xml',
          'Accept': 'application/xml',
          'Authorization': 'Basic YWRtaW46YWRtaW4='
        },
      }, true);
      // expect an empty answer
      return result === null; 
      
    } catch {
      return false;
    }
  };


}
export const connectService = new ConnectService();
export default connectService;
