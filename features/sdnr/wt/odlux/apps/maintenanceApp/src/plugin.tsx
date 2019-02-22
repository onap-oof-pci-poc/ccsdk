// app configuration and main entry point for the app

import * as React from "react";

import { faLock } from '@fortawesome/free-solid-svg-icons';  // select app icon

import applicationManager from '../../../framework/src/services/applicationManager';

import { maintenanceAppRootHandler } from './handlers/maintenanceAppRootHandler';

import MaintenenceView from "./views/maintenenceView";

const App : React.SFC = (props) => {
  return <MaintenenceView />
};

export function register() {
  applicationManager.registerApplication({
    name: "maintenanceApp",
    icon: faLock,
    rootComponent: App,
    rootActionHandler: maintenanceAppRootHandler,
    menuEntry: "Maintenance App"
  });
}


