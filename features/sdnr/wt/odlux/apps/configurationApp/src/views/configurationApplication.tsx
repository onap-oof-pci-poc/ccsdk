import * as React from 'react';

import { MaterialTable, MaterialTableCtorType } from '../../../../framework/src/components/material-table';
import connect, { Connect, IDispatcher } from '../../../../framework/src/flux/connect';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import { IConnectAppStoreState } from '../../../connectApp/src/handlers/connectAppRootHandler';
import { MountedNetworkElementType } from '../../../connectApp/src/models/mountedNetworkElements';
import { NavigateToApplication } from '../../../../framework/src/actions/navigationActions';
import { Dispatch } from '../../../../framework/src/flux/store';

import TextField from '@material-ui/core/TextField';
import { Tooltip, Button, FormControl, InputLabel, Select, MenuItem, InputAdornment } from '@material-ui/core';
import Link from '@material-ui/core/Link';

import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';

import { ViewSpecification } from '../models/uiModels';

const NetworkElementTable = MaterialTable as MaterialTableCtorType<MountedNetworkElementType>;

const mapProps = (state: IApplicationStoreState) => ({
  ...state.configuration,
  avaliableDevices: state.connect.mountedNetworkElements.elements.filter(el => el.connectionStatus === "connected")
});
const mapDisp = (dispatcher: IDispatcher) => ({
  navigateTo: (viewId: string, index?: string | number) => dispatcher.dispatch((dispatch: Dispatch, getState: () => IApplicationStoreState) => {
    const { configuration: { nodeId, lpId, indexValues } } = getState();
    const newIndexValues = typeof index === 'number' && indexValues
      ? indexValues.split('/').slice(0, index).join("/")
      : indexValues
        ? `${indexValues}${index ? `/${index}` : ''}`
        : index;
    dispatch(new NavigateToApplication("configuration", `${nodeId}/${lpId}/${viewId}${newIndexValues ? `/${newIndexValues}` : ''}`));

  }),
  changeNode: (ndoeId: string) => dispatcher.dispatch((dispatch: Dispatch) => {
    dispatch(new NavigateToApplication("configuration", ndoeId));
  }),
  changeLp: (lpId: string) => dispatcher.dispatch((dispatch: Dispatch, getState: () => IApplicationStoreState) => {
    const { configuration: { nodeId } } = getState();
    dispatch(new NavigateToApplication("configuration", `${nodeId}/${lpId}`));
  })
});

type ConfigurationApplicationProps = Connect<typeof mapProps, typeof mapDisp>;

type ConfigurationApplicationState = {

}

class ConfigurationApplicationComponent extends React.Component<ConfigurationApplicationProps, ConfigurationApplicationState> {

 render() {
    if (this.props.loading) {
      return (
        <h2>Collecting data from network element. Please wait ...</h2>
      );
    } else if (!this.props.nodeId) {
      return (
        <>
          <h2>Please select an network element to configure !</h2>
          <NetworkElementTable idProperty={"mountId"} rows={this.props.avaliableDevices} asynchronus
            onHandleClick={(evetm, rowData) => { this.props.changeNode(rowData.mountId) }} columns={
            [{ property:"mountId" }]
          } />
        </>
      );
    } else if (!this.props.lpId) {
      return this.props.coreModel && this.props.coreModel.ltp && this.props.coreModel.ltp.length
       ? (
        <>
          <h2>Please select an existing LP first !</h2>
          <ul>
            { this.props.coreModel.ltp.map(ltp => {
              return <li key={ltp.uuid}>
                <Link component="a" variant="body2" color="secondary" onClick={() => {
                  this.props.changeLp(ltp.lp[0].uuid);
                }}>{ltp.lp[0].label[0].value}</Link>
              </li>
            }) || null}
          </ul>
        </>
      ) 
      : (
        <>
         <h2>No LTP / LP found !</h2>
        </>
      );
    } else if (!this.props.capability && !this.props.viewId) {
      return (
        <h2>Please select a capability or viewId first !</h2>
      );
    }
    const viewData = this.props.viewData;
    const viewSpecification = this.props.viewId
      ? this.props.viewSpecifications.find(d => d.id === this.props.viewId)
      : this.props.viewSpecifications.find(d => d.name === this.props.conditionalPackage);

    return viewSpecification
      ? (
        <>
          <hgroup style={{ marginBottom: 15 }}>
            <h2>{`${this.props.nodeId} - ${this.props.lpId}`}</h2>
            {this.createBreadCrump(viewSpecification.id, this.props.viewSpecifications)}
          </hgroup>
          <div style={{ display: "flex", flexWrap: "wrap", overflow: "auto" }}>
            {

            (this.props.viewData && this.props.viewData instanceof Array)
              ? this.renderUIList(viewSpecification, viewData as { [key: string]: string | number }[])
              : this.renderUIElement(viewSpecification, viewData as { [key: string]: string | number })
          }
            {/* { <pre>{JSON.stringify(this.props.viewData, null, 2)} </pre> } */}

        </div>
        </>
      )
      : <h2>View [{this.props.viewId || this.props.conditionalPackage}] Not Found ! {this.props.viewSpecifications.length} </h2>;
  }

