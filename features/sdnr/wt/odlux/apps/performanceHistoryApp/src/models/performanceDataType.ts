export { HitEntry, Result } from '../../../../framework/src/models';

/**
 * Represents performance data fields of the performance history table.
 */
export type PerformanceDataType = {
  "_id": string;
  "radio-signal-id": string;
  "scanner-id": string;
  "time-stamp": string;
  "suspect-interval-flag": boolean;
  "es": string;
  "ses": string;
  "unavailability": string;
};


export type PerformanceResult = { "performance-data": PerformanceDataType };

export type Performance = PerformanceDataType & { _id: string };