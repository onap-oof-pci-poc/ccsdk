// main state handler

import { combineActionHandler } from '../../../../framework/src/flux/middleware';

// ** do not remove **
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import { IActionHandler } from '../../../../framework/src/flux/action';

import { IFaultNotifications, faultNotificationsHandler } from './notificationsHandler';
import { ICurrentProblemsState, currentProblemsActionHandler } from './currentProblemsHandler';
import { IAlarmLogEntriesState, alarmLogEntriesActionHandler } from './alarmLogEntriesHandler';
import { SetPanelAction } from '../actions/panelChangeActions';

export interface IFaultAppStoreState {
  currentProblems: ICurrentProblemsState;
  faultNotifications: IFaultNotifications;
  alarmLogEntries: IAlarmLogEntriesState;
  currentOpenPanel: string|null;
}

const currentOpenPanelHandler: IActionHandler<string | null> = (state = null, action) => {
  if (action instanceof SetPanelAction) {
    state = action.panelId;
  }
  return state;
}

declare module '../../../../framework/src/store/applicationStore' {
  interface IApplicationStoreState {
    faultApp: IFaultAppStoreState;
  }
}

const actionHandlers = {
  currentProblems: currentProblemsActionHandler,
  faultNotifications: faultNotificationsHandler,
  alarmLogEntries: alarmLogEntriesActionHandler,
  currentOpenPanel: currentOpenPanelHandler
};

export const faultAppRootHandler = combineActionHandler<IFaultAppStoreState>(actionHandlers);
export default faultAppRootHandler;
