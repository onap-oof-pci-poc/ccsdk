import * as React from 'react';

import connect, { IDispatcher, Connect } from '../../../../framework/src/flux/connect';
import { Panel } from '../../../../framework/src/components/material-ui';

import { requiredNetworkElementsReloadAction } from '../handlers/requiredNetworkElementsHandler';
import { loadAllMountedNetworkElementsAsync } from '../actions/mountedNetworkElementsActions';
import { connectionStatusLogReloadAction } from '../handlers/connectionStatusLogHandler';

import { RequiredNetworkElementsList } from '../components/requiredNetworkElements';
import { ConnectionStatusLog } from '../components/connectionStatusLog';
import { UnknownNetworkElementsList } from '../components/unknownNetworkElements';

const mapDispatcher = (dispatcher: IDispatcher) => ({
  onLoadUnknownNetworkElements: () => {
    dispatcher.dispatch(loadAllMountedNetworkElementsAsync);
  },
  onLoadRequiredNetworkElements: () => {
    dispatcher.dispatch(requiredNetworkElementsReloadAction);
  },
  onLoadConnectionStatusLog: () => {
    dispatcher.dispatch(connectionStatusLogReloadAction);
  }
});

type PanelId = null | "RequiredNetworkElements" | "UnknownNetworkElements" | "ConnectionStatusLog";

type ConnectApplicationComponentProps = Connect<undefined, typeof mapDispatcher> ;

type ConnectApplicationComponentState = {
  activePanel: PanelId;
};

class ConnectApplicationComponent extends React.Component<ConnectApplicationComponentProps, ConnectApplicationComponentState>{
  /**
   * Initialises this instance
   */
  constructor(props: ConnectApplicationComponentProps) {
    super(props);
    
    this.state = {
      activePanel: null
    };
  }
  private onTogglePanel = (panelId: PanelId) => {
    const nextActivePanel = panelId === this.state.activePanel ? null : panelId;
    this.setState({
      activePanel: nextActivePanel
    }, () => {
      switch (nextActivePanel) {
        case 'RequiredNetworkElements':
          this.props.onLoadRequiredNetworkElements();
          break;
        case 'UnknownNetworkElements':
          // todo: should we update the application state ?
          break;
        case 'ConnectionStatusLog':
          this.props.onLoadConnectionStatusLog();
          break;
        case null:
          // do nothing if all panels are closed
          break;
        default:
          console.warn("Unknown nextActivePanel [" + nextActivePanel + "] in connectView");
          break;
      }
    });
  };

  render(): JSX.Element {
    const { activePanel } = this.state;
    
    return (
      <>
        <Panel activePanel={ activePanel } panelId={ 'RequiredNetworkElements' } onToggle={ this.onTogglePanel } title={ "Required Network Elements" }>
          <RequiredNetworkElementsList />
        </Panel>
        <Panel activePanel={ activePanel } panelId={ 'UnknownNetworkElements' } onToggle={ this.onTogglePanel } title={ "Unknown Network Elements" }>
          <UnknownNetworkElementsList />
        </Panel>
        <Panel activePanel={ activePanel } panelId={ 'ConnectionStatusLog' } onToggle={ this.onTogglePanel } title={ "Connection Status Log" }>
          <ConnectionStatusLog />
        </Panel>
      </>
    );
  };
  public componentDidMount() {
    this.props.onLoadUnknownNetworkElements();
  }
}

export const ConnectApplication = (connect(undefined, mapDispatcher)(ConnectApplicationComponent));
export default ConnectApplication;