import * as React from 'react';

import { Theme, createStyles, WithStyles, withStyles, Tooltip } from '@material-ui/core';

import AddIcon from '@material-ui/icons/Add';
import EditIcon from '@material-ui/icons/Edit';
import RemoveIcon from '@material-ui/icons/RemoveCircleOutline';

import Button from '@material-ui/core/Button';
import IconButton from '@material-ui/core/IconButton';

import connect, { IDispatcher, Connect } from '../../../../framework/src/flux/connect';
import MaterialTable, { MaterialTableCtorType, ColumnType } from '../../../../framework/src/components/material-table';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';

import { loadAllMountedNetworkElementsAsync } from '../../../connectApp/src/actions/mountedNetworkElementsActions';

import { loadAllMainteneceEntriesAsyncAction } from '../actions/maintenenceActions';
import { MaintenenceEntry, spoofSymbol } from '../models/maintenenceEntryType';

import EditMaintenenceEntryDialog, { EditMaintenenceEntryDialogMode } from '../components/editMaintenenceEntryDialog';
import { convertToLocaleString } from '../utils/timeUtils';

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

const MaintenenceEntriesTable = MaterialTable as MaterialTableCtorType<MaintenenceEntry>;

const mapProps = (state: IApplicationStoreState) => ({
   maintenenceEntries: state.maintenanceApp.maintenenceEntries.entries,
   busy: state.maintenanceApp.maintenenceEntries.busy
});

const mapDispatcher = (dispatcher: IDispatcher) => ({
  onLoadMenteneceEntries: async () => {
    await dispatcher.dispatch(loadAllMountedNetworkElementsAsync)
    dispatcher.dispatch(loadAllMainteneceEntriesAsyncAction);
  }
});

const emptyMaintenenceEntry: MaintenenceEntry = {
  _id: '',
  mountId: '',
  description: '',
  start: convertToLocaleString(new Date().valueOf()),
  end: convertToLocaleString(new Date().valueOf()),
  active: false,
};

type MaintenenceViewComponentProps = Connect<typeof mapProps, typeof mapDispatcher> & WithStyles<typeof styles> & {

}

type MaintenenceViewComponentState = {
  maintenenceEntryToEdit: MaintenenceEntry;
  maintenenceEntryEditorMode: EditMaintenenceEntryDialogMode;
}

class MaintenenceViewComponent extends React.Component<MaintenenceViewComponentProps, MaintenenceViewComponentState> {

  constructor (props: MaintenenceViewComponentProps) {
    super(props);

    this.state = {
      maintenenceEntryToEdit: emptyMaintenenceEntry,
      maintenenceEntryEditorMode: EditMaintenenceEntryDialogMode.None,
    };

  }

  render() {
    const { classes } = this.props;
    const addMaintenenceEntryAction = {
      icon: AddIcon, tooltip: 'Add', onClick: () => {
        const startTime = (new Date().valueOf());
        const endTime = startTime;
        this.setState({
          maintenenceEntryToEdit: {
            ...emptyMaintenenceEntry,
            start: convertToLocaleString(startTime),
            end: convertToLocaleString(endTime),
          },
          maintenenceEntryEditorMode: EditMaintenenceEntryDialogMode.AddMaintenenceEntry
        });
      }
    };
    return (
      <>
        <MaintenenceEntriesTable asynchronus rows={this.props.maintenenceEntries} customActionButtons={[ addMaintenenceEntryAction ]} columns={
        [
          { property: "mountId", title: "Mount Id", type: ColumnType.text },
          { property: "active", title: "Active", type: ColumnType.boolean, labels: { "true": "active", "false": "not active" }, },
          { property: "start", title: "Start Date", type: ColumnType.text },
          { property: "end", title: "End Date", type: ColumnType.text },
          { property: "actions", title: "Actions", type: ColumnType.custom, customControl : ({ rowData })=>(
            <>
              <div className={classes.spacer}>
                <Tooltip title={"1h from now"} ><Button className={classes.button} onClick={ (event) => this.onOpenPlus1hEditMaintenenceEntryDialog(event, rowData)} >+1h</Button></Tooltip>
                <Tooltip title={"8h from now"} ><Button className={classes.button} onClick={(event) => this.onOpenPlus8hEditMaintenenceEntryDialog(event, rowData)} >+8h</Button></Tooltip>
              </div>
              <div className={classes.spacer}>
                <Tooltip title={"Edit"} ><IconButton className={classes.button} onClick={(event) => this.onOpenEditMaintenenceEntryDialog(event, rowData)} ><EditIcon /></IconButton></Tooltip>
                <Tooltip title={"Remove"} ><IconButton disabled={ !!rowData[spoofSymbol] } className={classes.button} onClick={(event) => this.onOpenRemoveMaintenenceEntryDialog(event, rowData)} ><RemoveIcon /></IconButton></Tooltip>
              </div>
            </>
          ) },
        ]
        } idProperty={'_id'}> </MaintenenceEntriesTable>
        <EditMaintenenceEntryDialog initialMaintenenceEntry={this.state.maintenenceEntryToEdit} mode={this.state.maintenenceEntryEditorMode}
          onClose={ this.onCloseEditMaintenenceEntryDialog } />
       </>
    );
  }

