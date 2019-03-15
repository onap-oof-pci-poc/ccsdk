import * as React from 'react';

import { withRouter, RouteComponentProps } from 'react-router-dom';

import { MaterialTable, ColumnType, MaterialTableCtorType } from '../../../../framework/src/components/material-table';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import connect, { Connect, IDispatcher } from '../../../../framework/src/flux/connect';

import { CrossPolarDiscriminationDataType } from '../models/crossPolarDiscriminationDataType';
import { createCrossPolarDiscrimination15minProperties, createCrossPolarDiscrimination15minActions, crossPolarDiscrimination15minReloadAction } from '../handlers/crossPolarDiscrimination15minHandler';
import { createCrossPolarDiscrimination24hoursProperties, createCrossPolarDiscrimination24hoursActions, crossPolarDiscrimination24hoursReloadAction } from '../handlers/crossPolarDiscrimination24hoursHandler';


const mapProps = (state: IApplicationStoreState) => ({
  crossPolarDiscrimination15minProperties: createCrossPolarDiscrimination15minProperties(state),
  crossPolarDiscrimination24hoursProperties: createCrossPolarDiscrimination24hoursProperties(state),
});

const mapDisp = (dispatcher: IDispatcher) => ({
  crossPolarDiscrimination15minActions: createCrossPolarDiscrimination15minActions(dispatcher.dispatch),
  crossPolarDiscrimination24hoursActions: createCrossPolarDiscrimination24hoursActions(dispatcher.dispatch),
});

type CrossPolarDiscriminationComponentProps = RouteComponentProps & Connect<typeof mapProps, typeof mapDisp> & {
  selectedTimePeriod: string
};

const CrossPolarDiscriminationTable = MaterialTable as MaterialTableCtorType<CrossPolarDiscriminationDataType>;

/**
 * The Component which gets the crossPolarDiscrimination data from the database based on the selected time period.
 */
class CrossPolarDiscriminationComponent extends React.Component<CrossPolarDiscriminationComponentProps>{
  render(): JSX.Element {
    if (this.props.selectedTimePeriod == "15min") {
      return (
        <CrossPolarDiscriminationTable idProperty={"_id"} columns={[
          { property: "radio-signal-id", title: "Radio signal", type: ColumnType.text },
          { property: "scanner-id", title: "Scanner ID", type: ColumnType.text },
          { property: "time-stamp", title: "End Time", type: ColumnType.text, disableFilter: true },
          {
            property: "suspect-interval-flag", title: "Suspect Interval", type: ColumnType.custom, customControl: ({ rowData }) => {
              const suspectIntervalFlag = rowData["suspect-interval-flag"].toString();
              return <div >{suspectIntervalFlag} </div>
            }
          },
          { property: "xpd-min", title: "CPD (min)[db]", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "xpd-avg", title: "CPD (avg)[db]", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "xpd-max", title: "CPD (max)[db]", type: ColumnType.text, disableFilter: true, disableSorting: true },
        ]} {...this.props.crossPolarDiscrimination15minProperties} {...this.props.crossPolarDiscrimination15minActions} />
      );
    } else {
      return (
        <CrossPolarDiscriminationTable idProperty={"_id"} columns={[
          { property: "radio-signal-id", title: "Radio signal", type: ColumnType.text },
          { property: "scanner-id", title: "Scanner ID", type: ColumnType.text },
          { property: "time-stamp", title: "End Time", type: ColumnType.text, disableFilter: true },
          {
            property: "suspect-interval-flag", title: "Suspect Interval", type: ColumnType.custom, customControl: ({ rowData }) => {
              const suspectIntervalFlag = rowData["suspect-interval-flag"].toString();
              return <div >{suspectIntervalFlag} </div>
            }
          },
          { property: "xpd-min", title: "CPD (min)[db]", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "xpd-avg", title: "CPD (avg)[db]", type: ColumnType.text, disableFilter: true, disableSorting: true },
          { property: "xpd-max", title: "CPD (max)[db]", type: ColumnType.text, disableFilter: true, disableSorting: true },
        ]} {...this.props.crossPolarDiscrimination24hoursProperties} {...this.props.crossPolarDiscrimination24hoursActions} />
      );
    }
  };
}

export const CrossPolarDiscrimination = withRouter(connect(mapProps, mapDisp)(CrossPolarDiscriminationComponent));
export default CrossPolarDiscrimination;
