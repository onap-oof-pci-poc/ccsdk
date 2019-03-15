import { createExternal, IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';


import { SignalToInterferenceDataType, SignalToInterference, SignalToInterferenceResult } from '../models/signalToInteferenceDataType';

export interface ISignalToInterference15minState extends IExternalTableState<SignalToInterferenceDataType> { }

/**
 * Creates elastic search material data fetch handler for SINR from historicalperformance15min database.
 */
const signalToInterferenceSearchHandler = createSearchDataHandler<SignalToInterferenceResult, SignalToInterference>(
  "sdnperformance/historicalperformance15min",
  null,
  (hit) => ({
    _id: hit._id,
    ...hit._source,
    ...hit._source["performance-data"]
  }),
  (name) => `${name}`);

export const {
  actionHandler: signalToInterference15minActionHandler,
  createActions: createSignalToInterference15minActions,
  createProperties: createSignalToInterference15minProperties,
  createPreActions: createSignalToInterference15minPreActions,
  reloadAction: signalToInterference15minReloadAction,
} = createExternal<SignalToInterferenceDataType>(signalToInterferenceSearchHandler, appState => appState.performanceHistoryApp.signalToInterference15min);

