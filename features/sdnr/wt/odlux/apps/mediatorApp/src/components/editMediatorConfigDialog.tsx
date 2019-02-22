import * as React from 'react';
import { Theme, createStyles, WithStyles, withStyles, Typography, FormControlLabel, Checkbox } from '@material-ui/core';

import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';
import Select from '@material-ui/core/Select';
import Dialog from '@material-ui/core/Dialog';
import DialogActions from '@material-ui/core/DialogActions';
import DialogContent from '@material-ui/core/DialogContent';
import DialogContentText from '@material-ui/core/DialogContentText';
import DialogTitle from '@material-ui/core/DialogTitle';

import Tabs from '@material-ui/core/Tabs';
import Tab from '@material-ui/core/Tab';

import Fab from '@material-ui/core/Fab';
import AddIcon from '@material-ui/icons/Add';
import DeleteIcon from '@material-ui/icons/Delete';
import IconButton from '@material-ui/core/IconButton';

import { addMediatorConfigAsyncActionCreator, updateMediatorConfigAsyncActionCreator, removeMediatorConfigAsyncActionCreator } from '../actions/mediatorConfigActions';
import { MediatorConfig, ODLConfig } from '../models/mediatorServer';
import FormControl from '@material-ui/core/FormControl';
import InputLabel from '@material-ui/core/InputLabel';
import MenuItem from '@material-ui/core/MenuItem';

import { Panel } from '../../../../framework/src/components/material-ui/panel';

import { IDispatcher, connect, Connect } from '../../../../framework/src/flux/connect';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';


const styles = (theme: Theme) => createStyles({
  root: {
    display: 'flex',
    flexDirection: 'column',
    flex: '1',
  },
  fab: {
    position: 'absolute',
    bottom: theme.spacing.unit,
    right: theme.spacing.unit,
  },
  title: {
    fontSize: 14,
  },
  center: {
    flex: "1",
    display: "flex",
    alignItems: "center",
    justifyContent: "center",
  },
  alignInOneLine: {
    display: 'flex',
    flexDirection: 'row'
  },
  left: {
    marginRight: theme.spacing.unit,
  },
  right: {
    marginLeft: 0,
  }
});

const TabContainer: React.SFC = ({ children }) => {
  return (
    <div style={{ width: "430px", height: "530px", position: "relative", display: 'flex', flexDirection: 'column' }}>
      {children}
    </div>
  );
}

export enum EditMediatorConfigDialogMode {
  None = "none",
  AddMediatorConfig = "addMediatorConfig",
  EditMediatorConfig = "editMediatorConfig",
  RemoveMediatorConfig = "removeMediatorConfig",
}

const mapProps = (state: IApplicationStoreState) => ({
  supportedDevices: state.mediatorApp.mediatorServerState.supportedDevices
});

const mapDispatch = (dispatcher: IDispatcher) => ({
  addMediatorConfig: (config: MediatorConfig) => {
    dispatcher.dispatch(addMediatorConfigAsyncActionCreator(config));
  },
  updateMediatorConfig: (config: MediatorConfig) => {
    dispatcher.dispatch(updateMediatorConfigAsyncActionCreator(config));
  },
  removeMediatorConfig: (config: MediatorConfig) => {
    dispatcher.dispatch(removeMediatorConfigAsyncActionCreator(config));
  },
});

type DialogSettings = {
  dialogTitle: string;
  dialogDescription: string;
  applyButtonText: string;
  cancelButtonText: string;
  readonly: boolean;
  readonlyName: boolean;
};

const settings: { [key: string]: DialogSettings } = {
  [EditMediatorConfigDialogMode.None]: {
    dialogTitle: "",
    dialogDescription: "",
    applyButtonText: "",
    cancelButtonText: "",
    readonly: true,
    readonlyName: true,
  },
  [EditMediatorConfigDialogMode.AddMediatorConfig]: {
    dialogTitle: "Add Mediator Configuration",
    dialogDescription: "",
    applyButtonText: "Add",
    cancelButtonText: "Cancel",
    readonly: false,
    readonlyName: false,
  },
  [EditMediatorConfigDialogMode.EditMediatorConfig]: {
    dialogTitle: "Edit Mediator Configuration",
    dialogDescription: "",
    applyButtonText: "Update",
    cancelButtonText: "Cancel",
    readonly: false,
    readonlyName: true,
  },
  [EditMediatorConfigDialogMode.RemoveMediatorConfig]: {
    dialogTitle: "Remove Mediator Configuration",
    dialogDescription: "",
    applyButtonText: "Remove",
    cancelButtonText: "Cancel",
    readonly: true,
    readonlyName: true,
  },
};

type EditMediatorConfigDialogComponentProps = WithStyles<typeof styles> & Connect<typeof mapProps, typeof mapDispatch> & {
  mode: EditMediatorConfigDialogMode;
  mediatorConfig: MediatorConfig;
  onClose: () => void;
};

type EditMediatorConfigDialogComponentState = MediatorConfig & { activeTab: number; activeOdlConfig: string };

