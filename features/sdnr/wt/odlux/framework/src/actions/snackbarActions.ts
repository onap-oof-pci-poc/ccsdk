import { Action } from '../flux/action';
import { SnackbarItem } from '../models/snackbarItem';
import { Omit } from '@material-ui/core';

export class AddSnackbarNotification extends Action {

  constructor(notification: Omit<SnackbarItem, 'key' >) {
    super();

    this.notification = { ...notification, key: (new Date().getTime() + Math.random()) }
  }

  public notification: SnackbarItem
}

export class RemoveSnackbarNotification extends Action {
  constructor(public key: number) {
    super();
  }
}