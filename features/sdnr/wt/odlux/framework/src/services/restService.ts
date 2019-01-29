
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
      'Authorization': 'Basic YWRtaW46S3A4Yko0U1hzek0wV1hsaGFrM2VIbGNzZTJnQXc4NHZhb0dHbUp2VXkyVQ=='
    };
  }
  const result = await fetch(uri, init);
  const contentType = result.headers.get("Content-Type") || result.headers.get("content-type");
  const isJson = contentType && contentType.toLowerCase().startsWith("application/json");
  try {
    const data = result.ok && (isJson ? await result.json() : await result.text()) as TData ;
    return data;
  } catch {
    return null;
  }
}