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
export class AddMountedNetworkElement extends BaseAction {
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
 *  An actioncrator for a async thunk action to add an allready mounted element to the state of this app. 
 *  Note: Use this action to add created object notified by the websocket. 
*/
export const addMountedNetworkElementAsyncActionCreator = (mountId: string) => async (dispatch: Dispatch) => {
  connectService.getMountedNetworkElementByMountId(mountId).then(mountedNetworkElement => {
    mountedNetworkElement && dispatch(new AddMountedNetworkElement(mountedNetworkElement));
  }).catch(error => {
    dispatch(new AddMountedNetworkElement(null, error));
  });
};

/** Represents an async thunk action to load all mounted network elements. */
export const loadAllMountedNetworkElementsAsync = (dispatch: Dispatch) => {
  dispatch(new LoadAllMountedNetworkElementsAction());
    connectService.getMountedNetworkElementsList().then(mountedNetworkElements => { 
      mountedNetworkElements && dispatch(new AllMountedNetworkElementsLoadedAction(mountedNetworkElements));
  }).catch(error => {
    dispatch(new AllMountedNetworkElementsLoadedAction(null, error));
  });
};

/** Represents an async thunk action to load all mounted network elements. */
export const mountNetworkElementActionCreatorAsync = (networkElement: RequiredNetworkElementType) => (dispatch: Dispatch) => {
  connectService.mountNetworkElement(networkElement).then((success) => {
    success && dispatch(new AddSnackbarNotification({ message: `Requesting mount [${ networkElement.mountId }]`, options: { variant: 'info' } }))
      || dispatch(new AddSnackbarNotification({ message: `Failed to mount [${ networkElement.mountId }]`, options: { variant: 'warning' } }));
  }).catch(error => {
    dispatch(new AddMountedNetworkElement(null, error));
  });
};

export const unmountNetworkElementActionCreatorAsync = (mountId: string) => (dispatch: Dispatch) => {
  connectService.unmountNetworkElement(mountId).then((success) => {
    success && dispatch(new AddSnackbarNotification({ message: `Requesting unmount [${ mountId }]`, options: { variant: 'info' } }))
      || dispatch(new AddSnackbarNotification({ message: `Failed to unmount [${ mountId }]`, options: { variant: 'warning' } }));
  }).catch(error => {
    dispatch(new AddMountedNetworkElement(null, error));
  });
};


