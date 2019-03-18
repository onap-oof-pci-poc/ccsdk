// main state handler

import { combineActionHandler } from '../../../../framework/src/flux/middleware';

import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';

import { IConnectAppStoreState } from '../../../connectApp/src/handlers/connectAppRootHandler';

import { IMaintenenceEntriesState, maintenenceEntriesActionHandler } from './maintenenceEntriesHandler';

export interface IMaintenanceAppStoreState {
  maintenenceEntries : IMaintenenceEntriesState
}

declare module '../../../../framework/src/store/applicationStore' {
  interface IApplicationStoreState {
    maintenance: IMaintenanceAppStoreState,
    connect: IConnectAppStoreState
  }
}

const actionHandlers = {
  maintenenceEntries: maintenenceEntriesActionHandler
};

export const maintenanceAppRootHandler = combineActionHandler<IMaintenanceAppStoreState>(actionHandlers);
export default maintenanceAppRootHandler;
