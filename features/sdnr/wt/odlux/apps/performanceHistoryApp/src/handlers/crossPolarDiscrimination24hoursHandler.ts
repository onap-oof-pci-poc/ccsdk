import { createExternal, IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';


import { CrossPolarDiscriminationDataType, CrossPolarDiscrimination, CrossPolarDiscriminationResult } from '../models/crossPolarDiscriminationDataType';

export interface ICrossPolarDiscrimination24hoursState extends IExternalTableState<CrossPolarDiscriminationDataType> { }

/**
 * Creates elastic search material data fetch handler for CPD from historicalperformance24h database.
 */
const crossPolarDiscriminationSearchHandler = createSearchDataHandler<CrossPolarDiscriminationResult, CrossPolarDiscrimination>(
  "sdnperformance/historicalperformance24h",
  null,
  (hit) => ({
    _id: hit._id,
    ...hit._source,
    ...hit._source["performance-data"]
  }),
  (name) => `${name}`);

export const {
  actionHandler: crossPolarDiscrimination24hoursActionHandler,
  createActions: createCrossPolarDiscrimination24hoursActions,
  createProperties: createCrossPolarDiscrimination24hoursProperties,
  createPreActions: createCrossPolarDiscrimination24hoursPreActions,
  reloadAction: crossPolarDiscrimination24hoursReloadAction,
} = createExternal<CrossPolarDiscriminationDataType>(crossPolarDiscriminationSearchHandler, appState => appState.performanceHistory.crossPolarDiscrimination24hours);

