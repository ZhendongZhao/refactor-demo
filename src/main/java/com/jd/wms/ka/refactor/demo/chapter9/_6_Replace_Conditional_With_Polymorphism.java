package com.jd.wms.ka.refactor.demo.chapter9;

/**
 * 以多态替代条件表达式
 */
public class _6_Replace_Conditional_With_Polymorphism {
    private static final int EUROPEAN = 0;
    private static final int AFRICAN = 1;
    private static final int NORWEGIAN_BLUE = 2;
    private int _type;
    private double _numberOfCoconutes = 0;
    private boolean _isNailed;
    private double _voltaage;


    double getSpeed() {
        switch (_type) {
            case EUROPEAN:
                return getBaseSpeed();
            case AFRICAN:
                return getBaseSpeed() - getLoadFactor() * _numberOfCoconutes;
            case NORWEGIAN_BLUE:
                return (_isNailed) ? 0 : getBaseSpeed(_voltaage);
        }
        throw new RuntimeException("Should be unreachable");
    }

    private double getBaseSpeed(double voltaage) {
        return 0;
    }

    private double getLoadFactor() {
        return 0;
    }

    private double getBaseSpeed() {
        return 0;
    }
}
