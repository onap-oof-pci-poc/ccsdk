export { HitEntry, Result } from '../../../../framework/src/models';

/**
 * Represents Receive level data fields of the performance history table.
 */
export type ReceiveLevelDataType = {
  "_id": string;
  "radio-signal-id": string;
  "scanner-id": string;
  "time-stamp": string;
  "suspect-interval-flag": boolean;
  "rx-level-min": string;
  "rx-level-avg": string;
  "rx-level-max": string;
};


export type ReceiveLevelResult = { "performance-data": ReceiveLevelDataType };

export type ReceiveLevel = ReceiveLevelDataType & { _id: string };