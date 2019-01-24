import { IActionHandler } from '../../../../framework/src/flux/action';

import {
  AddMountedNetworkElement,
  AllMountedNetworkElementsLoadedAction,
  LoadAllMountedNetworkElementsAction,
  RemoveMountedNetworkElement,
  UpdateConnectionStateMountedNetworkElement,
  UpdateRequiredMountedNetworkElement
} from '../actions/mountedNetworkElementsActions';

import { MountedNetworkElementType } from '../models/mountedNetworkElements';

export interface IMountedNetworkElementsState {
  elements: MountedNetworkElementType[];
  busy: boolean;
}

const mountedNetworkElementsStateInit: IMountedNetworkElementsState = {
  elements: [],
  busy: false
};

export const mountedNetworkElementsActionHandler: IActionHandler<IMountedNetworkElementsState> = (state = mountedNetworkElementsStateInit, action) => {
  if (action instanceof LoadAllMountedNetworkElementsAction) {

    state = {
      ...state,
      busy: true
    };
  
  } else if (action instanceof AllMountedNetworkElementsLoadedAction) {
    if (!action.error && action.mountedNetworkElements) {
      state = {
        ...state,
        elements: action.mountedNetworkElements,
        busy: false
      };
    } else {
      state = {
        ...state,
        busy: false
      };
    }
  } else if (action instanceof AddMountedNetworkElement) {
    action.mountedNetworkElement && (state = {
      ...state,
      elements: [...state.elements, action.mountedNetworkElement],
    });
  } else if (action instanceof RemoveMountedNetworkElement) {
    state = {
      ...state,
      elements: state.elements.filter(e => e.mountId !== action.mountId),
    };
  } else if (action instanceof UpdateConnectionStateMountedNetworkElement) {
    const index = state.elements.findIndex(el => el.mountId === action.mountId);
    if (index > -1) {
      state = {
        ...state,
        elements: [
          ...state.elements.slice(0, index),
          { ...state.elements[index], connectionStatus: action.mountId },
          ...state.elements.slice(index + 1)
        ]
      }
    }
  } else if (action instanceof UpdateRequiredMountedNetworkElement) {
    const index = state.elements.findIndex(el => el.mountId === action.mountId);
    if (index > -1 && (state.elements[index].required !== action.required)) {
      state = {
        ...state,
        elements: [
          ...state.elements.slice(0, index),
          { ...state.elements[index], required: action.required },
          ...state.elements.slice(index + 1)
        ]
      }
    }
  };
  return state;
};