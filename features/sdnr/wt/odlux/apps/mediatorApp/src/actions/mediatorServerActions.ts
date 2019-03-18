import { Action } from '../../../../framework/src/flux/action';
import { Dispatch } from '../../../../framework/src/flux/store';

import { MediatorServerVersionInfo, MediatorConfig, MediatorConfigResponse, MediatorServerDevice } from '../models/mediatorServer';
import mediatorService from '../services/mediatorService';
import { AddSnackbarNotification } from '../../../../framework/src/actions/snackbarActions';
import { NavigateToApplication } from '../../../../framework/src/actions/navigationActions';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';

/** Represents the base action. */
export class BaseAction extends Action { }

export class SetMediatorServerBusy extends BaseAction {
  constructor (public isBusy: boolean) {
    super();
  }
}

export class SetMediatorServerInfo extends BaseAction {
  /**
   * Initializes a new instance of this class.
   */
  constructor (public name: string | null, public url: string | null) {
    super();

  }
}

export class SetMediatorServerVersion extends BaseAction {
  /**
   * Initializes a new instance of this class.
   */
  constructor (public versionInfo: MediatorServerVersionInfo | null) {
    super();

  }
}

export class SetAllMediatorServerConfigurations extends BaseAction {
  /**
   * Initializes a new instance of this class.
   */
  constructor (public allConfigurations: MediatorConfigResponse[] | null) {
    super();

  }
}

export class SetMediatorServerSupportedDevices extends BaseAction {
  /**
   * Initializes a new instance of this class.
   */
  constructor (public devices: MediatorServerDevice[] | null) {
    super();

  }
}

export const initializeMediatorServerAsyncActionCreator = (serverId: string) => (dispatch: Dispatch) => {
  dispatch(new SetMediatorServerBusy(true));
  mediatorService.getMediatorServerById(serverId).then(mediatorServer => {
    if (!mediatorServer) {
      dispatch(new SetMediatorServerBusy(false));
      dispatch(new AddSnackbarNotification({ message: `Error loading mediator server [${serverId}]`, options: { variant: 'error' } }));
      dispatch(new NavigateToApplication("mediator"));
      return;
    }
    dispatch(new SetMediatorServerInfo(mediatorServer.name, mediatorServer.url));

    mediatorService.getMediatorServerVersion(mediatorServer.url).then(versionInfo => {
      dispatch(new SetMediatorServerVersion(versionInfo));
    });

    Promise.all([
      mediatorService.getMediatorServerAllConfigs(mediatorServer.url),
      mediatorService.getMediatorServerSupportedDevices(mediatorServer.url)
    ]).then(([configurations,supportedDevices]) => {
      dispatch(new SetAllMediatorServerConfigurations(configurations));
      dispatch(new SetMediatorServerSupportedDevices(supportedDevices));
      dispatch(new SetMediatorServerBusy(false));
    });
  });
};

