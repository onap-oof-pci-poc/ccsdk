import { ApplicationStore } from '../store/applicationStore';


let resolveApplicationStoreInitialized: (store: ApplicationStore) => void;
let applicationStore: ApplicationStore | null = null;
const applicationStoreInitialized: Promise<ApplicationStore> = new Promise((resolve) => resolveApplicationStoreInitialized = resolve);

export const setApplicationStore = (store: ApplicationStore) => {
  if (!applicationStore && store) {
    applicationStore = store;
    resolveApplicationStoreInitialized(store);
  }
}

export const applicationApi = {
  get applicationStore(): ApplicationStore | null {
    return applicationStore;
  },

  get applicationStoreInitialized(): Promise<ApplicationStore> {
    return applicationStoreInitialized;
  }
};

export default applicationApi;