import * as React from 'react';
import classNames from 'classnames';
import { withStyles, WithStyles, Theme, createStyles } from '@material-ui/core/styles';

export const styles = (theme: Theme) => createStyles({
  /* Styles applied to the root element. */
  root: { 
    transition: theme.transitions.create('background,box-shadow'),
    background: 'transparent',
    borderRadius: 2,
    overflow: 'hidden',
  },
  /* Styles applied to the root element if `selected={true}` or `selected="auto" and `value` set. */
  selected: {
    background: theme.palette.background.paper,
    boxShadow: theme.shadows[2],
  },
});

