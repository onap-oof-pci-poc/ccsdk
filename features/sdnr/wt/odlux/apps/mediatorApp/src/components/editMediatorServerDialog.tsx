import * as React from 'react';

import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';
import Dialog from '@material-ui/core/Dialog';
import DialogActions from '@material-ui/core/DialogActions';
import DialogContent from '@material-ui/core/DialogContent';
import DialogContentText from '@material-ui/core/DialogContentText';
import DialogTitle from '@material-ui/core/DialogTitle';

import { IDispatcher, connect, Connect } from '../../../../framework/src/flux/connect';

import { addAvaliableMediatorServerAsyncActionCreator, removeAvaliableMediatorServerAsyncActionCreator, updateAvaliableMediatorServerAsyncActionCreator } from '../actions/avaliableMediatorServersActions';
import { MediatorServer } from '../models/mediatorServer';

export enum EditMediatorServerDialogMode {
  None = "none",
  AddMediatorServer = "addMediatorServer",
  EditMediatorServer = "editMediatorServer",
  RemoveMediatorServer = "removeMediatorServer",
}

const mapDispatch = (dispatcher: IDispatcher) => ({
  addMediatorServer: (element: MediatorServer) => {
    dispatcher.dispatch(addAvaliableMediatorServerAsyncActionCreator(element));
  },
  updateMediatorServer: (element: MediatorServer) => {
    dispatcher.dispatch(updateAvaliableMediatorServerAsyncActionCreator(element));
  },
  removeMediatorServer: (element: MediatorServer) => {
    dispatcher.dispatch(removeAvaliableMediatorServerAsyncActionCreator(element));
  },
});

type DialogSettings = {
  dialogTitle: string;
  dialogDescription: string;
  applyButtonText: string;
  cancelButtonText: string;
  readonly: boolean;
};

const settings: { [key: string]: DialogSettings } = {
  [EditMediatorServerDialogMode.None]: {
    dialogTitle: "",
    dialogDescription: "",
    applyButtonText: "",
    cancelButtonText: "",
    readonly: true,
  },
  [EditMediatorServerDialogMode.AddMediatorServer]: {
    dialogTitle: "Add Mediator Server",
    dialogDescription: "",
    applyButtonText: "Add",
    cancelButtonText: "Cancel",
    readonly: false,
  },
  [EditMediatorServerDialogMode.EditMediatorServer]: {
    dialogTitle: "Edit Mediator Server",
    dialogDescription: "",
    applyButtonText: "Update",
    cancelButtonText: "Cancel",
    readonly: false,
  },
  [EditMediatorServerDialogMode.RemoveMediatorServer]: {
    dialogTitle: "Remove Mediator Server",
    dialogDescription: "",
    applyButtonText: "Remove",
    cancelButtonText: "Cancel",
    readonly: true,
  },
};

type EditMediatorServerDialogComponentProps = Connect<undefined,typeof mapDispatch> & {
  mode: EditMediatorServerDialogMode;
  mediatorServer: MediatorServer;
  onClose: () => void;
};

type EditMediatorServerDialogComponentState = MediatorServer ;

class EditMediatorServerDialogComponent extends React.Component<EditMediatorServerDialogComponentProps, EditMediatorServerDialogComponentState> {
  constructor(props: EditMediatorServerDialogComponentProps) {
    super(props);
    
    this.state = {
      ...this.props.mediatorServer
    };
  }

  render(): JSX.Element {
    const setting = settings[this.props.mode];
    return (
      <Dialog open={ this.props.mode !== EditMediatorServerDialogMode.None }>
        <DialogTitle id="form-dialog-title">{ setting.dialogTitle }</DialogTitle>
        <DialogContent>
          <DialogContentText>
            { setting.dialogDescription }
          </DialogContentText>
          {/* <TextField disabled spellCheck={false} autoFocus margin="dense" id="id" label="Id" type="text" fullWidth value={ this.state._id } onChange={(event)=>{ this.setState({_id: event.target.value}); } } /> */}
          <TextField disabled={ setting.readonly } spellCheck={false} margin="dense" id="name" label="Name" type="text" fullWidth value={ this.state.name } onChange={(event)=>{ this.setState({name: event.target.value}); } }/>
          <TextField disabled={ setting.readonly } spellCheck={false} margin="dense" id="url" label="Url" type="text" fullWidth value={ this.state.url } onChange={(event)=>{ this.setState({url: event.target.value}); } }/>
         </DialogContent>
        <DialogActions>
          <Button onClick={ (event) => {
            this.onApply({
              _id: this.state._id,
              name: this.state.name,
              url: this.state.url,
            });
            event.preventDefault();
            event.stopPropagation();
          } } > { setting.applyButtonText } </Button>
          <Button onClick={ (event) => {
            this.onCancel();
            event.preventDefault();
            event.stopPropagation();
          } } color="secondary"> { setting.cancelButtonText } </Button>
        </DialogActions>
      </Dialog>
    )
  }

  private onApply = (element: MediatorServer) => {
    this.props.onClose && this.props.onClose();
    switch (this.props.mode) {
      case EditMediatorServerDialogMode.AddMediatorServer:
        element && this.props.addMediatorServer(element);
        break;
      case EditMediatorServerDialogMode.EditMediatorServer:
        element && this.props.updateMediatorServer(element);
        break;
      case EditMediatorServerDialogMode.RemoveMediatorServer:
        element && this.props.removeMediatorServer(element);
        break;
    }
  };

  private onCancel = () => {
    this.props.onClose && this.props.onClose();
  }

  static getDerivedStateFromProps(props: EditMediatorServerDialogComponentProps, state: EditMediatorServerDialogComponentState & { _initialMediatorServer: MediatorServer }): EditMediatorServerDialogComponentState & { _initialMediatorServer: MediatorServer } {
    if (props.mediatorServer !== state._initialMediatorServer) {
      state = {
        ...state,
        ...props.mediatorServer,
        _initialMediatorServer: props.mediatorServer,
      };
    }
    return state;
  }
}

export const EditMediatorServerDialog = connect(undefined, mapDispatch)(EditMediatorServerDialogComponent);
export default EditMediatorServerDialog;