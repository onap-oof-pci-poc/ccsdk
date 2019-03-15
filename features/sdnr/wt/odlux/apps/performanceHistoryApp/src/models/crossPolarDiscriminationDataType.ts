export { HitEntry, Result } from '../../../../framework/src/models';

/**
 * Represents CPD data fields of the performance history table.
 */
export type CrossPolarDiscriminationDataType = {
  "_id": string;
  "radio-signal-id": string;
  "scanner-id": string;
  "time-stamp": string;
  "suspect-interval-flag": boolean;
  "xpd-min": string;
  "xpd-avg": string;
  "xpd-max": string;
};


export type CrossPolarDiscriminationResult = { "performance-data": CrossPolarDiscriminationDataType };

export type CrossPolarDiscrimination = CrossPolarDiscriminationDataType & { _id: string };