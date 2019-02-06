import { XmlFileInfo, MediatorConfig, BusySymbol, MediatorConfigResponse, MediatorServerDevice } from "../models/mediatorServer";
import { IActionHandler } from "../../../../framework/src/flux/action";
import { SetMediatorServerVersion, SetMediatorServerInfo, SetAllMediatorServerConfigurations, SetMediatorServerBusy, SetMediatorServerSupportedDevices } from "../actions/mediatorServerActions";
import { SetMediatorBusyByName, UpdateMediatorConfig, AddMediatorConfig, RemoveMediatorConfig } from "../actions/mediatorConfigActions";

export type MediatorServerState = {
  busy: boolean;
  name: string| null ;
  url: string | null;
  serverVersion: string| null;
  mediatorVersion: string| null;
  nexmls: XmlFileInfo[]; 
  configurations: MediatorConfigResponse[]; 
  supportedDevices: MediatorServerDevice[];
}

const mediatorServerInit: MediatorServerState = {
  busy: false,
  name: null,
  url: null,
  serverVersion : null,
  mediatorVersion: null,
  nexmls: [],
  configurations: [], 
  supportedDevices: []
}

export const mediatorServerHandler: IActionHandler<MediatorServerState> = (state = mediatorServerInit, action) => {
  if (action instanceof SetMediatorServerBusy) {
    state = {
      ...state,
      busy: action.isBusy
    };
  } else if (action instanceof SetMediatorServerInfo) {
    state = {
      ...state,
      name: action.name,
      url: action.url,
    };
  } else if (action instanceof SetMediatorServerVersion) {
    state = {
      ...state,
      serverVersion: action.versionInfo && action.versionInfo.server ,
      mediatorVersion: action.versionInfo && action.versionInfo.mediator ,
      nexmls: action.versionInfo && [...action.versionInfo.nexmls] || [], 
    };
  } else if (action instanceof SetAllMediatorServerConfigurations) {
    state = {
      ...state,
      configurations: action.allConfigurations && action.allConfigurations.map(config => ({...config, busy: false}) ) || [],    
    };
  } else if (action instanceof SetMediatorServerSupportedDevices) {
    state = {
      ...state,
      supportedDevices: action.devices || [],    
    };
  } else if (action instanceof SetMediatorBusyByName) {
    const index = state.configurations.findIndex(config => config.Name === action.name);
    if (index > -1) state = {
      ...state,
      configurations:[
        ...state.configurations.slice(0, index),
        { ...state.configurations[index], [BusySymbol]: action.isBusy }, 
        ...state.configurations.slice(index + 1)
      ] 
    };
  } else if (action instanceof AddMediatorConfig) {
   state = {
      ...state,
      configurations: [
         ...state.configurations,
         action.mediatorConfig
      ] 
    };
  } else if (action instanceof UpdateMediatorConfig) {
    const index = state.configurations.findIndex(config => config.Name === action.name);
    if (index > -1) state = {
      ...state,
      configurations:[
        ...state.configurations.slice(0, index),
        { ...action.mediatorConfig, [BusySymbol]: state.configurations[index][BusySymbol] }, 
        ...state.configurations.slice(index + 1)
      ] 
    };
  } else if (action instanceof RemoveMediatorConfig) {
    const index = state.configurations.findIndex(config => config.Name === action.name);
    if (index > -1) state = {
      ...state,
      configurations:[
        ...state.configurations.slice(0, index),
        ...state.configurations.slice(index + 1)
      ] 
    };
  }
  return state;
} 