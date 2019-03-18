// main state handler

import { combineActionHandler } from '../../../../framework/src/flux/middleware';

import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';

export interface IMinimumAppStoreState {
}

declare module '../../../../framework/src/store/applicationStore' {
  interface IApplicationStoreState {
    minimum: IMinimumAppStoreState
  }
}

const actionHandlers = {
};

export const minimumAppRootHandler = combineActionHandler<IMinimumAppStoreState>(actionHandlers);
export default minimumAppRootHandler;
