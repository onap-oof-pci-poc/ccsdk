import * as React from 'react';

import { withRouter, RouteComponentProps } from 'react-router-dom';

import { MaterialTable, ColumnType, MaterialTableCtorType } from '../../../../framework/src/components/material-table';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import connect, { Connect, IDispatcher } from '../../../../framework/src/flux/connect';

import { TransmissionPowerDataType } from '../models/transmissionPowerDataType';
import { createTransmissionPower15minProperties, createTransmissionPower15minActions } from '../handlers/transmissionPower15minHandler';
import { createTransmissionPower24hoursProperties, createTransmissionPower24hoursActions } from '../handlers/transmissionPower24hoursHandler';


const mapProps = (state: IApplicationStoreState) => ({
  transmissionPower15minProperties: createTransmissionPower15minProperties(state),
  transmissionPower24hoursProperties: createTransmissionPower24hoursProperties(state),
});

const mapDisp = (dispatcher: IDispatcher) => ({
  transmissionPower15minActions: createTransmissionPower15minActions(dispatcher.dispatch),
  transmissionPower24hoursActions: createTransmissionPower24hoursActions(dispatcher.dispatch),
});

type TransmissionPowerComponentProps = RouteComponentProps & Connect<typeof mapProps, typeof mapDisp> & {
  selectedTimePeriod: string
}

const TransmissionPowerTable = MaterialTable as MaterialTableCtorType<TransmissionPowerDataType>;

/**
 * The Component which gets the transmission power data from the database based on the selected time period.
 */
class TransmissionPowerComponent extends React.Component<TransmissionPowerComponentProps>{
  render(): JSX.Element {
    if (this.props.selectedTimePeriod == "15min") {
      return (
        <TransmissionPowerTable idProperty={"_id"} columns={[
          { property: "radio-signal-id", title: "Radio signal", type: ColumnType.text },
          { property: "scanner-id", title: "Scanner ID", type: ColumnType.text },
          { property: "time-stamp", title: "End Time", type: ColumnType.text, disableFilter: true },
          {
            property: "suspect-interval-flag", title: "Suspect Interval", type: ColumnType.custom, customControl: ({ rowData }) => {
              const suspectIntervalFlag = rowData["suspect-interval-flag"].toString();
              return <div >{suspectIntervalFlag} </div>
            }
          },
          { property: "tx-level-min", title: "Tx min", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "tx-level-avg", title: "Tx avg", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "tx-level-max", title: "Tx max", type: ColumnType.text, disableFilter: true, disableSorting: true },
        ]} {...this.props.transmissionPower15minProperties} {...this.props.transmissionPower15minActions} />
      );
    } else {
      return (
        <TransmissionPowerTable idProperty={"_id"} columns={[
          { property: "radio-signal-id", title: "Radio signal", type: ColumnType.text },
          { property: "scanner-id", title: "Scanner ID", type: ColumnType.text },
          { property: "time-stamp", title: "End Time", type: ColumnType.text, disableFilter: true },
          {
            property: "suspect-interval-flag", title: "Suspect Interval", type: ColumnType.custom, customControl: ({ rowData }) => {
              const suspectIntervalFlag = rowData["suspect-interval-flag"].toString();
              return <div >{suspectIntervalFlag} </div>
            }
          },
          { property: "tx-level-min", title: "Tx min", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "tx-level-avg", title: "Tx avg", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "tx-level-max", title: "Tx max", type: ColumnType.text, disableFilter: true, disableSorting: true },
        ]} {...this.props.transmissionPower24hoursProperties} {...this.props.transmissionPower24hoursActions} />
      );
    }
  };
}

export const TransmissionPower = withRouter(connect(mapProps, mapDisp)(TransmissionPowerComponent));
export default TransmissionPower;
