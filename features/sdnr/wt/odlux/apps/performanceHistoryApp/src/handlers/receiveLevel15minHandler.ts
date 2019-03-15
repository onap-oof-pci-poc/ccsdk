import { createExternal, IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';


import { ReceiveLevelDataType, ReceiveLevel, ReceiveLevelResult } from '../models/receiveLevelDataType';

export interface IReceiveLevel15minState extends IExternalTableState<ReceiveLevelDataType> { }

/**
 * Creates elastic search material data fetch handler for receiveLevel from historicalperformance15min database.
 */
const receiveLevelSearchHandler = createSearchDataHandler<ReceiveLevelResult, ReceiveLevel>(
  "sdnperformance/historicalperformance15min",
  null,
  (hit) => ({
    _id: hit._id,
    ...hit._source,
    ...hit._source["performance-data"]
  }),
  (name) => `${name}`);

export const {
  actionHandler: receiveLevel15minActionHandler,
  createActions: createReceiveLevel15minActions,
  createProperties: createReceiveLevel15minProperties,
  createPreActions: createReceiveLevel15minPreActions,
  reloadAction: receiveLevel15minReloadAction,
} = createExternal<ReceiveLevelDataType>(receiveLevelSearchHandler, appState => appState.performanceHistoryApp.receiveLevel15min);

