import { createExternal, IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';


import { AdaptiveModulationDataType, AdaptiveModulation, AdaptiveModulationResult } from '../models/adaptiveModulationDataType';

export interface IAdaptiveModulation24hoursState extends IExternalTableState<AdaptiveModulationDataType> { }

/**
 * Creates elastic search material data fetch handler for Adaptive modulation from historicalperformance24h database.
 */
const adaptiveModulationSearchHandler = createSearchDataHandler<AdaptiveModulationResult, AdaptiveModulation>(
  "sdnperformance/historicalperformance24h",
  null,
  (hit) => ({
    _id: hit._id,
    ...hit._source,
    ...hit._source["performance-data"]
  }),
  (name) => `${name}`);

export const {
  actionHandler: adaptiveModulation24hoursActionHandler,
  createActions: createAdaptiveModulation24hoursActions,
  createProperties: createAdaptiveModulation24hoursProperties,
  createPreActions: createAdaptiveModulation24hoursPreActions,
  reloadAction: adaptiveModulation24hoursReloadAction,
} = createExternal<AdaptiveModulationDataType>(adaptiveModulationSearchHandler, appState => appState.performanceHistory.adaptiveModulation24hours);

