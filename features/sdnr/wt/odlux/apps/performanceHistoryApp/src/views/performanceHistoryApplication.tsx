import * as React from 'react';

import { createStyles, Theme, withStyles, WithStyles } from '@material-ui/core/styles';
import FormControl from '@material-ui/core/FormControl';
import MenuItem from '@material-ui/core/MenuItem';
import Select from '@material-ui/core/Select';

import connect, { Connect, IDispatcher } from '../../../../framework/src/flux/connect';
import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import { Panel } from '../../../../framework/src/components/material-ui';

import { PanelId } from '../models/panelId';
import { PerformanceData } from '../components/performanceData';
import { ReceiveLevel } from '../components/receiveLevel';
import { TransmissionPower } from '../components/transmissionPower';
import { AdaptiveModulation } from '../components/adaptiveModulation';
import { Temperature } from '../components/temperature';
import { SignalToInterference } from '../components/signalToInterference';
import { CrossPolarDiscrimination } from '../components/crossPolarDiscrimination';
import { loadAllConnectedNetworkElementsAsync } from '../actions/connectedNetworkElementsActions';
import { loadDistinctLtpsbyNetworkElementAsync } from '../actions/ltpAction';
import { SetPanelAction } from '../actions/panelChangeActions';
import { createPerformanceData15minPreActions, performanceData15minReloadAction } from '../handlers/performanceData15minHandler';
import { createPerformanceData24hoursPreActions, performanceData24hoursReloadAction } from '../handlers/performanceData24hoursHandler';
import { createReceiveLevel15minPreActions, receiveLevel15minReloadAction } from '../handlers/receiveLevel15minHandler';
import { createReceiveLevel24hoursPreActions, receiveLevel24hoursReloadAction } from '../handlers/receiveLevel24hoursHandler';
import { createTransmissionPower15minPreActions, transmissionPower15minReloadAction } from '../handlers/transmissionPower15minHandler';
import { createTransmissionPower24hoursPreActions, transmissionPower24hoursReloadAction } from '../handlers/transmissionPower24hoursHandler';
import { createAdaptiveModulation15minPreActions, adaptiveModulation15minReloadAction } from '../handlers/adaptiveModulation15minHandler';
import { createAdaptiveModulation24hoursPreActions, adaptiveModulation24hoursReloadAction } from '../handlers/adaptiveModulation24hoursHandler';
import { createTemperature15minPreActions, temperature15minReloadAction } from '../handlers/temperature15minHandler';
import { createTemperature24hoursPreActions, temperature24hoursReloadAction } from '../handlers/temperature24hoursHandler';
import { createSignalToInterference15minPreActions, signalToInterference15minReloadAction } from '../handlers/signalToInterference15minHandler';
import { createSignalToInterference24hoursPreActions, signalToInterference24hoursReloadAction } from '../handlers/signalToInterference24hoursHandler';
import { createCrossPolarDiscrimination15minPreActions, crossPolarDiscrimination15minReloadAction } from '../handlers/crossPolarDiscrimination15minHandler';
import { createCrossPolarDiscrimination24hoursPreActions, crossPolarDiscrimination24hoursReloadAction } from '../handlers/crossPolarDiscrimination24hoursHandler';

const PerformanceHistoryComponentStyles = (theme: Theme) => createStyles({
  root: {
    display: "flex",
    flexWrap: "wrap",
  },
  margin: {
    margin: theme.spacing.unit,
  },
  display: {
    display: "inline-block"
  },
  selectDropdown: {
    borderRadius: 1,
    position: "relative",
    backgroundColor: theme.palette.background.paper,
    border: "1px solid #ced4da",
    fontSize: 16,
    width: "auto",
    padding: "5px 26px 5px 12px",
    transition: theme.transitions.create(["border-color", "box-shadow"]),
  }
});

const mapProps = (state: IApplicationStoreState) => ({
  activePanel: state.performanceHistory.currentOpenPanel,
  availableLtps: state.performanceHistory.ltps.distinctLtps,
  networkElements: state.performanceHistory.networkElements.connectedNetworkElements
});

