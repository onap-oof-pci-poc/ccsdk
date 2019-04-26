import * as React from 'react';
import { withStyles, WithStyles, createStyles, Theme } from '@material-ui/core/styles';

import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TablePagination from '@material-ui/core/TablePagination';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';
import Checkbox from '@material-ui/core/Checkbox';

import { TableToolbar } from './tableToolbar';
import { EnhancedTableHead } from './tableHead';
import { EnhancedTableFilter } from './tableFilter';

import { ColumnModel, ColumnType } from './columnModel';
import { Omit } from '@material-ui/core';
import { SvgIconProps } from '@material-ui/core/SvgIcon/SvgIcon';
export { ColumnModel, ColumnType } from './columnModel';

type propType = string | number | null | undefined | (string|number)[];
type dataType = { [prop: string]: propType };
type resultType<TData = dataType> = { page: number, rowCount: number, rows: TData[] };

export type DataCallback<TData = dataType> = (page?: number, rowsPerPage?: number, orderBy?: string | null, order?: 'asc' | 'desc' | null, filter?: { [property: string]: string }) =>resultType<TData> | Promise<resultType<TData>>;

function desc(a: dataType, b: dataType, orderBy: string) {
  if ((b[orderBy] || "") < (a[orderBy] || "") ) {
    return -1;
  }
  if ((b[orderBy] || "") > (a[orderBy] || "") ) {
    return 1;
  }
  return 0;
}

function stableSort(array: dataType[], cmp: (a: dataType, b: dataType) => number) {
  const stabilizedThis = array.map((el, index) => [el, index]) as [dataType, number][];
  stabilizedThis.sort((a, b) => {
    const order = cmp(a[0], b[0]);
    if (order !== 0) return order;
    return a[1] - b[1];
  });
  return stabilizedThis.map(el => el[0]);
}

function getSorting(order: 'asc' | 'desc' | null, orderBy: string) {
  return order === 'desc' ? (a: dataType, b: dataType) => desc(a, b, orderBy) : (a: dataType, b: dataType) => -desc(a, b, orderBy);
}

const styles = (theme: Theme) => createStyles({
  root: {
    width: '100%',
    marginTop: theme.spacing.unit * 3,
  },
  table: {
    minWidth: 1020,
  },
  tableWrapper: {
    overflowX: 'auto',
  },
});

export type MaterialTableComponentState<TData = {}> = {
  order: 'asc' | 'desc';
  orderBy: string | null;
  selected: any[] | null;
  rows: TData[];
  rowCount: number;
  page: number;
  rowsPerPage: number;
  loading: boolean;
  showFilter: boolean;
  filter: { [property: string]: string };
};

export type TableApi = { forceRefresh?: () => Promise<void> };

type MaterialTableComponentBaseProps<TData> = WithStyles<typeof styles> & {
  columns: ColumnModel<TData>[];
  idProperty: keyof TData | ((data: TData) => React.Key );
  title?: string;
  enableSelection?: boolean;
  disableSorting?: boolean;
  disableFilter?: boolean;
  customActionButtons?: { icon: React.ComponentType<SvgIconProps>, tooltip?: string, onClick: () => void  }[];
  onHandleClick?(event: React.MouseEvent<HTMLTableRowElement>, rowData: TData): void;
};

type MaterialTableComponentPropsWithRows<TData={}> = MaterialTableComponentBaseProps<TData> & { rows: TData[]; asynchronus?: boolean; };
type MaterialTableComponentPropsWithRequestData<TData={}> = MaterialTableComponentBaseProps<TData> & { onRequestData: DataCallback; tableApi?: TableApi; };
type MaterialTableComponentPropsWithExternalState<TData={}> = MaterialTableComponentBaseProps<TData> & MaterialTableComponentState & {
  onToggleFilter: () => void;
  onFilterChanged: (property: string, filterTerm: string) => void;
  onHandleChangePage: (page: number) => void;
  onHandleChangeRowsPerPage: (rowsPerPage: number | null) => void;
  onHandleRequestSort: (property: string) => void;
};

type MaterialTableComponentProps<TData = {}> =
  MaterialTableComponentPropsWithRows<TData> |
  MaterialTableComponentPropsWithRequestData<TData> |
  MaterialTableComponentPropsWithExternalState<TData>;

function isMaterialTableComponentPropsWithRows(props: MaterialTableComponentProps): props is MaterialTableComponentPropsWithRows {
  return (props as MaterialTableComponentPropsWithRows).rows !== undefined && (props as MaterialTableComponentPropsWithRows).rows instanceof Array;
}

