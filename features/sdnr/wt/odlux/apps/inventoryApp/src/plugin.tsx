// app configuration and main entry point for the app


import { faShoppingBag } from '@fortawesome/free-solid-svg-icons';  // select app icon

import applicationManager from '../../../framework/src/services/applicationManager';

import { Dashboard } from  './views/dashboard';
import faultAppRootHandler from './handlers/inventoryAppRootHandler';

export function register() {
  applicationManager.registerApplication({
    name: "inventory",
    icon: faShoppingBag,
    rootActionHandler: faultAppRootHandler,
    rootComponent: Dashboard,
    menuEntry: "Inventory"
  });
}
