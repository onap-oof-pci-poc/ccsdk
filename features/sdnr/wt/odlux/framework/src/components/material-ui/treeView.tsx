import * as React from 'react';

import { SvgIconProps } from '@material-ui/core/SvgIcon';
import { List, ListItem, TextField, ListItemText, ListItemIcon, WithTheme, withTheme, Omit } from '@material-ui/core';

import FileIcon from '@material-ui/icons/InsertDriveFile';
import CloseIcon from '@material-ui/icons/ExpandLess';
import OpenIcon from '@material-ui/icons/ExpandMore';
import FolderIcon from '@material-ui/icons/Folder';

export interface ITreeItem {
  disabled?: boolean;
  icon?: React.ComponentType<SvgIconProps>;
}

type TreeViewComponentState<TData extends ITreeItem = ITreeItem> = {
  /** All indices of all expanded Items */
  expandedItems: TData[];
  /** The index of the active iten or undefined if no item is active. */
  activeItem: undefined | TData;
  /** The search term or undefined if search is corrently not active. */
  searchTerm: undefined | string;
}

type TreeViewComponentBaseProps<TData extends ITreeItem = ITreeItem> = WithTheme & {
  items: TData[];
  contentProperty: keyof Omit<TData, keyof ITreeItem>;
  childrenProperty: keyof Omit<TData, keyof ITreeItem>;
  useFolderIcons?: boolean;
  enableSearchBar?: boolean;
  autoExpandFolder?: boolean;
  style?: React.CSSProperties;
  itemHeight?: number;
  depthOffset?: number;
}

type TreeViewComponentWithInternalStateProps<TData extends ITreeItem = ITreeItem> = TreeViewComponentBaseProps<TData> & {
  onItemClick?: (item: TData) => void;
  onFolderClick?: (item: TData) => void;
}

type TreeViewComponentWithExternalStateProps<TData extends ITreeItem = ITreeItem> = TreeViewComponentBaseProps<TData> & TreeViewComponentState<TData> & {
  onSearch: (searchTerm: string) => void;
  onItemClick: (item: TData) => void;
  onFolderClick: (item: TData) => void;
}

type TreeViewComponentProps<TData extends ITreeItem = ITreeItem> =
  TreeViewComponentWithInternalStateProps<TData> |
  TreeViewComponentWithExternalStateProps<TData>;

function isTreeViewComponentWithExternalStateProps<TData extends ITreeItem = ITreeItem>(props: TreeViewComponentProps<TData>): props is TreeViewComponentWithExternalStateProps<TData> {
  const propsWithExternalState = (props as TreeViewComponentWithExternalStateProps<TData>)
  return (
    propsWithExternalState.onSearch instanceof Function ||
    propsWithExternalState.expandedItems !== undefined ||
    propsWithExternalState.activeItem !== undefined ||
    propsWithExternalState.searchTerm !== undefined
  );
}

class TreeViewComponent<TData extends ITreeItem> extends React.Component<TreeViewComponentProps<TData>, TreeViewComponentState> {

  /**
    * Initializes a new instance.
    */
  constructor(props: TreeViewComponentProps<TData>) {
    super(props);

    this.state = {
      expandedItems: [],
      activeItem: undefined,
      searchTerm: undefined
    };
  }

  render(): JSX.Element {
    this.itemIndex = 0;
    const { searchTerm } = this.state;
    const { children, items, enableSearchBar } = this.props;
    const styles = {
      root: {
        padding: 0,
        paddingBottom: 8,
        paddingTop: children ? 0 : 8,
        ...this.props.style
      },
      search: {
        padding: `0px ${ this.props.theme.spacing.unit }px`
      }
    };
    return (
      <div style={ styles.root }>
        { children }
        { enableSearchBar && <TextField label={ "Search" } fullWidth={ true } style={ styles.search } value={ searchTerm } onChange={ this.onChangeSearchText } /> || null }
        <List>
            { this.renderItems(items, searchTerm && searchTerm.toLowerCase()) }
        </List>
      </div>
    );
  }

