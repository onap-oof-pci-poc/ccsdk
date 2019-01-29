// app configuration and main entry point for the app


import * as React from "react"; 
import { withRouter, RouteComponentProps, Route, Switch, Redirect } from 'react-router-dom';

import connect, { Connect, IDispatcher } from '../../../framework/src/flux/connect';

import { faBell } from '@fortawesome/free-solid-svg-icons';  // select app icon
import applicationManager from '../../../framework/src/services/applicationManager';
import { subscribe, IFormatedMessage } from '../../../framework/src/services/notificationService';
import { IApplicationStoreState } from "../../../framework/src/store/applicationStore";

import { faultAppRootHandler } from './handlers/faultAppRootHandler';
import { FaultApplication } from "./views/faultApplication";

import { Fault } from "./models/fault";
import { PanelId } from "./models/panelId";

import { SetPanelAction } from "./actions/panelChangeActions";
import { AddFaultNotificationAction } from "./actions/notificationActions";

import { createCurrentProblemsProperties, createCurrentProblemsActions } from "./handlers/currentProblemsHandler";

let currentMountId: string | undefined = undefined; 

const mapProps = (state: IApplicationStoreState) => ({
  currentProblemsProperties: createCurrentProblemsProperties(state),
});

const mapDisp = (dispatcher: IDispatcher) => ({
  currentProblemsActions: createCurrentProblemsActions(dispatcher.dispatch, true),
  setCurrentPanel: (panelId: PanelId) => dispatcher.dispatch(new SetPanelAction(panelId))
});

const FaultApplicationRouteAdapter = connect(mapProps, mapDisp)((props: RouteComponentProps<{ mountId?: string }> & Connect<typeof mapProps, typeof mapDisp>) => {
  if (currentMountId !== props.match.params.mountId) {
    // route parameter has changed 
    currentMountId = props.match.params.mountId || undefined;
    // Hint: This timeout is need, since it is not recommended to change the state while rendering is in progress !
    window.setTimeout(() => {
      if (currentMountId) {
        props.setCurrentPanel("CurrentProblem");
        props.currentProblemsActions.onFilterChanged("objectId", currentMountId);
        props.currentProblemsProperties.showFilter || (props.currentProblemsActions.onToggleFilter());
        props.currentProblemsActions.onRefresh();
      }
    });
  }
  return (
    <FaultApplication />
  )
});

const App = withRouter((props: RouteComponentProps) => (
  <Switch>
    <Route path={ `${ props.match.path }/:mountId?` } component={ FaultApplicationRouteAdapter } /> 
    <Redirect to={ `${ props.match.path }` } />
   </Switch>
)); 
 
export function register() {
  const applicationApi = applicationManager.registerApplication({
    name: "faultApp",
    icon: faBell,
    rootComponent: App,
    rootActionHandler: faultAppRootHandler,
    menuEntry: "Fault"
  });

  // subscribe to the websocket notifications
  subscribe<Fault & IFormatedMessage>("ProblemNotification", (fault => {
    const store = applicationApi && applicationApi.applicationStore;
    if (fault && store) {
      store.dispatch(new AddFaultNotificationAction(fault));
    }
  }));
}
