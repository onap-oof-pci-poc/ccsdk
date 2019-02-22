import * as React from 'react';

import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';
import Dialog from '@material-ui/core/Dialog';
import DialogActions from '@material-ui/core/DialogActions';
import DialogContent from '@material-ui/core/DialogContent';
import DialogContentText from '@material-ui/core/DialogContentText';
import DialogTitle from '@material-ui/core/DialogTitle';

import { IDispatcher, connect, Connect } from '../../../../framework/src/flux/connect';

import {
  addOrUpdateMaintenenceEntryAsyncActionCreator,
  removeFromMaintenenceEntrysAsyncActionCreator
} from '../actions/maintenenceActions';

import { MaintenenceEntry } from '../models/maintenenceEntryType';
import { FormControl, InputLabel, Select, MenuItem } from '@material-ui/core';

export enum EditMaintenenceEntryDialogMode {
  None = "none",
  AddMaintenenceEntry = "addMaintenenceEntry",
  EditMaintenenceEntry = "editMaintenenceEntry",
  RemoveMaintenenceEntry = "removeMaintenenceEntry"
}

const mapDispatch = (dispatcher: IDispatcher) => ({
  addOrUpdateMaintenenceEntry: (entry: MaintenenceEntry) => {
    dispatcher.dispatch(addOrUpdateMaintenenceEntryAsyncActionCreator(entry));
  },
  removeMaintenenceEntry: (entry: MaintenenceEntry) => {
    dispatcher.dispatch(removeFromMaintenenceEntrysAsyncActionCreator(entry));
  },
});

type DialogSettings = {
  dialogTitle: string,
  dialogDescription: string,
  applyButtonText: string,
  cancelButtonText: string,
  enableMountIdEditor: boolean,
  enableTimeEditor: boolean,
}

const settings: { [key: string]: DialogSettings } = {
  [EditMaintenenceEntryDialogMode.None]: {
    dialogTitle: "",
    dialogDescription: "",
    applyButtonText: "",
    cancelButtonText: "",
    enableMountIdEditor: false,
    enableTimeEditor: false,
  },
  [EditMaintenenceEntryDialogMode.AddMaintenenceEntry]: {
    dialogTitle: "Add new maintenence entry",
    dialogDescription: "",
    applyButtonText: "Add",
    cancelButtonText: "Cancel",
    enableMountIdEditor: true,
    enableTimeEditor: true,
  },
  [EditMaintenenceEntryDialogMode.EditMaintenenceEntry]: {
    dialogTitle: "Edit maintenence entry",
    dialogDescription: "",
    applyButtonText: "Save",
    cancelButtonText: "Cancel",
    enableMountIdEditor: false,
    enableTimeEditor: true,
  },
  [EditMaintenenceEntryDialogMode.RemoveMaintenenceEntry]: {
    dialogTitle: "Remove maintenence entry",
    dialogDescription: "",
    applyButtonText: "Remove",
    cancelButtonText: "Cancel",
    enableMountIdEditor: false,
    enableTimeEditor: false,
  },
}

type EditMaintenenceEntryDIalogComponentProps = Connect<undefined, typeof mapDispatch> & {
  mode: EditMaintenenceEntryDialogMode;
  initialMaintenenceEntry: MaintenenceEntry;
  onClose: () => void;
};

type EditMaintenenceEntryDIalogComponentState = MaintenenceEntry;

class EditMaintenenceEntryDIalogComponent extends React.Component<EditMaintenenceEntryDIalogComponentProps, EditMaintenenceEntryDIalogComponentState> {
  constructor (props: EditMaintenenceEntryDIalogComponentProps) {
    super(props);

    this.state = {
      ...this.props.initialMaintenenceEntry
    };
  }

  render(): JSX.Element {
    const setting = settings[this.props.mode];
    return (
      <Dialog open={this.props.mode !== EditMaintenenceEntryDialogMode.None}>
        <DialogTitle id="form-dialog-title">{setting.dialogTitle}</DialogTitle>
        <DialogContent>
          <DialogContentText>
            {setting.dialogDescription}
          </DialogContentText>
          <TextField disabled={!setting.enableMountIdEditor} spellCheck={false} autoFocus margin="dense" id="name" label="Name" type="text" fullWidth value={this.state.mountId} onChange={(event) => { this.setState({ mountId: event.target.value }); }} />
          <TextField disabled={!setting.enableTimeEditor} spellCheck={false} autoFocus margin="dense" id="start" label="Start" type="datetime-local" fullWidth value={this.state.start} onChange={(event) => { this.setState({ start: event.target.value }); }} />
          <TextField disabled={!setting.enableTimeEditor} spellCheck={false} autoFocus margin="dense" id="end" label="End" type="datetime-local" fullWidth value={this.state.end} onChange={(event) => { this.setState({ end: event.target.value }); }} />
          <FormControl fullWidth disabled={!setting.enableTimeEditor}>
            <InputLabel htmlFor="active">Active</InputLabel>
            <Select value={ this.state.active || false } onChange={(event) => {
              this.setState({ active: event.target.value as any as boolean });
            }} inputProps={{ name: 'active', id: 'active' }} fullWidth >
              <MenuItem value={true as any as string}>active</MenuItem>
              <MenuItem value={false as any as string}>not active</MenuItem>
            </Select>
          </FormControl>
        </DialogContent>
        <DialogActions>
          <Button onClick={(event) => {
            this.onApply({
              _id: this.state._id || this.state.mountId,
              mountId: this.state.mountId,
              description: this.state.description,
              start: this.state.start,
              end: this.state.end,
              active: this.state.active
            });
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

  private onApply = (entry: MaintenenceEntry) => {
    this.props.onClose && this.props.onClose();
    switch (this.props.mode) {
      case EditMaintenenceEntryDialogMode.AddMaintenenceEntry:
        entry && this.props.addOrUpdateMaintenenceEntry(entry);
        break;
      case EditMaintenenceEntryDialogMode.EditMaintenenceEntry:
        entry && this.props.addOrUpdateMaintenenceEntry(entry);
        break;
      case EditMaintenenceEntryDialogMode.RemoveMaintenenceEntry:
        entry && this.props.removeMaintenenceEntry(entry);
        break;
    }
  };


  private onCancel = () => {
    this.props.onClose && this.props.onClose();
  }

  static getDerivedStateFromProps(props: EditMaintenenceEntryDIalogComponentProps, state: EditMaintenenceEntryDIalogComponentState & { _initialMaintenenceEntry: MaintenenceEntry }): EditMaintenenceEntryDIalogComponentState & { _initialMaintenenceEntry: MaintenenceEntry } {
    if (props.initialMaintenenceEntry !== state._initialMaintenenceEntry) {
      state = {
        ...state,
        ...props.initialMaintenenceEntry,
        _initialMaintenenceEntry: props.initialMaintenenceEntry,
      };
    }
    return state;
  }

}

export const EditMaintenenceEntryDIalog = connect(undefined, mapDispatch)(EditMaintenenceEntryDIalogComponent);
export default EditMaintenenceEntryDIalog;