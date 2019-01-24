import { NetworkElementBaseType } from "./networkElementBase";

/**
* Represents data of an mounted network elements.
*/
export type MountedNetworkElementType = NetworkElementBaseType & {
  connectionStatus: string;
  required: boolean;
  capabilities: { module: string, revision: string }[];
};

