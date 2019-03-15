export { HitEntry, Result } from '../../../../framework/src/models';

/**
 * Represents Temperature data fields of the performance history table.
 */
export type TemperatureDataType = {
  "_id": string;
  "radio-signal-id": string;
  "scanner-id": string;
  "time-stamp": string;
  "suspect-interval-flag": boolean;
  "rf-temp-min": string;
  "rf-temp-avg": string;
  "rf-temp-max": string;
};


export type TemperatureResult = { "performance-data": TemperatureDataType };

export type Temperature = TemperatureDataType & { _id: string };