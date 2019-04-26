import * as React from 'react';

import { withRouter, RouteComponentProps } from 'react-router-dom';

import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faExclamationTriangle } from '@fortawesome/free-solid-svg-icons';

import { MaterialTable, ColumnType, MaterialTableCtorType } from '../../../../framework/src/components/material-table';
import { Panel } from '../../../../framework/src/components/material-ui';

import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import connect, { Connect, IDispatcher } from '../../../../framework/src/flux/connect';

import { Fault } from '../models/fault';
import { PanelId } from '../models/panelId';

import { createCurrentProblemsProperties, createCurrentProblemsActions, currentProblemsReloadAction } from '../handlers/currentProblemsHandler';
import { createAlarmLogEntriesProperties, createAlarmLogEntriesActions, alarmLogEntriesReloadAction } from '../handlers/alarmLogEntriesHandler';
import { SetPanelAction } from '../actions/panelChangeActions';

const mapProps = (state: IApplicationStoreState) => ({
  activePanel: state.fault.currentOpenPanel,
  currentProblemsProperties: createCurrentProblemsProperties(state),
  faultNotifications: state.fault.faultNotifications,
  alarmLogEntriesProperties: createAlarmLogEntriesProperties(state)
});

const mapDisp = (dispatcher: IDispatcher) => ({
  currentProblemsActions: createCurrentProblemsActions(dispatcher.dispatch),
  alarmLogEntriesActions: createAlarmLogEntriesActions(dispatcher.dispatch),
  reloadCurrentProblems: () => dispatcher.dispatch(currentProblemsReloadAction),
  reloadAlarmLogEntries: () => dispatcher.dispatch(alarmLogEntriesReloadAction),
  setCurrentPanel: (panelId: PanelId) => dispatcher.dispatch(new SetPanelAction(panelId))
});

type FaultApplicationComponentProps = RouteComponentProps & Connect<typeof mapProps, typeof mapDisp>;


const FaultTable = MaterialTable as MaterialTableCtorType<Fault>;

class FaultApplicationComponent extends React.Component<FaultApplicationComponentProps>{

  render(): JSX.Element {

    const { activePanel } = this.props;

    const onTogglePanel = (panelId: PanelId) => {
      const nextActivePanel = panelId === this.props.activePanel ? null : panelId;
      this.props.setCurrentPanel(nextActivePanel);

      switch (nextActivePanel) {
        case 'CurrentProblem':
          this.props.reloadCurrentProblems();
          break;
        case 'AlarmLog':
          this.props.reloadAlarmLogEntries();
          break;
        case 'AlarmNotifications':
        case null:
        default:
          // nothing to do
          break;
      }
    };

    return (
      <>
        <Panel activePanel={ activePanel } panelId={ 'CurrentProblem' } onToggle={ onTogglePanel } title={ 'Current Problem List' }>
          <FaultTable idProperty={ '_id' }  columns={ [
              { property: "icon", title: "", type: ColumnType.custom, customControl: this.renderIcon },
              { property: "timeStamp", type: ColumnType.text, title: "Time Stamp" },
              { property: "nodeName", title: "Node Name", type: ColumnType.text },
              { property: "counter", title: "Count", type: ColumnType.numeric, width: "100px" },
              { property: "objectId", title: "Object Id", type: ColumnType.text } ,
              { property: "problem", title: "Alarm Type", type: ColumnType.text },
              { property: "severity", title: "Severity", type: ColumnType.text, width: "140px" },
              ] } { ...this.props.currentProblemsProperties } { ...this.props.currentProblemsActions }  />
        </Panel>
        <Panel activePanel={ activePanel } panelId={ 'AlarmNotifications' } onToggle={ onTogglePanel } title={ `Alarm Notifications ${this.props.faultNotifications.faults.length} since ${this.props.faultNotifications.since}` }>
          <FaultTable rows={ this.props.faultNotifications.faults } asynchronus columns={ [
            { property: "icon", title: "", type: ColumnType.custom, customControl: this.renderIcon },
            { property: "timeStamp", title: "Time Stamp" },
            { property: "nodeName", title: "Node Name" },
            { property: "counter", title: "Count", width: "100px" },
            { property: "objectId", title: "Object Id" },
            { property: "problem", title: "Alarm Type" },
            { property: "severity", title: "Severity", width: "140px" },
            ] } idProperty={ '_id' } />
        </Panel>
        <Panel activePanel={ activePanel } panelId={ 'AlarmLog' } onToggle={ onTogglePanel } title={ 'Alarm Log' }>
          <FaultTable idProperty={ '_id' } columns={ [
            { property: "icon", title: "", type: ColumnType.custom, customControl: this.renderIcon },
            { property: "timeStamp", title: "Time Stamp" },
            { property: "nodeName", title: "Node Name" },
            { property: "counter", title: "Count", type: ColumnType.numeric, width: "100px" },
            { property: "objectId", title: "Object Id" },
            { property: "problem", title: "Alarm Type" },
            { property: "severity", title: "Severity", width: "140px" },
          ] } { ...this.props.alarmLogEntriesProperties } { ...this.props.alarmLogEntriesActions }/>
         </Panel>
      </>
    );
  };

  private renderIcon = (props: { rowData: Fault }) => {
    return (
      <FontAwesomeIcon icon={ faExclamationTriangle } />
    );
  };

}

export const FaultApplication = withRouter(connect(mapProps, mapDisp)(FaultApplicationComponent));
export default FaultApplication;
