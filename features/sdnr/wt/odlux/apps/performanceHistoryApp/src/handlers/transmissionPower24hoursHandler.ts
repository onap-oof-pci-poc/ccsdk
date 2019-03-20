import { createExternal, IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';

import { TransmissionPowerDataType, TransmissionPower, TransmissionPowerResult } from '../models/transmissionPowerDataType';

export interface ITransmissionPower24hoursState extends IExternalTableState<TransmissionPowerDataType> { }

/**
 * Creates elastic search material data fetch handler for transmission power from historicalperformance24h database.
 */
const transmissionPowerSearchHandler = createSearchDataHandler<TransmissionPowerResult, TransmissionPower>(
  "sdnperformance/historicalperformance24h",
  null,
  (hit) => ({
    _id: hit._id,
    ...hit._source,
    ...hit._source["performance-data"]
  }),
  (name) => `${name}`);

export const {
  actionHandler: transmissionPower24hoursActionHandler,
  createActions: createTransmissionPower24hoursActions,
  createProperties: createTransmissionPower24hoursProperties,
  createPreActions: createTransmissionPower24hoursPreActions,
  reloadAction: transmissionPower24hoursReloadAction,
} = createExternal<TransmissionPowerDataType>(transmissionPowerSearchHandler, appState => appState.performanceHistory.transmissionPower24hours);

