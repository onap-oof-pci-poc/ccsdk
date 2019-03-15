export { HitEntry, Result } from '../../../../framework/src/models';

/**
 * Represents Adaptive Modulation data fields of the performance history table.
 */
export type AdaptiveModulationDataType = {
  "_id": string;
  "radio-signal-id": string;
  "scanner-id": string;
  "time-stamp": string;
  "suspect-interval-flag": boolean;
  "time2-states-s": string;
  "time2-states": string;
  "time2-states-l": string;
  "time4-states-s": string;
  "time4-states": string;
  "time4-states-l": string;
  "time16-states-s": string;
  "time16-states": string;
  "time16-states-l": string;
  "time32-states-s": string;
  "time32-states": string;
  "time32-states-l": string;
  "time64-states-s": string;
  "time64-states": string;
  "time64-states-l": string;
  "time128-states-s": string;
  "time128-states": string;
  "time128-states-l": string;
  "time256-states-s": string;
  "time256-states": string;
  "time256-states-l": string;
  "time512-states-s": string;
  "time512-states": string;
  "time512-states-l": string;
  "time1024-states-s": string;
  "time1024-states": string;
  "time1024-states-l": string;
  "time2048-states-s": string;
  "time2048-states": string;
  "time2048-states-l": string;
  "time4096-states-s": string;
  "time4096-states": string;
  "time4096-states-l": string;
  "time8192-states-s": string;
  "time8192-states": string;
  "time8192-states-l": string;
};


export type AdaptiveModulationResult = { "performance-data": AdaptiveModulationDataType };

export type AdaptiveModulation = AdaptiveModulationDataType & { _id: string };