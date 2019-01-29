// main state handler

import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import { TocTreeNode } from 'models/tocNode';
import { IActionHandler } from '../../../../framework/src/flux/action';
import { LoadTocAction, TocLoadedAction, LoadDocumentAction, DocumentLoadedAction } from '../actions/helpActions';

export interface IHelpAppStoreState {
  busy: boolean;
  toc: TocTreeNode[] | undefined;
  content: string | undefined;
  currentPath: string | undefined;
}

declare module '../../../../framework/src/store/applicationStore' {
  interface IApplicationStoreState {
    helpApp: IHelpAppStoreState
  }
}

const helpAppStoreStateInit: IHelpAppStoreState = {
  busy: false,
  toc: undefined,
  content: undefined, 
  currentPath: undefined
};

export const helpAppRootHandler: IActionHandler<IHelpAppStoreState> = (state = helpAppStoreStateInit, action) => {
  if (action instanceof LoadTocAction) {
    state = {
      ...state,
      busy: true
    };
  } else if (action instanceof TocLoadedAction) {
    state = {
      ...state,
      busy: false,
      toc: action.toc
    };
  } else if (action instanceof LoadDocumentAction) {
    state = {
      ...state,
      busy: true
    };
  } else if (action instanceof DocumentLoadedAction) {
    state = {
      ...state,
      busy: false,
      content: action.document,
      currentPath: action.documentPath
    };
  }

  return state;
}


export default helpAppRootHandler;
