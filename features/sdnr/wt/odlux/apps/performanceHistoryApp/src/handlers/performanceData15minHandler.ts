import { createExternal,IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';

import {  PerformanceDataType, Performance,PerformanceResult } from '../models/performanceDataType';

export interface IPerformanceData15minState extends IExternalTableState<PerformanceDataType> {}

/**
 * Creates elastic search material data fetch handler for performance data from historicalperformance15min database.
 */
  const performanceDataSearchHandler = createSearchDataHandler<PerformanceResult, Performance>(
    "sdnperformance/historicalperformance15min",
     null,
     (hit) => ({ 
       _id: hit._id, 
       ...hit._source,
       ...hit._source["performance-data"]
      }),
  (name) => `${name}` );

export const {
  actionHandler: performanceData15minActionHandler,
  createActions: createPerformanceData15minActions,
  createProperties: createPerformanceData15minProperties,
  createPreActions: createPerformanceData15minPreActions,
  reloadAction: performanceData15minReloadAction
} = createExternal<PerformanceDataType>(performanceDataSearchHandler, appState => appState.performanceHistory.performanceData15min);

