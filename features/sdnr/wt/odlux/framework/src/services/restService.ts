import { ApplicationStore } from "../store/applicationStore";
import { ReplaceAction } from "../actions/navigationActions";

const baseUri = `${ window.location.origin }`;
const absUrlPattern = /^https?:\/\//;
let applicationStore: ApplicationStore | null = null;

export const startRestService = (store: ApplicationStore) => {
  applicationStore = store;
};

export const formEncode = (params: { [key: string]: string | number }) => Object.keys(params).map((key) => {
  return encodeURIComponent(key) + '=' + encodeURIComponent(params[key].toString());
}).join('&');

export async function requestRest<TData>(path: string = '', init: RequestInit = {}, authenticate: boolean = true):  Promise<TData|false|null> {
  const isAbsUrl = absUrlPattern.test(path);
  const uri = isAbsUrl ? path : (baseUri) + ('/' + path).replace(/\/{2,}/i, '/');
  init.headers = {
    'method': 'GET',
    'Content-Type': 'application/json',
    'Accept': 'application/json',
    ...init.headers
  };
  if (!isAbsUrl && authenticate && applicationStore) {
    const { state: { framework: { authenticationState: { user } } } } = applicationStore;
    // do not request if the user is not valid
    if (!user || !user.isValid) {
      return null;
    }
    (init.headers = {
      ...init.headers,
      'Authorization':  `${user.tokenType} ${user.token}`
      //'Authorization': 'Basic YWRtaW46YWRtaW4='
    });
  }
  const result = await fetch(uri, init);
  if (result.status === 401 || result.status === 403) {
    applicationStore && applicationStore.dispatch(new ReplaceAction(`/login?returnTo=${applicationStore.state.framework.navigationState.pathname}`));
    return null;
  }
  const contentType = result.headers.get("Content-Type") || result.headers.get("content-type");
  const isJson = contentType && contentType.toLowerCase().startsWith("application/json");
  try {
    const data = result.ok && (isJson ? await result.json() : await result.text()) as TData ;
    return data;
  } catch {
    return null;
  }
}