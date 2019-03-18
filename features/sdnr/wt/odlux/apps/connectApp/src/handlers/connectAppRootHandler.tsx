import { combineActionHandler } from '../../../../framework/src/flux/middleware';
import { IRequiredNetworkElementsState, requiredNetworkElementsActionHandler  } from './requiredNetworkElementsHandler';
import { IMountedNetworkElementsState, mountedNetworkElementsActionHandler } from './mountedNetworkElementsHandler';
import { IConnectionStatusLogState, connectionStatusLogActionHandler } from './connectionStatusLogHandler';

export interface IConnectAppStoreState {
  requiredNetworkElements: IRequiredNetworkElementsState;
  mountedNetworkElements: IMountedNetworkElementsState;
  connectionStatusLog: IConnectionStatusLogState;
}

declare module '../../../../framework/src/store/applicationStore' {
  interface IApplicationStoreState {
    connect: IConnectAppStoreState
  }
}

const actionHandlers = {
  requiredNetworkElements: requiredNetworkElementsActionHandler,
  mountedNetworkElements: mountedNetworkElementsActionHandler,
  connectionStatusLog: connectionStatusLogActionHandler
};

export const connectAppRootHandler = combineActionHandler <IConnectAppStoreState>(actionHandlers);
export default connectAppRootHandler;
