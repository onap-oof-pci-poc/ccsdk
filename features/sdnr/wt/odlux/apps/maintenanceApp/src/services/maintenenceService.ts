import { requestRest } from '../../../../framework/src/services/restService';
import { Result, HitEntry, PostResponse, DeleteResponse } from '../../../../framework/src/models/elasticSearch';

import { MaintenenceEntryType, MaintenenceEntry } from '../models/maintenenceEntryType';
import { convertToLocaleString, convertToGMTString } from '../utils/timeUtils';

export const maintenenceEntryDatabasePath = "mwtn/maintenancemode";

/**
 * Represents a web api accessor service for all maintenence entries related actions.
 */
class MaintenenceService {
  /**
    * Gets all maintenence entries from the backend.
    */
  public async getAllMaintenenceEntries(): Promise<(MaintenenceEntry[]) | null> {
    const path = `database/${maintenenceEntryDatabasePath}/_search`;
    const query = { "query": { "match_all": {} } };

    const result = await requestRest<Result<MaintenenceEntryType>>(path, { method: "POST", body: JSON.stringify(query) });
    return result && result.hits && result.hits.hits && result.hits.hits.map(me => me._source && me._source.filter[0] && ({
      _id: me._id,
      mountId: me._source.node,
      description: me._source.filter[0].description,
      start: me._source.filter[0].start && convertToLocaleString(me._source.filter[0].start),
      end: me._source.filter[0].end && convertToLocaleString(me._source.filter[0].end),
      active: me._source.active
    })) || null;
  }

  /**
    * Gets one maintenence entry by its mountId from the backend.
    */
  public async getMaintenenceEntryByMountId(mountId: string): Promise<(MaintenenceEntry) | null> {
    const path = `database/${maintenenceEntryDatabasePath}/${mountId}`;

    const result = await requestRest<HitEntry<MaintenenceEntryType> & { found: boolean }>(path, { method: "GET" });
    return result && result.found && result._source && result._source.filter[0] && {
      _id: result._id,
      mountId: result._source.node,
      description: result._source.filter[0].description,
      start: result._source.filter[0].start && convertToLocaleString(result._source.filter[0].start),
      end: result._source.filter[0].end && convertToLocaleString(result._source.filter[0].end),
      active: result._source.active
    } || null;
  }

  /**
  * Adds or updates one maintenence entry to the backend.
  */
  public async writeMaintenenceEntry(maintenenceEntry: MaintenenceEntry): Promise<PostResponse | null> {
    const path = `database/${maintenenceEntryDatabasePath}/${maintenenceEntry._id}`;
    const data: MaintenenceEntryType = {
      node: maintenenceEntry.mountId,
      filter: [
        {
          definition: { "object-id-ref": "", problem: "" },
          description: "",
          start: convertToGMTString(maintenenceEntry.start),
          end: convertToGMTString(maintenenceEntry.end)
        }
      ],
      active: maintenenceEntry.active
    };

    const result = await requestRest<PostResponse>(path, { method: "POST", body: JSON.stringify(data) });
    return result || null;
  }

  /**
  * Deletes one maintenence entry by its mountId from the backend.
  */
  public async deleteMaintenenceEntry(maintenenceEntry: MaintenenceEntry): Promise<(DeleteResponse) | null> {
    const path = `database/${maintenenceEntryDatabasePath}/${maintenenceEntry._id}`;

    const result = await requestRest<DeleteResponse>(path, { method: "DELETE" });
    return result || null;
  }
}

export const maintenenceService = new MaintenenceService();
export default maintenenceService;