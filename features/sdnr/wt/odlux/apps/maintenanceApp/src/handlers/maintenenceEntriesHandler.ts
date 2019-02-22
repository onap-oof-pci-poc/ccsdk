import { IActionHandler } from '../../../../framework/src/flux/action';

import { MaintenenceEntry } from '../models/maintenenceEntryType';
import { LoadAllMainteneceEntriesAction, AllMainteneceEntriesLoadedAction, UpdateMaintenanceEntry } from '../actions/maintenenceActions';

export interface IMaintenenceEntriesState {
  entries: MaintenenceEntry[];
  busy: boolean;
}

const maintenanceEntriesStateInit: IMaintenenceEntriesState = {
  entries: [],
  busy: false
};

export const maintenenceEntriesActionHandler: IActionHandler<IMaintenenceEntriesState> = (state = maintenanceEntriesStateInit, action) => {
  if (action instanceof LoadAllMainteneceEntriesAction){
    state = {
      ...state,
      busy: true,
    }
  } else if (action instanceof AllMainteneceEntriesLoadedAction){
    state = {
      ...state,
      entries: action.maintenenceEntries || [],
      busy: false,
    }
  } else if (action instanceof UpdateMaintenanceEntry) {
    const index = state.entries.findIndex(e => action.maintenenceEntry.mountId === e.mountId);
    state = {
      ...state,
      entries: index > -1 ? [
        ...state.entries.slice(0, index),
        action.maintenenceEntry,
        ...state.entries.slice(index+1),
      ] : [...state.entries, action.maintenenceEntry]
    }
  }
  return state;
}