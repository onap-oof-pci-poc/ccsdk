import { NetworkElementBaseType } from "./networkElementBase";

/**
* Represents data of Required Network Elements.
*/
export type RequiredNetworkElementType = NetworkElementBaseType & {
  username?: string;
  password?: string;
}

