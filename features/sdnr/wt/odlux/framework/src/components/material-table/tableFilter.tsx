
import * as React from 'react';
import { ColumnModel, ColumnType } from './columnModel';
import { withStyles, WithStyles, createStyles, Theme } from '@material-ui/core/styles';


import TableCell from '@material-ui/core/TableCell';
import TableRow from '@material-ui/core/TableRow';
import Input from '@material-ui/core/Input';
import { Select, FormControl, InputLabel, MenuItem } from '@material-ui/core';


const styles = (theme: Theme) => createStyles({
  container: {
    display: 'flex',
    flexWrap: 'wrap',
  },
  input: {
    margin: theme.spacing.unit,
  },
});

interface IEnhancedTableFilterComponentProps extends WithStyles<typeof styles> {
  onFilterChanged: (property: string, filterTerm: string) => void;
  filter: { [property: string]: string };
  columns: ColumnModel<{}>[];
  enableSelection?: boolean;
}

class EnhancedTableFilterComponent extends React.Component<IEnhancedTableFilterComponentProps> {
  createFilterHandler = (property: string) => (event: React.ChangeEvent<HTMLInputElement|HTMLSelectElement|HTMLTextAreaElement>) => {
    this.props.onFilterChanged && this.props.onFilterChanged(property, event.target.value);
  };

  render() {
    const { columns, filter, classes } = this.props;
    return (
      <TableRow>
         { this.props.enableSelection
           ? <TableCell padding="checkbox" style={ { width: "50px" } }>
             </TableCell>
           : null
         }
        { columns.map(col => {
          const style = col.width ? { width: col.width } : {};
          return (
            <TableCell
              key={ col.property }
              padding={ col.disablePadding ? 'none' : 'default' }
              style={ style }
            >
              { col.disableFilter || (col.type === ColumnType.custom)
                ? null
                : (col.type === ColumnType.boolean)
                  ? <Select className={classes.input} value={filter[col.property] !== undefined ? filter[col.property] : ''} onChange={this.createFilterHandler(col.property)} inputProps={{ name: `${col.property}-bool`, id: `${col.property}-bool` }} >
                    <MenuItem value={undefined}>
                      <em>None</em>
                    </MenuItem>
                    <MenuItem value={true as any as string}>{ col.labels ? col.labels["true"]:"true"}</MenuItem>
                    <MenuItem value={false as any as string}>{ col.labels ? col.labels["false"] : "false"}</MenuItem>
                  </Select>
                  : <Input className={classes.input} inputProps={{ 'aria-label': 'Filter' }} value={filter[col.property] || ''} onChange={this.createFilterHandler(col.property)} />}
            </TableCell>
          );
        }, this) }
      </TableRow>
    );
  }
}

export const EnhancedTableFilter = withStyles(styles)(EnhancedTableFilterComponent);