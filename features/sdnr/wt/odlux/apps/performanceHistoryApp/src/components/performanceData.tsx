import * as React from 'react';

import { withRouter, RouteComponentProps } from 'react-router-dom';

import { MaterialTable, ColumnType, MaterialTableCtorType } from '../../../../framework/src/components/material-table';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import connect, { Connect, IDispatcher } from '../../../../framework/src/flux/connect';

import { PerformanceDataType } from '../models/performanceDataType';
import { createPerformanceData15minProperties, createPerformanceData15minActions } from '../handlers/performanceData15minHandler';
import { createPerformanceData24hoursProperties, createPerformanceData24hoursActions } from '../handlers/performanceData24hoursHandler';

const mapProps = (state: IApplicationStoreState) => ({
  performanceData15minProperties: createPerformanceData15minProperties(state),
  performanceData24hoursProperties: createPerformanceData24hoursProperties(state),
});

const mapDisp = (dispatcher: IDispatcher) => ({
  performanceData15minActions: createPerformanceData15minActions(dispatcher.dispatch),
  performanceData24hoursActions: createPerformanceData24hoursActions(dispatcher.dispatch),
});

type PerformanceDataComponentProps = RouteComponentProps & Connect<typeof mapProps, typeof mapDisp> & {
  selectedTimePeriod: string
};

const PerformanceDataTable = MaterialTable as MaterialTableCtorType<PerformanceDataType>;

/**
 * The Component which gets the performance data from the database based on the selected time period.
 */
class PerformanceDataComponent extends React.Component<PerformanceDataComponentProps>{
  render(): JSX.Element {
    if (this.props.selectedTimePeriod == "15min") {
      return (
        <PerformanceDataTable idProperty={"_id"} columns={[
          { property: "radio-signal-id", title: "Radio signal", type: ColumnType.text },
          { property: "scanner-id", title: "Scanner ID", type: ColumnType.text },
          { property: "time-stamp", title: "End Time", type: ColumnType.text, disableFilter: true },
          {
            property: "suspect-interval-flag", title: "Suspect Interval", type: ColumnType.custom, customControl: ({ rowData }) => {
              const suspectIntervalFlag = rowData["suspect-interval-flag"].toString();
              return <div >{suspectIntervalFlag} </div>
            }
          },
          { property: "es", title: "ES", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "ses", title: "SES", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "unavailability", title: "UAS", type: ColumnType.text, disableFilter: true, disableSorting: true },
        ]} {...this.props.performanceData15minProperties} {...this.props.performanceData15minActions}
        />
      );
    } else {
      return (
        <PerformanceDataTable idProperty={"_id"} columns={[
          { property: "radio-signal-id", title: "Radio signal", type: ColumnType.text },
          { property: "scanner-id", title: "Scanner ID", type: ColumnType.text },
          { property: "time-stamp", title: "End Time", type: ColumnType.text, disableFilter: true },
          {
            property: "suspect-interval-flag", title: "Suspect Interval", type: ColumnType.custom, customControl: ({ rowData }) => {
              const suspectIntervalFlag = rowData["suspect-interval-flag"].toString();
              return <div >{suspectIntervalFlag} </div>
            }
          },
          { property: "es", title: "ES", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "ses", title: "SES", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "unavailability", title: "UAS", type: ColumnType.text, disableFilter: true, disableSorting: true },
        ]} {...this.props.performanceData24hoursProperties} {...this.props.performanceData24hoursActions}
        />
      );
    }
  };
}

export const PerformanceData = withRouter(connect(mapProps, mapDisp)(PerformanceDataComponent));
export default PerformanceData;
