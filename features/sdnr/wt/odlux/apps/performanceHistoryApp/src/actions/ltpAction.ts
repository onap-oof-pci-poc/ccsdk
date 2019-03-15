import { Action } from '../../../../framework/src/flux/action';
import { Dispatch } from '../../../../framework/src/flux/store';

import { Ltp } from '../models/availableLtps';
import { PerformanceHistoryService } from '../services/performanceHistoryService';

/** 
 * Represents the base action. 
 */
export class BaseAction extends Action { }

/** 
 * Represents an action causing the store to load available ltps. 
 */
export class LoadAllAvailableLtpsAction extends BaseAction { }

/** 
 * Represents an action causing the store to update available ltps. 
 */
export class AllAvailableLtpsLoadedAction extends BaseAction {
  /**
   * Initialize this instance.
   * @param availableLtps The available ltps which are returned from the database.
   */
  constructor(public availableLtps: Ltp[] | null, public error?: string) {
    super();
  }
}


/** 
 * Represents an asynchronous thunk action to load available distinctLtps by networkElement from the database and set the returned first Ltp as default. 
 * @param networkElement The network element sent to database to get its available distinct Ltps.
 * @param selectedTimePeriod The time period selected sent to database to get the distinct Ltps of the selected network element.
 * @param selectedLtp The Ltp which is selected in the dropdown.
 * @param selectFirstLtp The function to get the first ltp returned from the database to be selected as default on selection upon network element.
 * @param resetLtp The function to verify if the selected ltp is also available in the selected time period database else reset the Ltp dropdown to select.
 */
export const loadDistinctLtpsbyNetworkElementAsync = (networkElement: string, selectedTimePeriod: string, selectedLtp: string, selectFirstLtp?: Function, resetLtp?: Function) => (dispatch: Dispatch) => {
  if (selectedTimePeriod == "15min") {
    dispatch(new LoadAllAvailableLtpsAction());
    PerformanceHistoryService.getDistinctLtpsFrom15minDatabase(networkElement).then(distinctLtps => {
      if(distinctLtps) {
        let ltpNotSelected: boolean = true;
        selectFirstLtp && selectFirstLtp(distinctLtps[0].key);
        distinctLtps.forEach((value: Ltp) => {
          if(value.key === selectedLtp) {
            ltpNotSelected = false;
          }
        });
        resetLtp && resetLtp(ltpNotSelected);
        dispatch(new AllAvailableLtpsLoadedAction(distinctLtps))
      }
    }).catch(error => {
      dispatch(new AllAvailableLtpsLoadedAction(null, error));
    });
  } else {
    dispatch(new LoadAllAvailableLtpsAction());
    PerformanceHistoryService.getDistinctLtpsFrom24hoursDatabase(networkElement).then(distinctLtps => {
      if(distinctLtps) {
        let ltpNotSelected: boolean = true;
        selectFirstLtp && selectFirstLtp(distinctLtps[0].key);
        distinctLtps.forEach((value: Ltp) => {
          if(value.key === selectedLtp) {
            ltpNotSelected = false;
          }
        });
        resetLtp && resetLtp(ltpNotSelected);
        dispatch(new AllAvailableLtpsLoadedAction(distinctLtps))
      }
    }).catch(error => {
      dispatch(new AllAvailableLtpsLoadedAction(null, error));
    });
  }
};