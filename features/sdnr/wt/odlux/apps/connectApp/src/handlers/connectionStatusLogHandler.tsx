import { createExternal,IExternalTableState } from '../../../../framework/src/components/material-table/utilities';
import { createSearchDataHandler } from '../../../../framework/src/utilities/elasticSearch';

import { ConnectionStatusLogType } from '../models/connectionStatusLog';
export interface IConnectionStatusLogState extends IExternalTableState<ConnectionStatusLogType> { }

// create eleactic search material data fetch handler
const connectionStatusLogSearchHandler = createSearchDataHandler<{ event: ConnectionStatusLogType }, ConnectionStatusLogType>('sdnevents_v1/eventlog', null,
  (event) => ({
    _id: event._id,
    timeStamp: event._source.event.timeStamp,
    objectId: event._source.event.objectId,
    type: event._source.event.type,
    elementStatus: event._source.event.type === 'ObjectCreationNotificationXml'
      ? 'mounted'
      : event._source.event.type === 'ObjectDeletionNotificationXml'
        ? 'unmounted'
        : event._source.event.type === 'AttributeValueChangedNotificationXml'
          ? event._source.event.newValue
          : 'unknown',
    newValue: ''

  }),
  (name) => `event.${ name }`);

export const {
  actionHandler: connectionStatusLogActionHandler,
  createActions: createConnectionStatusLogActions,
  createProperties: createConnectionStatusLogProperties,
  reloadAction: connectionStatusLogReloadAction,

  // set value action, to change a value
} = createExternal<ConnectionStatusLogType>(connectionStatusLogSearchHandler, appState => appState.connect.connectionStatusLog);

