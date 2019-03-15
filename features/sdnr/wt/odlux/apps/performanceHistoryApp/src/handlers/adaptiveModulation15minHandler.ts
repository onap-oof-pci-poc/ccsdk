import { createExternal, IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';


import { AdaptiveModulationDataType, AdaptiveModulation, AdaptiveModulationResult } from '../models/adaptiveModulationDataType';

export interface IAdaptiveModulation15minState extends IExternalTableState<AdaptiveModulationDataType> { }

/**
 * Creates elastic search material data fetch handler for Adaptive modulation from historicalperformance15min database.
 */
const adaptiveModulationSearchHandler = createSearchDataHandler<AdaptiveModulationResult, AdaptiveModulation>(
  "sdnperformance/historicalperformance15min",
  null,
  (hit) => ({
    _id: hit._id,
    ...hit._source,
    ...hit._source["performance-data"]
  }),
  (name) => `${name}`);

export const {
  actionHandler: adaptiveModulation15minActionHandler,
  createActions: createAdaptiveModulation15minActions,
  createProperties: createAdaptiveModulation15minProperties,
  createPreActions: createAdaptiveModulation15minPreActions,
  reloadAction: adaptiveModulation15minReloadAction,
} = createExternal<AdaptiveModulationDataType>(adaptiveModulationSearchHandler, appState => appState.performanceHistoryApp.adaptiveModulation15min);

