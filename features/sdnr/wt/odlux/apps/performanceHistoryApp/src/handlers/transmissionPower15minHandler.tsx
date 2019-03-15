import { createExternal, IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';


import { TransmissionPowerDataType, TransmissionPower, TransmissionPowerResult } from '../models/transmissionPowerDataType';

export interface ITransmissionPower15minState extends IExternalTableState<TransmissionPowerDataType> { }

/**
 * Creates elastic search material data fetch handler for Transmission power from historicalperformance15min database.
 */
const transmissionPowerSearchHandler = createSearchDataHandler<TransmissionPowerResult, TransmissionPower>(
  "sdnperformance/historicalperformance15min",
  null,
  (hit) => ({
    _id: hit._id,
    ...hit._source,
    ...hit._source["performance-data"]
  }),
  (name) => `${name}`);

export const {
  actionHandler: transmissionPower15minActionHandler,
  createActions: createTransmissionPower15minActions,
  createProperties: createTransmissionPower15minProperties,
  createPreActions: createTransmissionPower15minPreActions,
  reloadAction: transmissionPower15minReloadAction,
} = createExternal<TransmissionPowerDataType>(transmissionPowerSearchHandler, appState => appState.performanceHistoryApp.transmissionPower15min);

