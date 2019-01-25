
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
    #user:admin password:Kp8bJ4SXszM0WXlhak3eHlcse2gAw84vaoGGmJvUy2U
    init.headers = {
      ...init.headers,
      'Authorization': 'Basic YWRtaW46S3A4Yko0U1hzek0wV1hsaGFrM2VIbGNzZTJnQXc4NHZhb0dHbUp2VXkyVQ=='
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
