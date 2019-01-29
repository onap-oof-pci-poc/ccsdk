import { Action } from '../../../../framework/src/flux/action';
import { PanelId } from '../models/panelId';

export class SetPanelAction extends Action {
  constructor(public panelId: PanelId) {
    super();
  }
}

