
import { faBook } from '@fortawesome/free-solid-svg-icons';

import applicationManager from '../../../framework/src/services/applicationManager';

import performanceHistoryRootHandler from './handlers/performanceHistoryRootHandler';
import PerformanceHistoryApplication  from './views/performanceHistoryApplication'; 

export function register() {
  applicationManager.registerApplication({ 
    name: "performanceHistoryApp",
    icon: faBook,
    rootComponent: PerformanceHistoryApplication,
    rootActionHandler: performanceHistoryRootHandler,
    menuEntry: "Performance History"
  });
}                                     