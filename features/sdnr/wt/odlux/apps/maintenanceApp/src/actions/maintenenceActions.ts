import { Action } from '../../../../framework/src/flux/action';
import { Dispatch } from '../../../../framework/src/flux/store';
import { MaintenenceEntry, spoofSymbol } from '../models/maintenenceEntryType';

import { AddSnackbarNotification } from '../../../../framework/src/actions/snackbarActions';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';

import { maintenenceService } from '../services/maintenenceService';

export class BaseAction extends Action { }

export class LoadAllMainteneceEntriesAction extends BaseAction { }

export class AllMainteneceEntriesLoadedAction extends BaseAction {

  constructor (public maintenenceEntries: MaintenenceEntry[] | null, error?:string) {
    super();

  }
}


export const loadAllMainteneceEntriesAsyncAction = (dispatch: Dispatch , getState: () => IApplicationStoreState) => {
  dispatch(new LoadAllMainteneceEntriesAction());
  // frist get all entries from the maintenance index
  maintenenceService.getAllMaintenenceEntries().then(entries => {
    if (!entries) {
      dispatch(new AddSnackbarNotification({ message: `Error reading maintenece sessings.`, options: { variant: 'error' } }));
      return;
    }

    // combine ell entries from the maintenance index with all networkelements
    const networkElements = getState().connectApp.mountedNetworkElements;
    const maintenenceEntries = networkElements.elements.reduce((acc, cur) => {
      const entry = entries.find(e => e.mountId === cur.mountId);
      acc.push(entry || {
        [spoofSymbol]: true,
        _id: cur.mountId,
        mountId: cur.mountId,
        description : "",
        start: "",
        end: "",
        active: false
      });
      return acc;
    }, [] as MaintenenceEntry[]);

    // all all entries from the maintenance index which are not in all networkelements
    entries.forEach(entry => {
      if (maintenenceEntries.findIndex(e => e.mountId === entry.mountId) < 0) {
        maintenenceEntries.push(entry);
      };
    });

    dispatch(new AllMainteneceEntriesLoadedAction(maintenenceEntries));
  }).catch(error => dispatch(new AllMainteneceEntriesLoadedAction(null, error)));
}

export class UpdateMaintenanceEntry extends BaseAction {
  constructor(public maintenenceEntry: MaintenenceEntry) {
    super();
  }
}

/** Represents an async thunk action creator to add an element to the maintenence entries. */
export const addOrUpdateMaintenenceEntryAsyncActionCreator = (entry: MaintenenceEntry) => (dispatch: Dispatch) => {
  maintenenceService.writeMaintenenceEntry(entry).then(result => {
    result && window.setTimeout(() => {
      // dispatch(loadAllMountedNetworkElementsAsync);
      dispatch(new UpdateMaintenanceEntry(entry));
      dispatch(new AddSnackbarNotification({ message: `Successfully ${result && result.created ? "created" : "updated"} maintenece sessings for [${entry.mountId}]`, options: { variant: 'success' } }));
    }, 900);
  });
};

/** Represents an async thunk action creator to delete an element from the maintenence entries. */
export const removeFromMaintenenceEntrysAsyncActionCreator = (entry: MaintenenceEntry) => (dispatch: Dispatch) => {
  maintenenceService.deleteMaintenenceEntry(entry).then(result => {
    result && window.setTimeout(() => {
      //dispatch(loadAllMountedNetworkElementsAsync);
      dispatch(new UpdateMaintenanceEntry({
        [spoofSymbol]: true,
        _id: entry._id,
        mountId: entry.mountId,
        description : "",
        start: "",
        end: "",
        active: false
      }));
      dispatch(new AddSnackbarNotification({ message: `Successfully removed [${entry.mountId}]`, options: { variant: 'success' } }));
    }, 900);
  });
};

// Hint: since there is no notification of changed required network elements, this code is not aware of changes caused outiside of this browser.