function isMaterialTableComponentPropsWithRequestData(props: MaterialTableComponentProps): props is MaterialTableComponentPropsWithRequestData {
  return (props as MaterialTableComponentPropsWithRequestData).onRequestData !== undefined && (props as MaterialTableComponentPropsWithRequestData).onRequestData instanceof Function;
}

function isMaterialTableComponentPropsWithRowsAndRequestData(props: MaterialTableComponentProps): props is MaterialTableComponentPropsWithExternalState {
  const propsWithExternalState = (props as MaterialTableComponentPropsWithExternalState)
  return propsWithExternalState.onFilterChanged instanceof Function ||
    propsWithExternalState.onHandleChangePage instanceof Function ||
    propsWithExternalState.onHandleChangeRowsPerPage instanceof Function ||
    propsWithExternalState.onToggleFilter instanceof Function ||
    propsWithExternalState.onHandleRequestSort instanceof Function
}

class MaterialTableComponent<TData extends {} = {}> extends React.Component<MaterialTableComponentProps, MaterialTableComponentState> {

  constructor(props: MaterialTableComponentProps) {
    super(props);

    const page = isMaterialTableComponentPropsWithRowsAndRequestData(this.props) ? this.props.page : 0;
    const rowsPerPage = isMaterialTableComponentPropsWithRowsAndRequestData(this.props) ? this.props.rowsPerPage || 10 : 10;

    this.state = {
      filter: isMaterialTableComponentPropsWithRowsAndRequestData(this.props) ? this.props.filter || {} : {},
      showFilter: isMaterialTableComponentPropsWithRowsAndRequestData(this.props) ? this.props.showFilter : false,
      loading: isMaterialTableComponentPropsWithRowsAndRequestData(this.props) ? this.props.loading : false,
      order: isMaterialTableComponentPropsWithRowsAndRequestData(this.props) ? this.props.order : 'asc',
      orderBy: isMaterialTableComponentPropsWithRowsAndRequestData(this.props) ? this.props.orderBy : null,
      selected: isMaterialTableComponentPropsWithRowsAndRequestData(this.props) ? this.props.selected : null,
      rows: isMaterialTableComponentPropsWithRows(this.props) && this.props.rows.slice(page * rowsPerPage, page * rowsPerPage + rowsPerPage) || [],
      rowCount: isMaterialTableComponentPropsWithRows(this.props) && this.props.rows.length || 0,
      page,
      rowsPerPage,
    };

    if (isMaterialTableComponentPropsWithRequestData(this.props)) {
      this.update();

      if (this.props.tableApi) {
        this.props.tableApi.forceRefresh = () => this.update();
      }
    }
  }
  render(): JSX.Element {
    const { classes, columns } = this.props;
    const { rows, rowCount, order, orderBy, selected, rowsPerPage, page, showFilter, filter } = this.state;
    const emptyRows = rowsPerPage - Math.min(rowsPerPage, rowCount - page * rowsPerPage);
    const getId = typeof this.props.idProperty !== "function" ? (data: TData) => ((data as {[key:string]: any })[this.props.idProperty as any as string] as string | number) : this.props.idProperty;
    const toggleFilter = isMaterialTableComponentPropsWithRowsAndRequestData(this.props) ? this.props.onToggleFilter : () => { !this.props.disableFilter && this.setState({ showFilter: !showFilter }, this.update) }
    return (
      <Paper className={ classes.root }>
        <TableToolbar numSelected={ selected && selected.length } title={ this.props.title } customActionButtons={ this.props.customActionButtons } onExportToCsv={ this.exportToCsv }
          onToggleFilter={ toggleFilter } />
        <div className={ classes.tableWrapper }>
          <Table className={ classes.table } aria-labelledby="tableTitle">
            <EnhancedTableHead
              columns={ columns }
              numSelected={ selected && selected.length }
              order={ order }
              orderBy={ orderBy }
              onSelectAllClick={ this.handleSelectAllClick }
              onRequestSort={ this.onHandleRequestSort }
              rowCount={ rows.length }
              enableSelection={ this.props.enableSelection }
            />
            <TableBody>
              { showFilter && <EnhancedTableFilter columns={ columns } filter={ filter } onFilterChanged={ this.onFilterChanged } enableSelection={this.props.enableSelection} /> || null }
              { rows // may need ordering here
                .map((entry: TData & { [key: string]: any }) => {
                  const entryId = getId(entry);
                  const isSelected = this.isSelected(entryId);
                  return (
                    <TableRow
                      hover
                      onClick={ event => this.handleClick(event, entry, entryId) }
                      role="checkbox"
                      aria-checked={ isSelected }
                      tabIndex={ -1 }
                      key={ entryId }
                      selected={ isSelected }
                    >
                      { this.props.enableSelection
                       ? <TableCell padding="checkbox" style={ { width: "50px" } }>
                          <Checkbox checked={ isSelected } />
                        </TableCell>
                       : null
                      }
                      {
                        this.props.columns.map(
                          col => {
                            const style = col.width ? { width: col.width } : { };
                            return (
                              <TableCell key={ col.property } align={ col.type === ColumnType.numeric && !col.align ? "right": col.align } style={ style }>
                                { col.type === ColumnType.custom && col.customControl
                                  ? <col.customControl className={col.className} style={col.style} rowData={ entry } />
                                  : col.type === ColumnType.boolean
                                    ? <span className={col.className} style={col.style}>{col.labels ? col.labels[entry[col.property] ? "true": "false"] : String(entry[col.property]) }</span>
                                    : <span className={col.className} style={col.style}>{String(entry[col.property])}</span>
                                }
                              </TableCell>
                            );
                          }
                        )
                      }
                    </TableRow>
                  );
                }) }
              { emptyRows > 0 && (
                <TableRow style={ { height: 49 * emptyRows } }>
                  <TableCell colSpan={ this.props.columns.length } />
                </TableRow>
              ) }
            </TableBody>
          </Table>
        </div>
        <TablePagination
          rowsPerPageOptions={[5, 10, 20, 50] }
          component="div"
          count={ rowCount }
          rowsPerPage={ rowsPerPage }
          page={ page }
          backIconButtonProps={ {
            'aria-label': 'Previous Page',
          } }
          nextIconButtonProps={ {
            'aria-label': 'Next Page',
          } }
          onChangePage={ this.onHandleChangePage }
          onChangeRowsPerPage={ this.onHandleChangeRowsPerPage }
        />
      </Paper>
    );
  }

