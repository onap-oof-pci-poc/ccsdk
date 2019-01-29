import * as React from 'react';
import { NavLink, Link, Route } from 'react-router-dom';

import ListItem from '@material-ui/core/ListItem';
import ListItemIcon from '@material-ui/core/ListItemIcon';
import ListItemText from '@material-ui/core/ListItemText';

import { withStyles, WithStyles, createStyles, Theme } from '@material-ui/core/styles';

const styles = (theme: Theme) => createStyles({
  active: {
    backgroundColor: theme.palette.action.selected
  }
});

export interface IListItemLinkProps extends WithStyles<typeof styles> {
  icon: JSX.Element | null;
  primary: string | React.ComponentType;
  secondary?: React.ComponentType;
  to: string;
  exact?: boolean;
}

export const ListItemLink = withStyles(styles)((props: IListItemLinkProps) => {
  const { icon, primary: Primary, secondary: Secondary, classes, to, exact = false } = props;
  const renderLink = (itemProps: any): JSX.Element => (<NavLink exact={ exact } to={ to } activeClassName={ classes.active } { ...itemProps } />);

  return (
       <>
        <ListItem button component={ renderLink }>
          { icon
            ? <ListItemIcon>{ icon }</ListItemIcon>
            : null
          }
        { typeof Primary === 'string'
          ? <ListItemText primary={ Primary } style={{ padding: 0 }} /> 
          : <Primary />
          }
        </ListItem>
        { Secondary 
          ? <Route exact={ exact } path={ to } component={ Secondary } />
          : null
        }
      </>
    );
  }
);

export default ListItemLink;

