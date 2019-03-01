
export type AuthToken = {
  username: string;
  access_token: string;
  token_type: string;
  expires: number;
}


export class User {

  constructor (private _bearerToken: AuthToken) {

  }

  public get user(): string | null {
    return this._bearerToken && this._bearerToken.username;
  };

  public get token(): string | null {
    return this._bearerToken && this._bearerToken.access_token;
  }

  public get tokenType(): string | null {
    return this._bearerToken && this._bearerToken.token_type;
  }

  public get isValid(): boolean {
    return (this._bearerToken && (new Date().valueOf()) < this._bearerToken.expires) || false;
  }

  public toString() {
    return JSON.stringify(this._bearerToken);
  }

  public static fromString(data: string) {
    return new User(JSON.parse(data));
  }


}
