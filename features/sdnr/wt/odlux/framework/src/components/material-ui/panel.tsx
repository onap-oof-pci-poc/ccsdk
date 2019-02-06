import * as React from 'react';

import { withStyles, Theme, WithStyles, createStyles } from '@material-ui/core/styles';

import { ExpansionPanel, ExpansionPanelSummary, ExpansionPanelDetails, Typography, ExpansionPanelActions } from '@material-ui/core';

import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
import { SvgIconProps } from '@material-ui/core/SvgIcon';

const styles = (theme: Theme) => createStyles({
  accordion: {
    // background: theme.palette.secondary.dark,
    // color: theme.palette.primary.contrastText
  },
  detail: {
    // background: theme.palette.background.paper,
    // color: theme.palette.text.primary,
    position: "relative", 
    display: 'flex', 
    flexDirection: 'column'
  },
  text: {
    // color: theme.palette.common.white,
    // fontSize: "1rem"
  },
});

type PanalProps = WithStyles<typeof styles> & {
  activePanel: string | null,
  panelId: string,
  title: string,
  customActionButtons?: JSX.Element[];
  onToggle: (panelId: string | null) => void;
}

const PanelComponent: React.SFC<PanalProps> = (props) => {
  const { classes, activePanel, onToggle } = props;
  return (
    <ExpansionPanel className={ classes.accordion } expanded={ activePanel === props.panelId } onChange={ () => onToggle(props.panelId) } >
      <ExpansionPanelSummary expandIcon={ <ExpandMoreIcon /> }>
        <Typography className={ classes.text } >{ props.title }</Typography>
      </ExpansionPanelSummary>
      <ExpansionPanelDetails className={ classes.detail }>
        { props.children }
      </ExpansionPanelDetails>
      { props.customActionButtons 
        ? <ExpansionPanelActions>
          { props.customActionButtons }
         </ExpansionPanelActions> 
        : null }  
    </ExpansionPanel>
  );
};

export const Panel = withStyles(styles)(PanelComponent);
export default Panel;