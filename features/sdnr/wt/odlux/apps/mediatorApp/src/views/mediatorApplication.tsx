import * as React from 'react';
import { Theme, createStyles, WithStyles, withStyles, Tooltip } from '@material-ui/core';

import AddIcon from '@material-ui/icons/Add';
import IconButton from '@material-ui/core/IconButton';
import EditIcon from '@material-ui/icons/Edit';
import DeleteIcon from '@material-ui/icons/Delete';
import InfoIcon from '@material-ui/icons/Info';
import StartIcon from '@material-ui/icons/PlayArrow';
import StopIcon from '@material-ui/icons/Stop';

import CircularProgress from '@material-ui/core/CircularProgress'

import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import connect, { Connect, IDispatcher } from '../../../../framework/src/flux/connect';
import MaterialTable, { MaterialTableCtorType, ColumnType } from '../../../../framework/src/components/material-table';

import { MediatorConfig, BusySymbol, MediatorConfigResponse } from '../models/mediatorServer';
import EditMediatorConfigDialog, { EditMediatorConfigDialogMode } from '../components/editMediatorConfigDialog';
import { startMediatorByNameAsyncActionCreator, stopMediatorByNameAsyncActionCreator } from '../actions/mediatorConfigActions';
import mediatorService from '../services/mediatorService';

const styles = (theme: Theme) => createStyles({
  root: {
    display: 'flex',
    flexDirection: 'column',
    flex: '1',
  },
  formControl: {
    margin: theme.spacing.unit,
    minWidth: 300,
  },
  button: {
    margin: 0,
    padding: "6px 6px",
    minWidth: 'unset'
  },
  spacer: {
    marginLeft: theme.spacing.unit,
    marginRight: theme.spacing.unit,
    display: "inline"
  },
  progress: {
    flex: '1 1 100%',
    display: 'flex',
    alignItems: 'center',
    justifyContent: 'center',
    pointerEvents: 'none'
  }
});

const mapProps = (state: IApplicationStoreState) => ({
  serverName: state.mediator.mediatorServerState.name,
  serverUrl: state.mediator.mediatorServerState.url,
  serverVersion: state.mediator.mediatorServerState.serverVersion,
  mediatorVersion: state.mediator.mediatorServerState.mediatorVersion,
  configurations: state.mediator.mediatorServerState.configurations,
  supportedDevices: state.mediator.mediatorServerState.supportedDevices,
  busy: state.mediator.mediatorServerState.busy,
});

const mapDispatch = (dispatcher: IDispatcher) => ({
  startMediator: (name: string) => dispatcher.dispatch(startMediatorByNameAsyncActionCreator(name)),
  stopMediator: (name: string) => dispatcher.dispatch(stopMediatorByNameAsyncActionCreator(name)),
});

const emptyMediatorConfig: MediatorConfig = {
  Name: "",
  DeviceIp: "127.0.0.1",
  DevicePort: 161,
  NcUsername: "admin",
  NcPassword: "admin",
  DeviceType: -1,
  NcPort: 4020,
  TrapPort: 10020,
  NeXMLFile: "",
  ODLConfig: []
};

const MediatorServerConfigurationsTable = MaterialTable as MaterialTableCtorType<MediatorConfigResponse>;

type MediatorApplicationComponentProps = Connect<typeof mapProps, typeof mapDispatch> & WithStyles<typeof styles>;

type MediatorServerSelectionComponentState = {
  busy: boolean,
  mediatorConfigToEdit: MediatorConfig,
  mediatorConfigEditorMode: EditMediatorConfigDialogMode
}

class MediatorApplicationComponent extends React.Component<MediatorApplicationComponentProps, MediatorServerSelectionComponentState> {

  constructor (props: MediatorApplicationComponentProps) {
    super(props);

    this.state = {
      busy: false,
      mediatorConfigToEdit: emptyMediatorConfig,
      mediatorConfigEditorMode: EditMediatorConfigDialogMode.None,
    }
  }

