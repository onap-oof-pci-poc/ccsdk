import { createExternal, IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';


import { TemperatureDataType, Temperature, TemperatureResult } from '../models/temperatureDataType';

export interface ITemperature24hoursState extends IExternalTableState<TemperatureDataType> { }

/**
 * Creates elastic search material data fetch handler for temperature from historicalperformance24h database.
 */
const temperatureSearchHandler = createSearchDataHandler<TemperatureResult, Temperature>(
  "sdnperformance/historicalperformance24h",
  null,
  (hit) => ({
    _id: hit._id,
    ...hit._source,
    ...hit._source["performance-data"]
  }),
  (name) => `${name}`);

export const {
  actionHandler: temperature24hoursActionHandler,
  createActions: createTemperature24hoursActions,
  createProperties: createTemperature24hoursProperties,
  createPreActions: createTemperature24hoursPreActions,
  reloadAction: temperature24hoursReloadAction,
} = createExternal<TemperatureDataType>(temperatureSearchHandler, appState => appState.performanceHistoryApp.temperature24hours);

