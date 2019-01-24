import { IActionHandler } from '../flux/action';
import { SetTitleAction } from '../actions/titleActions';

import { AddSnackbarNotification, RemoveSnackbarNotification } from '../actions/snackbarActions';
import { AddErrorInfoAction, RemoveErrorInfoAction, ClearErrorInfoAction } from '../actions/errorActions';

import { IconType } from '../models/iconDefinition';

import { ErrorInfo } from '../models/errorInfo';
import { SnackbarItem } from '../models/snackbarItem';

export interface IApplicationState {
  title: string;
  icon?: IconType; 

  errors: ErrorInfo[];
  snackBars: SnackbarItem[];
}

const applicationStateInit: IApplicationState = { title: "Loading ...", errors: [], snackBars:[] };

export const applicationStateHandler: IActionHandler<IApplicationState> = (state = applicationStateInit, action) => {
  if (action instanceof SetTitleAction) {
    state = {
      ...state,
      title: action.title,
      icon: action.icon
    };
  } else if (action instanceof AddErrorInfoAction) {
    state = {
      ...state,
      errors: [
        ...state.errors,
        action.errorInfo
      ]
    };
  } else if (action instanceof RemoveErrorInfoAction) {
    const index = state.errors.indexOf(action.errorInfo);
    if (index > -1) {
      state = {
        ...state,
        errors: [
          ...state.errors.slice(0, index),
          ...state.errors.slice(index + 1)
        ]
      };
    }
  } else if (action instanceof ClearErrorInfoAction) {
    if (state.errors && state.errors.length) {
      state = {
        ...state,
        errors: []
      };
    }
  } else if (action instanceof AddSnackbarNotification) {
    state = {
      ...state,
      snackBars: [
        ...state.snackBars,
        action.notification
      ]
    };
  } else if (action instanceof RemoveSnackbarNotification) {
    state = {
      ...state,
      snackBars: state.snackBars.filter(s => s.key !== action.key)
    };
  }
  return state;
};
