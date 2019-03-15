import { createExternal, IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';


import { CrossPolarDiscriminationDataType, CrossPolarDiscrimination, CrossPolarDiscriminationResult } from '../models/crossPolarDiscriminationDataType';

export interface ICrossPolarDiscrimination15minState extends IExternalTableState<CrossPolarDiscriminationDataType> { }

/**
 * Creates elastic search material data fetch handler for CPD from historicalperformance15min database.
 */
const crossPolarDiscriminationSearchHandler = createSearchDataHandler<CrossPolarDiscriminationResult, CrossPolarDiscrimination>(
  "sdnperformance/historicalperformance15min",
  null,
  (hit) => ({
    _id: hit._id,
    ...hit._source,
    ...hit._source["performance-data"]
  }),
  (name) => `${name}`);

export const {
  actionHandler: crossPolarDiscrimination15minActionHandler,
  createActions: createCrossPolarDiscrimination15minActions,
  createProperties: createCrossPolarDiscrimination15minProperties,
  createPreActions: createCrossPolarDiscrimination15minPreActions,
  reloadAction: crossPolarDiscrimination15minReloadAction,
} = createExternal<CrossPolarDiscriminationDataType>(crossPolarDiscriminationSearchHandler, appState => appState.performanceHistoryApp.crossPolarDiscrimination15min);

