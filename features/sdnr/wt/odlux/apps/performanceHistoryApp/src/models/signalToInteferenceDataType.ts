export { HitEntry, Result } from '../../../../framework/src/models';

/**
 * Represents Signal to interference data fields of the performance history table.
 */
export type SignalToInterferenceDataType = {
  "_id": string;
  "radio-signal-id": string;
  "scanner-id": string;
  "time-stamp": string;
  "suspect-interval-flag": boolean;
  "snir-min": string;
  "snir-avg": string;
  "snir-max": string;
};


export type SignalToInterferenceResult = { "performance-data": SignalToInterferenceDataType };

export type SignalToInterference = SignalToInterferenceDataType & { _id: string };