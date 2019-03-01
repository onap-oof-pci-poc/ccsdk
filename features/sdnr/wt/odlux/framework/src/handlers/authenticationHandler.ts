import { IActionHandler } from '../flux/action';
import { UpdateAuthentication } from '../actions/authentication';

import { User } from '../models/authentication';

export interface IAuthenticationState {
  user?: User;
}

const initialToken = localStorage.getItem("userToken");

const authenticationStateInit: IAuthenticationState = {
  user: initialToken && User.fromString(initialToken) || undefined
};

export const authenticationStateHandler: IActionHandler<IAuthenticationState> = (state = authenticationStateInit, action) => {
  if (action instanceof UpdateAuthentication) {

    const user = action.bearerToken && new User(action.bearerToken) || undefined;
    if (user) {
      localStorage.setItem("userToken", user.toString());
    } else {
      localStorage.removeItem("userToken");
    }

    state = {
      ...state,
      user
    };
  }

  return state;
};
