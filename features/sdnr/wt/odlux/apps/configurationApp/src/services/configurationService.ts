
import { requestRest } from '../../../../framework/src/services/restService';

import { CoreModelNetworkElement, NameValue } from '../models/coreModel';
import { ViewSpecification } from '../models/uiModels';

export const getValueByName = (name: string, nameValuePairs: NameValue[], defaultValue: string | null = null): string | null => {
  const entry = nameValuePairs.find(p => p["value-name"] === name);
  return entry && entry.value || defaultValue;
};

class ConfigurationService {

  /** Gets the core model for a network element by its mountId. */
  public async getCoreModelByNodeId(nodeId: string): Promise<CoreModelNetworkElement | null> {
    const path = `restconf/config/network-topology:network-topology/topology/topology-netconf/node/${nodeId}/yang-ext:mount/core-model:network-element`;
    const ne = await requestRest<{ "network-element": CoreModelNetworkElement }>(path, { method: "GET" });
    return ne && ne["network-element"] || null;
  }

  public async getViewData(path: string): Promise<{} | null> {
    const viewData = await requestRest<{}>(path, { method: "GET" });
    return viewData || null;
  }

  /** Gets the UI description object for a capability of a network element. */
  public async getUIDescriptionByCapability(capability: string, revision: string | null): Promise<ViewSpecification[] | null> {
    const capFile = capability && revision && `${capability}@${revision}.json`;
    const coreModelResponse = capFile && await requestRest<{ views: ViewSpecification[] }>(`assets/${capFile}`, { method: "GET" }, false, true);
    return coreModelResponse && coreModelResponse.views || null;
  }

}

export const configurationService = new ConfigurationService();
export default configurationService;