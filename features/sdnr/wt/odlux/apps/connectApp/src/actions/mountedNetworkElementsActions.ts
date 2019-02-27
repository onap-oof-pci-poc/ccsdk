import { Action } from '../../../../framework/src/flux/action';
import { Dispatch } from '../../../../framework/src/flux/store';

import { MountedNetworkElementType } from '../models/mountedNetworkElements';
import { RequiredNetworkElementType } from '../models/requiredNetworkElements';

import { connectService } from '../services/connectService';
import { AddSnackbarNotification } from '../../../../framework/src/actions/snackbarActions';

/** Represents the base action. */
export class BaseAction extends Action { }

/** Represents an action causing the store to load all mounted network elements. */
export class LoadAllMountedNetworkElementsAction extends BaseAction { }

/** Represents an action causing the store to update all mounted network elements. */
export class AllMountedNetworkElementsLoadedAction extends BaseAction {
  constructor(public mountedNetworkElements: MountedNetworkElementType[] | null, public error?: string) {
    super();
  }
}

/** Represents an action causing the store to update all mounted network elements. */
export class AddOrUpdateMountedNetworkElement extends BaseAction {
  constructor(public mountedNetworkElement: MountedNetworkElementType | null, public error?: string) {
    super();
  }
}

export class RemoveMountedNetworkElement extends BaseAction {
  constructor(public mountId: string) {
    super();
  }
}

export class UpdateConnectionStateMountedNetworkElement extends BaseAction {
  constructor(public mountId: string, connectionState: string) {
    super();
  }
}


export class UpdateRequiredMountedNetworkElement extends BaseAction {
  constructor(public mountId: string, public required: boolean) {
    super();
  }
}

/**
 *  Represents an action crator for a async thunk action to add an allready mounted element to the state of this app.
 *  Note: Use this action to add created object notified by the websocket.
*/
export const addMountedNetworkElementAsyncActionCreator = (mountId: string) => async (dispatch: Dispatch) => {
  return connectService.getMountedNetworkElementByMountId(mountId).then(mountedNetworkElement => {
    mountedNetworkElement && dispatch(new AddOrUpdateMountedNetworkElement(mountedNetworkElement));
  }).catch(error => {
    dispatch(new AddOrUpdateMountedNetworkElement(null, error));
  });
};

export const updateMountedNetworkElementAsyncActionCreator = (mountId: string) => async (dispatch: Dispatch) => {
  return connectService.getMountedNetworkElementByMountId(mountId).then(mountedNetworkElement => {
    if (mountedNetworkElement) {
      dispatch(new AddOrUpdateMountedNetworkElement(mountedNetworkElement));
    } else {
      dispatch(new RemoveMountedNetworkElement(mountId));
    }
  }).catch(error => {
    dispatch(new AddOrUpdateMountedNetworkElement(null, error));
  });
};

/** Represents an async thunk action to load all mounted network elements. */
export const loadAllMountedNetworkElementsAsync = (dispatch: Dispatch) => {
  dispatch(new LoadAllMountedNetworkElementsAction());
  return connectService.getMountedNetworkElementsList().then(mountedNetworkElements => {
      mountedNetworkElements && dispatch(new AllMountedNetworkElementsLoadedAction(mountedNetworkElements));
  }).catch(error => {
    dispatch(new AllMountedNetworkElementsLoadedAction(null, error));
  });
};

/** Represents an action crator for a async thunk action to mount a network element. */
export const mountNetworkElementAsyncActionCreator = (networkElement: RequiredNetworkElementType) => (dispatch: Dispatch) => {
  return connectService.mountNetworkElement(networkElement).then((success) => {
    success && (
      dispatch(addMountedNetworkElementAsyncActionCreator(networkElement.mountId)) &&
      dispatch(new AddSnackbarNotification({ message: `Requesting mount [${networkElement.mountId}]`, options: { variant: 'info' } }))
     ) || dispatch(new AddSnackbarNotification({ message: `Failed to mount [${ networkElement.mountId }]`, options: { variant: 'warning' } }));
  }).catch(error => {
    dispatch(new AddOrUpdateMountedNetworkElement(null, error));
  });
};

/** Represents an action crator for a async thunk action to unmount a network element. */
export const unmountNetworkElementAsyncActionCreator = (mountId: string) => (dispatch: Dispatch) => {
  return connectService.unmountNetworkElement(mountId).then((success) => {
    success && dispatch(new AddSnackbarNotification({ message: `Requesting unmount [${ mountId }]`, options: { variant: 'info' } }))
      || dispatch(new AddSnackbarNotification({ message: `Failed to unmount [${ mountId }]`, options: { variant: 'warning' } }));
  }).catch(error => {
    dispatch(new AddOrUpdateMountedNetworkElement(null, error));
  });
};


