/** Represents the elestic search db type for maintenence enrties */
export type MaintenenceEntryType = {
    node: string;
    // According to the arrangement from 2019.02.15 there will be currently only one element in the filters array.
    filter: [{
      definition: { "object-id-ref": string ,problem: string},
      description: string,
      /** The end date for the maintenence mode formated as ISO date string in UTC.  */
      end: string,
      /** The start date for the maintenence mode formated as ISO date string in UTC.  */
      start: string
    }],
    /** Determines if the filter set is activated or not. */
    active: boolean;
}

export const spoofSymbol = Symbol("Spoof");

/** Represents the type for an maintenence entry. */
export type MaintenenceEntry = {
  [spoofSymbol]?: boolean;
  _id: string;
  mountId: string;
  description: string;
  start: string;
  end: string;
  active: boolean;
}