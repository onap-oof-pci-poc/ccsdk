import { Action } from "../flux/action";

export abstract class NavigationAction extends Action { }

export class NavigateToApplication<TState = { }> extends NavigationAction {
 
  constructor(public applicationName: string, public href?: string, public state?: TState, public replace: boolean = false ) {
    super();
    
  }
}

export class PushAction<TState = { }> extends NavigationAction {
  constructor(public href: string, public state?: TState) {
    super();

  }
}

export class ReplaceAction<TState = { }> extends NavigationAction {
  constructor(public href: string, public state?: TState) {
    super();

  }
}

export class GoAction extends NavigationAction {
  constructor(public index: number) {
    super();

  }
}

export class GoBackAction extends NavigationAction {

}

export class GoForwardeAction extends NavigationAction {

}

export class LocationChanged extends NavigationAction {
  constructor(public pathname: string, public search: string, public hash: string ) {
    super();
    
  }
} 