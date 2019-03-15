import { IActionHandler } from '../../../../framework/src/flux/action';

import {
  AllConnectedNetworkElementsLoadedAction,
  LoadAllConnectedNetworkElementsAction,
} from '../actions/connectedNetworkElementsActions';

import { ConnectedNetworkElements } from '../models/connectedNetworkElements';

export interface IConnectedNetworkElementsState {
  connectedNetworkElements: ConnectedNetworkElements[];
  busy: boolean;
}

const connectedNetworkElementsStateInit: IConnectedNetworkElementsState = {
  connectedNetworkElements: [],
  busy: false
};

export const connectedNetworkElementsActionHandler: IActionHandler<IConnectedNetworkElementsState> = (state = connectedNetworkElementsStateInit, action) => {
  if (action instanceof LoadAllConnectedNetworkElementsAction) {

    state = {
      ...state,
      busy: true
    };

  } else if (action instanceof AllConnectedNetworkElementsLoadedAction) {
    if (!action.error && action.connectedNetworkElements) {
      state = {
        ...state,
        connectedNetworkElements: action.connectedNetworkElements,
        busy: false
      };
    } else {
      state = {
        ...state,
        busy: false
      };
    }
  }
  return state;
};