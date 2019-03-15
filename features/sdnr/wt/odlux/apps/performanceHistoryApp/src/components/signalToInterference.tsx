import * as React from 'react';

import { withRouter, RouteComponentProps } from 'react-router-dom';

import { MaterialTable, ColumnType, MaterialTableCtorType } from '../../../../framework/src/components/material-table';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import connect, { Connect, IDispatcher } from '../../../../framework/src/flux/connect';

import { SignalToInterferenceDataType } from '../models/signalToInteferenceDataType';
import { createSignalToInterference15minProperties, createSignalToInterference15minActions } from '../handlers/signalToInterference15minHandler';
import { createSignalToInterference24hoursProperties, createSignalToInterference24hoursActions } from '../handlers/signalToInterference24hoursHandler';

const mapProps = (state: IApplicationStoreState) => ({
  signalToInterference15minProperties: createSignalToInterference15minProperties(state),
  signalToInterference24hoursProperties: createSignalToInterference24hoursProperties(state),
});

const mapDisp = (dispatcher: IDispatcher) => ({
  signalToInterference15minActions: createSignalToInterference15minActions(dispatcher.dispatch),
  signalToInterference24hoursActions: createSignalToInterference24hoursActions(dispatcher.dispatch),
});

type SignalToInterferenceComponentProps = RouteComponentProps & Connect<typeof mapProps, typeof mapDisp> & {
  selectedTimePeriod: string
};

const SignalToInterferenceTable = MaterialTable as MaterialTableCtorType<SignalToInterferenceDataType>;

/**
 * The Component which gets the signal to interference data from the database based on the selected time period.
 */
class SignalToInterferenceComponent extends React.Component<SignalToInterferenceComponentProps>{
  render(): JSX.Element {
    if (this.props.selectedTimePeriod == "15min") {
      return (
        <SignalToInterferenceTable idProperty={"_id"} columns={[
          { property: "radio-signal-id", title: "Radio signal", type: ColumnType.text },
          { property: "scanner-id", title: "Scanner ID", type: ColumnType.text },
          { property: "time-stamp", title: "End Time", type: ColumnType.text, disableFilter: true },
          {
            property: "suspect-interval-flag", title: "Suspect Interval", type: ColumnType.custom, customControl: ({ rowData }) => {
              const suspectIntervalFlag = rowData["suspect-interval-flag"].toString();
              return <div >{suspectIntervalFlag} </div>
            }
          },
          { property: "snir-min", title: "SINR (min)[db]", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "snir-avg", title: "SINR (avg)[db]", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "snir-max", title: "SINR (max)[db]", type: ColumnType.text, disableFilter: true, disableSorting: true },
        ]} {...this.props.signalToInterference15minProperties} {...this.props.signalToInterference15minActions}
        />
      );
    } else {
      return (
        <SignalToInterferenceTable idProperty={"_id"} columns={[
          { property: "radio-signal-id", title: "Radio signal", type: ColumnType.text },
          { property: "scanner-id", title: "Scanner ID", type: ColumnType.text },
          { property: "time-stamp", title: "End Time", type: ColumnType.text, disableFilter: true },
          {
            property: "suspect-interval-flag", title: "Suspect Interval", type: ColumnType.custom, customControl: ({ rowData }) => {
              const suspectIntervalFlag = rowData["suspect-interval-flag"].toString();
              return <div >{suspectIntervalFlag} </div>
            }
          },
          { property: "snir-min", title: "SINR (min)[db]", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "snir-avg", title: "SINR (avg)[db]", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "snir-max", title: "SINR (max)[db]", type: ColumnType.text, disableFilter: true, disableSorting: true },
        ]} {...this.props.signalToInterference24hoursProperties} {...this.props.signalToInterference24hoursActions}
        />
      );
    }
  };
}

export const SignalToInterference = withRouter(connect(mapProps, mapDisp)(SignalToInterferenceComponent));
export default SignalToInterference;
