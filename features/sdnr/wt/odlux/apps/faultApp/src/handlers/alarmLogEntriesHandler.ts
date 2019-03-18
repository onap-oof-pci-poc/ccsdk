import { createExternal,IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';

import { Fault, FaultLog } from '../models/fault';

export interface IAlarmLogEntriesState extends IExternalTableState<Fault> { }

// create eleactic search material data fetch handler
const alarmLogEntriesSearchHandler = createSearchDataHandler<FaultLog, Fault>(
  'sdnevents/faultlog',
  null,
  (hit) => ({ _id: hit._id, ...hit._source.fault }),
  (name) => `fault.${ name }`
);

export const {
  actionHandler: alarmLogEntriesActionHandler,
  createActions: createAlarmLogEntriesActions,
  createProperties: createAlarmLogEntriesProperties,
  reloadAction: alarmLogEntriesReloadAction,

  // set value action, to change a value
} = createExternal<Fault>(alarmLogEntriesSearchHandler, appState => appState.fault.alarmLogEntries);

