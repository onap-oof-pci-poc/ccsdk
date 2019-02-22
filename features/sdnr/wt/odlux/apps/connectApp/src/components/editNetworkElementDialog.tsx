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
  addToRequiredNetworkElementsAsyncActionCreator,
  removeFromRequiredNetworkElementsAsyncActionCreator
} from '../actions/requiredNetworkElementsActions';

import { unmountNetworkElementAsyncActionCreator, mountNetworkElementAsyncActionCreator } from '../actions/mountedNetworkElementsActions';
import { RequiredNetworkElementType } from '../models/requiredNetworkElements';

export enum EditNetworkElementDialogMode {
  None = "none",
  UnknownNetworkElementToRequiredNetworkElements = "unknownNetworkElementToRequiredNetworkElements",
  RequiredNetworkElementToUnknownNetworkElements = "requiredNetworkElementToUnknownNetworkElements",
  MountNetworkElementToRequiredNetworkElements = "mountNetworkElementToRequiredNetworkElements",
  MountNetworkElementToUnknonwNetworkElements = "mountNetworkElementToRequiredUnknownElements",
  MountNetworkElement = "mountNetworkElement",
  UnmountNetworkElement = "unmountNetworkElement",
}

const mapDispatch = (dispatcher: IDispatcher) => ({
  addToRequiredNetworkElements: (element: RequiredNetworkElementType) => {
    dispatcher.dispatch(addToRequiredNetworkElementsAsyncActionCreator(element));
  },
  removeFromRequiredNetworkElements: (element: RequiredNetworkElementType) => {
    dispatcher.dispatch(removeFromRequiredNetworkElementsAsyncActionCreator(element));
  },
  mountNetworkElement: (element: RequiredNetworkElementType) => {
    dispatcher.dispatch(mountNetworkElementAsyncActionCreator(element));
  },
  mountAndRquireNetworkElement: (element: RequiredNetworkElementType) => {
    dispatcher.dispatch(addToRequiredNetworkElementsAsyncActionCreator(element));
    dispatcher.dispatch(mountNetworkElementAsyncActionCreator(element));
  },
  unmountNetworkElement: (element: RequiredNetworkElementType) => {
    dispatcher.dispatch(unmountNetworkElementAsyncActionCreator(element && element.mountId));
  }
}
);

type DialogSettings = {
  dialogTitle: string,
  dialogDescription: string,
  applyButtonText: string,
  cancelButtonText: string,
  enableMountIdEditor: boolean,
  enableUsernameEditor: boolean,
  enableExtendedEditor: boolean,
}

const settings: { [key: string]: DialogSettings } = {
  [EditNetworkElementDialogMode.None]: {
    dialogTitle: "",
    dialogDescription: "",
    applyButtonText: "",
    cancelButtonText: "",
    enableMountIdEditor: false,
    enableUsernameEditor: false,
    enableExtendedEditor: false,
  },
  [EditNetworkElementDialogMode.UnknownNetworkElementToRequiredNetworkElements] : {
    dialogTitle: "Add to required network elements" ,
    dialogDescription: "Create a new NetworkElement in planning database as clone of existing real NetworkElement." ,
    applyButtonText: "Add to required network elements" ,
    cancelButtonText: "Cancel",
    enableMountIdEditor: false,
    enableUsernameEditor: true,
    enableExtendedEditor: false,
  },
  [EditNetworkElementDialogMode.RequiredNetworkElementToUnknownNetworkElements]: {
    dialogTitle: "Remove from required network elements",
    dialogDescription: "Do you really want to remove the required element:",
    applyButtonText: "Remove network element",
    cancelButtonText: "Cancel",
    enableMountIdEditor: false,
    enableUsernameEditor: false,
    enableExtendedEditor: false,
  },
  [EditNetworkElementDialogMode.MountNetworkElementToUnknonwNetworkElements]: {
    dialogTitle: "Mount to unknown network elements",
    dialogDescription: "Mount this network element:",
    applyButtonText: "Mount network element",
    cancelButtonText: "Cancel",
    enableMountIdEditor: true,
    enableUsernameEditor: true,
    enableExtendedEditor: true,
  },
  [EditNetworkElementDialogMode.MountNetworkElementToRequiredNetworkElements]: {
    dialogTitle: "Mount to required network elements",
    dialogDescription: "Mount this network element:",
    applyButtonText: "Mount network element",
    cancelButtonText: "Cancel",
    enableMountIdEditor: true,
    enableUsernameEditor: true,
    enableExtendedEditor: true,
  },
  [EditNetworkElementDialogMode.MountNetworkElement]: {
    dialogTitle: "Mount network element",
    dialogDescription: "mount this network element:",
    applyButtonText: "mount network element",
    cancelButtonText: "Cancel",
    enableMountIdEditor: false,
    enableUsernameEditor: false,
    enableExtendedEditor: false,
  },
  [EditNetworkElementDialogMode.UnmountNetworkElement]: {
    dialogTitle: "Unmount network element",
    dialogDescription: "unmount this network element:",
    applyButtonText: "Unmount network element",
    cancelButtonText: "Cancel",
    enableMountIdEditor: false,
    enableUsernameEditor: false,
    enableExtendedEditor: false,
  },
}

