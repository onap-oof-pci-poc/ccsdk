// app configuration and main entry point for the app

import * as React from "react";
import { withRouter, RouteComponentProps, Route, Switch, Redirect } from 'react-router-dom';

import { faGlobe } from '@fortawesome/free-solid-svg-icons';  // select app icon

import applicationManager from '../../../framework/src/services/applicationManager';
import { IApplicationStoreState } from "../../../framework/src/store/applicationStore";
import connect, { Connect, IDispatcher } from '../../../framework/src/flux/connect';

import { mediatorAppRootHandler } from './handlers/mediatorAppRootHandler';
import { avaliableMediatorServersReloadAction } from "./handlers/avaliableMediatorServersHandler";

import { MediatorApplication } from "./views/mediatorApplication";
import { MediatorServerSelection } from "./views/mediatorServerSelection";
import { initializeMediatorServerAsyncActionCreator } from "./actions/mediatorServerActions";

let currentMediatorServerId: string | undefined = undefined;

const mapDisp = (dispatcher: IDispatcher) => ({
  loadMediatorServer : (mediatorServerId: string) => dispatcher.dispatch(initializeMediatorServerAsyncActionCreator(mediatorServerId)),
});

const MediatorServerRouteAdapter = connect(undefined, mapDisp)((props: RouteComponentProps<{ mediatorServerId: string }> & Connect<undefined, typeof mapDisp>) => {
  if (currentMediatorServerId !== props.match.params.mediatorServerId) {
    // route parameter has changed
    currentMediatorServerId = props.match.params.mediatorServerId || undefined;
    // Hint: This timeout is need, since it is not recommended to change the state while rendering is in progress !
    window.setTimeout(() => {
      if (currentMediatorServerId) {
        props.loadMediatorServer(currentMediatorServerId);
      }
    });
  }
  return (
    <MediatorApplication />
  )
});

type AppProps = RouteComponentProps & Connect;

const App = (props: AppProps) => (
  <Switch>
    <Route exact path={ `${ props.match.path }` } component={ MediatorServerSelection } />
    <Route path={ `${ props.match.path }/:mediatorServerId` } component={ MediatorServerRouteAdapter } />
    <Redirect to={ `${ props.match.path }` } />
   </Switch>
);

const FinalApp = withRouter(connect()(App));

export function register() {
  const applicationApi = applicationManager.registerApplication({
    name: "mediatorApp",
    icon: faGlobe,
    rootComponent: FinalApp,
    rootActionHandler: mediatorAppRootHandler,
    menuEntry: "Mediator"
  });

  // prefetch all avaliable mediator servers
  applicationApi.applicationStoreInitialized.then(applicationStore => {
    applicationStore.dispatch(avaliableMediatorServersReloadAction)
  });
};
