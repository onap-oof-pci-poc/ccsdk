import * as React from 'react';

import { withRouter, RouteComponentProps } from 'react-router-dom';

import { MaterialTable, ColumnType, MaterialTableCtorType } from '../../../../framework/src/components/material-table';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import connect, { Connect, IDispatcher } from '../../../../framework/src/flux/connect';

import { ReceiveLevelDataType } from '../models/receiveLevelDataType';
import { createReceiveLevel15minProperties, createReceiveLevel15minActions, receiveLevel15minReloadAction } from '../handlers/receiveLevel15minHandler';
import { createReceiveLevel24hoursProperties, createReceiveLevel24hoursActions, receiveLevel24hoursReloadAction } from '../handlers/receiveLevel24hoursHandler';


const mapProps = (state: IApplicationStoreState) => ({
  receiveLevel15minProperties: createReceiveLevel15minProperties(state),
  receiveLevel24hoursProperties: createReceiveLevel24hoursProperties(state),
});

const mapDisp = (dispatcher: IDispatcher) => ({
  receiveLevel15minActions: createReceiveLevel15minActions(dispatcher.dispatch),
  receiveLevel24hoursActions: createReceiveLevel24hoursActions(dispatcher.dispatch),
});

type ReceiveLevelComponentProps = RouteComponentProps & Connect<typeof mapProps, typeof mapDisp> & {
  selectedTimePeriod: string
};

const ReceiveLevelTable = MaterialTable as MaterialTableCtorType<ReceiveLevelDataType>;

/**
 * The Component which gets the receiveLevel data from the database based on the selected time period.
 */
class ReceiveLevelComponent extends React.Component<ReceiveLevelComponentProps>{
  render(): JSX.Element {
    if (this.props.selectedTimePeriod == "15min") {
      return (
        <ReceiveLevelTable idProperty={"_id"} columns={[
          { property: "radio-signal-id", title: "Radio signal", type: ColumnType.text },
          { property: "scanner-id", title: "Scanner ID", type: ColumnType.text },
          { property: "time-stamp", title: "End Time", type: ColumnType.text, disableFilter: true },
          {
            property: "suspect-interval-flag", title: "Suspect Interval", type: ColumnType.custom, customControl: ({ rowData }) => {
              const suspectIntervalFlag = rowData["suspect-interval-flag"].toString();
              return <div >{suspectIntervalFlag} </div>
            }
          },
          { property: "rx-level-min", title: "Rx min", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "rx-level-avg", title: "Rx avg", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "rx-level-max", title: "Rx max", type: ColumnType.text, disableFilter: true, disableSorting: true },
        ]} {...this.props.receiveLevel15minProperties} {...this.props.receiveLevel15minActions} />
      );
    } else {
      return (
        <ReceiveLevelTable idProperty={"_id"} columns={[
          { property: "radio-signal-id", title: "Radio signal", type: ColumnType.text },
          { property: "scanner-id", title: "Scanner ID", type: ColumnType.text },
          { property: "time-stamp", title: "End Time", type: ColumnType.text, disableFilter: true },
          {
            property: "suspect-interval-flag", title: "Suspect Interval", type: ColumnType.custom, customControl: ({ rowData }) => {
              const suspectIntervalFlag = rowData["suspect-interval-flag"].toString();
              return <div >{suspectIntervalFlag} </div>
            }
          },
          { property: "rx-level-min", title: "Rx min", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "rx-level-avg", title: "Rx avg", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "rx-level-max", title: "Rx max", type: ColumnType.text, disableFilter: true, disableSorting: true },
        ]} {...this.props.receiveLevel24hoursProperties} {...this.props.receiveLevel24hoursActions} />
      );
    }
  };
}

export const ReceiveLevel = withRouter(connect(mapProps, mapDisp)(ReceiveLevelComponent));
export default ReceiveLevel;
