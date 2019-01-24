import { IActionHandler } from '../flux/action';
import { LocationChanged } from '../actions/navigationActions';


export interface INavigationState {
  pathname: string;
  search: string;
  hash: string;
}

const navigationStateInit: INavigationState = {
  pathname: '/',
  search: '',
  hash: '',
};


export const navigationStateHandler: IActionHandler<INavigationState> = (state = navigationStateInit, action) => {
  if (action instanceof LocationChanged) { 
    state = {
      ...state,
      pathname: action.pathname,
      search: action.search,
      hash: action.hash
    }
  }
  return state;
}