  private itemIndex: number = 0; 
  private renderItems = (items: TData[], searchTerm: string | undefined, depth: number = 1) => {
    return items.reduce((acc, item) => {

      const children = this.props.childrenProperty && ((item as any)[this.props.childrenProperty] as TData[]);
      const childrenJsx = children && this.renderItems(children, searchTerm, depth + 1);

      const expanded = searchTerm
        ? children && childrenJsx.length > 0
        : !children
          ? false
          : this.state.expandedItems.indexOf(item) > -1;
      const isFolder = children !== undefined;

      const itemJsx = this.renderItem(item, searchTerm, depth, isFolder, expanded);
      itemJsx && acc.push(itemJsx);

      if (isFolder && expanded) {
        acc.push(...childrenJsx);
      }
      return acc;

    }, [] as JSX.Element[]);
  }
  private renderItem = (item: TData, searchTerm: string | undefined, depth: number, isFolder: boolean, expanded: boolean): JSX.Element | null => {
    const styles = {
      item: {
        paddingLeft: (((this.props.depthOffset || 0) + depth) * this.props.theme.spacing.unit * 3),
        backgroundColor: this.state.activeItem === item ? this.props.theme.palette.action.selected : undefined,
        height: this.props.itemHeight || undefined,
        cursor: item.disabled ? 'not-allowed' : 'pointer',
        color: item.disabled ? this.props.theme.palette.text.disabled : this.props.theme.palette.text.primary,
        overflow: 'hidden',
        transform: 'translateZ(0)',
      }
    };

    const text = (item as any)[this.props.contentProperty] as string || ''; // need to keep track of search
    const matchIndex = searchTerm ? text.toLowerCase().indexOf(searchTerm) : -1;
    const searchTermLength = searchTerm && searchTerm.length || 0;

    const handleClickCreator = (isIcon: boolean) => (event: React.SyntheticEvent) => {
          if (item.disabled) return;
          event.preventDefault();
          event.stopPropagation();
          if (isFolder && (this.props.autoExpandFolder || isIcon)) {
            this.props.onFolderClick ? this.props.onFolderClick(item) : this.onFolderClick(item); 
          } else {
            this.props.onItemClick ? this.props.onItemClick(item) : this.onItemClick(item);
          }
        };

    return ((searchTerm && (matchIndex > -1 || expanded) || !searchTerm)
      ? (
        <ListItem key={ `tree-list-${ this.itemIndex++ }` } style={ styles.item } onClick={ handleClickCreator(false) } button >

          { // display the left icon
            (this.props.useFolderIcons && <ListItemIcon>{ isFolder ? <FolderIcon /> : <FileIcon /> }</ListItemIcon>) ||
            (item.icon && (<ListItemIcon><item.icon /></ListItemIcon>)) }

          
          { // highlight search result
            matchIndex > -1
            ? (<span>
                { text.substring(0, matchIndex) }
              <span
                style={ {
                  display: 'inline-block',
                  backgroundColor: 'rgba(255,235,59,0.5)',
                  padding: '3px',
                } }
              >
                  { text.substring(matchIndex, matchIndex + searchTermLength) }
              </span>
                { text.substring(matchIndex + searchTermLength) }
            </span>)
            : (<ListItemText primary={ text } />)
          }

          { // display the right icon, depending on the state 
            !isFolder ? null : expanded ? (<OpenIcon onClick={ handleClickCreator(true) } />) : (<CloseIcon onClick={ handleClickCreator(true) } />) }
        </ListItem>
       )
      : null
    );
  }

  private onFolderClick = (item: TData) => {
    // toggle items with children
    if (this.state.searchTerm) return;
    const indexOfItemToToggle = this.state.expandedItems.indexOf(item);
    if (indexOfItemToToggle === -1) {
      this.setState({
        expandedItems: [...this.state.expandedItems, item],
      });
    } else {
      this.setState({
        expandedItems: [
          ...this.state.expandedItems.slice(0, indexOfItemToToggle),
          ...this.state.expandedItems.slice(indexOfItemToToggle + 1),
        ]
      });
    }
  };

  private onItemClick = (item: TData) => {
    // activate items without children
    this.setState({
      activeItem: item,
    });
  };

  private onChangeSearchText = (event: React.ChangeEvent<HTMLInputElement>) => {
    event.preventDefault();
    event.stopPropagation();

    if (isTreeViewComponentWithExternalStateProps(this.props)) {
      this.props.onSearch(event.target.value)
    } else {
      this.setState({
        searchTerm: event.target.value
      });
    }
  };

  static getDerivedStateFromProps(props: TreeViewComponentProps, state: TreeViewComponentState): TreeViewComponentState {
    if (isTreeViewComponentWithExternalStateProps(props)) {
      return {
        ...state,
        expandedItems: props.expandedItems || [],
        activeItem: props.activeItem,
        searchTerm: props.searchTerm
      };
    }
    return state;
  }

  public static defaultProps = {
    useFolderIcons: false,
    enableSearchBar: false,
    autoExpandFolder: false,
    depthOffset: 0
  }
}

export type TreeViewCtorType<TData extends ITreeItem = ITreeItem> = new () => React.Component<Omit<TreeViewComponentProps<TData>, 'theme'>>;

export const TreeView = withTheme()(TreeViewComponent);
export default TreeView;