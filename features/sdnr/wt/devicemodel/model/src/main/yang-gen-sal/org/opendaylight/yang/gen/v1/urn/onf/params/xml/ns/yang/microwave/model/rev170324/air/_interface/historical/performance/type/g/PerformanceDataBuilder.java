package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData
 *
 */
public class PerformanceDataBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData> {

    private java.lang.Integer _cses;
    private java.lang.Short _defectBlocksSum;
    private java.lang.Integer _es;
    private java.lang.Byte _rfTempAvg;
    private java.lang.Byte _rfTempMax;
    private java.lang.Byte _rfTempMin;
    private java.lang.Byte _rxLevelAvg;
    private java.lang.Byte _rxLevelMax;
    private java.lang.Byte _rxLevelMin;
    private java.lang.Integer _ses;
    private java.lang.Byte _snirAvg;
    private java.lang.Byte _snirMax;
    private java.lang.Byte _snirMin;
    private java.lang.Integer _time1024States;
    private java.lang.Integer _time1024StatesL;
    private java.lang.Integer _time128States;
    private java.lang.Integer _time16States;
    private java.lang.Integer _time16StatesS;
    private java.lang.Integer _time2048States;
    private java.lang.Integer _time2048StatesL;
    private java.lang.Integer _time256States;
    private java.lang.Integer _time2States;
    private java.lang.Integer _time32States;
    private java.lang.Integer _time4096States;
    private java.lang.Integer _time4096StatesL;
    private java.lang.Integer _time4States;
    private java.lang.Integer _time4StatesS;
    private java.lang.Integer _time512States;
    private java.lang.Integer _time512StatesL;
    private java.lang.Integer _time64States;
    private java.lang.Integer _time8192States;
    private java.lang.Integer _time8192StatesL;
    private java.lang.Integer _time8States;
    private java.lang.Integer _timePeriod;
    private java.lang.Byte _txLevelAvg;
    private java.lang.Byte _txLevelMax;
    private java.lang.Byte _txLevelMin;
    private java.lang.Integer _unavailability;
    private java.lang.Byte _xpdAvg;
    private java.lang.Byte _xpdMax;
    private java.lang.Byte _xpdMin;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>> augmentation = Collections.emptyMap();

