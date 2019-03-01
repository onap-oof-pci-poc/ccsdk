import { Action } from '../flux/action';
import { AuthToken } from '../models/authentication';

export class UpdateAuthentication extends Action {

  constructor (public bearerToken: AuthToken | null) {
    super();
  }
}