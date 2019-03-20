import { createExternal, IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';

import { PerformanceDataType, Performance, PerformanceResult } from '../models/performanceDataType';

export interface IPerformanceData24hoursState extends IExternalTableState<PerformanceDataType> { }

/**
 * Creates elastic search material data fetch handler for performance data from historicalperformance24h database.
 */
const performanceDataSearchHandler = createSearchDataHandler<PerformanceResult, Performance>(
  "sdnperformance/historicalperformance24h",
  null,
  (hit) => ({
    _id: hit._id,
    ...hit._source,
    ...hit._source["performance-data"]
  }),
  (name) => `${name}`);

export const {
  actionHandler: performanceData24hoursActionHandler,
  createActions: createPerformanceData24hoursActions,
  createProperties: createPerformanceData24hoursProperties,
  createPreActions: createPerformanceData24hoursPreActions,
  reloadAction: performanceData24hoursReloadAction
} = createExternal<PerformanceDataType>(performanceDataSearchHandler, appState => appState.performanceHistory.performanceData24hours);

