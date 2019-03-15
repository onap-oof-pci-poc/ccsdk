import * as React from 'react';

import { withRouter, RouteComponentProps } from 'react-router-dom';

import { MaterialTable, ColumnType, MaterialTableCtorType } from '../../../../framework/src/components/material-table';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import connect, { Connect, IDispatcher } from '../../../../framework/src/flux/connect';

import { TemperatureDataType } from '../models/temperatureDataType';
import { createTemperature15minProperties, createTemperature15minActions, temperature15minReloadAction } from '../handlers/temperature15minHandler';
import { createTemperature24hoursProperties, createTemperature24hoursActions, temperature24hoursReloadAction } from '../handlers/temperature24hoursHandler';


const mapProps = (state: IApplicationStoreState) => ({
  temperature15minProperties: createTemperature15minProperties(state),
  temperature24hoursProperties: createTemperature24hoursProperties(state),
});

const mapDisp = (dispatcher: IDispatcher) => ({
  temperature15minActions: createTemperature15minActions(dispatcher.dispatch),
  temperature24hoursActions: createTemperature24hoursActions(dispatcher.dispatch),
});

type TemperatureComponentProps = RouteComponentProps & Connect<typeof mapProps, typeof mapDisp> & {
  selectedTimePeriod: string
};

const TemperatureTable = MaterialTable as MaterialTableCtorType<TemperatureDataType>;

/**
 * The Component which gets the temperature data from the database based on the selected time period.
 */
class TemperatureComponent extends React.Component<TemperatureComponentProps>{
  render(): JSX.Element {
    if (this.props.selectedTimePeriod == "15min") {
      return (
        <TemperatureTable idProperty={"_id"} columns={[
          { property: "radio-signal-id", title: "Radio signal", type: ColumnType.text },
          { property: "scanner-id", title: "Scanner ID", type: ColumnType.text },
          { property: "time-stamp", title: "End Time", type: ColumnType.text, disableFilter: true },
          {
            property: "suspect-interval-flag", title: "Suspect Interval", type: ColumnType.custom, customControl: ({ rowData }) => {
              const suspectIntervalFlag = rowData["suspect-interval-flag"].toString();
              return <div >{suspectIntervalFlag} </div>
            }
          },
          { property: "rf-temp-min", title: "Rx min", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "rf-temp-avg", title: "Rx avg", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "rf-temp-max", title: "Rx max", type: ColumnType.text, disableFilter: true, disableSorting: true },
        ]} {...this.props.temperature15minProperties} {...this.props.temperature15minActions} />
      );
    } else {
      return (
        <TemperatureTable idProperty={"_id"} columns={[
          { property: "radio-signal-id", title: "Radio signal", type: ColumnType.text },
          { property: "scanner-id", title: "Scanner ID", type: ColumnType.text },
          { property: "time-stamp", title: "End Time", type: ColumnType.text, disableFilter: true },
          {
            property: "suspect-interval-flag", title: "Suspect Interval", type: ColumnType.custom, customControl: ({ rowData }) => {
              const suspectIntervalFlag = rowData["suspect-interval-flag"].toString();
              return <div >{suspectIntervalFlag} </div>
            }
          },
          { property: "rf-temp-min", title: "Rx min", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "rf-temp-avg", title: "Rx avg", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "rf-temp-max", title: "Rx max", type: ColumnType.text, disableFilter: true, disableSorting: true },
        ]} {...this.props.temperature24hoursProperties} {...this.props.temperature24hoursActions} />
      );
    }
  };
}

export const Temperature = withRouter(connect(mapProps, mapDisp)(TemperatureComponent));
export default Temperature;