  private static keyPropertyParser = /\$\$INDEX:(\d+):?([a-z\-]+)?\$\$$/;
  private renderUIList = (viewSpecification: ViewSpecification, viewData: { [key: string]: string | number }[]) => {
    const keyMatch = ConfigurationApplicationComponent.keyPropertyParser.exec(viewSpecification.dataPath);
    const keyProperty = keyMatch && keyMatch[2];
    return (
      <Table>
        <TableHead>
          <TableRow>
            {viewSpecification.elements.map(uiElement => {
              switch (uiElement.uiType) {
                case "number":
                return (
                  <TableCell key={uiElement.id} align={"right"} >{uiElement.label}</TableCell>
                );
                case "selection":
                case "object":
                case "list":
                case "string":
                case "boolean":
                  return (
                    <TableCell key={uiElement.id} align={"left"} >{uiElement.label}</TableCell>
                  );
                default:
                  if (process.env.NODE_ENV !== "production") {
                    console.error(`Unknown column type - ${(uiElement as any).uiType} in ${(uiElement as any).id}.`)
                  }
                  return null;
              }
            })
            }
            <TableCell align={"right"} >Actions</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {viewData.map((row, ind) => (
            <TableRow key={keyProperty && row[keyProperty] || ind}>
              {viewSpecification.elements.map(uiElement => {
                switch (uiElement.uiType) {
                  case "string":
                  case "number":
                    return (
                      <TableCell key={uiElement.id} component="td" scope="row" align={uiElement.uiType === "number" ? "right" : "left"}>{row[uiElement.id] == null ? "---" : row[uiElement.id] } </TableCell>
                    );
                  case "boolean":
                    return (
                      <TableCell key={uiElement.id} component="td" scope="row" align={"left"} >{row[uiElement.id] == null ? "---" : row[uiElement.id] ? uiElement.trueValue || 'True' : uiElement.falseValue || 'False'} </TableCell>
                    );
                  case "list":
                  case "object":
                    return (
                      <TableCell key={uiElement.id} component="td" scope="row" align={"left"} >
                        <Tooltip title={uiElement.description || ''}>
                          <Link component="a" variant="body2" color="secondary" onClick={() => {
                            this.props.navigateTo(uiElement.viewId, String(ind));
                          }}>{uiElement.label}</Link>
                        </Tooltip></TableCell>
                    );
                  case "selection":
                    const option = row[uiElement.id] ? uiElement.options.find(opt => opt.key === row[uiElement.id]) : null;
                    return (
                      <TableCell key={uiElement.id} component="td" scope="row" align={"left"} >{option ? option.value : row[uiElement.id] == null ? "---" : row[uiElement.id]  } </TableCell>
                    );
                  default:
                    if (process.env.NODE_ENV !== "production") {
                      console.error(`Unknown column type - ${(uiElement as any).uiType} in ${(uiElement as any).id}.`)
                    }
                    return null;
                }
              })}
              <TableCell align={"right"} ><Button onClick={() => {
                this.props.navigateTo(this.props.viewId || '', String(/*keyProperty && row[keyProperty] || */ ind));
              }} >Details</Button>
              </TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    );
  }

  private renderUIElement = (viewSpecification: ViewSpecification, viewData: { [key: string]: string | number }) => (
    viewSpecification.elements.map(uiElement => {
      if (uiElement.leafrefPath) {
        return null;
      }
      switch (uiElement.uiType) {
        case "selection":
          return (viewData[uiElement.id] != null
            ? (<FormControl key={uiElement.id} style={{ width: 485, marginLeft: 20, marginRight: 20 }}>
              <InputLabel htmlFor={`select-${uiElement.id}`} >{uiElement.label}</InputLabel>
              <Select
                readOnly={ true }
                value={(viewData[uiElement.id] || '').toString().toLowerCase()}
                inputProps={{
                  name: uiElement.id,
                  id: `select-${uiElement.id}`,
                }}
              >
                {uiElement.options.map(option => (<MenuItem title={option.description} value={option.value}>{option.key}</MenuItem>))}
              </Select>
            </FormControl>)
            : null
          );
        case "boolean":
          return (viewData[uiElement.id] != null
            ? (<FormControl key={uiElement.id} style={{ width: 485, marginLeft: 20, marginRight: 20 }}>
              <InputLabel htmlFor={`select-${uiElement.id}`} >{uiElement.label}</InputLabel>
              <Select
                readOnly={ true }

                  value={String(viewData[uiElement.id]).toLowerCase()}
                  inputProps={{
                    name: uiElement.id,
                    id: `select-${uiElement.id}`,
                  }}
                >
                  <MenuItem value={'true'}>{uiElement.trueValue || 'True'}</MenuItem>
                  <MenuItem value={'false'}>{uiElement.falseValue || 'False'}</MenuItem>

                </Select>
            </FormControl>)
            : null
          );
        case "string":
          return (
            <Tooltip key={uiElement.id} title={uiElement.description || ''}>
              <TextField InputProps={{ readOnly: true }} spellCheck={false} autoFocus margin="dense"
                id={uiElement.id} label={uiElement.label} type="text" value={viewData[uiElement.id] || ''} style={{ width: 485, marginLeft: 20, marginRight: 20 }} />
            </Tooltip>
          );
        case "number":
          return (
            <Tooltip key={uiElement.id} title={uiElement.description || ''}>
              <TextField InputProps={{ readOnly: true, startAdornment: uiElement.unit != null ? <InputAdornment position="start">{uiElement.unit}</InputAdornment> : undefined }} spellCheck={false} autoFocus margin="dense"
                id={uiElement.id} label={uiElement.label} type="text" value={viewData[uiElement.id] || ''} style={{ width: 485, marginLeft: 20, marginRight: 20 }} />
            </Tooltip>
          );
        case "list":
        case "object":
          return (
            <Tooltip key={uiElement.id} title={uiElement.description || ''}>
              <Link component="a" variant="body2" color="secondary" style={{ width: 485, marginLeft: 20, marginRight: 20 }}  onClick={() => {
                this.props.navigateTo(uiElement.viewId);
              }}>{uiElement.label}</Link>
            </Tooltip>
          );
        default:
          if (process.env.NODE_ENV !== "production") {
            console.error(`Unknown type - ${(uiElement as any).uiType} in ${(uiElement as any).id}.`)
          }
          return null;
      }
    })
  )

  private createBreadCrump = (viewId: string, viewSpecifications: ViewSpecification[]) => {
    const result: JSX.Element[] = [];
    const hasIndex = /\/\$\$INDEX:(\d+):?([a-z\-]+)?\$\$/i;
    let currentViewSpecification = viewSpecifications.find(s => s.id === viewId);
    let indexCounter = 0;
    while (currentViewSpecification != null) {
      const currentViewId = currentViewSpecification.id;
      const currentDataPathHasIndex = hasIndex.test(currentViewSpecification.dataPath);
      result.unshift((
        <span>
          <Link component="a" variant="body2" color="secondary" onClick={() => {
            this.props.navigateTo(currentViewId, currentDataPathHasIndex ? ++indexCounter : indexCounter);
          }}>{currentViewSpecification.name}</Link>
          {viewId === currentViewId ? null : " | "}
        </span>
      ));
      currentViewSpecification = viewSpecifications.find(s => s.id === (currentViewSpecification && currentViewSpecification.parentView || ''));
    }
    return result;
  }
}

export const ConfigurationApplication = connect(mapProps, mapDisp)(ConfigurationApplicationComponent);
export default ConfigurationApplication;