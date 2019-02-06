import * as React from 'react';
import { Theme, createStyles, WithStyles, withStyles, Tooltip } from '@material-ui/core';

import AddIcon from '@material-ui/icons/Add';
import LinkOffIcon from '@material-ui/icons/LinkOff';
import AddCircleIcon from '@material-ui/icons/AddCircleOutline';

import Button from '@material-ui/core/Button';
import IconButton from '@material-ui/core/IconButton';

import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import { MaterialTable, ColumnType, MaterialTableCtorType } from '../../../../framework/src/components/material-table';
import { Connect, connect, IDispatcher } from '../../../../framework/src/flux/connect';
import { NavigateToApplication } from '../../../../framework/src/actions/navigationActions';

import { RequiredNetworkElementType } from '../models/requiredNetworkElements';
import { IMountedNetworkElementsState } from '../handlers/mountedNetworkElementsHandler';
import EditNetworkElementDialog, { EditNetworkElementDialogMode } from './editNetworkElementDialog';
import { NetworkElementBaseType } from 'models/networkElementBase';


const styles = (theme: Theme) => createStyles({
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

const mapProps = ({ connectApp: state }: IApplicationStoreState) => ({
  mountedNetworkElements: state.mountedNetworkElements
});

const mapDispatch = (dispatcher: IDispatcher) => ({
  navigateToApplication: (applicationName: string, path?: string) => dispatcher.dispatch(new NavigateToApplication(applicationName, path)),
});
type UnknownNetworkElementDisplayType = NetworkElementBaseType & {
  connectionStatus: string,
  coreModelRev: string,
  airInterfaceRev: string
}

type UnknownNetworkElementsListProps = WithStyles<typeof styles> & Connect<typeof mapProps, typeof mapDispatch> & {}

type UnknownNetworkElementsListState = {
  
  unknownNetworkElements: UnknownNetworkElementDisplayType[];

  networkElementToEdit: RequiredNetworkElementType;
  networkElementEditorMode: EditNetworkElementDialogMode;
}


const emptyRequireNetworkElement = { mountId: '', host: '', port: 0 };
const UnknownNetworkElementTable = MaterialTable as MaterialTableCtorType<UnknownNetworkElementDisplayType>;
export class UnknownNetworkElementsListComponent extends React.Component<UnknownNetworkElementsListProps, UnknownNetworkElementsListState> {

  constructor(props: UnknownNetworkElementsListProps) {
    super(props);

    this.state = {
      unknownNetworkElements: [],
      networkElementToEdit: emptyRequireNetworkElement,
      networkElementEditorMode: EditNetworkElementDialogMode.None,
    };
  }

  static getDerivedStateFromProps(props: UnknownNetworkElementsListProps, state: UnknownNetworkElementsListState & { _mountedNetworkElements: IMountedNetworkElementsState }) {
    if (props.mountedNetworkElements != state._mountedNetworkElements) {
      state.unknownNetworkElements = props.mountedNetworkElements.elements.filter(element => !element.required).map(element => {
        
        // handle onfCoreModelRevision
        const onfCoreModelRevision = element.capabilities.find((cap) => {
          return cap.module === 'core-model' || cap.module === 'CoreModel-CoreNetworkModule-ObjectClasses' ;
        });
        const onfAirInterfaceRevision = element.capabilities.find((cap) => {
          return cap.module === 'microwave-model' || cap.module === 'MicrowaveModel-ObjectClasses-AirInterface' ;
        });
        return {
          mountId: element.mountId,
          host: element.host,
          port: element.port,
          connectionStatus: element.connectionStatus,
          coreModelRev: onfCoreModelRevision && onfCoreModelRevision.revision || 'unknown',
          airInterfaceRev: onfAirInterfaceRevision && onfAirInterfaceRevision.revision || 'unknown'
        }
      }
      );
    }
    return state;
  }
  
  render(): JSX.Element {
    const { classes } = this.props;
    const { networkElementToEdit, networkElementEditorMode, unknownNetworkElements } = this.state;
    const addRequireNetworkElementAction = {
      icon: AddIcon, tooltip: 'Add', onClick: () => {
        this.setState({
          networkElementEditorMode: EditNetworkElementDialogMode.MountNetworkElementToUnknonwNetworkElements,
          networkElementToEdit: emptyRequireNetworkElement,
        });
      }
    };
    return (
      <>
        <UnknownNetworkElementTable customActionButtons={ [addRequireNetworkElementAction] } asynchronus rows={ unknownNetworkElements } columns={ [
          { property: "mountId", title: "Name", type: ColumnType.text },
          { property: "connectionStatus", title: "Connection Status", type: ColumnType.text },
          { property: "host", title: "Host", type: ColumnType.text },
          { property: "port", title: "Port", type: ColumnType.text },
          { property: "coreModelRev", title: "Core Model", type: ColumnType.text },
          { property: "airInterfaceRev", title: "Air interface", type: ColumnType.text },
          {
            property: "actions", title: "Actions", type: ColumnType.custom, customControl: ({ rowData }) => (
              <>
                <div className={ classes.spacer }>
                  <Tooltip title={ "Unmount" } ><IconButton className={ classes.button } onClick={ event => this.onOpenUnmountdNetworkElementsDialog(event, rowData) } ><LinkOffIcon /></IconButton></Tooltip>
                  <Tooltip title={ "Add to required" } ><IconButton className={ classes.button } onClick={ event => this.onOpenAddToRequiredNetworkElementsDialog(event, rowData) } ><AddCircleIcon /></IconButton></Tooltip>
                </div>
                <div className={ classes.spacer }>
                  <Tooltip title={ "Info" } ><Button className={ classes.button } >I</Button></Tooltip>
                </div>
                <div className={ classes.spacer }>
                  <div className={ classes.spacer }>
                    <Tooltip title={ "Fault" } ><Button className={ classes.button } onClick={ this.navigateToApplicationHandlerCreator("faultApp", rowData) } >F</Button></Tooltip>
                    <Tooltip title={ "Configure" } ><Button className={ classes.button } onClick={ this.navigateToApplicationHandlerCreator("configureApp", rowData) } >C</Button></Tooltip>
                    <Tooltip title={ "Accounting " } ><Button className={ classes.button } onClick={ this.navigateToApplicationHandlerCreator("accountingApp", rowData) }>A</Button></Tooltip>
                    <Tooltip title={ "Performance" } ><Button className={ classes.button } onClick={ this.navigateToApplicationHandlerCreator("performanceApp", rowData) }>P</Button></Tooltip>
                    <Tooltip title={ "Security" } ><Button className={ classes.button } onClick={ this.navigateToApplicationHandlerCreator("securityApp", rowData) }>S</Button></Tooltip>
                  </div>
                </div>                
              </>
            )
          },
        ] } idProperty="mountId" >
        </UnknownNetworkElementTable>
        
        <EditNetworkElementDialog 
          mode={ networkElementEditorMode }
          initialNetworkElement={ networkElementToEdit }
          onClose={ this.onCloseEditNetworkElementDialog }
        />
      </>
    );
  };

  private onOpenAddToRequiredNetworkElementsDialog = (event: React.MouseEvent<HTMLElement>, element: UnknownNetworkElementDisplayType) => {
    this.setState({
      networkElementToEdit: {
        mountId: element.mountId,
        host: element.host,
        port: element.port,
        username: 'admin',
        password: 'admin',
      },
      networkElementEditorMode: EditNetworkElementDialogMode.UnknownNetworkElementToRequiredNetworkElements
    });
    event.preventDefault();
    event.stopPropagation();
  }

  private onOpenUnmountdNetworkElementsDialog = (event: React.MouseEvent<HTMLElement>, element: UnknownNetworkElementDisplayType) => {
    this.setState({
      networkElementToEdit: {
        mountId: element.mountId,
        host: element.host,
        port: element.port
      },
      networkElementEditorMode: EditNetworkElementDialogMode.UnmountNetworkElement
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

export const UnknownNetworkElementsList = withStyles(styles)(connect(mapProps, mapDispatch)(UnknownNetworkElementsListComponent));
export default UnknownNetworkElementsList;
