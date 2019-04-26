import { Action } from '../../../../framework/src/flux/action';
import { Dispatch } from '../../../../framework/src/flux/store';

import { CoreModelNetworkElement, LpResponse } from '../models/coreModel';
import configurationService, { getValueByName } from '../services/configurationService';
import { ViewSpecification } from 'models/uiModels';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import { AddSnackbarNotification } from '../../../../framework/src/actions/snackbarActions';

export class ConfigurationApplicationBaseAction extends Action { }

export class UpdateLoading extends ConfigurationApplicationBaseAction {
  constructor (public loading: boolean) {
    super();

  }
}

export class UpdateCoreModel extends ConfigurationApplicationBaseAction {
  constructor (public nodeId?: string, public coreModel?: CoreModelNetworkElement) {
    super();

  }
}

export class UpdateLp extends ConfigurationApplicationBaseAction {
  constructor (public lpId?: string, public capability?: string, public conditionalPackage?: string, public viewSpecifications: ViewSpecification[] = []) {
    super();

  }
}

export class UpdateViewData extends ConfigurationApplicationBaseAction {
  constructor (public viewId?: string, public indexValues: string = "", public viewData: {} = {}) {
    super();

  }
}


export const updateMountIdAsyncActionCreator = (nodeId: string | undefined) => async (dispatch: Dispatch) => {
  if (!nodeId) {
    dispatch(new UpdateCoreModel());
    return;
  }
  dispatch(new UpdateLoading(true));
  const coreModel = await configurationService.getCoreModelByNodeId(nodeId);
  dispatch(new UpdateLoading(false));

  return coreModel
    ? dispatch(new UpdateCoreModel(nodeId, coreModel))
    : dispatch(new UpdateCoreModel());
}

export const updateLpIdAsyncActionCreator = (lpId: string | undefined) => async (dispatch: Dispatch, getState: () => IApplicationStoreState) => {
  const { configuration: { coreModel: coreModel, nodeId: nodeId } } = getState();
  if (! nodeId || !lpId || !coreModel) {
    dispatch(new UpdateLp());
    return;
  }

  // find the lp with its unique uuid
  let lpData: LpResponse | null = null;
  for (let ltp of coreModel.ltp) {
    const lp = ltp.lp.find(pl => pl.uuid === lpId);
    if (lp) {
      lpData = lp;
      break;
    }
  }

  // urn:onf:params:xml:ns:yang:microwave-model?module=microwave-model => microwave-model
  let capability: string | null = lpData && getValueByName("capability", lpData.extension, null);
  if (capability) {
    const paramIndex = capability.indexOf('?');
    if (paramIndex > -1) {
      capability = capability.slice(paramIndex+1);
    }
    const params = capability.split("&").map(p => (p || "=").split("="));
    const capParam = params.find(p => p[0] === "module") || null;
    capability = capParam && capParam[1] || null;
  }

  const revision: string | null = lpData && getValueByName("revision", lpData.extension, null);
  const conditionalPackage: string | null = lpData && getValueByName("conditional-package", lpData.extension, null);

  dispatch(new UpdateLoading(true));
  const viewSpecifications = capability && await configurationService.getUIDescriptionByCapability(capability, revision) || [];
  dispatch(new UpdateLoading(false));

  return coreModel ?
    dispatch(new UpdateLp(lpId, capability || undefined, conditionalPackage || undefined, viewSpecifications)) :
    dispatch(new UpdateLp());
}

export const updateViewDataAsyncActionCreator = (viewId: string | undefined, indexValues: string[] = []) => async (dispatch: Dispatch, getState: () => IApplicationStoreState) => {
  const { configuration: { nodeId, lpId, capability, conditionalPackage, viewSpecifications } } = getState();
  if (!viewId || !capability || !nodeId || !lpId || !conditionalPackage) {
    // dispatch(new AddSnackbarNotification({ message: `Error invalid parameter !${JSON.stringify({capability ,nodeId ,lpId ,conditionalPackage}, null,2)}`, options: { variant: 'error' } }));
    dispatch(new UpdateViewData());
    return;
  }

  const viewSpecification = viewSpecifications.find(desc => desc.id === viewId);
  if (!viewSpecification) {
    dispatch(new AddSnackbarNotification({ message: `Error viewId ${viewId} not found !`, options: { variant: 'error' } }));
    dispatch(new UpdateViewData());
    return;
  }

  const url = viewSpecification.url.replace(/\$\$NODEID\$\$/g, nodeId).replace(/\$\$LPUUID\$\$/g, lpId);

  dispatch(new UpdateLoading(true));
  const data = capability && await configurationService.getViewData(url) || { };
  dispatch(new UpdateLoading(false));

  let viewData: { [path: string]: {} } = data;

  const pathElements = viewSpecification.dataPath &&
    viewSpecification.dataPath.replace(
      /\/\$\$INDEX:(\d+):?([a-z\-]+)?\$\$/ig,
      (_, indexStr, keyStr) => {
        const index = +indexStr;
        return indexValues[index] && '/' + indexValues[index] || '';
      }).split("/") || [];

  for (let path of pathElements) {
    if (path === "") {
      break;
    }
    viewData = viewData[path];
  }

  return viewData != null ?
    dispatch(new UpdateViewData(viewId, indexValues.length > 0 ? indexValues.join("/") : "", viewData)) :
    dispatch(new UpdateViewData());
}