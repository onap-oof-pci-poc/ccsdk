// app configuration and main entry point for the app

import * as React from "react";
import { withRouter, RouteComponentProps, Route, Switch, Redirect } from 'react-router-dom';

import { faAdjust } from '@fortawesome/free-solid-svg-icons';  // select app icon

import connect, { Connect, IDispatcher } from '../../../framework/src/flux/connect';
import applicationManager from '../../../framework/src/services/applicationManager';
import { IApplicationStoreState } from "../../../framework/src/store/applicationStore";

import { configurationAppRootHandler } from './handlers/configurationAppRootHandler';
import configurationService from "./services/configurationService";

import ConfigurationApplication from "./views/configurationApplication";
import { updateMountIdAsyncActionCreator, updateLpIdAsyncActionCreator, updateViewDataAsyncActionCreator } from "./actions/configurationActions";

let currentMountId: string | null | undefined = undefined;
let currentLpId: string | null |undefined = undefined;
let currentViewId: string | null | undefined = undefined;
let currentIndex: string | null | undefined = undefined;
let lastUrl: string | undefined = undefined;

const mapProps = (state: IApplicationStoreState) => ({
  // currentProblemsProperties: createCurrentProblemsProperties(state),
});

const mapDisp = (dispatcher: IDispatcher) => ({
  updateMountId: (mountId: string | undefined) => dispatcher.dispatch(updateMountIdAsyncActionCreator(mountId)),
  updateLpId: (lpId: string | undefined) => dispatcher.dispatch(updateLpIdAsyncActionCreator(lpId)),
  updateViewData: (viewPath: string, indexValues: string[]) => dispatcher.dispatch(updateViewDataAsyncActionCreator(viewPath, indexValues)),
});

const ConfigurationApplicationRouteAdapter = connect(mapProps, mapDisp)((props: RouteComponentProps<{ mountId?: string, lpId?: string, viewId?: string, "0"?: string }> & Connect<typeof mapProps, typeof mapDisp>) => {
  if (props.location.pathname !== lastUrl) {
    // ensure the asynchronus update will only be called once per path
    lastUrl = props.location.pathname;
    window.setTimeout(async () => {

      // check if the mountId has changed
      if (currentMountId !== props.match.params.mountId) {
        currentMountId = props.match.params.mountId || undefined;
        currentLpId = null;
        currentViewId = null;
        currentIndex = null;
        await props.updateMountId(currentMountId);
      }

      // check if the lpId has changed
      if (currentLpId !== props.match.params.lpId) {
        currentLpId = props.match.params.lpId || undefined;
        currentViewId = null;
        currentIndex = null;
        currentMountId && await props.updateLpId(currentLpId);
      }

      // check if the viewId or the indices has changed
      if (currentViewId !== props.match.params.viewId || currentIndex !== props.match.params[0]) {
        currentViewId = props.match.params.viewId || undefined;
        currentIndex = props.match.params[0] || undefined;
        currentLpId && await props.updateViewData(currentViewId || '', currentIndex && currentIndex.split("/") || [] );
      }

    });
  }
  return (
    <ConfigurationApplication />
  );
});

const App = withRouter((props: RouteComponentProps) => (
  <Switch>
    <Route path={`${props.match.path}/:mountId/:lpId/:viewId/*`} component={ConfigurationApplicationRouteAdapter} />
    <Route path={`${props.match.path}/:mountId/:lpId/:viewId`} component={ConfigurationApplicationRouteAdapter} />
    <Route path={`${props.match.path}/:mountId/:lpId`} component={ConfigurationApplicationRouteAdapter} />
    <Route path={`${props.match.path}/:mountId`} component={ConfigurationApplicationRouteAdapter} />
    <Route path={`${props.match.path}`} component={ConfigurationApplicationRouteAdapter} />
    <Redirect to={`${props.match.path}`} />
  </Switch>
));

export function register() {
  applicationManager.registerApplication({
    name: "configuration",
    icon: faAdjust,
    rootComponent: App,
    rootActionHandler: configurationAppRootHandler,
    menuEntry: "Configuration"
  });
}
