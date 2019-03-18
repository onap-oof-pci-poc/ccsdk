import { createExternal,IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';

import { RequiredNetworkElementType } from '../models/requiredNetworkElements';
export interface IRequiredNetworkElementsState extends IExternalTableState<RequiredNetworkElementType> { }

// create eleactic search material data fetch handler
const requiredNetworkElementsSearchHandler = createSearchDataHandler<RequiredNetworkElementType>('mwtn/required-networkelement');

export const {
  actionHandler: requiredNetworkElementsActionHandler,
  createActions: createRequiredNetworkElementsActions,
  createProperties: createRequiredNetworkElementsProperties,
  reloadAction: requiredNetworkElementsReloadAction,

  // set value action, to change a value
} = createExternal<RequiredNetworkElementType>(requiredNetworkElementsSearchHandler, appState => appState.connect.requiredNetworkElements);