    public PerformanceDataBuilder() {
    }
    public PerformanceDataBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG arg) {
        this._es = arg.getEs();
        this._ses = arg.getSes();
        this._cses = arg.getCses();
        this._unavailability = arg.getUnavailability();
        this._txLevelMin = arg.getTxLevelMin();
        this._txLevelMax = arg.getTxLevelMax();
        this._txLevelAvg = arg.getTxLevelAvg();
        this._rxLevelMin = arg.getRxLevelMin();
        this._rxLevelMax = arg.getRxLevelMax();
        this._rxLevelAvg = arg.getRxLevelAvg();
        this._time2States = arg.getTime2States();
        this._time4StatesS = arg.getTime4StatesS();
        this._time4States = arg.getTime4States();
        this._time8States = arg.getTime8States();
        this._time16StatesS = arg.getTime16StatesS();
        this._time16States = arg.getTime16States();
        this._time32States = arg.getTime32States();
        this._time64States = arg.getTime64States();
        this._time128States = arg.getTime128States();
        this._time256States = arg.getTime256States();
        this._time512States = arg.getTime512States();
        this._time512StatesL = arg.getTime512StatesL();
        this._time1024States = arg.getTime1024States();
        this._time1024StatesL = arg.getTime1024StatesL();
        this._time2048States = arg.getTime2048States();
        this._time2048StatesL = arg.getTime2048StatesL();
        this._time4096States = arg.getTime4096States();
        this._time4096StatesL = arg.getTime4096StatesL();
        this._time8192States = arg.getTime8192States();
        this._time8192StatesL = arg.getTime8192StatesL();
        this._snirMin = arg.getSnirMin();
        this._snirMax = arg.getSnirMax();
        this._snirAvg = arg.getSnirAvg();
        this._xpdMin = arg.getXpdMin();
        this._xpdMax = arg.getXpdMax();
        this._xpdAvg = arg.getXpdAvg();
        this._rfTempMin = arg.getRfTempMin();
        this._rfTempMax = arg.getRfTempMax();
        this._rfTempAvg = arg.getRfTempAvg();
        this._defectBlocksSum = arg.getDefectBlocksSum();
        this._timePeriod = arg.getTimePeriod();
    }

    public PerformanceDataBuilder(PerformanceData base) {
        this._cses = base.getCses();
        this._defectBlocksSum = base.getDefectBlocksSum();
        this._es = base.getEs();
        this._rfTempAvg = base.getRfTempAvg();
        this._rfTempMax = base.getRfTempMax();
        this._rfTempMin = base.getRfTempMin();
        this._rxLevelAvg = base.getRxLevelAvg();
        this._rxLevelMax = base.getRxLevelMax();
        this._rxLevelMin = base.getRxLevelMin();
        this._ses = base.getSes();
        this._snirAvg = base.getSnirAvg();
        this._snirMax = base.getSnirMax();
        this._snirMin = base.getSnirMin();
        this._time1024States = base.getTime1024States();
        this._time1024StatesL = base.getTime1024StatesL();
        this._time128States = base.getTime128States();
        this._time16States = base.getTime16States();
        this._time16StatesS = base.getTime16StatesS();
        this._time2048States = base.getTime2048States();
        this._time2048StatesL = base.getTime2048StatesL();
        this._time256States = base.getTime256States();
        this._time2States = base.getTime2States();
        this._time32States = base.getTime32States();
        this._time4096States = base.getTime4096States();
        this._time4096StatesL = base.getTime4096StatesL();
        this._time4States = base.getTime4States();
        this._time4StatesS = base.getTime4StatesS();
        this._time512States = base.getTime512States();
        this._time512StatesL = base.getTime512StatesL();
        this._time64States = base.getTime64States();
        this._time8192States = base.getTime8192States();
        this._time8192StatesL = base.getTime8192StatesL();
        this._time8States = base.getTime8States();
        this._timePeriod = base.getTimePeriod();
        this._txLevelAvg = base.getTxLevelAvg();
        this._txLevelMax = base.getTxLevelMax();
        this._txLevelMin = base.getTxLevelMin();
        this._unavailability = base.getUnavailability();
        this._xpdAvg = base.getXpdAvg();
        this._xpdMax = base.getXpdMax();
        this._xpdMin = base.getXpdMin();
        if (base instanceof PerformanceDataImpl) {
            PerformanceDataImpl impl = (PerformanceDataImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG) {
            this._es = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getEs();
            this._ses = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getSes();
            this._cses = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getCses();
            this._unavailability = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getUnavailability();
            this._txLevelMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTxLevelMin();
            this._txLevelMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTxLevelMax();
            this._txLevelAvg = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTxLevelAvg();
            this._rxLevelMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getRxLevelMin();
            this._rxLevelMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getRxLevelMax();
            this._rxLevelAvg = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getRxLevelAvg();
            this._time2States = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime2States();
            this._time4StatesS = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime4StatesS();
            this._time4States = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime4States();
            this._time8States = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime8States();
            this._time16StatesS = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime16StatesS();
            this._time16States = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime16States();
            this._time32States = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime32States();
            this._time64States = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime64States();
            this._time128States = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime128States();
            this._time256States = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime256States();
            this._time512States = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime512States();
            this._time512StatesL = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime512StatesL();
            this._time1024States = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime1024States();
            this._time1024StatesL = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime1024StatesL();
            this._time2048States = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime2048States();
            this._time2048StatesL = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime2048StatesL();
            this._time4096States = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime4096States();
            this._time4096StatesL = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime4096StatesL();
            this._time8192States = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime8192States();
            this._time8192StatesL = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTime8192StatesL();
            this._snirMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getSnirMin();
            this._snirMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getSnirMax();
            this._snirAvg = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getSnirAvg();
            this._xpdMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getXpdMin();
            this._xpdMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getXpdMax();
            this._xpdAvg = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getXpdAvg();
            this._rfTempMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getRfTempMin();
            this._rfTempMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getRfTempMax();
            this._rfTempAvg = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getRfTempAvg();
            this._defectBlocksSum = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getDefectBlocksSum();
            this._timePeriod = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG)arg).getTimePeriod();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfacePerformanceTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getCses() {
        return _cses;
    }
    
    public java.lang.Short getDefectBlocksSum() {
        return _defectBlocksSum;
    }
    
    public java.lang.Integer getEs() {
        return _es;
    }
    
    public java.lang.Byte getRfTempAvg() {
        return _rfTempAvg;
    }
    
    public java.lang.Byte getRfTempMax() {
        return _rfTempMax;
    }
    
    public java.lang.Byte getRfTempMin() {
        return _rfTempMin;
    }
    
    public java.lang.Byte getRxLevelAvg() {
        return _rxLevelAvg;
    }
    
    public java.lang.Byte getRxLevelMax() {
        return _rxLevelMax;
    }
    
    public java.lang.Byte getRxLevelMin() {
        return _rxLevelMin;
    }
    
    public java.lang.Integer getSes() {
        return _ses;
    }
    
    public java.lang.Byte getSnirAvg() {
        return _snirAvg;
    }
    
    public java.lang.Byte getSnirMax() {
        return _snirMax;
    }
    
    public java.lang.Byte getSnirMin() {
        return _snirMin;
    }
    
    public java.lang.Integer getTime1024States() {
        return _time1024States;
    }
    
    public java.lang.Integer getTime1024StatesL() {
        return _time1024StatesL;
    }
    
    public java.lang.Integer getTime128States() {
        return _time128States;
    }
    
    public java.lang.Integer getTime16States() {
        return _time16States;
    }
    
    public java.lang.Integer getTime16StatesS() {
        return _time16StatesS;
    }
    
    public java.lang.Integer getTime2048States() {
        return _time2048States;
    }
    
    public java.lang.Integer getTime2048StatesL() {
        return _time2048StatesL;
    }
    
    public java.lang.Integer getTime256States() {
        return _time256States;
    }
    
    public java.lang.Integer getTime2States() {
        return _time2States;
    }
    
    public java.lang.Integer getTime32States() {
        return _time32States;
    }
    
    public java.lang.Integer getTime4096States() {
        return _time4096States;
    }
    
    public java.lang.Integer getTime4096StatesL() {
        return _time4096StatesL;
    }
    
    public java.lang.Integer getTime4States() {
        return _time4States;
    }
    
    public java.lang.Integer getTime4StatesS() {
        return _time4StatesS;
    }
    
    public java.lang.Integer getTime512States() {
        return _time512States;
    }
    
    public java.lang.Integer getTime512StatesL() {
        return _time512StatesL;
    }
    
    public java.lang.Integer getTime64States() {
        return _time64States;
    }
    
    public java.lang.Integer getTime8192States() {
        return _time8192States;
    }
    
    public java.lang.Integer getTime8192StatesL() {
        return _time8192StatesL;
    }
    
    public java.lang.Integer getTime8States() {
        return _time8States;
    }
    
    public java.lang.Integer getTimePeriod() {
        return _timePeriod;
    }
    
    public java.lang.Byte getTxLevelAvg() {
        return _txLevelAvg;
    }
    
    public java.lang.Byte getTxLevelMax() {
        return _txLevelMax;
    }
    
    public java.lang.Byte getTxLevelMin() {
        return _txLevelMin;
    }
    
    public java.lang.Integer getUnavailability() {
        return _unavailability;
    }
    
    public java.lang.Byte getXpdAvg() {
        return _xpdAvg;
    }
    
    public java.lang.Byte getXpdMax() {
        return _xpdMax;
    }
    
    public java.lang.Byte getXpdMin() {
        return _xpdMin;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PerformanceDataBuilder setCses(final java.lang.Integer value) {
        this._cses = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setDefectBlocksSum(final java.lang.Short value) {
        this._defectBlocksSum = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setEs(final java.lang.Integer value) {
        this._es = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setRfTempAvg(final java.lang.Byte value) {
        this._rfTempAvg = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setRfTempMax(final java.lang.Byte value) {
        this._rfTempMax = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setRfTempMin(final java.lang.Byte value) {
        this._rfTempMin = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setRxLevelAvg(final java.lang.Byte value) {
        this._rxLevelAvg = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setRxLevelMax(final java.lang.Byte value) {
        this._rxLevelMax = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setRxLevelMin(final java.lang.Byte value) {
        this._rxLevelMin = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setSes(final java.lang.Integer value) {
        this._ses = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setSnirAvg(final java.lang.Byte value) {
        this._snirAvg = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setSnirMax(final java.lang.Byte value) {
        this._snirMax = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setSnirMin(final java.lang.Byte value) {
        this._snirMin = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime1024States(final java.lang.Integer value) {
        this._time1024States = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime1024StatesL(final java.lang.Integer value) {
        this._time1024StatesL = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime128States(final java.lang.Integer value) {
        this._time128States = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime16States(final java.lang.Integer value) {
        this._time16States = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime16StatesS(final java.lang.Integer value) {
        this._time16StatesS = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime2048States(final java.lang.Integer value) {
        this._time2048States = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime2048StatesL(final java.lang.Integer value) {
        this._time2048StatesL = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime256States(final java.lang.Integer value) {
        this._time256States = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime2States(final java.lang.Integer value) {
        this._time2States = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime32States(final java.lang.Integer value) {
        this._time32States = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime4096States(final java.lang.Integer value) {
        this._time4096States = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime4096StatesL(final java.lang.Integer value) {
        this._time4096StatesL = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime4States(final java.lang.Integer value) {
        this._time4States = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime4StatesS(final java.lang.Integer value) {
        this._time4StatesS = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime512States(final java.lang.Integer value) {
        this._time512States = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime512StatesL(final java.lang.Integer value) {
        this._time512StatesL = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime64States(final java.lang.Integer value) {
        this._time64States = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime8192States(final java.lang.Integer value) {
        this._time8192States = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime8192StatesL(final java.lang.Integer value) {
        this._time8192StatesL = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTime8States(final java.lang.Integer value) {
        this._time8States = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTimePeriod(final java.lang.Integer value) {
        this._timePeriod = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTxLevelAvg(final java.lang.Byte value) {
        this._txLevelAvg = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTxLevelMax(final java.lang.Byte value) {
        this._txLevelMax = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTxLevelMin(final java.lang.Byte value) {
        this._txLevelMin = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setUnavailability(final java.lang.Integer value) {
        this._unavailability = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setXpdAvg(final java.lang.Byte value) {
        this._xpdAvg = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setXpdMax(final java.lang.Byte value) {
        this._xpdMax = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setXpdMin(final java.lang.Byte value) {
        this._xpdMin = value;
        return this;
    }
    
    public PerformanceDataBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PerformanceDataBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PerformanceData build() {
        return new PerformanceDataImpl(this);
    }

    private static final class PerformanceDataImpl implements PerformanceData {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData.class;
        }

        private final java.lang.Integer _cses;
        private final java.lang.Short _defectBlocksSum;
        private final java.lang.Integer _es;
        private final java.lang.Byte _rfTempAvg;
        private final java.lang.Byte _rfTempMax;
        private final java.lang.Byte _rfTempMin;
        private final java.lang.Byte _rxLevelAvg;
        private final java.lang.Byte _rxLevelMax;
        private final java.lang.Byte _rxLevelMin;
        private final java.lang.Integer _ses;
        private final java.lang.Byte _snirAvg;
        private final java.lang.Byte _snirMax;
        private final java.lang.Byte _snirMin;
        private final java.lang.Integer _time1024States;
        private final java.lang.Integer _time1024StatesL;
        private final java.lang.Integer _time128States;
        private final java.lang.Integer _time16States;
        private final java.lang.Integer _time16StatesS;
        private final java.lang.Integer _time2048States;
        private final java.lang.Integer _time2048StatesL;
        private final java.lang.Integer _time256States;
        private final java.lang.Integer _time2States;
        private final java.lang.Integer _time32States;
        private final java.lang.Integer _time4096States;
        private final java.lang.Integer _time4096StatesL;
        private final java.lang.Integer _time4States;
        private final java.lang.Integer _time4StatesS;
        private final java.lang.Integer _time512States;
        private final java.lang.Integer _time512StatesL;
        private final java.lang.Integer _time64States;
        private final java.lang.Integer _time8192States;
        private final java.lang.Integer _time8192StatesL;
        private final java.lang.Integer _time8States;
        private final java.lang.Integer _timePeriod;
        private final java.lang.Byte _txLevelAvg;
        private final java.lang.Byte _txLevelMax;
        private final java.lang.Byte _txLevelMin;
        private final java.lang.Integer _unavailability;
        private final java.lang.Byte _xpdAvg;
        private final java.lang.Byte _xpdMax;
        private final java.lang.Byte _xpdMin;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>> augmentation = Collections.emptyMap();

        private PerformanceDataImpl(PerformanceDataBuilder base) {
            this._cses = base.getCses();
            this._defectBlocksSum = base.getDefectBlocksSum();
            this._es = base.getEs();
            this._rfTempAvg = base.getRfTempAvg();
            this._rfTempMax = base.getRfTempMax();
            this._rfTempMin = base.getRfTempMin();
            this._rxLevelAvg = base.getRxLevelAvg();
            this._rxLevelMax = base.getRxLevelMax();
            this._rxLevelMin = base.getRxLevelMin();
            this._ses = base.getSes();
            this._snirAvg = base.getSnirAvg();
            this._snirMax = base.getSnirMax();
            this._snirMin = base.getSnirMin();
            this._time1024States = base.getTime1024States();
            this._time1024StatesL = base.getTime1024StatesL();
            this._time128States = base.getTime128States();
            this._time16States = base.getTime16States();
            this._time16StatesS = base.getTime16StatesS();
            this._time2048States = base.getTime2048States();
            this._time2048StatesL = base.getTime2048StatesL();
            this._time256States = base.getTime256States();
            this._time2States = base.getTime2States();
            this._time32States = base.getTime32States();
            this._time4096States = base.getTime4096States();
            this._time4096StatesL = base.getTime4096StatesL();
            this._time4States = base.getTime4States();
            this._time4StatesS = base.getTime4StatesS();
            this._time512States = base.getTime512States();
            this._time512StatesL = base.getTime512StatesL();
            this._time64States = base.getTime64States();
            this._time8192States = base.getTime8192States();
            this._time8192StatesL = base.getTime8192StatesL();
            this._time8States = base.getTime8States();
            this._timePeriod = base.getTimePeriod();
            this._txLevelAvg = base.getTxLevelAvg();
            this._txLevelMax = base.getTxLevelMax();
            this._txLevelMin = base.getTxLevelMin();
            this._unavailability = base.getUnavailability();
            this._xpdAvg = base.getXpdAvg();
            this._xpdMax = base.getXpdMax();
            this._xpdMin = base.getXpdMin();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getCses() {
            return _cses;
        }
        
        @Override
        public java.lang.Short getDefectBlocksSum() {
            return _defectBlocksSum;
        }
        
        @Override
        public java.lang.Integer getEs() {
            return _es;
        }
        
        @Override
        public java.lang.Byte getRfTempAvg() {
            return _rfTempAvg;
        }
        
        @Override
        public java.lang.Byte getRfTempMax() {
            return _rfTempMax;
        }
        
        @Override
        public java.lang.Byte getRfTempMin() {
            return _rfTempMin;
        }
        
        @Override
        public java.lang.Byte getRxLevelAvg() {
            return _rxLevelAvg;
        }
        
        @Override
        public java.lang.Byte getRxLevelMax() {
            return _rxLevelMax;
        }
        
        @Override
        public java.lang.Byte getRxLevelMin() {
            return _rxLevelMin;
        }
        
        @Override
        public java.lang.Integer getSes() {
            return _ses;
        }
        
        @Override
        public java.lang.Byte getSnirAvg() {
            return _snirAvg;
        }
        
        @Override
        public java.lang.Byte getSnirMax() {
            return _snirMax;
        }
        
        @Override
        public java.lang.Byte getSnirMin() {
            return _snirMin;
        }
        
        @Override
        public java.lang.Integer getTime1024States() {
            return _time1024States;
        }
        
        @Override
        public java.lang.Integer getTime1024StatesL() {
            return _time1024StatesL;
        }
        
        @Override
        public java.lang.Integer getTime128States() {
            return _time128States;
        }
        
        @Override
        public java.lang.Integer getTime16States() {
            return _time16States;
        }
        
        @Override
        public java.lang.Integer getTime16StatesS() {
            return _time16StatesS;
        }
        
        @Override
        public java.lang.Integer getTime2048States() {
            return _time2048States;
        }
        
        @Override
        public java.lang.Integer getTime2048StatesL() {
            return _time2048StatesL;
        }
        
        @Override
        public java.lang.Integer getTime256States() {
            return _time256States;
        }
        
        @Override
        public java.lang.Integer getTime2States() {
            return _time2States;
        }
        
        @Override
        public java.lang.Integer getTime32States() {
            return _time32States;
        }
        
        @Override
        public java.lang.Integer getTime4096States() {
            return _time4096States;
        }
        
        @Override
        public java.lang.Integer getTime4096StatesL() {
            return _time4096StatesL;
        }
        
        @Override
        public java.lang.Integer getTime4States() {
            return _time4States;
        }
        
        @Override
        public java.lang.Integer getTime4StatesS() {
            return _time4StatesS;
        }
        
        @Override
        public java.lang.Integer getTime512States() {
            return _time512States;
        }
        
        @Override
        public java.lang.Integer getTime512StatesL() {
            return _time512StatesL;
        }
        
        @Override
        public java.lang.Integer getTime64States() {
            return _time64States;
        }
        
        @Override
        public java.lang.Integer getTime8192States() {
            return _time8192States;
        }
        
        @Override
        public java.lang.Integer getTime8192StatesL() {
            return _time8192StatesL;
        }
        
        @Override
        public java.lang.Integer getTime8States() {
            return _time8States;
        }
        
        @Override
        public java.lang.Integer getTimePeriod() {
            return _timePeriod;
        }
        
        @Override
        public java.lang.Byte getTxLevelAvg() {
            return _txLevelAvg;
        }
        
        @Override
        public java.lang.Byte getTxLevelMax() {
            return _txLevelMax;
        }
        
        @Override
        public java.lang.Byte getTxLevelMin() {
            return _txLevelMin;
        }
        
        @Override
        public java.lang.Integer getUnavailability() {
            return _unavailability;
        }
        
        @Override
        public java.lang.Byte getXpdAvg() {
            return _xpdAvg;
        }
        
        @Override
        public java.lang.Byte getXpdMax() {
            return _xpdMax;
        }
        
        @Override
        public java.lang.Byte getXpdMin() {
            return _xpdMin;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_cses);
            result = prime * result + Objects.hashCode(_defectBlocksSum);
            result = prime * result + Objects.hashCode(_es);
            result = prime * result + Objects.hashCode(_rfTempAvg);
            result = prime * result + Objects.hashCode(_rfTempMax);
            result = prime * result + Objects.hashCode(_rfTempMin);
            result = prime * result + Objects.hashCode(_rxLevelAvg);
            result = prime * result + Objects.hashCode(_rxLevelMax);
            result = prime * result + Objects.hashCode(_rxLevelMin);
            result = prime * result + Objects.hashCode(_ses);
            result = prime * result + Objects.hashCode(_snirAvg);
            result = prime * result + Objects.hashCode(_snirMax);
            result = prime * result + Objects.hashCode(_snirMin);
            result = prime * result + Objects.hashCode(_time1024States);
            result = prime * result + Objects.hashCode(_time1024StatesL);
            result = prime * result + Objects.hashCode(_time128States);
            result = prime * result + Objects.hashCode(_time16States);
            result = prime * result + Objects.hashCode(_time16StatesS);
            result = prime * result + Objects.hashCode(_time2048States);
            result = prime * result + Objects.hashCode(_time2048StatesL);
            result = prime * result + Objects.hashCode(_time256States);
            result = prime * result + Objects.hashCode(_time2States);
            result = prime * result + Objects.hashCode(_time32States);
            result = prime * result + Objects.hashCode(_time4096States);
            result = prime * result + Objects.hashCode(_time4096StatesL);
            result = prime * result + Objects.hashCode(_time4States);
            result = prime * result + Objects.hashCode(_time4StatesS);
            result = prime * result + Objects.hashCode(_time512States);
            result = prime * result + Objects.hashCode(_time512StatesL);
            result = prime * result + Objects.hashCode(_time64States);
            result = prime * result + Objects.hashCode(_time8192States);
            result = prime * result + Objects.hashCode(_time8192StatesL);
            result = prime * result + Objects.hashCode(_time8States);
            result = prime * result + Objects.hashCode(_timePeriod);
            result = prime * result + Objects.hashCode(_txLevelAvg);
            result = prime * result + Objects.hashCode(_txLevelMax);
            result = prime * result + Objects.hashCode(_txLevelMin);
            result = prime * result + Objects.hashCode(_unavailability);
            result = prime * result + Objects.hashCode(_xpdAvg);
            result = prime * result + Objects.hashCode(_xpdMax);
            result = prime * result + Objects.hashCode(_xpdMin);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData)obj;
            if (!Objects.equals(_cses, other.getCses())) {
                return false;
            }
            if (!Objects.equals(_defectBlocksSum, other.getDefectBlocksSum())) {
                return false;
            }
            if (!Objects.equals(_es, other.getEs())) {
                return false;
            }
            if (!Objects.equals(_rfTempAvg, other.getRfTempAvg())) {
                return false;
            }
            if (!Objects.equals(_rfTempMax, other.getRfTempMax())) {
                return false;
            }
            if (!Objects.equals(_rfTempMin, other.getRfTempMin())) {
                return false;
            }
            if (!Objects.equals(_rxLevelAvg, other.getRxLevelAvg())) {
                return false;
            }
            if (!Objects.equals(_rxLevelMax, other.getRxLevelMax())) {
                return false;
            }
            if (!Objects.equals(_rxLevelMin, other.getRxLevelMin())) {
                return false;
            }
            if (!Objects.equals(_ses, other.getSes())) {
                return false;
            }
            if (!Objects.equals(_snirAvg, other.getSnirAvg())) {
                return false;
            }
            if (!Objects.equals(_snirMax, other.getSnirMax())) {
                return false;
            }
            if (!Objects.equals(_snirMin, other.getSnirMin())) {
                return false;
            }
            if (!Objects.equals(_time1024States, other.getTime1024States())) {
                return false;
            }
            if (!Objects.equals(_time1024StatesL, other.getTime1024StatesL())) {
                return false;
            }
            if (!Objects.equals(_time128States, other.getTime128States())) {
                return false;
            }
            if (!Objects.equals(_time16States, other.getTime16States())) {
                return false;
            }
            if (!Objects.equals(_time16StatesS, other.getTime16StatesS())) {
                return false;
            }
            if (!Objects.equals(_time2048States, other.getTime2048States())) {
                return false;
            }
            if (!Objects.equals(_time2048StatesL, other.getTime2048StatesL())) {
                return false;
            }
            if (!Objects.equals(_time256States, other.getTime256States())) {
                return false;
            }
            if (!Objects.equals(_time2States, other.getTime2States())) {
                return false;
            }
            if (!Objects.equals(_time32States, other.getTime32States())) {
                return false;
            }
            if (!Objects.equals(_time4096States, other.getTime4096States())) {
                return false;
            }
            if (!Objects.equals(_time4096StatesL, other.getTime4096StatesL())) {
                return false;
            }
            if (!Objects.equals(_time4States, other.getTime4States())) {
                return false;
            }
            if (!Objects.equals(_time4StatesS, other.getTime4StatesS())) {
                return false;
            }
            if (!Objects.equals(_time512States, other.getTime512States())) {
                return false;
            }
            if (!Objects.equals(_time512StatesL, other.getTime512StatesL())) {
                return false;
            }
            if (!Objects.equals(_time64States, other.getTime64States())) {
                return false;
            }
            if (!Objects.equals(_time8192States, other.getTime8192States())) {
                return false;
            }
            if (!Objects.equals(_time8192StatesL, other.getTime8192StatesL())) {
                return false;
            }
            if (!Objects.equals(_time8States, other.getTime8States())) {
                return false;
            }
            if (!Objects.equals(_timePeriod, other.getTimePeriod())) {
                return false;
            }
            if (!Objects.equals(_txLevelAvg, other.getTxLevelAvg())) {
                return false;
            }
            if (!Objects.equals(_txLevelMax, other.getTxLevelMax())) {
                return false;
            }
            if (!Objects.equals(_txLevelMin, other.getTxLevelMin())) {
                return false;
            }
            if (!Objects.equals(_unavailability, other.getUnavailability())) {
                return false;
            }
            if (!Objects.equals(_xpdAvg, other.getXpdAvg())) {
                return false;
            }
            if (!Objects.equals(_xpdMax, other.getXpdMax())) {
                return false;
            }
            if (!Objects.equals(_xpdMin, other.getXpdMin())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PerformanceDataImpl otherImpl = (PerformanceDataImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceData>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "PerformanceData [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cses != null) {
                builder.append("_cses=");
                builder.append(_cses);
                builder.append(", ");
            }
            if (_defectBlocksSum != null) {
                builder.append("_defectBlocksSum=");
                builder.append(_defectBlocksSum);
                builder.append(", ");
            }
            if (_es != null) {
                builder.append("_es=");
                builder.append(_es);
                builder.append(", ");
            }
            if (_rfTempAvg != null) {
                builder.append("_rfTempAvg=");
                builder.append(_rfTempAvg);
                builder.append(", ");
            }
            if (_rfTempMax != null) {
                builder.append("_rfTempMax=");
                builder.append(_rfTempMax);
                builder.append(", ");
            }
            if (_rfTempMin != null) {
                builder.append("_rfTempMin=");
                builder.append(_rfTempMin);
                builder.append(", ");
            }
            if (_rxLevelAvg != null) {
                builder.append("_rxLevelAvg=");
                builder.append(_rxLevelAvg);
                builder.append(", ");
            }
            if (_rxLevelMax != null) {
                builder.append("_rxLevelMax=");
                builder.append(_rxLevelMax);
                builder.append(", ");
            }
            if (_rxLevelMin != null) {
                builder.append("_rxLevelMin=");
                builder.append(_rxLevelMin);
                builder.append(", ");
            }
            if (_ses != null) {
                builder.append("_ses=");
                builder.append(_ses);
                builder.append(", ");
            }
            if (_snirAvg != null) {
                builder.append("_snirAvg=");
                builder.append(_snirAvg);
                builder.append(", ");
            }
            if (_snirMax != null) {
                builder.append("_snirMax=");
                builder.append(_snirMax);
                builder.append(", ");
            }
            if (_snirMin != null) {
                builder.append("_snirMin=");
                builder.append(_snirMin);
                builder.append(", ");
            }
            if (_time1024States != null) {
                builder.append("_time1024States=");
                builder.append(_time1024States);
                builder.append(", ");
            }
            if (_time1024StatesL != null) {
                builder.append("_time1024StatesL=");
                builder.append(_time1024StatesL);
                builder.append(", ");
            }
            if (_time128States != null) {
                builder.append("_time128States=");
                builder.append(_time128States);
                builder.append(", ");
            }
            if (_time16States != null) {
                builder.append("_time16States=");
                builder.append(_time16States);
                builder.append(", ");
            }
            if (_time16StatesS != null) {
                builder.append("_time16StatesS=");
                builder.append(_time16StatesS);
                builder.append(", ");
            }
            if (_time2048States != null) {
                builder.append("_time2048States=");
                builder.append(_time2048States);
                builder.append(", ");
            }
            if (_time2048StatesL != null) {
                builder.append("_time2048StatesL=");
                builder.append(_time2048StatesL);
                builder.append(", ");
            }
            if (_time256States != null) {
                builder.append("_time256States=");
                builder.append(_time256States);
                builder.append(", ");
            }
            if (_time2States != null) {
                builder.append("_time2States=");
                builder.append(_time2States);
                builder.append(", ");
            }
            if (_time32States != null) {
                builder.append("_time32States=");
                builder.append(_time32States);
                builder.append(", ");
            }
            if (_time4096States != null) {
                builder.append("_time4096States=");
                builder.append(_time4096States);
                builder.append(", ");
            }
            if (_time4096StatesL != null) {
                builder.append("_time4096StatesL=");
                builder.append(_time4096StatesL);
                builder.append(", ");
            }
            if (_time4States != null) {
                builder.append("_time4States=");
                builder.append(_time4States);
                builder.append(", ");
            }
            if (_time4StatesS != null) {
                builder.append("_time4StatesS=");
                builder.append(_time4StatesS);
                builder.append(", ");
            }
            if (_time512States != null) {
                builder.append("_time512States=");
                builder.append(_time512States);
                builder.append(", ");
            }
            if (_time512StatesL != null) {
                builder.append("_time512StatesL=");
                builder.append(_time512StatesL);
                builder.append(", ");
            }
            if (_time64States != null) {
                builder.append("_time64States=");
                builder.append(_time64States);
                builder.append(", ");
            }
            if (_time8192States != null) {
                builder.append("_time8192States=");
                builder.append(_time8192States);
                builder.append(", ");
            }
            if (_time8192StatesL != null) {
                builder.append("_time8192StatesL=");
                builder.append(_time8192StatesL);
                builder.append(", ");
            }
            if (_time8States != null) {
                builder.append("_time8States=");
                builder.append(_time8States);
                builder.append(", ");
            }
            if (_timePeriod != null) {
                builder.append("_timePeriod=");
                builder.append(_timePeriod);
                builder.append(", ");
            }
            if (_txLevelAvg != null) {
                builder.append("_txLevelAvg=");
                builder.append(_txLevelAvg);
                builder.append(", ");
            }
            if (_txLevelMax != null) {
                builder.append("_txLevelMax=");
                builder.append(_txLevelMax);
                builder.append(", ");
            }
            if (_txLevelMin != null) {
                builder.append("_txLevelMin=");
                builder.append(_txLevelMin);
                builder.append(", ");
            }
            if (_unavailability != null) {
                builder.append("_unavailability=");
                builder.append(_unavailability);
                builder.append(", ");
            }
            if (_xpdAvg != null) {
                builder.append("_xpdAvg=");
                builder.append(_xpdAvg);
                builder.append(", ");
            }
            if (_xpdMax != null) {
                builder.append("_xpdMax=");
                builder.append(_xpdMax);
                builder.append(", ");
            }
            if (_xpdMin != null) {
                builder.append("_xpdMin=");
                builder.append(_xpdMin);
            }
            final int builderLength = builder.length();
            final int builderAdditionalLength = builder.substring(name.length(), builderLength).length();
            if (builderAdditionalLength > 2 && !builder.substring(builderLength - 2, builderLength).equals(", ")) {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
