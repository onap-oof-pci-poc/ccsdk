import { createExternal,IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';

import { InventoryType } from '../models/inventory';

export interface IInventoryElementsState extends IExternalTableState<InventoryType> { }

// create eleactic search material data fetch handler
const inventoryElementsSearchHandler = createSearchDataHandler<InventoryType>("sdnevents/inventoryequipment");

export const {
  actionHandler: inventoryElementsActionHandler,
  createActions: createInventoryElementsActions,
  createProperties: createInventoryElementsProperties,
  reloadAction: inventoryElementsReloadAction,

  // set value action, to change a value
} = createExternal<InventoryType>(inventoryElementsSearchHandler, appState => appState.inventory.inventoryElements);

