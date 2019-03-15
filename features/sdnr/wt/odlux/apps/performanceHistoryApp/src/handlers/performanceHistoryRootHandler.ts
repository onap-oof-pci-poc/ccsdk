// main state handler

import { combineActionHandler } from '../../../../framework/src/flux/middleware';

// ** do not remove **
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import { IActionHandler } from '../../../../framework/src/flux/action';

import { IPerformanceData15minState, performanceData15minActionHandler } from './performanceData15minHandler';
import { IReceiveLevel15minState, receiveLevel15minActionHandler } from './receiveLevel15minHandler';
import { ITransmissionPower15minState, transmissionPower15minActionHandler } from './transmissionPower15minHandler';
import { IAdaptiveModulation15minState, adaptiveModulation15minActionHandler } from './adaptiveModulation15minHandler';
import { ITemperature15minState, temperature15minActionHandler } from './temperature15minHandler';
import { ISignalToInterference15minState, signalToInterference15minActionHandler } from './signalToInterference15minHandler';
import { ICrossPolarDiscrimination15minState, crossPolarDiscrimination15minActionHandler } from './crossPolarDiscrimination15minHandler';
import { IPerformanceData24hoursState, performanceData24hoursActionHandler } from './performanceData24hoursHandler';
import { IReceiveLevel24hoursState, receiveLevel24hoursActionHandler } from './receiveLevel24hoursHandler';
import { ITransmissionPower24hoursState, transmissionPower24hoursActionHandler } from './transmissionPower24hoursHandler';
import { IAdaptiveModulation24hoursState, adaptiveModulation24hoursActionHandler } from './adaptiveModulation24hoursHandler';
import { ITemperature24hoursState, temperature24hoursActionHandler } from './temperature24hoursHandler';
import { ISignalToInterference24hoursState, signalToInterference24hoursActionHandler } from './signalToInterference24hoursHandler';
import { ICrossPolarDiscrimination24hoursState, crossPolarDiscrimination24hoursActionHandler } from './crossPolarDiscrimination24hoursHandler';
import { SetPanelAction } from '../actions/panelChangeActions';
import { IConnectedNetworkElementsState, connectedNetworkElementsActionHandler } from './connectedNetworkElementsActionHandler';
import { IAvailableLtpsState, availableLtpsActionHandler } from './availableLtpsActionHandler';

export interface IPerformanceHistoryStoreState {
  networkElements: IConnectedNetworkElementsState;
  ltps: IAvailableLtpsState;
  performanceData15min: IPerformanceData15minState;
  performanceData24hours: IPerformanceData24hoursState;
  receiveLevel15min: IReceiveLevel15minState;
  receiveLevel24hours: IReceiveLevel24hoursState;
  transmissionPower15min: ITransmissionPower15minState;
  transmissionPower24hours: ITransmissionPower24hoursState;
  adaptiveModulation15min: IAdaptiveModulation15minState;
  adaptiveModulation24hours: IAdaptiveModulation24hoursState;
  temperature15min: ITemperature15minState;
  temperature24hours: ITemperature24hoursState;
  signalToInterference15min:ISignalToInterference15minState;
  signalToInterference24hours:ISignalToInterference24hoursState;
  crossPolarDiscrimination15min: ICrossPolarDiscrimination15minState;
  crossPolarDiscrimination24hours: ICrossPolarDiscrimination24hoursState;
  currentOpenPanel: string | null;

}

const currentOpenPanelHandler: IActionHandler<string | null> = (state = null, action) => {
  if (action instanceof SetPanelAction) {
    state = action.panelId;
  }
  return state;
}

declare module '../../../../framework/src/store/applicationStore' {
  interface IApplicationStoreState {
    performanceHistoryApp: IPerformanceHistoryStoreState;
  }
}

const actionHandlers = {
  networkElements: connectedNetworkElementsActionHandler,
  ltps: availableLtpsActionHandler,
  performanceData15min: performanceData15minActionHandler,
  performanceData24hours: performanceData24hoursActionHandler,
  receiveLevel15min: receiveLevel15minActionHandler,
  receiveLevel24hours: receiveLevel24hoursActionHandler,
  transmissionPower15min: transmissionPower15minActionHandler,
  transmissionPower24hours: transmissionPower24hoursActionHandler,
  adaptiveModulation15min: adaptiveModulation15minActionHandler,
  adaptiveModulation24hours: adaptiveModulation24hoursActionHandler,
  temperature15min: temperature15minActionHandler,
  temperature24hours: temperature24hoursActionHandler,
  signalToInterference15min: signalToInterference15minActionHandler,
  signalToInterference24hours: signalToInterference24hoursActionHandler,
  crossPolarDiscrimination15min: crossPolarDiscrimination15minActionHandler,
  crossPolarDiscrimination24hours: crossPolarDiscrimination24hoursActionHandler,
  currentOpenPanel: currentOpenPanelHandler,
};

export const performanceHistoryRootHandler = combineActionHandler<IPerformanceHistoryStoreState>(actionHandlers);
export default performanceHistoryRootHandler;

