import { createExternal, IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';


import { SignalToInterferenceDataType, SignalToInterference, SignalToInterferenceResult } from '../models/signalToInteferenceDataType';

export interface ISignalToInterference24hoursState extends IExternalTableState<SignalToInterferenceDataType> { }

/**
 * Creates elastic search material data fetch handler for SINR from historicalperformance24h database.
 */
const signalToInterferenceSearchHandler = createSearchDataHandler<SignalToInterferenceResult, SignalToInterference>(
  "sdnperformance/historicalperformance24h",
  null,
  (hit) => ({
    _id: hit._id,
    ...hit._source,
    ...hit._source["performance-data"]
  }),
  (name) => `${name}`);

export const {
  actionHandler: signalToInterference24hoursActionHandler,
  createActions: createSignalToInterference24hoursActions,
  createProperties: createSignalToInterference24hoursProperties,
  createPreActions: createSignalToInterference24hoursPreActions,
  reloadAction: signalToInterference24hoursReloadAction,
} = createExternal<SignalToInterferenceDataType>(signalToInterferenceSearchHandler, appState => appState.performanceHistoryApp.signalToInterference24hours);

