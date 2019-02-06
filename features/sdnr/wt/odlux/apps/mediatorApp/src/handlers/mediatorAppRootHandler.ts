// main state handler

import { combineActionHandler } from '../../../../framework/src/flux/middleware';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';

import { IAvaliableMediatorServersState, avaliableMediatorServersActionHandler } from './avaliableMediatorServersHandler' ;
import { MediatorServerState, mediatorServerHandler } from './mediatorServerHandler';

export interface IMediatorAppStoreState {
  avaliableMediatorServers: IAvaliableMediatorServersState,
  mediatorServerState: MediatorServerState,
}

declare module '../../../../framework/src/store/applicationStore' {
  interface IApplicationStoreState {
    mediatorApp: IMediatorAppStoreState
  }
}

const actionHandlers = {
  avaliableMediatorServers: avaliableMediatorServersActionHandler,
  mediatorServerState: mediatorServerHandler,
};

export const mediatorAppRootHandler = combineActionHandler<IMediatorAppStoreState>(actionHandlers);
export default mediatorAppRootHandler;
