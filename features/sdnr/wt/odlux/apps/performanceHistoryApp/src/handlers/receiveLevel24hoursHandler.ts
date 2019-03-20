import { createExternal, IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';


import { ReceiveLevelDataType, ReceiveLevel, ReceiveLevelResult } from '../models/receiveLevelDataType';

export interface IReceiveLevel24hoursState extends IExternalTableState<ReceiveLevelDataType> { }

/**
 * Creates elastic search material data fetch handler for receiveLevel from historicalperformance24h database.
 */
const receiveLevelSearchHandler = createSearchDataHandler<ReceiveLevelResult, ReceiveLevel>(
  "sdnperformance/historicalperformance24h",
  null,
  (hit) => ({
    _id: hit._id,
    ...hit._source,
    ...hit._source["performance-data"]
  }),
  (name) => `${name}`);

export const {
  actionHandler: receiveLevel24hoursActionHandler,
  createActions: createReceiveLevel24hoursActions,
  createProperties: createReceiveLevel24hoursProperties,
  createPreActions: createReceiveLevel24hoursPreActions,
  reloadAction: receiveLevel24hoursReloadAction,
} = createExternal<ReceiveLevelDataType>(receiveLevelSearchHandler, appState => appState.performanceHistory.receiveLevel24hours);

