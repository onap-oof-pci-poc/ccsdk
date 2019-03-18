import { createExternal,IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';

import { MediatorServer } from '../models/mediatorServer';
import { mediatorServerResourcePath } from '../services/mediatorService';

export interface IAvaliableMediatorServersState extends IExternalTableState<MediatorServer> { }

// create eleactic search material data fetch handler
const avaliableMediatorServersSearchHandler = createSearchDataHandler<MediatorServer>(mediatorServerResourcePath);

export const {
  actionHandler: avaliableMediatorServersActionHandler,
  createActions: createAvaliableMediatorServersActions,
  createProperties: createAvaliableMediatorServersProperties,
  reloadAction: avaliableMediatorServersReloadAction,

  // set value action, to change a value
} = createExternal<MediatorServer>(avaliableMediatorServersSearchHandler, appState => appState.mediator.avaliableMediatorServers);