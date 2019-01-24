import * as React from 'react';
import { Theme, createStyles, withStyles, WithStyles } from '@material-ui/core/styles';

import AddIcon from '@material-ui/icons/Add';
import LinkIcon from '@material-ui/icons/Link';
import LinkOffIcon from '@material-ui/icons/LinkOff';
import RemoveIcon from '@material-ui/icons/RemoveCircleOutline';

import Button from '@material-ui/core/Button';
import IconButton from '@material-ui/core/IconButton';

import { MaterialTable, ColumnType, MaterialTableCtorType } from '../../../../framework/src/components/material-table';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import { connect, Connect, IDispatcher } from '../../../../framework/src/flux/connect';
import { NavigateToApplication } from '../../../../framework/src/actions/navigationActions';


import { RequiredNetworkElementType } from '../models/requiredNetworkElements';
import { createRequiredNetworkElementsActions, createRequiredNetworkElementsProperties } from '../handlers/requiredNetworkElementsHandler';

import EditNetworkElementDialog, { EditNetworkElementDialogMode } from './editNetworkElementDialog';
import { Tooltip } from '@material-ui/core';
import { NetworkElementBaseType } from 'models/networkElementBase';

const styles = (theme: Theme) => createStyles({
  connectionStatusConnected: {
    color: 'darkgreen',
  },
  connectionStatusConnecting: {
    color: theme.palette.primary.main,
  },
  connectionStatusDisconnected: {
    color: 'red',
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
  }
});

const mapProps = (state: IApplicationStoreState) => ({
  requiredNetworkElementsProperties: createRequiredNetworkElementsProperties(state),
  requiredNetworkElements: state.connectApp.requiredNetworkElements,
  mountedNetworkElements: state.connectApp.mountedNetworkElements
});

const mapDispatch = (dispatcher: IDispatcher) => ({
  requiredNetworkElementsActions: createRequiredNetworkElementsActions(dispatcher.dispatch),
  navigateToApplication: (applicationName: string, path?: string) => dispatcher.dispatch(new NavigateToApplication(applicationName, path)),
});

type RequiredNetworkElementsListComponentProps = WithStyles<typeof styles> & Connect<typeof mapProps, typeof mapDispatch> & {

}
type RequiredNetworkElementsListComponentState = {
  networkElementToEdit: RequiredNetworkElementType,
  networkElementEditorMode: EditNetworkElementDialogMode
}

const emptyRequireNetworkElement = { mountId: '', host: '', port: 0 };

const RequiredNetworkElementTable = MaterialTable as MaterialTableCtorType<RequiredNetworkElementType>;

export class RequiredNetworkElementsListComponent extends React.Component<RequiredNetworkElementsListComponentProps, RequiredNetworkElementsListComponentState> {

  constructor(props: RequiredNetworkElementsListComponentProps) {
    super(props);

    this.state = {
      networkElementToEdit: emptyRequireNetworkElement,
      networkElementEditorMode: EditNetworkElementDialogMode.None
    };
  }

  //  private navigationCreator 

