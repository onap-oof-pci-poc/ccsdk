// app configuration and main entry point for the app


import { faBell } from '@fortawesome/free-solid-svg-icons';  // select app icon
import applicationManager from '../../../framework/src/services/applicationManager';
import { subscribe, IFormatedMessage } from '../../../framework/src/services/notificationService';

import { faultAppRootHandler } from './handlers/faultAppRootHandler';
import { FaultApplication } from "./views/faultApplication";

import { Fault } from "models/fault";
import { AddFaultNotificationAction } from "./actions/notificationActions";

export function register() {
  const applicationApi = applicationManager.registerApplication({
    name: "faultApp",
    icon: faBell,
    rootComponent: FaultApplication,
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
