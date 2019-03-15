import * as React from 'react';

import { withRouter, RouteComponentProps } from 'react-router-dom';

import { MaterialTable, ColumnType, MaterialTableCtorType } from '../../../../framework/src/components/material-table';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import connect, { Connect, IDispatcher } from '../../../../framework/src/flux/connect';

import { AdaptiveModulationDataType } from '../models/adaptiveModulationDataType';
import { createAdaptiveModulation15minProperties, createAdaptiveModulation15minActions, adaptiveModulation15minReloadAction } from '../handlers/adaptiveModulation15minHandler';
import { createAdaptiveModulation24hoursProperties, createAdaptiveModulation24hoursActions, adaptiveModulation24hoursReloadAction } from '../handlers/adaptiveModulation24hoursHandler';


const mapProps = (state: IApplicationStoreState) => ({
  adaptiveModulation15minProperties: createAdaptiveModulation15minProperties(state),
  adaptiveModulation24hoursProperties: createAdaptiveModulation24hoursProperties(state),
});

const mapDisp = (dispatcher: IDispatcher) => ({
  adaptiveModulation15minActions: createAdaptiveModulation15minActions(dispatcher.dispatch),
  adaptiveModulation24hoursActions: createAdaptiveModulation24hoursActions(dispatcher.dispatch),
});

type AdaptiveModulationComponentProps = RouteComponentProps & Connect<typeof mapProps, typeof mapDisp> & {
  selectedTimePeriod: string
};

const AdaptiveModulationTable = MaterialTable as MaterialTableCtorType<AdaptiveModulationDataType>;

/**
 * The Component which gets the adaptiveModulation data from the database based on the selected time period.
 */
class AdaptiveModulationComponent extends React.Component<AdaptiveModulationComponentProps>{
  render(): JSX.Element {
    if (this.props.selectedTimePeriod == "15min") {
      return (
        <AdaptiveModulationTable idProperty={"_id"} columns={[
          { property: "radio-signal-id", title: "Radio signal", type: ColumnType.text },
          { property: "scanner-id", title: "Scanner ID", type: ColumnType.text },
          { property: "time-stamp", title: "End Time", type: ColumnType.text, disableFilter: true },
          {
            property: "suspect-interval-flag", title: "Suspect Interval", type: ColumnType.custom, customControl: ({ rowData }) => {
              const suspectIntervalFlag = rowData["suspect-interval-flag"].toString();
              return <div >{suspectIntervalFlag} </div>
            }
          },
          { property: "time2-states-s", title: "QAM2S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time2-states", title: "QAM2", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time2-states-l", title: "QAM2L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time4-states-s", title: "QAM4S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time4-states", title: "QAM4", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time4-states-l", title: "QAM4L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time16-states-s", title: "QAM16S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time16-states", title: "QAM16", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time16-states-l", title: "QAM16L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time32-states-s", title: "QAM32S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time32-states", title: "QAM32", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time32-states-l", title: "QAM32L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time64-states-s", title: "QAM64S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time64-states", title: "QAM64", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time64-states-l", title: "QAM64L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time128-states-s", title: "QAM128S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time128-states", title: "QAM128", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time128-states-l", title: "QAM128L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time256-states-s", title: "QAM256S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time256-states", title: "QAM256", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time256-states-l", title: "QAM256L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time512-states-s", title: "QAM512S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time512-states", title: "QAM512", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time512-states-l", title: "QAM512L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time1024-states-s", title: "QAM1024S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time1024-states", title: "QAM1024", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time1024-states-l", title: "QAM1024L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time2048-states-s", title: "QAM2048S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time2048-states", title: "QAM2048", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time2048-states-l", title: "QAM2048L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time4096-states-s", title: "QAM4096S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time4096-states", title: "QAM4096", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time4096-states-l", title: "QAM4096L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time8192-states-s", title: "QAM8192S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time8192-states", title: "QAM8192", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time8192-states-l", title: "QAM8192L", type: ColumnType.text, disableFilter: true, disableSorting: true },
        ]} {...this.props.adaptiveModulation15minProperties} {...this.props.adaptiveModulation15minActions} />
      );
    } else {
      return (
        <AdaptiveModulationTable idProperty={"_id"} columns={[
          { property: "radio-signal-id", title: "Radio signal", type: ColumnType.text },
          { property: "scanner-id", title: "Scanner ID", type: ColumnType.text },
          { property: "time-stamp", title: "End Time", type: ColumnType.text, disableFilter: true },
          {
            property: "suspect-interval-flag", title: "Suspect Interval", type: ColumnType.custom, customControl: ({ rowData }) => {
              const suspectIntervalFlag = rowData["suspect-interval-flag"].toString();
              return <div >{suspectIntervalFlag} </div>
            }
          },
          { property: "time2-states-s", title: "QAM2S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time2-states", title: "QAM2", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time2-states-l", title: "QAM2L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time4-states-s", title: "QAM4S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time4-states", title: "QAM4", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time4-states-l", title: "QAM4L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time16-states-s", title: "QAM16S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time16-states", title: "QAM16", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time16-states-l", title: "QAM16L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time32-states-s", title: "QAM32S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time32-states", title: "QAM32", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time32-states-l", title: "QAM32L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time64-states-s", title: "QAM64S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time64-states", title: "QAM64", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time64-states-l", title: "QAM64L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time128-states-s", title: "QAM128S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time128-states", title: "QAM128", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time128-states-l", title: "QAM128L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time256-states-s", title: "QAM256S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time256-states", title: "QAM256", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time256-states-l", title: "QAM256L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time512-states-s", title: "QAM512S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time512-states", title: "QAM512", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time512-states-l", title: "QAM512L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time1024-states-s", title: "QAM1024S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time1024-states", title: "QAM1024", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time1024-states-l", title: "QAM1024L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time2048-states-s", title: "QAM2048S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time2048-states", title: "QAM2048", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time2048-states-l", title: "QAM2048L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time4096-states-s", title: "QAM4096S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time4096-states", title: "QAM4096", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time4096-states-l", title: "QAM4096L", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time8192-states-s", title: "QAM8192S", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time8192-states", title: "QAM8192", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "time8192-states-l", title: "QAM8192L", type: ColumnType.text, disableFilter: true, disableSorting: true },
        ]} {...this.props.adaptiveModulation24hoursProperties} {...this.props.adaptiveModulation24hoursActions} />
      );
    }
  };
}

export const AdaptiveModulation = withRouter(connect(mapProps, mapDisp)(AdaptiveModulationComponent));
export default AdaptiveModulation;
