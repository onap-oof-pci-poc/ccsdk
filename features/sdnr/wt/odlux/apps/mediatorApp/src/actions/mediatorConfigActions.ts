
import { Action } from '../../../../framework/src/flux/action';
import { Dispatch } from '../../../../framework/src/flux/store';

import { AddSnackbarNotification } from '../../../../framework/src/actions/snackbarActions';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';

import mediatorService from '../services/mediatorService';
import { MediatorConfig, MediatorConfigResponse } from '../models/mediatorServer';

/** Represents the base action. */
export class BaseAction extends Action { }

export class SetMediatorBusyByName extends BaseAction {
  constructor (public name: string, public isBusy: boolean) {
    super();
  }
}

export class AddMediatorConfig extends BaseAction {
  constructor (public mediatorConfig: MediatorConfigResponse) {
    super();
  }
}

export class UpdateMediatorConfig extends BaseAction {
  constructor (public name: string, public mediatorConfig: MediatorConfigResponse) {
    super();
  }
}

export class RemoveMediatorConfig extends BaseAction {
  constructor (public name: string) {
    super();
  }
}


export const startMediatorByNameAsyncActionCreator = (name: string) => (dispatch: Dispatch, getState: () => IApplicationStoreState) => {
  dispatch(new SetMediatorBusyByName(name, true));
  const { mediatorApp: { mediatorServerState: { url } } } = getState();
  if (url) {
    mediatorService.startMediatorByName(url, name).then(msg => {
      dispatch(new AddSnackbarNotification({ message: msg + ' ' + name, options: { variant: 'info' } }));
      // since there is no notification, a timeout will be need here 
      window.setTimeout(() => {
        mediatorService.getMediatorServerConfigByName(url, name).then(config => {
          if (config) {
            dispatch(new UpdateMediatorConfig(name, config));
          } else {
            dispatch(new AddSnackbarNotification({ message: `Error: reading mediator config for ${name}.`, options: { variant: 'error' } }));
          }
          dispatch(new SetMediatorBusyByName(name, false));
        });
      }, 2100);
    });
  } else {
    dispatch(new AddSnackbarNotification({ message: `Error: currently no mediator server selected.`, options: { variant: 'error' } }));
    dispatch(new SetMediatorBusyByName(name, false));
  }
};

export const stopMediatorByNameAsyncActionCreator = (name: string) => (dispatch: Dispatch, getState: () => IApplicationStoreState) => {
  dispatch(new SetMediatorBusyByName(name, true));
  const { mediatorApp: { mediatorServerState: { url } } } = getState();
  if (url) {
    mediatorService.stopMediatorByName(url, name).then(msg => {
      dispatch(new AddSnackbarNotification({ message: msg + ' ' + name, options: { variant: 'info' } }));
      // since there is no notification, a timeout will be need here 
      window.setTimeout(() => {
        mediatorService.getMediatorServerConfigByName(url, name).then(config => {
          if (config) {
            dispatch(new UpdateMediatorConfig(name, config));
          } else {
            dispatch(new AddSnackbarNotification({ message: `Error: reading mediator config for ${name}.`, options: { variant: 'error' } }));
          }
          dispatch(new SetMediatorBusyByName(name, false));
        });
      }, 2100);
    });
  } else {
    dispatch(new AddSnackbarNotification({ message: `Error: currently no mediator server selected.`, options: { variant: 'error' } }));
    dispatch(new SetMediatorBusyByName(name, false));
  }
};

export const addMediatorConfigAsyncActionCreator = (config: MediatorConfig) => (dispatch: Dispatch, getState: () => IApplicationStoreState) => {
  const { Name: name } = config;
  const { mediatorApp: { mediatorServerState: { url } } } = getState();
  if (url) {
    mediatorService.createMediatorConfig(url, config).then(msg => {
      dispatch(new AddSnackbarNotification({ message: msg + ' ' + name, options: { variant: 'info' } }));
      // since there is no notification, a timeout will be need here 
      window.setTimeout(() => {
        mediatorService.getMediatorServerConfigByName(url, name).then(config => {
          if (config) {
            dispatch(new AddMediatorConfig(config));
          } else {
            dispatch(new AddSnackbarNotification({ message: `Error: reading mediator config for ${name}.`, options: { variant: 'error' } }));
          }
        });
      }, 2100);
    });
  } else {
    dispatch(new AddSnackbarNotification({ message: `Error: currently no mediator server selected.`, options: { variant: 'error' } }));
  }
};

export const updateMediatorConfigAsyncActionCreator = (config: MediatorConfig) => (dispatch: Dispatch) => {
  // currently not supported be backend
};

export const removeMediatorConfigAsyncActionCreator = (config: MediatorConfig) => (dispatch: Dispatch, getState: () => IApplicationStoreState) => {
  const { Name: name } = config;
  const { mediatorApp: { mediatorServerState: { url } } } = getState();
  if (url) {
    mediatorService.deleteMediatorConfigByName(url, name).then(msg => {
      dispatch(new AddSnackbarNotification({ message: msg + ' ' + name, options: { variant: 'info' } }));
      // since there is no notification, a timeout will be need here 
      window.setTimeout(() => {
        mediatorService.getMediatorServerConfigByName(url, config.Name).then(config => {
          if (!config) {
            dispatch(new RemoveMediatorConfig(name));
          } else {
            dispatch(new AddSnackbarNotification({ message: `Error: deleting mediator config for ${name}.`, options: { variant: 'error' } }));
          }
        });
      }, 2100);
    });
  } else {
    dispatch(new AddSnackbarNotification({ message: `Error: currently no mediator server selected.`, options: { variant: 'error' } }));
    dispatch(new SetMediatorBusyByName(name, false));
  }
};



