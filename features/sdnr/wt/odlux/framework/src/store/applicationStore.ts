
import { Store } from '../flux/store';
import { combineActionHandler, MiddlewareArg, Middleware, chainMiddleware } from '../flux/middleware';

import applicationService from '../services/applicationManager';

import { applicationRegistryHandler, IApplicationRegistration } from '../handlers/applicationRegistryHandler';
import { authenticationStateHandler, IAuthenticationState } from '../handlers/authenticationHandler';
import { applicationStateHandler, IApplicationState } from '../handlers/applicationStateHandler';
import { navigationStateHandler, INavigationState } from '../handlers/navigationStateHandler';

import { setApplicationStore } from '../services/applicationApi';

import apiMiddleware from '../middleware/api';
import thunkMiddleware from '../middleware/thunk';
import loggerMiddleware from '../middleware/logger';
import routerMiddleware from '../middleware/navigation';

export type MiddlewareApi = MiddlewareArg<IApplicationStoreState>;

export interface IFrameworkStoreState {
  applicationRegistraion: IApplicationRegistration;
  applicationState: IApplicationState;
  authenticationState: IAuthenticationState;
  navigationState: INavigationState;
}

export interface IApplicationStoreState {
  framework: IFrameworkStoreState;
}

const frameworkHandlers = combineActionHandler({
  applicationRegistraion: applicationRegistryHandler,
  applicationState: applicationStateHandler,
  authenticationState: authenticationStateHandler,
  navigationState: navigationStateHandler
});

export class ApplicationStore extends Store<IApplicationStoreState> { }

/** This function will create the application store considering the currently registered application ans their middlewares. */
export const applicationStoreCreator = (): ApplicationStore => {
  const middlewares: Middleware<IApplicationStoreState>[] = [];
  const actionHandlers = Object.keys(applicationService.applications).reduce((acc, cur) => {
    const reg = applicationService.applications[cur];
    reg && typeof reg.rootActionHandler === 'function' && (acc[cur] = reg.rootActionHandler);
    reg && +(reg.middlewares || 0) && middlewares.push(...(reg.middlewares as Middleware<IApplicationStoreState>[]));
    return acc;
  }, { framework: frameworkHandlers } as any);

  const applicationStore = new ApplicationStore(combineActionHandler(actionHandlers), chainMiddleware(loggerMiddleware, thunkMiddleware, routerMiddleware, apiMiddleware, ...middlewares));
  setApplicationStore(applicationStore);
  return applicationStore;
}

export default applicationStoreCreator;