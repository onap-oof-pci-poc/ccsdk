import { Action } from '../../../../framework/src/flux/action';
import { Dispatch } from '../../../../framework/src/flux/store';
import { RequiredNetworkElementType } from '../models/requiredNetworkElements';
import { requiredNetworkElementsReloadAction } from '../handlers/requiredNetworkElementsHandler';
import { UpdateRequiredMountedNetworkElement } from '../actions/mountedNetworkElementsActions';

import { AddSnackbarNotification } from '../../../../framework/src/actions/snackbarActions';

import { connectService } from '../services/connectService';

/** Represents the base action. */
export class BaseAction extends Action { }


/** Represents an async thunk action creator to add an element to the required network elements. */
export const addToRequiredNetworkElementsAsyncActionCreator = (element: RequiredNetworkElementType) => (dispatch: Dispatch) => {
  connectService.insertRequiredNetworkElement(element).then(_ => {
    window.setTimeout(() => {
      dispatch(requiredNetworkElementsReloadAction);
      dispatch(new UpdateRequiredMountedNetworkElement(element.mountId, true));
      dispatch(new AddSnackbarNotification({ message: `Successfully added [${ element.mountId }]`, options: { variant: 'success' } }));
    }, 900);
  });
};

/** Represents an async thunk action creator to delete an element from the required network elements. */
export const removeFromRequiredNetworkElementsAsyncActionCreator = (element: RequiredNetworkElementType) => (dispatch: Dispatch) => {
  connectService.deleteRequiredNetworkElement(element).then(_ => {
    window.setTimeout(() => {
      dispatch(requiredNetworkElementsReloadAction);
      dispatch(new UpdateRequiredMountedNetworkElement(element.mountId, false));
      dispatch(new AddSnackbarNotification({ message: `Successfully removed [${ element.mountId }]`, options: { variant: 'success' } }));
    }, 900);
  });
};



