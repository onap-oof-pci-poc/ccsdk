/**
  * The PlainObject type is a JavaScript object containing zero or more key-value pairs.
  */
export interface PlainObject<T = any> {
  [key: string]: T;
}

export interface AjaxParameter {
  /**
    * The HTTP method to use for the request (e.g. "POST", "GET", "PUT").
    */
  method?: 'GET' | 'POST' | 'PUT' | 'DELETE' | 'OPTIONS' | 'PATCH';
  /**
    * An object of additional header key/value pairs to send along with requests using the XMLHttpRequest
    * transport. The header X-Requested-With: XMLHttpRequest is always added, but its default
    * XMLHttpRequest value can be changed here. Values in the headers setting can also be overwritten from
    * within the beforeSend function.
    */
  headers?: PlainObject<string | null | undefined>;
  /**
    * Data to be sent to the server. It is converted to a query string, if not already a string. It's
    * appended to the url for GET-requests. See processData option to prevent this automatic processing.
    * Object must be Key/Value pairs. If value is an Array, jQuery serializes multiple values with same
    * key based on the value of the traditional setting (described below).
    */
  data?: PlainObject | string;
}