const mapDispatcher = (dispatcher: IDispatcher) => ({
  reloadPerformanceData15min: () => dispatcher.dispatch(performanceData15minReloadAction),
  reloadPerformanceData24hours: () => dispatcher.dispatch(performanceData24hoursReloadAction),
  reloadReceiveLevel15min: () => dispatcher.dispatch(receiveLevel15minReloadAction),
  reloadReceiveLevel24hours: () => dispatcher.dispatch(receiveLevel24hoursReloadAction),
  reloadTransmissionPower15min: () => dispatcher.dispatch(transmissionPower15minReloadAction),
  reloadTransmissionPower24hours: () => dispatcher.dispatch(transmissionPower24hoursReloadAction),
  reloadAdaptiveModulation15min: () => dispatcher.dispatch(adaptiveModulation15minReloadAction),
  reloadAdaptiveModulation24hours: () => dispatcher.dispatch(adaptiveModulation24hoursReloadAction),
  reloadTemperature15min: () => dispatcher.dispatch(temperature15minReloadAction),
  reloadTemperature24hours: () => dispatcher.dispatch(temperature24hoursReloadAction),
  reloadSignalToInterference15min: () => dispatcher.dispatch(signalToInterference15minReloadAction),
  reloadSignalToInterference24hours: () => dispatcher.dispatch(signalToInterference24hoursReloadAction),
  reloadCrossPolarDiscrimination15min: () => dispatcher.dispatch(crossPolarDiscrimination15minReloadAction),
  reloadCrossPolarDiscrimination24hours: () => dispatcher.dispatch(crossPolarDiscrimination24hoursReloadAction),
  performanceData15minPreActions: createPerformanceData15minPreActions(dispatcher.dispatch),
  performanceData24hoursPreActions: createPerformanceData24hoursPreActions(dispatcher.dispatch),
  receiveLevel15minPreActions: createReceiveLevel15minPreActions(dispatcher.dispatch),
  receiveLevel24hoursPreActions: createReceiveLevel24hoursPreActions(dispatcher.dispatch),
  transmissionPower15minPreActions: createTransmissionPower15minPreActions(dispatcher.dispatch),
  transmissionPower24hoursPreActions: createTransmissionPower24hoursPreActions(dispatcher.dispatch),
  adaptiveModulation15minPreActions: createAdaptiveModulation15minPreActions(dispatcher.dispatch),
  adaptiveModulation24hoursPreActions: createAdaptiveModulation24hoursPreActions(dispatcher.dispatch),
  temperature15minPreActions: createTemperature15minPreActions(dispatcher.dispatch),
  temperature24hoursPreActions: createTemperature24hoursPreActions(dispatcher.dispatch),
  signalToInterference15minPreActions: createSignalToInterference15minPreActions(dispatcher.dispatch),
  signalToInterference24hoursPreActions: createSignalToInterference24hoursPreActions(dispatcher.dispatch),
  crossPolarDiscrimination15minPreActions: createCrossPolarDiscrimination15minPreActions(dispatcher.dispatch),
  crossPolarDiscrimination24hoursPreActions: createCrossPolarDiscrimination24hoursPreActions(dispatcher.dispatch),
  getConnectedNetworkElements: () => dispatcher.dispatch(loadAllConnectedNetworkElementsAsync),
  getDistinctLtps: (selectedNetworkElement: string, selectedTimePeriod: string, selectedLtp: string, selectFirstLtp?: Function, resetLTP?: Function) => dispatcher.dispatch(loadDistinctLtpsbyNetworkElementAsync(selectedNetworkElement, selectedTimePeriod, selectedLtp, selectFirstLtp, resetLTP)),
  setCurrentPanel: (panelId: PanelId) => dispatcher.dispatch(new SetPanelAction(panelId))
});

type PerformanceHistoryComponentProps = Connect<typeof mapProps, typeof mapDispatcher> & WithStyles<typeof PerformanceHistoryComponentStyles>;

type PerformanceHistoryComponentState = {
  selectedNetworkElement: string,
  selectedTimePeriod: string,
  selectedLtp: string,
  showLtps: boolean,
  showPanels: boolean
};

/**
 * Represents the component for Performance history application.
 */
class PerformanceHistoryComponent extends React.Component<PerformanceHistoryComponentProps, PerformanceHistoryComponentState>{
  /**
  * Initialises this instance
  */
  constructor(props: PerformanceHistoryComponentProps) {
    super(props);
    this.state = {
      selectedNetworkElement: "-1",
      selectedTimePeriod: "15min",
      selectedLtp: "-1",
      showLtps: false,
      showPanels: false
    };
  }

