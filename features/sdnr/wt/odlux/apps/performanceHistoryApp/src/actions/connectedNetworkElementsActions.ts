import { Action } from '../../../../framework/src/flux/action';
import { Dispatch } from '../../../../framework/src/flux/store';

import { ConnectedNetworkElements } from '../models/connectedNetworkElements';
import { PerformanceHistoryService } from '../services/performanceHistoryService';

/** 
 * Represents the base action. 
 */
export class BaseAction extends Action { }

/** 
 * Represents an action causing the store to load all connected network elements. 
 */
export class LoadAllConnectedNetworkElementsAction extends BaseAction { }

/** 
 * Represents an action causing the store to update all connected network elements. 
 */
export class AllConnectedNetworkElementsLoadedAction extends BaseAction {  
  /**
   * Initialize this instance.
   * 
   * @param connectedNetworkElements The network elements which are returned from the restconf.
   */
  constructor(public connectedNetworkElements: ConnectedNetworkElements[] | null, public error?: string) {
    super();
  }
}

/** 
 * Represents an asynchronous thunk  action to load all connected network elements from the restconf. 
 */
export const loadAllConnectedNetworkElementsAsync = (dispatch: Dispatch) => {
  dispatch(new LoadAllConnectedNetworkElementsAction());
  PerformanceHistoryService.getConnectedNetworkElementsList().then(networkElements => {
    networkElements && dispatch(new AllConnectedNetworkElementsLoadedAction(networkElements));
  }).catch(error => {
    dispatch(new AllConnectedNetworkElementsLoadedAction(null, error));
  });
};