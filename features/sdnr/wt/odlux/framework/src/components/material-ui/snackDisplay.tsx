import * as React from 'react';

import { IApplicationStoreState } from '../../store/applicationStore';
import { Connect, connect, IDispatcher } from '../../flux/connect';
import { RemoveSnackbarNotification } from '../../actions/snackbarActions';

import { InjectedNotistackProps, withSnackbar } from 'notistack';

const mapProps = (state: IApplicationStoreState) => ({
  notifications: state.framework.applicationState.snackBars
});

const mapDispatch = (dispatcher: IDispatcher) => ({
  removeSnackbar: (key: number) => {
    dispatcher.dispatch(new RemoveSnackbarNotification(key));
   }
});

type DisplaySnackbarsComponentProps = Connect<typeof mapProps, typeof mapDispatch> & InjectedNotistackProps;

class DisplaySnackbarsComponent extends React.Component<DisplaySnackbarsComponentProps> {
  private displayed: number[] = [];

  private storeDisplayed = (id: number) => {
    this.displayed = [...this.displayed, id];
  };

  public shouldComponentUpdate({ notifications: newSnacks = [] }: DisplaySnackbarsComponentProps) {
    
    const { notifications: currentSnacks } = this.props;
    let notExists = false;
    for (let i = 0; i < newSnacks.length; i++) {
      if (notExists) continue;
      notExists = notExists || !currentSnacks.filter(({ key }) => newSnacks[i].key === key).length;
    }
    return notExists;
  }

  componentDidUpdate() {
    const { notifications = [] } = this.props;

    notifications.forEach(notification => {
      if (this.displayed.includes(notification.key)) return;
      const options = notification.options || {};
      this.props.enqueueSnackbar(notification.message, options);
      this.storeDisplayed(notification.key);
      this.props.removeSnackbar(notification.key);
    });
  }

  render() {
    return null;
  }
}

const DisplayStackbars = withSnackbar(connect(mapProps, mapDispatch)(DisplaySnackbarsComponent));
export default DisplayStackbars;