package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers
 *
 */
public class UmtsRanRrcTimersBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers> {

    private java.lang.Short _n300;
    private java.lang.Short _n301;
    private java.lang.Short _n302;
    private java.lang.Short _n304;
    private java.lang.Short _n310;
    private java.lang.Integer _n312;
    private java.lang.Short _n313;
    private java.lang.Integer _n315;
    private java.lang.Integer _t300;
    private java.lang.Integer _t301;
    private java.lang.Integer _t302;
    private java.lang.Integer _t304;
    private java.lang.Long _t305;
    private java.lang.Short _t307;
    private java.lang.Integer _t308;
    private java.lang.Short _t309;
    private java.lang.Integer _t310;
    private java.lang.Integer _t311;
    private java.lang.Short _t312;
    private java.lang.Short _t313;
    private java.lang.Short _t314;
    private java.lang.Integer _t315;
    private java.lang.Long _t316;
    private java.lang.Integer _t317;
    private java.lang.Short _waitTime;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>> augmentation = Collections.emptyMap();

    public UmtsRanRrcTimersBuilder() {
    }
    public UmtsRanRrcTimersBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG arg) {
        this._t300 = arg.getT300();
        this._t301 = arg.getT301();
        this._t302 = arg.getT302();
        this._t304 = arg.getT304();
        this._t305 = arg.getT305();
        this._t307 = arg.getT307();
        this._t308 = arg.getT308();
        this._t309 = arg.getT309();
        this._t310 = arg.getT310();
        this._t311 = arg.getT311();
        this._t312 = arg.getT312();
        this._t313 = arg.getT313();
        this._t314 = arg.getT314();
        this._t315 = arg.getT315();
        this._t316 = arg.getT316();
        this._t317 = arg.getT317();
        this._n300 = arg.getN300();
        this._n301 = arg.getN301();
        this._n302 = arg.getN302();
        this._n304 = arg.getN304();
        this._n310 = arg.getN310();
        this._n312 = arg.getN312();
        this._n313 = arg.getN313();
        this._n315 = arg.getN315();
        this._waitTime = arg.getWaitTime();
    }

    public UmtsRanRrcTimersBuilder(UmtsRanRrcTimers base) {
        this._n300 = base.getN300();
        this._n301 = base.getN301();
        this._n302 = base.getN302();
        this._n304 = base.getN304();
        this._n310 = base.getN310();
        this._n312 = base.getN312();
        this._n313 = base.getN313();
        this._n315 = base.getN315();
        this._t300 = base.getT300();
        this._t301 = base.getT301();
        this._t302 = base.getT302();
        this._t304 = base.getT304();
        this._t305 = base.getT305();
        this._t307 = base.getT307();
        this._t308 = base.getT308();
        this._t309 = base.getT309();
        this._t310 = base.getT310();
        this._t311 = base.getT311();
        this._t312 = base.getT312();
        this._t313 = base.getT313();
        this._t314 = base.getT314();
        this._t315 = base.getT315();
        this._t316 = base.getT316();
        this._t317 = base.getT317();
        this._waitTime = base.getWaitTime();
        if (base instanceof UmtsRanRrcTimersImpl) {
            UmtsRanRrcTimersImpl impl = (UmtsRanRrcTimersImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG) {
            this._t300 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT300();
            this._t301 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT301();
            this._t302 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT302();
            this._t304 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT304();
            this._t305 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT305();
            this._t307 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT307();
            this._t308 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT308();
            this._t309 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT309();
            this._t310 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT310();
            this._t311 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT311();
            this._t312 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT312();
            this._t313 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT313();
            this._t314 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT314();
            this._t315 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT315();
            this._t316 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT316();
            this._t317 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getT317();
            this._n300 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getN300();
            this._n301 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getN301();
            this._n302 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getN302();
            this._n304 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getN304();
            this._n310 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getN310();
            this._n312 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getN312();
            this._n313 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getN313();
            this._n315 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getN315();
            this._waitTime = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG)arg).getWaitTime();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanRrcTimersG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getN300() {
        return _n300;
    }
    
    public java.lang.Short getN301() {
        return _n301;
    }
    
    public java.lang.Short getN302() {
        return _n302;
    }
    
    public java.lang.Short getN304() {
        return _n304;
    }
    
    public java.lang.Short getN310() {
        return _n310;
    }
    
    public java.lang.Integer getN312() {
        return _n312;
    }
    
    public java.lang.Short getN313() {
        return _n313;
    }
    
    public java.lang.Integer getN315() {
        return _n315;
    }
    
    public java.lang.Integer getT300() {
        return _t300;
    }
    
    public java.lang.Integer getT301() {
        return _t301;
    }
    
    public java.lang.Integer getT302() {
        return _t302;
    }
    
    public java.lang.Integer getT304() {
        return _t304;
    }
    
    public java.lang.Long getT305() {
        return _t305;
    }
    
    public java.lang.Short getT307() {
        return _t307;
    }
    
    public java.lang.Integer getT308() {
        return _t308;
    }
    
    public java.lang.Short getT309() {
        return _t309;
    }
    
    public java.lang.Integer getT310() {
        return _t310;
    }
    
    public java.lang.Integer getT311() {
        return _t311;
    }
    
    public java.lang.Short getT312() {
        return _t312;
    }
    
    public java.lang.Short getT313() {
        return _t313;
    }
    
    public java.lang.Short getT314() {
        return _t314;
    }
    
    public java.lang.Integer getT315() {
        return _t315;
    }
    
    public java.lang.Long getT316() {
        return _t316;
    }
    
    public java.lang.Integer getT317() {
        return _t317;
    }
    
    public java.lang.Short getWaitTime() {
        return _waitTime;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkN300Range(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setN300(final java.lang.Short value) {
    if (value != null) {
        checkN300Range(value);
    }
        this._n300 = value;
        return this;
    }
    
     
     private static void checkN301Range(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setN301(final java.lang.Short value) {
    if (value != null) {
        checkN301Range(value);
    }
        this._n301 = value;
        return this;
    }
    
     
     private static void checkN302Range(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setN302(final java.lang.Short value) {
    if (value != null) {
        checkN302Range(value);
    }
        this._n302 = value;
        return this;
    }
    
     
     private static void checkN304Range(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setN304(final java.lang.Short value) {
    if (value != null) {
        checkN304Range(value);
    }
        this._n304 = value;
        return this;
    }
    
     
     private static void checkN310Range(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setN310(final java.lang.Short value) {
    if (value != null) {
        checkN310Range(value);
    }
        this._n310 = value;
        return this;
    }
    
     
     private static void checkN312Range(final int value) {
         if (value >= 1 && value <= 1000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..1000]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setN312(final java.lang.Integer value) {
    if (value != null) {
        checkN312Range(value);
    }
        this._n312 = value;
        return this;
    }
    
     
     private static void checkN313Range(final short value) {
         if (value >= (short)1 && value <= (short)1) {
             return;
         }
         if (value >= (short)2 && value <= (short)2) {
             return;
         }
         if (value >= (short)4 && value <= (short)4) {
             return;
         }
         if (value >= (short)10 && value <= (short)10) {
             return;
         }
         if (value >= (short)20 && value <= (short)20) {
             return;
         }
         if (value >= (short)50 && value <= (short)50) {
             return;
         }
         if (value >= (short)100 && value <= (short)100) {
             return;
         }
         if (value >= (short)200 && value <= (short)200) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..1], [2..2], [4..4], [10..10], [20..20], [50..50], [100..100], [200..200]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setN313(final java.lang.Short value) {
    if (value != null) {
        checkN313Range(value);
    }
        this._n313 = value;
        return this;
    }
    
     
     private static void checkN315Range(final int value) {
         if (value >= 1 && value <= 1000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..1000]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setN315(final java.lang.Integer value) {
    if (value != null) {
        checkN315Range(value);
    }
        this._n315 = value;
        return this;
    }
    
     
     private static void checkT300Range(final int value) {
         if (value >= 100 && value <= 8000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[100..8000]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setT300(final java.lang.Integer value) {
    if (value != null) {
        checkT300Range(value);
    }
        this._t300 = value;
        return this;
    }
    
     
     private static void checkT301Range(final int value) {
         if (value >= 100 && value <= 8000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[100..8000]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setT301(final java.lang.Integer value) {
    if (value != null) {
        checkT301Range(value);
    }
        this._t301 = value;
        return this;
    }
    
     
     private static void checkT302Range(final int value) {
         if (value >= 100 && value <= 8000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[100..8000]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setT302(final java.lang.Integer value) {
    if (value != null) {
        checkT302Range(value);
    }
        this._t302 = value;
        return this;
    }
    
     
     private static void checkT304Range(final int value) {
         if (value >= 100 && value <= 100) {
             return;
         }
         if (value >= 200 && value <= 200) {
             return;
         }
         if (value >= 400 && value <= 400) {
             return;
         }
         if (value >= 1000 && value <= 1000) {
             return;
         }
         if (value >= 2000 && value <= 2000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[100..100], [200..200], [400..400], [1000..1000], [2000..2000]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setT304(final java.lang.Integer value) {
    if (value != null) {
        checkT304Range(value);
    }
        this._t304 = value;
        return this;
    }
    
     
    public UmtsRanRrcTimersBuilder setT305(final java.lang.Long value) {
        this._t305 = value;
        return this;
    }
    
     
     private static void checkT307Range(final short value) {
         if (value >= (short)5 && value <= (short)5) {
             return;
         }
         if (value >= (short)10 && value <= (short)10) {
             return;
         }
         if (value >= (short)15 && value <= (short)15) {
             return;
         }
         if (value >= (short)20 && value <= (short)20) {
             return;
         }
         if (value >= (short)30 && value <= (short)30) {
             return;
         }
         if (value >= (short)40 && value <= (short)40) {
             return;
         }
         if (value >= (short)50 && value <= (short)50) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[5..5], [10..10], [15..15], [20..20], [30..30], [40..40], [50..50]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setT307(final java.lang.Short value) {
    if (value != null) {
        checkT307Range(value);
    }
        this._t307 = value;
        return this;
    }
    
     
     private static void checkT308Range(final int value) {
         if (value >= 40 && value <= 40) {
             return;
         }
         if (value >= 80 && value <= 80) {
             return;
         }
         if (value >= 160 && value <= 160) {
             return;
         }
         if (value >= 320 && value <= 320) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[40..40], [80..80], [160..160], [320..320]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setT308(final java.lang.Integer value) {
    if (value != null) {
        checkT308Range(value);
    }
        this._t308 = value;
        return this;
    }
    
     
     private static void checkT309Range(final short value) {
         if (value >= (short)1 && value <= (short)8) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..8]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setT309(final java.lang.Short value) {
    if (value != null) {
        checkT309Range(value);
    }
        this._t309 = value;
        return this;
    }
    
     
     private static void checkT310Range(final int value) {
         if (value >= 40 && value <= 40) {
             return;
         }
         if (value >= 80 && value <= 80) {
             return;
         }
         if (value >= 120 && value <= 120) {
             return;
         }
         if (value >= 160 && value <= 160) {
             return;
         }
         if (value >= 200 && value <= 200) {
             return;
         }
         if (value >= 240 && value <= 240) {
             return;
         }
         if (value >= 280 && value <= 280) {
             return;
         }
         if (value >= 320 && value <= 320) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[40..40], [80..80], [120..120], [160..160], [200..200], [240..240], [280..280], [320..320]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setT310(final java.lang.Integer value) {
    if (value != null) {
        checkT310Range(value);
    }
        this._t310 = value;
        return this;
    }
    
     
     private static void checkT311Range(final int value) {
         if (value >= 250 && value <= 250) {
             return;
         }
         if (value >= 500 && value <= 500) {
             return;
         }
         if (value >= 750 && value <= 750) {
             return;
         }
         if (value >= 1000 && value <= 1000) {
             return;
         }
         if (value >= 1250 && value <= 1250) {
             return;
         }
         if (value >= 1500 && value <= 1500) {
             return;
         }
         if (value >= 1750 && value <= 1750) {
             return;
         }
         if (value >= 2000 && value <= 2000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[250..250], [500..500], [750..750], [1000..1000], [1250..1250], [1500..1500], [1750..1750], [2000..2000]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setT311(final java.lang.Integer value) {
    if (value != null) {
        checkT311Range(value);
    }
        this._t311 = value;
        return this;
    }
    
     
     private static void checkT312Range(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setT312(final java.lang.Short value) {
    if (value != null) {
        checkT312Range(value);
    }
        this._t312 = value;
        return this;
    }
    
     
     private static void checkT313Range(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setT313(final java.lang.Short value) {
    if (value != null) {
        checkT313Range(value);
    }
        this._t313 = value;
        return this;
    }
    
     
     private static void checkT314Range(final short value) {
         if (value >= (short)0 && value <= (short)0) {
             return;
         }
         if (value >= (short)2 && value <= (short)2) {
             return;
         }
         if (value >= (short)4 && value <= (short)4) {
             return;
         }
         if (value >= (short)6 && value <= (short)6) {
             return;
         }
         if (value >= (short)8 && value <= (short)8) {
             return;
         }
         if (value >= (short)12 && value <= (short)12) {
             return;
         }
         if (value >= (short)16 && value <= (short)16) {
             return;
         }
         if (value >= (short)20 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..0], [2..2], [4..4], [6..6], [8..8], [12..12], [16..16], [20..20]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setT314(final java.lang.Short value) {
    if (value != null) {
        checkT314Range(value);
    }
        this._t314 = value;
        return this;
    }
    
     
     private static void checkT315Range(final int value) {
         if (value >= 0 && value <= 0) {
             return;
         }
         if (value >= 10 && value <= 10) {
             return;
         }
         if (value >= 30 && value <= 30) {
             return;
         }
         if (value >= 60 && value <= 60) {
             return;
         }
         if (value >= 180 && value <= 180) {
             return;
         }
         if (value >= 600 && value <= 600) {
             return;
         }
         if (value >= 1200 && value <= 1200) {
             return;
         }
         if (value >= 1800 && value <= 1800) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..0], [10..10], [30..30], [60..60], [180..180], [600..600], [1200..1200], [1800..1800]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setT315(final java.lang.Integer value) {
    if (value != null) {
        checkT315Range(value);
    }
        this._t315 = value;
        return this;
    }
    
     
    public UmtsRanRrcTimersBuilder setT316(final java.lang.Long value) {
        this._t316 = value;
        return this;
    }
    
     
     private static void checkT317Range(final int value) {
         if (value >= 0 && value <= 0) {
             return;
         }
         if (value >= 10 && value <= 10) {
             return;
         }
         if (value >= 30 && value <= 30) {
             return;
         }
         if (value >= 60 && value <= 60) {
             return;
         }
         if (value >= 180 && value <= 180) {
             return;
         }
         if (value >= 600 && value <= 600) {
             return;
         }
         if (value >= 1200 && value <= 1200) {
             return;
         }
         if (value >= 1800 && value <= 1800) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..0], [10..10], [30..30], [60..60], [180..180], [600..600], [1200..1200], [1800..1800]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setT317(final java.lang.Integer value) {
    if (value != null) {
        checkT317Range(value);
    }
        this._t317 = value;
        return this;
    }
    
     
     private static void checkWaitTimeRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public UmtsRanRrcTimersBuilder setWaitTime(final java.lang.Short value) {
    if (value != null) {
        checkWaitTimeRange(value);
    }
        this._waitTime = value;
        return this;
    }
    
    public UmtsRanRrcTimersBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanRrcTimersBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanRrcTimers build() {
        return new UmtsRanRrcTimersImpl(this);
    }

    private static final class UmtsRanRrcTimersImpl implements UmtsRanRrcTimers {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers.class;
        }

        private final java.lang.Short _n300;
        private final java.lang.Short _n301;
        private final java.lang.Short _n302;
        private final java.lang.Short _n304;
        private final java.lang.Short _n310;
        private final java.lang.Integer _n312;
        private final java.lang.Short _n313;
        private final java.lang.Integer _n315;
        private final java.lang.Integer _t300;
        private final java.lang.Integer _t301;
        private final java.lang.Integer _t302;
        private final java.lang.Integer _t304;
        private final java.lang.Long _t305;
        private final java.lang.Short _t307;
        private final java.lang.Integer _t308;
        private final java.lang.Short _t309;
        private final java.lang.Integer _t310;
        private final java.lang.Integer _t311;
        private final java.lang.Short _t312;
        private final java.lang.Short _t313;
        private final java.lang.Short _t314;
        private final java.lang.Integer _t315;
        private final java.lang.Long _t316;
        private final java.lang.Integer _t317;
        private final java.lang.Short _waitTime;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>> augmentation = Collections.emptyMap();

        private UmtsRanRrcTimersImpl(UmtsRanRrcTimersBuilder base) {
            this._n300 = base.getN300();
            this._n301 = base.getN301();
            this._n302 = base.getN302();
            this._n304 = base.getN304();
            this._n310 = base.getN310();
            this._n312 = base.getN312();
            this._n313 = base.getN313();
            this._n315 = base.getN315();
            this._t300 = base.getT300();
            this._t301 = base.getT301();
            this._t302 = base.getT302();
            this._t304 = base.getT304();
            this._t305 = base.getT305();
            this._t307 = base.getT307();
            this._t308 = base.getT308();
            this._t309 = base.getT309();
            this._t310 = base.getT310();
            this._t311 = base.getT311();
            this._t312 = base.getT312();
            this._t313 = base.getT313();
            this._t314 = base.getT314();
            this._t315 = base.getT315();
            this._t316 = base.getT316();
            this._t317 = base.getT317();
            this._waitTime = base.getWaitTime();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getN300() {
            return _n300;
        }
        
        @Override
        public java.lang.Short getN301() {
            return _n301;
        }
        
        @Override
        public java.lang.Short getN302() {
            return _n302;
        }
        
        @Override
        public java.lang.Short getN304() {
            return _n304;
        }
        
        @Override
        public java.lang.Short getN310() {
            return _n310;
        }
        
        @Override
        public java.lang.Integer getN312() {
            return _n312;
        }
        
        @Override
        public java.lang.Short getN313() {
            return _n313;
        }
        
        @Override
        public java.lang.Integer getN315() {
            return _n315;
        }
        
        @Override
        public java.lang.Integer getT300() {
            return _t300;
        }
        
        @Override
        public java.lang.Integer getT301() {
            return _t301;
        }
        
        @Override
        public java.lang.Integer getT302() {
            return _t302;
        }
        
        @Override
        public java.lang.Integer getT304() {
            return _t304;
        }
        
        @Override
        public java.lang.Long getT305() {
            return _t305;
        }
        
        @Override
        public java.lang.Short getT307() {
            return _t307;
        }
        
        @Override
        public java.lang.Integer getT308() {
            return _t308;
        }
        
        @Override
        public java.lang.Short getT309() {
            return _t309;
        }
        
        @Override
        public java.lang.Integer getT310() {
            return _t310;
        }
        
        @Override
        public java.lang.Integer getT311() {
            return _t311;
        }
        
        @Override
        public java.lang.Short getT312() {
            return _t312;
        }
        
        @Override
        public java.lang.Short getT313() {
            return _t313;
        }
        
        @Override
        public java.lang.Short getT314() {
            return _t314;
        }
        
        @Override
        public java.lang.Integer getT315() {
            return _t315;
        }
        
        @Override
        public java.lang.Long getT316() {
            return _t316;
        }
        
        @Override
        public java.lang.Integer getT317() {
            return _t317;
        }
        
        @Override
        public java.lang.Short getWaitTime() {
            return _waitTime;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_n300);
            result = prime * result + Objects.hashCode(_n301);
            result = prime * result + Objects.hashCode(_n302);
            result = prime * result + Objects.hashCode(_n304);
            result = prime * result + Objects.hashCode(_n310);
            result = prime * result + Objects.hashCode(_n312);
            result = prime * result + Objects.hashCode(_n313);
            result = prime * result + Objects.hashCode(_n315);
            result = prime * result + Objects.hashCode(_t300);
            result = prime * result + Objects.hashCode(_t301);
            result = prime * result + Objects.hashCode(_t302);
            result = prime * result + Objects.hashCode(_t304);
            result = prime * result + Objects.hashCode(_t305);
            result = prime * result + Objects.hashCode(_t307);
            result = prime * result + Objects.hashCode(_t308);
            result = prime * result + Objects.hashCode(_t309);
            result = prime * result + Objects.hashCode(_t310);
            result = prime * result + Objects.hashCode(_t311);
            result = prime * result + Objects.hashCode(_t312);
            result = prime * result + Objects.hashCode(_t313);
            result = prime * result + Objects.hashCode(_t314);
            result = prime * result + Objects.hashCode(_t315);
            result = prime * result + Objects.hashCode(_t316);
            result = prime * result + Objects.hashCode(_t317);
            result = prime * result + Objects.hashCode(_waitTime);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers)obj;
            if (!Objects.equals(_n300, other.getN300())) {
                return false;
            }
            if (!Objects.equals(_n301, other.getN301())) {
                return false;
            }
            if (!Objects.equals(_n302, other.getN302())) {
                return false;
            }
            if (!Objects.equals(_n304, other.getN304())) {
                return false;
            }
            if (!Objects.equals(_n310, other.getN310())) {
                return false;
            }
            if (!Objects.equals(_n312, other.getN312())) {
                return false;
            }
            if (!Objects.equals(_n313, other.getN313())) {
                return false;
            }
            if (!Objects.equals(_n315, other.getN315())) {
                return false;
            }
            if (!Objects.equals(_t300, other.getT300())) {
                return false;
            }
            if (!Objects.equals(_t301, other.getT301())) {
                return false;
            }
            if (!Objects.equals(_t302, other.getT302())) {
                return false;
            }
            if (!Objects.equals(_t304, other.getT304())) {
                return false;
            }
            if (!Objects.equals(_t305, other.getT305())) {
                return false;
            }
            if (!Objects.equals(_t307, other.getT307())) {
                return false;
            }
            if (!Objects.equals(_t308, other.getT308())) {
                return false;
            }
            if (!Objects.equals(_t309, other.getT309())) {
                return false;
            }
            if (!Objects.equals(_t310, other.getT310())) {
                return false;
            }
            if (!Objects.equals(_t311, other.getT311())) {
                return false;
            }
            if (!Objects.equals(_t312, other.getT312())) {
                return false;
            }
            if (!Objects.equals(_t313, other.getT313())) {
                return false;
            }
            if (!Objects.equals(_t314, other.getT314())) {
                return false;
            }
            if (!Objects.equals(_t315, other.getT315())) {
                return false;
            }
            if (!Objects.equals(_t316, other.getT316())) {
                return false;
            }
            if (!Objects.equals(_t317, other.getT317())) {
                return false;
            }
            if (!Objects.equals(_waitTime, other.getWaitTime())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanRrcTimersImpl otherImpl = (UmtsRanRrcTimersImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanRrcTimers>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanRrcTimers [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_n300 != null) {
                builder.append("_n300=");
                builder.append(_n300);
                builder.append(", ");
            }
            if (_n301 != null) {
                builder.append("_n301=");
                builder.append(_n301);
                builder.append(", ");
            }
            if (_n302 != null) {
                builder.append("_n302=");
                builder.append(_n302);
                builder.append(", ");
            }
            if (_n304 != null) {
                builder.append("_n304=");
                builder.append(_n304);
                builder.append(", ");
            }
            if (_n310 != null) {
                builder.append("_n310=");
                builder.append(_n310);
                builder.append(", ");
            }
            if (_n312 != null) {
                builder.append("_n312=");
                builder.append(_n312);
                builder.append(", ");
            }
            if (_n313 != null) {
                builder.append("_n313=");
                builder.append(_n313);
                builder.append(", ");
            }
            if (_n315 != null) {
                builder.append("_n315=");
                builder.append(_n315);
                builder.append(", ");
            }
            if (_t300 != null) {
                builder.append("_t300=");
                builder.append(_t300);
                builder.append(", ");
            }
            if (_t301 != null) {
                builder.append("_t301=");
                builder.append(_t301);
                builder.append(", ");
            }
            if (_t302 != null) {
                builder.append("_t302=");
                builder.append(_t302);
                builder.append(", ");
            }
            if (_t304 != null) {
                builder.append("_t304=");
                builder.append(_t304);
                builder.append(", ");
            }
            if (_t305 != null) {
                builder.append("_t305=");
                builder.append(_t305);
                builder.append(", ");
            }
            if (_t307 != null) {
                builder.append("_t307=");
                builder.append(_t307);
                builder.append(", ");
            }
            if (_t308 != null) {
                builder.append("_t308=");
                builder.append(_t308);
                builder.append(", ");
            }
            if (_t309 != null) {
                builder.append("_t309=");
                builder.append(_t309);
                builder.append(", ");
            }
            if (_t310 != null) {
                builder.append("_t310=");
                builder.append(_t310);
                builder.append(", ");
            }
            if (_t311 != null) {
                builder.append("_t311=");
                builder.append(_t311);
                builder.append(", ");
            }
            if (_t312 != null) {
                builder.append("_t312=");
                builder.append(_t312);
                builder.append(", ");
            }
            if (_t313 != null) {
                builder.append("_t313=");
                builder.append(_t313);
                builder.append(", ");
            }
            if (_t314 != null) {
                builder.append("_t314=");
                builder.append(_t314);
                builder.append(", ");
            }
            if (_t315 != null) {
                builder.append("_t315=");
                builder.append(_t315);
                builder.append(", ");
            }
            if (_t316 != null) {
                builder.append("_t316=");
                builder.append(_t316);
                builder.append(", ");
            }
            if (_t317 != null) {
                builder.append("_t317=");
                builder.append(_t317);
                builder.append(", ");
            }
            if (_waitTime != null) {
                builder.append("_waitTime=");
                builder.append(_waitTime);
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
