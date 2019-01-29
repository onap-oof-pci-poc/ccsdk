import { createExternal,IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';

import { FaultResult, Fault } from '../models/fault';

export interface ICurrentProblemsState extends IExternalTableState<Fault> { }

// create eleactic search material data fetch handler
const currentProblemsSearchHandler = createSearchDataHandler<FaultResult, Fault>(
    'sdnevents/faultcurrent',
    null,
    (hit) => ({ _id: hit._id, ...hit._source.faultCurrent }),
    (name) => `faultCurrent.${name}`
  );

export const {
  actionHandler: currentProblemsActionHandler,
  createActions: createCurrentProblemsActions,
  createProperties: createCurrentProblemsProperties,
  reloadAction: currentProblemsReloadAction,

  // set value action, to change a value 
} = createExternal<Fault>(currentProblemsSearchHandler, appState => appState.faultApp.currentProblems);

