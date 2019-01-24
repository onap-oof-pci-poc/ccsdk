
const baseUri = `${ window.location.origin }`;

export async function requestRest<TData>(path: string = '', init: RequestInit = {}, authenticate: boolean = false):  Promise<TData|false|null> {
  const uri = (baseUri) + ('/' + path).replace(/\/{2,}/i, '/');
  init.headers = {
    'method': 'GET',
    'Content-Type': 'application/json',
    'Accept': 'application/json',
    ...init.headers
  };
  if (authenticate) {
    init.headers = {
      ...init.headers,
      'Authorization': 'Basic YWRtaW46YWRtaW4='
    };
  }
  const result = await fetch(uri, init);
  try {
    const data = result.ok && await result.json() as TData ;
    return data;
  } catch {
    return null;
  }
}