  componentDidMount(){
    this.props.onLoadMenteneceEntries();
  }

  private onOpenPlus1hEditMaintenenceEntryDialog = (event: React.MouseEvent<HTMLElement>, entry: MaintenenceEntry) => {
    event.preventDefault();
    event.stopPropagation();
    const startTime = (new Date().valueOf());
    const endTime = startTime + (1 * 60 * 60 * 1000);
    this.setState({
      maintenenceEntryToEdit: {
        ...entry,
        start: convertToLocaleString(startTime),
        end: convertToLocaleString(endTime),
      },
      maintenenceEntryEditorMode: EditMaintenenceEntryDialogMode.EditMaintenenceEntry
    });
  }

  private onOpenPlus8hEditMaintenenceEntryDialog = (event: React.MouseEvent<HTMLElement>, entry: MaintenenceEntry) => {
    event.preventDefault();
    event.stopPropagation();
    const startTime = (new Date().valueOf());
    const endTime = startTime + (8 * 60 * 60 * 1000);
    this.setState({
      maintenenceEntryToEdit: {
        ...entry,
        start: convertToLocaleString(startTime),
        end: convertToLocaleString(endTime),
      },
      maintenenceEntryEditorMode: EditMaintenenceEntryDialogMode.EditMaintenenceEntry
    });
  }

  private onOpenEditMaintenenceEntryDialog = (event: React.MouseEvent<HTMLElement>, entry: MaintenenceEntry) => {
    event.preventDefault();
    event.stopPropagation();
    const startTime = (new Date().valueOf());
    const endTime = startTime ;
    this.setState({
      maintenenceEntryToEdit: {
        ...entry,
        ...(entry.start && endTime)
          ? { start: entry.start, end: entry.end }
          : { start: convertToLocaleString(startTime), end: convertToLocaleString(endTime)}
      },
      maintenenceEntryEditorMode: EditMaintenenceEntryDialogMode.EditMaintenenceEntry
    });
  }

  private onOpenRemoveMaintenenceEntryDialog = (event: React.MouseEvent<HTMLElement>, entry: MaintenenceEntry) => {
    event.preventDefault();
    event.stopPropagation();
    const startTime = (new Date().valueOf());
    const endTime = startTime;
    this.setState({
      maintenenceEntryToEdit: {
        ...entry,
        ...(entry.start && endTime)
          ? { start: entry.start, end: entry.end }
          : { start: convertToLocaleString(startTime), end: convertToLocaleString(endTime) }
      },
      maintenenceEntryEditorMode: EditMaintenenceEntryDialogMode.RemoveMaintenenceEntry
    });
  }

  private onCloseEditMaintenenceEntryDialog = () => {
    this.setState({
      maintenenceEntryToEdit: emptyMaintenenceEntry,
      maintenenceEntryEditorMode: EditMaintenenceEntryDialogMode.None,
    });
  }
}

export const MaintenenceView = withStyles(styles)(connect(mapProps, mapDispatcher)(MaintenenceViewComponent));
export default MaintenenceView;