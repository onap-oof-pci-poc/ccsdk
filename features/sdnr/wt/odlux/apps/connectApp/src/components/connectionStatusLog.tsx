import * as React from 'react';
import connect, { IDispatcher, Connect } from '../../../../framework/src/flux/connect';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import { MaterialTable, ColumnType } from '../../../../framework/src/components/material-table';

import { createConnectionStatusLogActions, createConnectionStatusLogProperties } from '../handlers/connectionStatusLogHandler';

const mapProps = (state: IApplicationStoreState) => ({
  connectionStatusLogProperties: createConnectionStatusLogProperties(state),
});

const mapDispatch = (dispatcher: IDispatcher) => ({
    connectionStatusLogActions: createConnectionStatusLogActions(dispatcher.dispatch),
});
  
type ConnectionStatusLogComponentProps = Connect<typeof mapProps, typeof mapDispatch>;

class ConnectionStatusLogComponent extends React.Component<ConnectionStatusLogComponentProps> {
  render(): JSX.Element {
    return (
      <MaterialTable columns={ [
        { property: "timeStamp", title: "Time", type: ColumnType.text },
        { property: "objectId", title: "Name", type: ColumnType.text },
        { property: "elementStatus", title: "Connection status", type: ColumnType.text, disableFilter: true, disableSorting: true },
      ] } idProperty="_id" { ...this.props.connectionStatusLogActions } {...this.props.connectionStatusLogProperties } >
      </MaterialTable>
    );
  };

}

export const ConnectionStatusLog = connect(mapProps, mapDispatch)(ConnectionStatusLogComponent);
export default ConnectionStatusLog;