  render(): JSX.Element {
    const { classes } = this.props;
    const { networkElementToEdit } = this.state;
    const addRequireNetworkElementAction = {
      icon: AddIcon, tooltip: 'Add', onClick: () => {
        this.setState({
          networkElementEditorMode: EditNetworkElementDialogMode.MountNetworkElementToRequiredNetworkElements,
          networkElementToEdit: emptyRequireNetworkElement,
        });
      }
    };
    return (
      <>
        <RequiredNetworkElementTable customActionButtons={ [addRequireNetworkElementAction] } columns={ [
          { property: "mountId", title: "Name", type: ColumnType.text },
          {
            property: "connectionStatus", title: "Connection Status", type: ColumnType.custom, disableFilter: true, disableSorting: true, customControl: ({ rowData }) => {
              const unknownNetworkElement = this.props.mountedNetworkElements.elements.find(el => el.mountId === rowData.mountId);
              const connectionStatus = unknownNetworkElement && unknownNetworkElement.connectionStatus || 'disconnected';
              const cssClasses = connectionStatus === "connected"
                ? classes.connectionStatusConnected
                : connectionStatus === "disconnected"
                  ? classes.connectionStatusDisconnected
                  : classes.connectionStatusConnecting
              return <div className={ cssClasses } >{ connectionStatus } </div>

            }
          },
          { property: "host", title: "Host", type: ColumnType.text },
          { property: "port", title: "Port", type: ColumnType.text },
          // { property: "username", title: "Username", type: ColumnType.text },
          // { property: "password", title: "Password", type: ColumnType.text },
          {
            property: "actions", title: "Actions", type: ColumnType.custom, customControl: ({ rowData }) => {
              const unknownNetworkElement = this.props.mountedNetworkElements.elements.find(el => el.mountId === rowData.mountId);
              const connectionStatus = unknownNetworkElement && unknownNetworkElement.connectionStatus || 'disconnected';
              return (
                <>
                  <div className={ classes.spacer }>
                    <Tooltip title={ "Mount" } ><IconButton className={ classes.button } onClick={ event => this.onOpenMountdNetworkElementsDialog(event, rowData) }><LinkIcon /></IconButton></Tooltip>
                    <Tooltip title={ "Unmount" } ><IconButton className={ classes.button } onClick={ event => this.onOpenUnmountdNetworkElementsDialog(event, rowData) }><LinkOffIcon /></IconButton></Tooltip>
                    <Tooltip title={ "Remove" } ><IconButton className={ classes.button } onClick={ event => this.onOpenRemoveRequiredNetworkElementDialog(event, rowData) } ><RemoveIcon /></IconButton></Tooltip>
                  </div>
                  <div className={ classes.spacer }>
                    <Tooltip title={ "Info" } ><Button className={ classes.button } >I</Button></Tooltip>
                  </div>
                  <div className={ classes.spacer }>
                    <Tooltip title={ "Fault" } ><Button className={ classes.button } onClick={ this.navigateToApplicationHandlerCreator("faultApp", rowData) } >F</Button></Tooltip>
                    <Tooltip title={ "Configure" } ><Button className={ classes.button } onClick={ this.navigateToApplicationHandlerCreator("configureApp", rowData)} >C</Button></Tooltip>
                    <Tooltip title={ "Accounting " } ><Button className={ classes.button } onClick={ this.navigateToApplicationHandlerCreator("accountingApp", rowData) }>A</Button></Tooltip>
                    <Tooltip title={ "Performance" } ><Button className={ classes.button } onClick={ this.navigateToApplicationHandlerCreator("performanceApp", rowData) }>P</Button></Tooltip>
                    <Tooltip title={ "Security" } ><Button className={ classes.button } onClick={ this.navigateToApplicationHandlerCreator("securityApp", rowData) }>S</Button></Tooltip>
                  </div>
                </>
              )
            }
          },
        ] } idProperty="mountId" { ...this.props.requiredNetworkElements } { ...this.props.requiredNetworkElementsActions } { ...this.props.requiredNetworkElementsProperties } asynchronus >
        </RequiredNetworkElementTable>
        <EditNetworkElementDialog
          initialNetworkElement={ networkElementToEdit }
          mode={ this.state.networkElementEditorMode }
          onClose={ this.onCloseEditNetworkElementDialog }
        />
      </>
    );
  };

  public componentDidMount() {
    this.props.requiredNetworkElementsActions.onRefresh();
  }

  private onOpenRemoveRequiredNetworkElementDialog = (event: React.MouseEvent<HTMLElement>, element: RequiredNetworkElementType) => {
    this.setState({
      networkElementToEdit: element,
      networkElementEditorMode: EditNetworkElementDialogMode.RequiredNetworkElementToUnknownNetworkElements
    });
    event.preventDefault();
    event.stopPropagation();
  }

  private onOpenUnmountdNetworkElementsDialog = (event: React.MouseEvent<HTMLElement>, element: RequiredNetworkElementType) => {
    this.setState({
      networkElementToEdit: element,
      networkElementEditorMode: EditNetworkElementDialogMode.UnmountNetworkElement
    });
    event.preventDefault();
    event.stopPropagation();
  }

  private onOpenMountdNetworkElementsDialog = (event: React.MouseEvent<HTMLElement>, element: RequiredNetworkElementType) => {
    this.setState({
      networkElementToEdit: element,
      networkElementEditorMode: EditNetworkElementDialogMode.MountNetworkElement
    });
    event.preventDefault();
    event.stopPropagation();
  }

  private onCloseEditNetworkElementDialog = () => {
    this.setState({
      networkElementEditorMode: EditNetworkElementDialogMode.None,
      networkElementToEdit: emptyRequireNetworkElement,
    });
  }

  private navigateToApplicationHandlerCreator = (applicationName: string, element: NetworkElementBaseType) => (event: React.MouseEvent<HTMLElement>) => {
    this.props.navigateToApplication(applicationName, element.mountId);
    event.preventDefault();
    event.stopPropagation();
  }
}

export const RequiredNetworkElementsList = withStyles(styles)(connect(mapProps, mapDispatch)(RequiredNetworkElementsListComponent));
export default RequiredNetworkElementsList;