  render(): JSX.Element {
    const { classes } = this.props;
    const { activePanel } = this.props;

    const onTogglePanel = (panelId: PanelId) => {
      const nextActivePanel = panelId === this.props.activePanel ? null : panelId;
      this.props.setCurrentPanel(nextActivePanel);
      switch (nextActivePanel) {
        case "PerformanceData":
          if (this.state.selectedTimePeriod == "15min") {
            this.props.reloadPerformanceData15min();
          } else {

            this.props.reloadPerformanceData24hours();
          }
          break;
        case "ReceiveLevel":
          if (this.state.selectedTimePeriod == "15min") {
            this.props.reloadReceiveLevel15min();
          } else {
            this.props.reloadReceiveLevel24hours();
          }
          break;
        case "TransmissionPower":
          if (this.state.selectedTimePeriod == "15min") {
            this.props.reloadTransmissionPower15min();
          } else {
            this.props.reloadTransmissionPower24hours();
          }
          break;
        case "AdaptiveModulation":
          if (this.state.selectedTimePeriod == "15min") {
            this.props.reloadAdaptiveModulation15min();
          } else {
            this.props.reloadAdaptiveModulation24hours();
          }
          break;
        case "Temperature":
          if (this.state.selectedTimePeriod == "15min") {
            this.props.reloadTemperature15min();
          } else {
            this.props.reloadTemperature24hours();
          }
          break;
        case "SINR":
          if (this.state.selectedTimePeriod == "15min") {
            this.props.reloadSignalToInterference15min();
          } else {
            this.props.reloadSignalToInterference24hours();
          }
          break;
        case "CPD":
          if (this.state.selectedTimePeriod == "15min") {
            this.props.reloadCrossPolarDiscrimination15min();
          } else {
            this.props.reloadCrossPolarDiscrimination24hours();
          }
          break;
        case null:
          break;
        default:
          break;
      }
    }

    return (
      <>
        <div>
          <form className={ classes.root } autoComplete="off">
            <FormControl className={ classes.margin }>
              <span> Select Network element </span>
              <Select className={ classes.selectDropdown } value={ this.state.selectedNetworkElement } onChange={ this.handleNetworkElementChange }
              >
                <MenuItem value={ "-1" }><em>--Select--</em></MenuItem>
                { this.props.networkElements.map(ne =>
                  (<MenuItem value={ ne.mountId } key={ ne.mountId }>{ ne.mountId }</MenuItem>))}
              </Select>
            </FormControl>
          </form>
        </div>
        { this.state.showLtps && (
          <div>
            <FormControl className={ classes.display }>
              <span>
                Select LTP
              </span>
              <Select className={ classes.selectDropdown } value={ this.state.selectedLtp } onChange={ this.handleLtpChange }  >
                <MenuItem value={ "-1" }><em>--Select--</em></MenuItem>
                { this.props.availableLtps.map(ltp =>
                  (<MenuItem value={ltp.key} key={ltp.key}>{ltp.key}</MenuItem>)) }
              </Select>
              <span> Time-Period </span>
              <Select className={ classes.selectDropdown } value={ this.state.selectedTimePeriod } onChange={ this.handleTimePeriodChange } >
                <MenuItem value={ "15min" }>15min</MenuItem>
                <MenuItem value={ "24hours" }>24hours</MenuItem>
              </Select>
            </FormControl>
            { this.state.showPanels && (
              <div>
                <Panel activePanel={ activePanel } panelId={ "PerformanceData" } onToggle={ onTogglePanel } title={ "Performance Data" }>
                  <PerformanceData selectedTimePeriod={ this.state.selectedTimePeriod} />
                </Panel>
                <Panel activePanel={ activePanel } panelId={ "ReceiveLevel" } onToggle={ onTogglePanel } title={ "Receive Level" }>
                  <ReceiveLevel selectedTimePeriod={ this.state.selectedTimePeriod} />
                </Panel>
                <Panel activePanel={ activePanel } panelId={ "TransmissionPower" } onToggle={ onTogglePanel } title={ "Transmission Power" }>
                  <TransmissionPower selectedTimePeriod={ this.state.selectedTimePeriod} />
                </Panel>
                <Panel activePanel={ activePanel } panelId={ "AdaptiveModulation" } onToggle={ onTogglePanel } title={ "Adaptive Modulation" }>
                  <AdaptiveModulation selectedTimePeriod={ this.state.selectedTimePeriod} />
                </Panel>
                <Panel activePanel={ activePanel } panelId={ "Temperature" } onToggle={ onTogglePanel } title={ "Temperature" }>
                  <Temperature selectedTimePeriod={ this.state.selectedTimePeriod} />
                </Panel>
                <Panel activePanel={ activePanel } panelId={ "SINR" } onToggle={ onTogglePanel } title={ "Signal-to-interference-plus-noise ratio (SINR)" }>
                  <SignalToInterference selectedTimePeriod={ this.state.selectedTimePeriod} />
                </Panel>
                <Panel activePanel={ activePanel } panelId={ "CPD" } onToggle={ onTogglePanel } title={ "Cross Polar Discrimination" }>
                  <CrossPolarDiscrimination selectedTimePeriod={ this.state.selectedTimePeriod } />
                </Panel>
              </div>
            )}
          </div>
        )}
      </>
    );
  };

