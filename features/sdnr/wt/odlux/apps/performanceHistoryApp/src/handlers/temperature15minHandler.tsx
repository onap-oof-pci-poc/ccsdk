import { createExternal, IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';


import { TemperatureDataType, Temperature, TemperatureResult } from '../models/temperatureDataType';

export interface ITemperature15minState extends IExternalTableState<TemperatureDataType> { }

/**
 * Creates elastic search material data fetch handler for Temperature from historicalperformance15min database.
 */
const temperatureSearchHandler = createSearchDataHandler<TemperatureResult, Temperature>(
  "sdnperformance/historicalperformance15min",
  null,
  (hit) => ({
    _id: hit._id,
    ...hit._source,
    ...hit._source["performance-data"]
  }),
  (name) => `${name}`);

export const {
  actionHandler: temperature15minActionHandler,
  createActions: createTemperature15minActions,
  createProperties: createTemperature15minProperties,
  createPreActions: createTemperature15minPreActions,
  reloadAction: temperature15minReloadAction,
} = createExternal<TemperatureDataType>(temperatureSearchHandler, appState => appState.performanceHistoryApp.temperature15min);

