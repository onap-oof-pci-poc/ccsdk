import * as React from 'react';

import { IApplicationStoreState } from "../../../../framework/src/store/applicationStore";
import connect, { Connect, IDispatcher } from '../../../../framework/src/flux/connect';
import { TreeView, TreeViewCtorType } from '../../../../framework/src/components/material-ui/treeView';

import { ListItemText } from '@material-ui/core';

import { NavigateToApplication } from '../../../../framework/src/actions/navigationActions';

import { TocTreeNode } from '../models/tocNode';

const TocTree = TreeView as any as TreeViewCtorType<TocTreeNode>;

const mapProps = (state: IApplicationStoreState) => ({
  helpToc: state.helpApp.toc,
  helpBusy: state.helpApp.busy
});

const mapDisp = (dispatcher: IDispatcher) => ({
  requestDocument: (node: TocTreeNode) => dispatcher.dispatch(new NavigateToApplication("helpApp", node.uri))
});

const SubMenuEntryComponent: React.SFC<Connect<typeof mapProps, typeof mapDisp>> = (props) => {
  return props.helpToc
  ? (
    <TocTree items={ props.helpToc } contentProperty={ "label" } childrenProperty={ "nodes" } depthOffset={ 1 } 
        useFolderIcons={ false } enableSearchBar={ false } onItemClick={ props.requestDocument } />
    )
  : ( 
    <ListItemText >Loading ...</ListItemText>   
  )  
};

export const SubMenuEntry = connect(mapProps, mapDisp)(SubMenuEntryComponent);
export default SubMenuEntry;