  static getDerivedStateFromProps(props: MaterialTableComponentProps, state: MaterialTableComponentState & { _rawRows: {}[] }): MaterialTableComponentState & { _rawRows: {}[] } {
    if (isMaterialTableComponentPropsWithRowsAndRequestData(props)) {
      return {
        ...state,
        rows: props.rows,
        rowCount: props.rowCount,
        orderBy: props.orderBy,
        order: props.order,
        filter: props.filter,
        loading: props.loading,
        showFilter: props.showFilter,
        page: props.page,
        rowsPerPage: props.rowsPerPage
      }
    } else if (isMaterialTableComponentPropsWithRows(props) && props.asynchronus && state._rawRows !== props.rows) {
      const newState = MaterialTableComponent.updateRows(props, state);
      return {
        ...state,
        ...newState,
        _rawRows: props.rows || []
      };
    }
    return state;
  }

  private static updateRows(props: MaterialTableComponentPropsWithRows, state: MaterialTableComponentState): { rows: {}[], rowCount: number } {
    try {
      const { page, rowsPerPage, order, orderBy, filter } = state;
      let data: dataType[] = props.rows || [];
      let filtered = false;
      if (state.showFilter) {
        Object.keys(filter).forEach(prop => {
          const exp = filter[prop];
          filtered = filtered || exp !== undefined;
          data = exp !== undefined ? data.filter((val) => {
            const value = val[prop];
            return (value == exp) || (value && value.toString().indexOf(String(exp)) > -1);
          }) : data;
        });
      }

      const rowCount = data.length;

      data = (orderBy && order
        ? stableSort(data, getSorting(order, orderBy))
        : data).slice(page * rowsPerPage, page * rowsPerPage + rowsPerPage);

      return {
        rows: data,
        rowCount
      };
    } catch{
      return {
        rows: [],
        rowCount: 0
      }
    }
  }

  private async update() {
    if (isMaterialTableComponentPropsWithRequestData(this.props)) {
      const response = await Promise.resolve(
        this.props.onRequestData(
          this.state.page, this.state.rowsPerPage, this.state.orderBy, this.state.order, this.state.showFilter && this.state.filter || {})
      );
      this.setState(response);
    } else {
      this.setState(MaterialTableComponent.updateRows(this.props, this.state));
    }
  }

  private onFilterChanged = (property: string, filterTerm: string) => {
    if (isMaterialTableComponentPropsWithRowsAndRequestData(this.props)) {
      this.props.onFilterChanged(property, filterTerm);
      return;
    }
    if (this.props.disableFilter) return;
    const colDefinition = this.props.columns && this.props.columns.find(col => col.property === property);
    if (colDefinition && colDefinition.disableFilter) return;

    const filter = { ...this.state.filter, [property]: filterTerm };
    this.setState({
      filter
    }, this.update);
  };

