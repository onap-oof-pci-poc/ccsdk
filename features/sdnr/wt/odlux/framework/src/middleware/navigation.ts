import { Location, History, createHashHistory } from "history";

import { ApplicationStore } from "../store/applicationStore";
import { Dispatch } from '../flux/store';

import { LocationChanged, NavigateToApplication } from "../actions/navigationActions";
import { PushAction, ReplaceAction, GoAction, GoBackAction, GoForwardeAction } from '../actions/navigationActions';

import applicationManager from "../services/applicationManager";

const routerMiddlewareCreator = (history: History) => () => (next: Dispatch): Dispatch => (action) => {
  
  if (action instanceof NavigateToApplication) {
    const application = applicationManager.applications && applicationManager.applications[action.applicationName];
    if (application) {
      const href = `/${ application.path || application.name }${ action.href ? '/' + action.href : '' }`.replace(/\/{2,}/i, '/');
      if (action.replace) {
        history.replace(href, action.state);
      } else {
        history.push(href, action.state);
      }
    }
  } else if (action instanceof PushAction) {
    history.push(action.href, action.state);
  } else if (action instanceof ReplaceAction) {
    history.replace(action.href, action.state);
  } else if (action instanceof GoAction) {
    history.go(action.index);
  } else if (action instanceof GoBackAction) {
    history.goBack();
  } else if (action instanceof GoForwardeAction) {
    history.goForward();
  } else {
    return next(action);
  }
  return action;
};

function startListener(history: History, store: ApplicationStore) {
  store.dispatch(new LocationChanged(history.location.pathname, history.location.search, history.location.hash));
  history.listen((location: Location) => {
    store.dispatch(new LocationChanged(location.pathname, location.search, location.hash));
  });
}

const history = createHashHistory();

export function startHistoryListener(store: ApplicationStore) {
  startListener(history, store);
}

export const routerMiddleware = routerMiddlewareCreator(history);
export default routerMiddleware;
