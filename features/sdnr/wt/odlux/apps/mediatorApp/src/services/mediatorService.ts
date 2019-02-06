import * as $ from 'jquery';

import { requestRest } from '../../../../framework/src/services/restService';
import { MediatorServer, MediatorServerVersionInfo, MediatorConfig, MediatorServerDevice, MediatorConfigResponse } from '../models/mediatorServer';
import { HitEntry } from '../../../../framework/src/models';

export const mediatorServerResourcePath = "mwtn/mediator-server";

type MediatorServerResponse<TData> = { code: number, data: TData };
type IndexableMediatorServer = MediatorServer & { [key: string]: any; } ;

/** 
 * Represents a web api accessor service for all mediator server actions.
 */
class MediatorService {
  /**
    * Inserts data into the mediator servers table.
    */
  public async insertMediatorServer(server: IndexableMediatorServer): Promise<MediatorServer | null> {
    const path = `database/${mediatorServerResourcePath}`;
    const data = Object.keys(server).reduce((acc, cur) => {
      if (cur !== "_id") acc[cur] = server[cur];
      return acc;
    }, {} as IndexableMediatorServer);
    const result = await requestRest<MediatorServer>(path, { method: "POST", body: JSON.stringify(data) });
    return result || null;
  }

  /**
    * Updates data into the mediator servers table.
    */
  public async updateMediatorServer(server: IndexableMediatorServer): Promise<MediatorServer | null> {
    const path = `database/${mediatorServerResourcePath}/${server._id}`;
    const data = Object.keys(server).reduce((acc, cur) => {
      if (cur !== "_id") { acc[cur] = server[cur] } else { acc["id"] = 0 };
      return acc;
    }, {} as IndexableMediatorServer);
    const result = await requestRest<MediatorServer>(path, { method: "PUT", body: JSON.stringify(data) });
    return result || null;
  }

  /**
    * Deletes data from the mediator servers table.
    */
  public async deleteMediatorServer(server: MediatorServer): Promise<MediatorServer | null> {
    const path = `database/${mediatorServerResourcePath}/${server._id}`;
    const result = await requestRest<MediatorServer>(path, { method: "DELETE" });
    return result || null;
  }

  public async getMediatorServerById(serverId: string): Promise<MediatorServer | null> {
    const path = `database/${mediatorServerResourcePath}/${serverId}`;
    const result = await requestRest<HitEntry<MediatorServer> & { found: boolean }>(path, { method: "GET" });
    return result && result.found && result._source && {
      _id: result._id,
      name: result._source.name,
      url: result._source.url,
    } || null;
  }

  // https://cloud-highstreet-technologies.com/wiki/doku.php?id=att:ms:api

  private accassMediatorServer<TData ={}>(mediatorServerUrl: string, task: string, data?: {}): Promise<MediatorServerResponse<TData> | null> {
    const url = `${mediatorServerUrl}/api/?task=${task}`;
    // return (await requestRest<{ code: number, data: TData}>(path, { method: "POST" })) || null ;
    return new Promise<{ code: number, data: TData }>((resolve, reject) => {
      $.post({
        url,
        data: data,
        //contentType: 'application/json'
      }).then((result: any) => {
        if (typeof result === "string") {
          resolve(JSON.parse(result));
        } else {
          resolve(result);
        };
      });
    });
  }

  public async getMediatorServerVersion(mediatorServerUrl: string): Promise<MediatorServerVersionInfo | null> {
    const result = await this.accassMediatorServer<MediatorServerVersionInfo>(mediatorServerUrl, 'version');
    if (result && result.code === 1) return result.data;
    return null;
  }

  public async getMediatorServerAllConfigs(mediatorServerUrl: string): Promise<MediatorConfigResponse[] | null> {
    const result = await this.accassMediatorServer<MediatorConfigResponse[]>(mediatorServerUrl, 'getconfig');
    if (result && result.code === 1) return result.data;
    return null;
  }

  public async getMediatorServerConfigByName(mediatorServerUrl: string, name: string): Promise<MediatorConfigResponse | null> {
    const result = await this.accassMediatorServer<MediatorConfigResponse[]>(mediatorServerUrl, 'getconfig', { name } );
    if (result && result.code === 1 && result.data && result.data.length === 1) return result.data[0];
    return null;
  }

  public async getMediatorServerSupportedDevices(mediatorServerUrl: string): Promise<MediatorServerDevice[] | null> {
    const result = await this.accassMediatorServer<MediatorServerDevice[]>(mediatorServerUrl, 'getdevices' );
    if (result && result.code === 1) return result.data;
    return null;
  }

  public async startMediatorByName(mediatorServerUrl: string, name: string): Promise<string | null> {
    const result = await this.accassMediatorServer<string>(mediatorServerUrl, 'start', { name } );
    if (result && result.code === 1) return result.data;
    return null;
  }

  public async stopMediatorByName(mediatorServerUrl: string, name: string): Promise<string | null> {
    const result = await this.accassMediatorServer<string>(mediatorServerUrl, 'stop', { name } );
    if (result && result.code === 1) return result.data;
    return null;
  }

  public async createMediatorConfig(mediatorServerUrl: string, config: MediatorConfig): Promise<string | null> {
    const result = await this.accassMediatorServer<string>(mediatorServerUrl, 'create', { config: JSON.stringify(config) }  );
    if (result && result.code === 1) return result.data;
    return null;
  }

  public async updateMediatorConfigByName(mediatorServerUrl: string, config: MediatorConfig): Promise<string | null> {
    const result = await this.accassMediatorServer<string>(mediatorServerUrl, 'update', { config: JSON.stringify(config) } );
    if (result && result.code === 1) return result.data;
    return null;
  }

  public async deleteMediatorConfigByName(mediatorServerUrl: string, name: string): Promise<string | null> {
    const result = await this.accassMediatorServer<string>(mediatorServerUrl, 'delete', { name } );
    if (result && result.code === 1) return result.data;
    return null;
  }

  public async getMediatorServerFreeNcPorts(mediatorServerUrl: string, limit?: number): Promise<number[] | null> {
    const result = await this.accassMediatorServer<number[]>(mediatorServerUrl, 'getncports', { limit } );
    if (result && result.code === 1) return result.data;
    return null;
  }
  
  public async getMediatorServerFreeSnmpPorts(mediatorServerUrl: string, limit?: number): Promise<number[] | null> {
    const result = await this.accassMediatorServer<number[]>(mediatorServerUrl, 'getsnmpports', { limit } );
    if (result && result.code === 1) return result.data;
    return null;
  }
}

export const mediatorService = new MediatorService;
export default mediatorService;