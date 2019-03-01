import { requestRest, formEncode } from "./restService";
import { AuthToken } from "../models/authentication";

type AuthTokenResponse = {
  access_token: string;
  token_type: string;
  expires_in: number;
}


class AuthenticationService {
  public async authenticateUser(email: string, password: string, scope: string): Promise<AuthToken | null> {
    const result = await requestRest<string>(`oauth2/token`, {
      method: "POST",
      headers: {
        'Content-Type': 'application/x-www-form-urlencoded'
      },
      body: formEncode({
        grant_type: "password",
        username: email,
        password: password,
        scope: scope
      })
    }, false);
    const resultObj: AuthTokenResponse| null = result && JSON.parse(result);
    return resultObj && {
      username: email,
      access_token: resultObj.access_token,
      token_type: resultObj.token_type,
      expires: (new Date().valueOf()) + (resultObj.expires_in * 1000)
    } || null;
  }
}

export const authenticationService = new AuthenticationService();
export default authenticationService;