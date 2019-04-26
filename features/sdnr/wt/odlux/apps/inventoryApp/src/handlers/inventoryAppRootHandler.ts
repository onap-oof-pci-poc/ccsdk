// main state handler

import { combineActionHandler } from '../../../../framework/src/flux/middleware';

// ** do not remove **
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import { IActionHandler } from '../../../../framework/src/flux/action';
import { IInventoryElementsState, inventoryElementsActionHandler } from './inventoryElementsHandler';


export interface IInventoryAppStateState {
  inventoryElements: IInventoryElementsState
}


declare module '../../../../framework/src/store/applicationStore' {
  interface IApplicationStoreState {
    inventory: IInventoryAppStateState;
  }
}

const actionHandlers = {
  inventoryElements: inventoryElementsActionHandler
};

export const faultAppRootHandler = combineActionHandler<IInventoryAppStateState>(actionHandlers);
export default faultAppRootHandler;