  private onHandleRequestSort = (event: React.SyntheticEvent, property: string) => {
    if (isMaterialTableComponentPropsWithRowsAndRequestData(this.props)) {
      this.props.onHandleRequestSort(property);
      return;
    }
    if (this.props.disableSorting) return;
    const colDefinition = this.props.columns && this.props.columns.find(col => col.property === property);
    if (colDefinition && colDefinition.disableSorting) return;

    const orderBy = this.state.orderBy === property && this.state.order === 'desc' ? null : property;
    const order = this.state.orderBy === property && this.state.order === 'asc' ? 'desc' : 'asc';
    this.setState({
      order,
      orderBy
    }, this.update);
  };

  handleSelectAllClick: () => {};

  private onHandleChangePage = (event: React.MouseEvent<HTMLButtonElement> | null, page: number) => {
    if (isMaterialTableComponentPropsWithRowsAndRequestData(this.props)) {
      this.props.onHandleChangePage(page);
      return;
    }
    this.setState({
      page
    }, this.update);
  };

  private onHandleChangeRowsPerPage = (event: React.ChangeEvent<HTMLTextAreaElement | HTMLInputElement>) => {
    if (isMaterialTableComponentPropsWithRowsAndRequestData(this.props)) {
      this.props.onHandleChangeRowsPerPage(+(event && event.target.value));
      return;
    }
    const rowsPerPage = +(event && event.target.value);
    if (rowsPerPage && rowsPerPage > 0) {
      this.setState({
        rowsPerPage
      }, this.update);
    }
  };

  private isSelected(id: string | number): boolean {
    let selected = this.state.selected || [];
    const selectedIndex = selected.indexOf(id);
    return (selectedIndex > -1);
  }

  private handleClick(event: React.MouseEvent<HTMLTableRowElement>, rowData: TData, id: string | number): void {
    if (this.props.onHandleClick instanceof Function) {
      this.props.onHandleClick(event, rowData);
      return;
    }
    if (!this.props.enableSelection){
      return;
    }
    let selected = this.state.selected || [];
    const selectedIndex = selected.indexOf(id);
    if (selectedIndex > -1) {
      selected = [
        ...selected.slice(0, selectedIndex),
        ...selected.slice(selectedIndex + 1)
      ];
    } else {
      selected = [
        ...selected,
        id
      ];
    }
    this.setState({
      selected
    });
  }

  private exportToCsv = async () => {
    let file;
    let data: dataType[] | null = null;
    let csv: string[] = [];


    if (isMaterialTableComponentPropsWithRequestData(this.props)) {
      this.setState({ loading: true });
      const result = await Promise.resolve(
        this.props.onRequestData( 0, 1000, this.state.orderBy, this.state.order, this.state.showFilter && this.state.filter || {})
      );
      data = result.rows;
      this.setState({ loading: true });
    } else {
      data = MaterialTableComponent.updateRows(this.props, this.state).rows;
    }

    if (data && data.length > 0) {
      csv.push(this.props.columns.map(col => col.title || col.property).join(',') + "\r\n");
      this.state.rows && this.state.rows.forEach((row: any) => {
        csv.push(this.props.columns.map(col => row[col.property]).join(',') + "\r\n");
      });
      const properties = { type: "text/csv;charset=utf-8"  }; // Specify the file's mime-type.
      try {
        // Specify the filename using the File constructor, but ...
        file = new File(csv, "export.csv", properties);
      } catch (e) {
        // ... fall back to the Blob constructor if that isn't supported.
        file = new Blob(csv, properties);
      }
    }
    if (!file) return;
    var reader = new FileReader();
    reader.onload = function (e) {
      const dataUri = reader.result as any;
      const link = document.createElement("a");
      if (typeof link.download === 'string') {
        link.href = dataUri;
        link.download = "export.csv";

        //Firefox requires the link to be in the body
        document.body.appendChild(link);

        //simulate click
        link.click();

        //remove the link when done
        document.body.removeChild(link);
      } else {
        window.open(dataUri);
      }
    }
    reader.readAsDataURL(file);

    // const url = URL.createObjectURL(file);
    // window.location.replace(url);
  }
}

export type MaterialTableCtorType<TData extends {} = {}> = new () => React.Component<Omit<MaterialTableComponentProps<TData>, 'classes'>>;

export const MaterialTable = withStyles(styles)(MaterialTableComponent);
export default MaterialTable;