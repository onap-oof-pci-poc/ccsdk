export { HitEntry, Result } from '../../../../framework/src/models';

/**
 * Represents the TransmissionPower data fields of the performance history table.
 */
export type TransmissionPowerDataType = {
  "_id": string;
  "radio-signal-id": string;
  "scanner-id": string;
  "time-stamp": string;
  "suspect-interval-flag": boolean;
  "tx-level-min": string;
  "tx-level-avg": string;
  "tx-level-max": string;
};


export type TransmissionPowerResult = { "performance-data": TransmissionPowerDataType };

export type TransmissionPower = TransmissionPowerDataType & { _id: string };