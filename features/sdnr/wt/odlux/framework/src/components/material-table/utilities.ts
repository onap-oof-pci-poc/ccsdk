import { Action, IActionHandler } from '../../flux/action';
import { Dispatch } from '../../flux/store';

import { AddErrorInfoAction } from '../../actions/errorActions';
import { IApplicationStoreState } from '../../store/applicationStore';

import { DataCallback } from ".";
export interface IExternalTableState<TData> {
  order: 'asc' | 'desc';
  orderBy: string | null;
  selected: any[] | null;
  rows: TData[];
  rowCount: number;
  page: number;
  rowsPerPage: number;
  loading: boolean;
  showFilter: boolean;
  filter: { [property: string]: string };
}

/** Create an actionHandler and actions for external table states. */
export function createExternal<TData>(callback: DataCallback<TData>, selectState: (appState: IApplicationStoreState) => IExternalTableState<TData>) {

  //#region Actions
  abstract class TableAction extends Action { }

 
  class RequestSortAction extends TableAction {
    constructor(public orderBy: string) {
      super();
    }
  }

  class SetSelectedAction extends TableAction {
    constructor(public selected: TData[] | null) {
      super();
    }
  }

  class SetPageAction extends TableAction {
    constructor(public page: number) {
      super();
    }
  }

  class SetRowsPerPageAction extends TableAction {
    constructor(public rowsPerPage: number) {
      super();
    }
  }

  class SetFilterChangedAction extends TableAction {
    constructor(public filter: {[key: string]: string}) {
      super();
    }
  }

  class SetShowFilterAction extends TableAction {
    constructor(public show: boolean) {
      super();
    }
  }

  class RefreshAction extends TableAction {
    constructor() {
      super();
    }
  }

  class SetResultAction extends TableAction {
    constructor(public result: { page: number, rowCount: number, rows: TData[] }) {
      super();
    }
  }

  // #endregion
 
  //#region Action Handler
  const externalTableStateInit: IExternalTableState<TData> = {
    order: 'asc',
    orderBy: null,
    selected: null,
    rows: [],
    rowCount: 0,
    page: 0,
    rowsPerPage: 10,
    loading: false,
    showFilter: false,
    filter: {}
  };

  const externalTableStateActionHandler: IActionHandler<IExternalTableState<TData>> = (state = externalTableStateInit, action) => {
    if (!(action instanceof TableAction)) return state;
    if (action instanceof RefreshAction) {
      state = {
        ...state,
        loading: true
      }
    } else if (action instanceof SetResultAction) {
      state = {
        ...state,
        loading: false,
        rows: action.result.rows,
        rowCount: action.result.rowCount,
        page: action.result.page,
      }
    } else if (action instanceof RequestSortAction) {
      state = {
        ...state,
        loading: true,
        orderBy : state.orderBy === action.orderBy && state.order === 'desc' ? null : action.orderBy ,
        order: state.orderBy === action.orderBy && state.order === 'asc' ? 'desc' : 'asc',
      }
    } else if (action instanceof SetShowFilterAction) {
      state = {
        ...state,
        loading: true,
        showFilter: action.show
      }
    } else if (action instanceof SetFilterChangedAction) {
      state = {
        ...state,
        loading: true,
        filter: action.filter
      }
    } else if (action instanceof SetPageAction) {
      state = {
        ...state,
        loading: true,
        page: action.page
      }
    } else if (action instanceof SetRowsPerPageAction) {
      state = {
        ...state,
        loading: true,
        rowsPerPage: action.rowsPerPage
      }
    } 
    return state;
  }

  //const createTableAction(tableAction)

  //#endregion
  const reloadAction = (dispatch: Dispatch, getAppState: () => IApplicationStoreState) => {
    dispatch(new RefreshAction());
    const ownState = selectState(getAppState());
    Promise.resolve(callback(ownState.page, ownState.rowsPerPage, ownState.orderBy, ownState.order, ownState.showFilter && ownState.filter || {})).then(result => {
      dispatch(new SetResultAction(result));
    }).catch(error => new AddErrorInfoAction(error));
  };

  const createActions = (dispatch: Dispatch) => {
    return {
      onRefresh: () => {
        dispatch(reloadAction);
      },
      onHandleRequestSort: (orderBy: string) => {
        dispatch((dispatch: Dispatch, getAppState: () => IApplicationStoreState) => {
          dispatch(new RequestSortAction(orderBy));
          const ownState = selectState(getAppState());
          Promise.resolve(callback(ownState.page, ownState.rowsPerPage, ownState.orderBy, ownState.order, ownState.showFilter && ownState.filter || {})).then(result => {
            dispatch(new SetResultAction(result));
          }).catch(error => new AddErrorInfoAction(error));
        });
      },
      onToggleFilter: () => {
        dispatch((dispatch: Dispatch, getAppState: () => IApplicationStoreState) => {
          const { showFilter } = selectState(getAppState());
          dispatch(new SetShowFilterAction(!showFilter));
          const ownState = selectState(getAppState());
          Promise.resolve(callback(ownState.page, ownState.rowsPerPage, ownState.orderBy, ownState.order, ownState.showFilter && ownState.filter || {})).then(result => {
            dispatch(new SetResultAction(result));
          }).catch(error => new AddErrorInfoAction(error));
        });
      },
      onFilterChanged: (property: string, filterTerm: string ) => {
        dispatch((dispatch: Dispatch, getAppState: () => IApplicationStoreState) => {
          let { filter } = selectState(getAppState());
          filter = { ...filter, [property]: filterTerm };
          dispatch(new SetFilterChangedAction(filter));
          const ownState = selectState(getAppState());
          Promise.resolve(callback(ownState.page, ownState.rowsPerPage, ownState.orderBy, ownState.order, ownState.showFilter && ownState.filter || {})).then(result => {
            dispatch(new SetResultAction(result));
          }).catch(error => new AddErrorInfoAction(error));
        });
      },
      onHandleChangePage: (page: number) => { 
        dispatch((dispatch: Dispatch, getAppState: () => IApplicationStoreState) => {
          dispatch(new SetPageAction(page));
          const ownState = selectState(getAppState());
          Promise.resolve(callback(ownState.page, ownState.rowsPerPage, ownState.orderBy, ownState.order, ownState.showFilter && ownState.filter || {})).then(result => {
            dispatch(new SetResultAction(result));
          }).catch(error => new AddErrorInfoAction(error));
        });
      },
      onHandleChangeRowsPerPage: (rowsPerPage: number | null) => {
        dispatch((dispatch: Dispatch, getAppState: () => IApplicationStoreState) => {
          dispatch(new SetRowsPerPageAction(rowsPerPage || 10));
          const ownState = selectState(getAppState());
          Promise.resolve(callback(ownState.page, ownState.rowsPerPage, ownState.orderBy, ownState.order, ownState.showFilter && ownState.filter || {})).then(result => {
            dispatch(new SetResultAction(result));
          }).catch(error => new AddErrorInfoAction(error));
        });
      }
      // selected:
    };
  };

  const createProperties = (state: IApplicationStoreState) => {
    return {
      ...selectState(state)
     }   
  }
  
  return {
    reloadAction: reloadAction,
    createActions: createActions,
    createProperties: createProperties,
    actionHandler: externalTableStateActionHandler
  }
}