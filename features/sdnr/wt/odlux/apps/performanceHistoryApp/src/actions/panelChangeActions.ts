import { Action } from '../../../../framework/src/flux/action';
import { PanelId } from '../models/panelId';

/** 
 * Represents an action causing the store to update the panel. 
 */
export class SetPanelAction extends Action {
  /**
   * Initialize this instance.
   * @param panelId Action to set the current panel by its Id.
   */
  constructor(public panelId: PanelId) {
    super();
  }
}
