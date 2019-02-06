import { Action } from '../../../../framework/src/flux/action';
import { Dispatch } from '../../../../framework/src/flux/store';
import { AddSnackbarNotification } from '../../../../framework/src/actions/snackbarActions';

import { MediatorServer } from '../models/mediatorServer';
import { avaliableMediatorServersReloadAction } from '../handlers/avaliableMediatorServersHandler';
import mediatorService from '../services/mediatorService';

/** Represents the base action. */
export class BaseAction extends Action { }

/** Represents an async thunk action that will add a server to the avaliable mediator servers. */
export const addAvaliableMediatorServerAsyncActionCreator = (server: MediatorServer) => (dispatch: Dispatch) => {
    mediatorService.insertMediatorServer(server).then(_ => {
      window.setTimeout(() => {
        dispatch(avaliableMediatorServersReloadAction);
        dispatch(new AddSnackbarNotification({ message: `Successfully added [${ server.name }]`, options: { variant: 'success' } }));
      }, 900);
    });
  };

  /** Represents an async thunk action that will add a server to the avaliable mediator servers. */
export const updateAvaliableMediatorServerAsyncActionCreator = (server: MediatorServer) => (dispatch: Dispatch) => {
  mediatorService.updateMediatorServer(server).then(_ => {
    window.setTimeout(() => {
      dispatch(avaliableMediatorServersReloadAction);
      dispatch(new AddSnackbarNotification({ message: `Successfully updated [${ server.name }]`, options: { variant: 'success' } }));
    }, 900);
  });
};
  
  /** Represents an async thunk action that will delete a server from the avaliable mediator servers. */
  export const removeAvaliableMediatorServerAsyncActionCreator = (server: MediatorServer) => (dispatch: Dispatch) => {
    mediatorService.deleteMediatorServer(server).then(_ => {
      window.setTimeout(() => {
        dispatch(avaliableMediatorServersReloadAction);
        dispatch(new AddSnackbarNotification({ message: `Successfully removed [${ server.name }]`, options: { variant: 'success' } }));
      }, 900);
    });
  };
  