type EditNetworkElementDialogComponentProps = Connect<undefined,typeof mapDispatch> & {
  mode: EditNetworkElementDialogMode;
  initialNetworkElement: RequiredNetworkElementType;
  onClose: () => void;
};

type EditNetworkElementDialogComponentState = RequiredNetworkElementType & {
  required: boolean;
};

class EditNetworkElementDialogComponent extends React.Component<EditNetworkElementDialogComponentProps, EditNetworkElementDialogComponentState> {
  constructor(props: EditNetworkElementDialogComponentProps) {
    super(props);

    this.state = {
      mountId: this.props.initialNetworkElement.mountId,
      host: this.props.initialNetworkElement.host,
      port: this.props.initialNetworkElement.port,
      password: this.props.initialNetworkElement.password,
      username: this.props.initialNetworkElement.username,
      required: false
    };
  }

  render(): JSX.Element {
    const setting = settings[this.props.mode];
    return (
      <Dialog open={ this.props.mode !== EditNetworkElementDialogMode.None }>
        <DialogTitle id="form-dialog-title">{ setting.dialogTitle }</DialogTitle>
        <DialogContent>
          <DialogContentText>
            { setting.dialogDescription }
          </DialogContentText>
          <TextField disabled={ !setting.enableMountIdEditor } spellCheck={false} autoFocus margin="dense" id="name" label="Name" type="text" fullWidth value={ this.state.mountId } onChange={(event)=>{ this.setState({mountId: event.target.value}); } } />
          <TextField disabled={ !setting.enableMountIdEditor } spellCheck={false} margin="dense" id="ipaddress" label="IP address" type="text" fullWidth value={ this.state.host } onChange={(event)=>{ this.setState({host: event.target.value}); } }/>
          <TextField disabled={ !setting.enableMountIdEditor } spellCheck={false} margin="dense" id="netconfport" label="NetConf port" type="number" fullWidth value={ this.state.port.toString() } onChange={(event)=>{ this.setState({port: +event.target.value}); } }/>
          { setting.enableUsernameEditor && <TextField disabled={ !setting.enableUsernameEditor } spellCheck={ false } margin="dense" id="username" label="Username" type="text" fullWidth value={ this.state.username } onChange={ (event) => { this.setState({ username: event.target.value }); } } /> || null }
          { setting.enableUsernameEditor && <TextField disabled={ !setting.enableUsernameEditor } spellCheck={ false } margin="dense" id="password" label="Password" type="password" fullWidth value={ this.state.password } onChange={ (event) => { this.setState({ password: event.target.value }); } } /> || null }
        </DialogContent>
        <DialogActions>
          <Button onClick={ (event) => {
            this.onApply({
              mountId: this.state.mountId,
              host: this.state.host,
              port: this.state.port,
              username: this.state.username,
              password: this.state.password
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

  private onApply = (element: RequiredNetworkElementType) => {
    this.props.onClose && this.props.onClose();
    switch (this.props.mode) {
      case EditNetworkElementDialogMode.UnknownNetworkElementToRequiredNetworkElements:
        element && this.props.addToRequiredNetworkElements(element);
        break;
      case EditNetworkElementDialogMode.RequiredNetworkElementToUnknownNetworkElements:
        element && this.props.removeFromRequiredNetworkElements(element);
        break;
      case EditNetworkElementDialogMode.MountNetworkElementToUnknonwNetworkElements:
        element && this.props.mountNetworkElement(element);
        break;
      case EditNetworkElementDialogMode.MountNetworkElementToRequiredNetworkElements:
        element && this.props.mountAndRquireNetworkElement(element);
        break;
      case EditNetworkElementDialogMode.MountNetworkElement:
        element && this.props.mountNetworkElement(element);
        break;
      case EditNetworkElementDialogMode.UnmountNetworkElement:
        element && this.props.unmountNetworkElement(element);
        break;
    }
  };

  private onCancel = () => {
    this.props.onClose && this.props.onClose();
  }

  static getDerivedStateFromProps(props: EditNetworkElementDialogComponentProps, state: EditNetworkElementDialogComponentState & { _initialNetworkElement: RequiredNetworkElementType }): EditNetworkElementDialogComponentState & { _initialNetworkElement: RequiredNetworkElementType } {
    if (props.initialNetworkElement !== state._initialNetworkElement) {
      state = {
        ...state,
        ...props.initialNetworkElement,
        _initialNetworkElement: props.initialNetworkElement,
      };
    }
    return state;
  }
}

export const EditNetworkElementDialog = connect(undefined, mapDispatch)(EditNetworkElementDialogComponent);
export default EditNetworkElementDialog;