  render() {
    const { classes } = this.props;

    const renderActions = (rowData: MediatorConfigResponse) => (
      <>
        <div className={classes.spacer}>
          <Tooltip title={"Start"} >
            <IconButton disabled={rowData[BusySymbol]} className={classes.button}>
              <StartIcon onClick={(event) => { event.preventDefault(); event.stopPropagation(); this.props.startMediator(rowData.Name); }} />
            </IconButton>
          </Tooltip>
          <Tooltip title={"Stop"} >
            <IconButton disabled={rowData[BusySymbol]} className={classes.button}>
              <StopIcon onClick={(event) => { event.preventDefault(); event.stopPropagation(); this.props.stopMediator(rowData.Name); }} />
            </IconButton>
          </Tooltip>
        </div>
        <div className={classes.spacer}>
          <Tooltip title={"Info"} ><IconButton className={classes.button}><InfoIcon /></IconButton></Tooltip>
        </div>
        <div className={classes.spacer}>
          { process.env.NODE_ENV === "development" ? <Tooltip title={"Edit"} ><IconButton disabled={rowData[BusySymbol]} className={classes.button} onClick={event => this.onOpenEditConfigurationDialog(event, rowData)}><EditIcon /></IconButton></Tooltip> : null}
          <Tooltip title={"Remove"} ><IconButton disabled={rowData[BusySymbol]} className={classes.button} onClick={event => this.onOpenRemoveConfigutationDialog(event, rowData)}><DeleteIcon /></IconButton></Tooltip>
        </div>
      </>
    );

    const addMediatorConfigAction = { icon: AddIcon, tooltip: 'Add', onClick: this.onOpenAddConfigurationDialog };
    return (
      <div className={classes.root}>
        {this.props.busy || this.state.busy
          ? <div className={classes.progress}> <CircularProgress color={"secondary"} size={48} /> </div>
          : <MediatorServerConfigurationsTable title={this.props.serverName || ''} customActionButtons={[addMediatorConfigAction]} idProperty={"Name"} rows={this.props.configurations} asynchronus columns={[
            { property: "Name", title: "Mediator", type: ColumnType.text },
            { property: "Status", title: "Status", type: ColumnType.custom, customControl: ({ rowData }) => rowData.pid ? (<span>Running</span>) : (<span>Stopped</span>) },
            { property: "DeviceIp", title: "IP Adress", type: ColumnType.text },
            {
              property: "Device", title: "Device", type: ColumnType.custom, customControl: ({ rowData }) => {
                const dev = this.props.supportedDevices && this.props.supportedDevices.find(dev => dev.id === rowData.DeviceType);
                return (
                  <span> {dev && `${dev.vendor} - ${dev.device} (${dev.version || '0.0.0'})`} </span>
                )
              }
            },
            { property: "actions", title: "Actions", type: ColumnType.custom, customControl: ({ rowData }) => renderActions(rowData) },
          ]} />
        }

        <EditMediatorConfigDialog
          mediatorConfig={this.state.mediatorConfigToEdit}
          mode={this.state.mediatorConfigEditorMode}
          onClose={this.onCloseEditMediatorConfigDialog} />

      </div>
    );
  }

  private onOpenAddConfigurationDialog = () => {
    // Tries to determine a free port for netconf listener and snpm listener
    // it it could not determine free ports the dialog will open any way
    // those ports should not be configured from the fontend, furthermore
    // the backend should auto configure them and tell the user the result
    // after the creation process.

    this.setState({
      busy: true,
    });
    this.props.serverUrl && Promise.all([
      mediatorService.getMediatorServerFreeNcPorts(this.props.serverUrl, 1),
      mediatorService.getMediatorServerFreeSnmpPorts(this.props.serverUrl, 1),
    ]).then(([freeNcPorts, freeSnmpPorts]) => {
      if (freeNcPorts && freeSnmpPorts && freeNcPorts.length > 0 && freeSnmpPorts.length > 0) {
        this.setState({
          busy: false,
          mediatorConfigEditorMode: EditMediatorConfigDialogMode.AddMediatorConfig,
          mediatorConfigToEdit: {
            ...emptyMediatorConfig,
            NcPort: freeNcPorts[0],
            TrapPort: freeSnmpPorts[0],
          },
        });
      } else {
        this.setState({
          busy: false,
          mediatorConfigEditorMode: EditMediatorConfigDialogMode.AddMediatorConfig,
          mediatorConfigToEdit: { ...emptyMediatorConfig },
        });
      }
    })

  }

  private onOpenEditConfigurationDialog = (event: React.MouseEvent<HTMLElement>, configEntry: MediatorConfig) => {
    event.preventDefault();
    event.stopPropagation();
    this.setState({
      mediatorConfigEditorMode: EditMediatorConfigDialogMode.EditMediatorConfig,
      mediatorConfigToEdit: configEntry,
    });
  }

  private onOpenRemoveConfigutationDialog = (event: React.MouseEvent<HTMLElement>, configEntry: MediatorConfig) => {
    event.preventDefault();
    event.stopPropagation();
    this.setState({
      mediatorConfigEditorMode: EditMediatorConfigDialogMode.RemoveMediatorConfig,
      mediatorConfigToEdit: configEntry,
    });
  }

  private onCloseEditMediatorConfigDialog = () => {
    this.setState({
      mediatorConfigEditorMode: EditMediatorConfigDialogMode.None,
      mediatorConfigToEdit: emptyMediatorConfig,
    });
  }
}

export const MediatorApplication = withStyles(styles)(connect(mapProps, mapDispatch)(MediatorApplicationComponent));