class EditMediatorConfigDialogComponent extends React.Component<EditMediatorConfigDialogComponentProps, EditMediatorConfigDialogComponentState> {
  constructor (props: EditMediatorConfigDialogComponentProps) {
    super(props);

    this.state = {
      ...this.props.mediatorConfig,
      activeTab: 0,
      activeOdlConfig: ""
    };
  }

  private odlConfigValueChangeHandlerCreator = <THtmlElement extends HTMLElement, TKey extends keyof ODLConfig>(index: number, property: TKey, mapValue: (event: React.ChangeEvent<THtmlElement>) => any) => (event: React.ChangeEvent<THtmlElement>) => {
    event.stopPropagation();
    event.preventDefault();
    this.setState({
      ODLConfig: [
        ...this.state.ODLConfig.slice(0, index),
        { ...this.state.ODLConfig[index], [property]: mapValue(event) },
        ...this.state.ODLConfig.slice(index + 1)
      ]
    });
  }

  render(): JSX.Element {
    const setting = settings[this.props.mode];
    const { classes } = this.props;
    return (
      <Dialog open={this.props.mode !== EditMediatorConfigDialogMode.None}>
        <DialogTitle id="form-dialog-title">{setting.dialogTitle}</DialogTitle>
        <DialogContent>
          <DialogContentText>
            {setting.dialogDescription}
          </DialogContentText>
          <Tabs value={this.state.activeTab} indicatorColor="primary" textColor="primary" onChange={(event, value) => this.setState({ activeTab: value })} >
            <Tab label="Config" />
            <Tab label="ODL AutoConnect" />
          </Tabs>
          { this.state.activeTab === 0 ? <TabContainer >
            <TextField disabled={setting.readonly || setting.readonlyName} spellCheck={false} autoFocus margin="dense" id="name" label="Name" type="text" fullWidth value={this.state.Name} onChange={(event) => { this.setState({ Name: event.target.value }); }} />
            <FormControl fullWidth disabled={setting.readonly}>
              <InputLabel htmlFor="deviceType">Device</InputLabel>
              <Select value={this.state.DeviceType} onChange={(event) => {
                const device = this.props.supportedDevices.find(device => device.id === +event.target.value);
                if (device) {
                  this.setState({
                    DeviceType: device.id,
                    NeXMLFile: device.xml
                  });
                } else {
                  this.setState({
                    DeviceType: -1,
                    NeXMLFile: ""
                  });
                }
              }} inputProps={{ name: 'deviceType', id: 'deviceType' }} fullWidth >
                <MenuItem value={-1}><em>None</em></MenuItem>
                {this.props.supportedDevices.map(device => (<MenuItem key={device.id} value={device.id} >{`${device.vendor} - ${device.device} (${device.version || '0.0.0'}) `}</MenuItem>))}
              </Select>
            </FormControl>
            <TextField disabled={setting.readonly} spellCheck={false} autoFocus margin="dense" id="ipAddress" label="IP Address" type="text" fullWidth value={this.state.DeviceIp} onChange={(event) => { this.setState({ DeviceIp: event.target.value }); }} />
            <TextField disabled={setting.readonly} spellCheck={false} autoFocus margin="dense" id="devicePort" label="Port" type="number" fullWidth value={this.state.DevicePort || ""} onChange={(event) => { this.setState({ DevicePort: +event.target.value }); }} />
            <TextField disabled={setting.readonly} spellCheck={false} autoFocus margin="dense" id="trapsPort" label="TrapsPort" type="number" fullWidth value={this.state.TrapPort || ""} onChange={(event) => { this.setState({ TrapPort: +event.target.value }); }} />
            <TextField disabled={setting.readonly} spellCheck={false} autoFocus margin="dense" id="ncUser" label="Netconf User" type="text" fullWidth value={this.state.NcUsername} onChange={(event) => { this.setState({ NcUsername: event.target.value }); }} />
            <TextField disabled={setting.readonly} spellCheck={false} autoFocus margin="dense" id="ncPassword" label="Netconf Password" type="password" fullWidth value={this.state.NcPassword} onChange={(event) => { this.setState({ NcPassword: event.target.value }); }} />
            <TextField disabled={setting.readonly} spellCheck={false} autoFocus margin="dense" id="ncPort" label="Netconf Port" type="number" fullWidth value={this.state.NcPort || ""} onChange={(event) => { this.setState({ NcPort: +event.target.value }); }} />
          </TabContainer> : null}
          { this.state.activeTab === 1 ? <TabContainer >
            { this.state.ODLConfig && this.state.ODLConfig.length > 0
              ? this.state.ODLConfig.map((cfg, ind) => {
                const panelId = `panel-${ind}`;
                const deleteButton = (<IconButton onClick={() => {
                  this.setState({
                    ODLConfig: [
                      ...this.state.ODLConfig.slice(0, ind),
                      ...this.state.ODLConfig.slice(ind + 1)
                    ]
                  });
                }} ><DeleteIcon /></IconButton>)
                return (
                  <Panel title={cfg.Server && `${cfg.User ? `${cfg.User}@` : ''}${cfg.Protocol}://${cfg.Server}:${cfg.Port}` || "new odl config"} key={panelId} panelId={panelId} activePanel={this.state.activeOdlConfig} customActionButtons={[deleteButton]}
                    onToggle={(id) => this.setState({ activeOdlConfig: (this.state.activeOdlConfig === id) ? "" : (id || "") })} >
                    <div className={classes.alignInOneLine}>
                    <FormControl className={classes.left} margin={"dense"} >
                        <InputLabel htmlFor={`protocol-${ind}`}>Protocoll</InputLabel>
                        <Select value={cfg.Protocol} onChange={ this.odlConfigValueChangeHandlerCreator(ind, "Protocol", e => (e.target.value)) } inputProps={{ name: `protocol-${ind}`, id: `protocol-${ind}` }} fullWidth >
                          <MenuItem value={"http"}>http</MenuItem>
                          <MenuItem value={"https"}>https</MenuItem>
                        </Select>
                      </FormControl>
                      <TextField className={classes.left} spellCheck={false} margin="dense" id="hostname" label="Hostname" type="text" value={cfg.Server} onChange={this.odlConfigValueChangeHandlerCreator(ind, "Server", e => e.target.value)} />
                      <TextField className={classes.right} style={{ maxWidth: "65px"}} spellCheck={false} margin="dense" id="port" label="Port" type="number" value={cfg.Port|| ""} onChange={this.odlConfigValueChangeHandlerCreator(ind, "Port", e => +e.target.value)} />
                    </div>
                    <div className={classes.alignInOneLine}>
                      <TextField className={classes.left} spellCheck={false} margin="dense" id="username" label="Username" type="text" value={cfg.User} onChange={this.odlConfigValueChangeHandlerCreator(ind, "User", e => e.target.value)} />
                      <TextField className={classes.right} spellCheck={false} margin="dense" id="password" label="Password" type="password" value={cfg.Password} onChange={this.odlConfigValueChangeHandlerCreator(ind, "Password", e => e.target.value)} />
                    </div>
                    <div className={classes.alignInOneLine}>
                      <FormControlLabel className={classes.right} control={<Checkbox checked={cfg.Trustall} onChange={this.odlConfigValueChangeHandlerCreator(ind, "Trustall", e => e.target.checked)} />} label="Trustall" />
                    </div>
                  </Panel>
                );
              })
              : <div className={classes.center} >
                <Typography component={"div"} className={classes.title} color="textSecondary" gutterBottom>Please add an ODL auto connect configuration.</Typography>
              </div>
            }
            <Fab className={classes.fab} color="primary" aria-label="Add" onClick={() => this.setState({
              ODLConfig: [...this.state.ODLConfig, { Server: '', Port: 8181, Protocol: 'https', User: 'admin', Password: 'admin', Trustall: false }]
            })} > <AddIcon /> </Fab>

          </TabContainer> : null}

        </DialogContent>
        <DialogActions>
          <Button onClick={(event) => {
            this.onApply(Object.keys(this.state).reduce<MediatorConfig & { [kex: string]: any }>((acc, key) => {
              // do not copy activeTab and activeOdlConfig
              if (key !== "activeTab" && key !== "activeOdlConfig" && key !== "_initialMediatorConfig") acc[key] = (this.state as any)[key];
              return acc;
            }, {} as MediatorConfig));
            event.preventDefault();
            event.stopPropagation();
          }} > {setting.applyButtonText} </Button>
          <Button onClick={(event) => {
            this.onCancel();
            event.preventDefault();
            event.stopPropagation();
          }} color="secondary"> {setting.cancelButtonText} </Button>
        </DialogActions>
      </Dialog>
    )
  }

