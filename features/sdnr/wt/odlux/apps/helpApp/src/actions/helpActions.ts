import { Action } from '../../../../framework/src/flux/action';
import { Dispatch } from '../../../../framework/src/flux/store';

import { TocTreeNode } from '../models/tocNode';
import helpService from '../services/helpService';

export class LoadTocAction extends Action {
  constructor() {
    super();

  }
}

export class TocLoadedAction extends Action {
  constructor(public toc?: TocTreeNode[], error?: string) {
    super();
    
  }
}

export const requestTocAsyncAction = async (dispatch: Dispatch) => {
  dispatch(new LoadTocAction);
  try {
    const toc = await helpService.getTableOfContents();
    if (toc) {
      dispatch(new TocLoadedAction(toc));
    } else {
      dispatch(new TocLoadedAction(undefined, "Could not load TOC."));
    }
  } catch (err) {
    dispatch(new TocLoadedAction(undefined, err));
  }
}

export class LoadDocumentAction extends Action {
  constructor() {
    super();

  }
}

export class DocumentLoadedAction extends Action {
  constructor(public document?: string, public documentPath?: string, error?: string) {
    super();

  }
}

export const requestDocumentAsyncActionCreator = (path: string) => async (dispatch: Dispatch) => {
  dispatch(new LoadDocumentAction);
  try {
    const doc = await helpService.getDocument(path);
    if (doc) {
      dispatch(new DocumentLoadedAction(doc, path));
    } else {
      dispatch(new DocumentLoadedAction(undefined, undefined, "Could not load document."));
    }
  } catch (err) {
    dispatch(new DocumentLoadedAction(undefined, undefined, err));
  }
}