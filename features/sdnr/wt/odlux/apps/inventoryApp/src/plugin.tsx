// app configuration and main entry point for the app


import { faShoppingBag } from '@fortawesome/free-solid-svg-icons';  // select app icon

import applicationManager from '../../../framework/src/services/applicationManager';

import { Dashboard } from  './views/dashboard';

export function register() {
  applicationManager.registerApplication({
    name: "inventoryApp",
    icon: faShoppingBag,
    rootComponent: Dashboard,
    menuEntry: "Inventory App"
  });
}