  private onApply = (config: MediatorConfig) => {
    this.props.onClose && this.props.onClose();
    switch (this.props.mode) {
      case EditMediatorConfigDialogMode.AddMediatorConfig:
        config && this.props.addMediatorConfig(config);
        break;
      case EditMediatorConfigDialogMode.EditMediatorConfig:
        config && this.props.updateMediatorConfig(config);
        break;
      case EditMediatorConfigDialogMode.RemoveMediatorConfig:
        config && this.props.removeMediatorConfig(config);
        break;
    }
  };

  private onCancel = () => {
    this.props.onClose && this.props.onClose();
  }

  static getDerivedStateFromProps(props: EditMediatorConfigDialogComponentProps, state: EditMediatorConfigDialogComponentState & { _initialMediatorConfig: MediatorConfig }): EditMediatorConfigDialogComponentState & { _initialMediatorConfig: MediatorConfig } {
    if (props.mediatorConfig !== state._initialMediatorConfig) {
      state = {
        ...state,
        ...props.mediatorConfig,
        _initialMediatorConfig: props.mediatorConfig,
      };
    }
    return state;
  }
}

export const EditMediatorConfigDialog = withStyles(styles)(connect(mapProps, mapDispatch)(EditMediatorConfigDialogComponent));
export default EditMediatorConfigDialog;