  public componentDidMount() {
    this.props.getConnectedNetworkElements();
  }

  /**
   * Function which selects the first ltp returned from the database on selection of network element.
   */
  private selectFirstLtp = (firstLtp: string) => {
    this.setState({
      showPanels: true,
      selectedLtp: firstLtp
    });
    this.preFilterChangeAndReload(this.state.selectedNetworkElement, this.state.selectedTimePeriod, firstLtp);
  }

  /**
   * A function which loads the tables based on prefilters defined by network element and ltp on selected time period.
   */
  private preFilterChangeAndReload = (networkElement: string, timePeriod: string, ltp: string) => {
    const preFilter = {
      "node-name": networkElement,
      "uuid-interface": ltp
    };
    if (timePeriod == "15min") {
      this.props.performanceData15minPreActions.onPreFilterChanged(preFilter);
      this.props.receiveLevel15minPreActions.onPreFilterChanged(preFilter);
      this.props.transmissionPower15minPreActions.onPreFilterChanged(preFilter);
      this.props.adaptiveModulation15minPreActions.onPreFilterChanged(preFilter);
      this.props.temperature15minPreActions.onPreFilterChanged(preFilter);
      this.props.signalToInterference15minPreActions.onPreFilterChanged(preFilter);
      this.props.crossPolarDiscrimination15minPreActions.onPreFilterChanged(preFilter);
    } else if (timePeriod == "24hours") {
      this.props.performanceData24hoursPreActions.onPreFilterChanged(preFilter);
      this.props.receiveLevel24hoursPreActions.onPreFilterChanged(preFilter);
      this.props.transmissionPower24hoursPreActions.onPreFilterChanged(preFilter);
      this.props.adaptiveModulation24hoursPreActions.onPreFilterChanged(preFilter);
      this.props.temperature24hoursPreActions.onPreFilterChanged(preFilter);
      this.props.signalToInterference24hoursPreActions.onPreFilterChanged(preFilter);
      this.props.crossPolarDiscrimination24hoursPreActions.onPreFilterChanged(preFilter);
    }
  }

  /**
   * Function which handles network element changes.
   */
  private handleNetworkElementChange = (event: React.ChangeEvent<HTMLSelectElement>) => {
    var showLtps: boolean = true;
    if (event.target.value === "-1") {
      showLtps = false;
    } else if (event.target.value !== this.state.selectedNetworkElement) {
      this.setState({
        showPanels: false
      });
    }
    this.setState({
      showLtps: showLtps,
      selectedNetworkElement: event.target.value,
      selectedLtp: "-1"
    });
    this.props.getDistinctLtps(event.target.value, this.state.selectedTimePeriod, "-1", this.selectFirstLtp);
  }

  /**
   * Function which resets the ltps to "--select--" in the state if the passed parameter @ltpNotSelected is true.
   * @param ltpNotSelected: true, if existing selected is not available in the given time period, else false
   */
  private resetLtpDropdown = (ltpNotSelected: boolean) => {
    if (ltpNotSelected) {
      this.setState({
        selectedLtp: "-1",
      });
    }
  }

  /**
   * Function which handles the time period changes.
   */
  private handleTimePeriodChange = (event: React.ChangeEvent<HTMLSelectElement>) => {
    this.setState({
      selectedTimePeriod: event.target.value,
    });
    if (event.target.value == "15min") {
      this.props.getDistinctLtps(this.state.selectedNetworkElement, event.target.value, this.state.selectedLtp, undefined, this.resetLtpDropdown);
    } else if (event.target.value == "24hours") {
      this.props.getDistinctLtps(this.state.selectedNetworkElement, event.target.value, this.state.selectedLtp, undefined, this.resetLtpDropdown);
    }
    this.preFilterChangeAndReload(this.state.selectedNetworkElement, event.target.value, this.state.selectedLtp);
  }

  /**
   * Function which handles the ltp changes.
   */
  private handleLtpChange = (event: React.ChangeEvent<HTMLSelectElement>) => {
    var showPanels: boolean = true;
    if (event.target.value === "-1") {
      showPanels = false;
    }
    this.setState({
      showPanels: showPanels,
      selectedLtp: event.target.value
    });
    this.preFilterChangeAndReload(this.state.selectedNetworkElement, this.state.selectedTimePeriod, event.target.value);
  }
}

export const PerformanceHistoryApplication = withStyles(PerformanceHistoryComponentStyles)(connect(mapProps, mapDispatcher)(PerformanceHistoryComponent));
export default PerformanceHistoryApplication;
