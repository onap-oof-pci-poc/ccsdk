// app configuration and main entry point for the app

import * as React from "react"; 
import { withRouter, RouteComponentProps, Route, Switch, Redirect } from 'react-router-dom';

import { faFirstAid } from '@fortawesome/free-solid-svg-icons';  // select app icon

import applicationManager from '../../../framework/src/services/applicationManager';
import { IApplicationStoreState } from "../../../framework/src/store/applicationStore";
import connect, { Connect, IDispatcher } from '../../../framework/src/flux/connect';

import { requestTocAsyncAction, requestDocumentAsyncActionCreator } from "./actions/helpActions";
import { helpAppRootHandler } from './handlers/helpAppRootHandler';

import { HelpApplication } from './views/helpApplication';
import { SubMenuEntry } from "./components/subMenuEntry";

import '!style-loader!css-loader!highlight.js/styles/default.css';

const mapProps = (state: IApplicationStoreState) => ({
  
});

const mapDisp = (dispatcher: IDispatcher) => ({
  requestDocument: (path: string) => {
    dispatcher.dispatch(requestDocumentAsyncActionCreator(path));
  }
});

let currentHelpPath: string | undefined = undefined;

const HelpApplicationRouteAdapter = connect(mapProps, mapDisp)((props: RouteComponentProps<{ '0'?: string }> & Connect<typeof mapProps, typeof mapDisp>) => {
  if (currentHelpPath !== props.match.params["0"]) {
    // route parameter has changed 
    currentHelpPath = props.match.params["0"] || undefined;
    // Hint: This timeout is need, since it is not recommended to change the state while rendering is in progress !
    window.setTimeout(() => {
      if (currentHelpPath) {
        props.requestDocument(currentHelpPath);
      }
    });
  }
  return (
    <HelpApplication />
  )
});

const App = withRouter((props: RouteComponentProps) => (
  <Switch>
    <Route path={ `${ props.match.path }/*` } component={ HelpApplicationRouteAdapter } />
    <Redirect to={ `${ props.match.path }` } />
  </Switch>
));

export async function register() {
  const applicationApi = applicationManager.registerApplication({
    name: "helpApp",
    icon: faFirstAid,
    rootComponent: App,
    rootActionHandler: helpAppRootHandler,
    menuEntry: "Help",
    subMenuEntry: SubMenuEntry
  });

  // start the initial toc request after the application store is initalized
  const store = await applicationApi.applicationStoreInitialized; 
  store.dispatch(requestTocAsyncAction);

}