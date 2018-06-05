package com.jd.wms.ka.refactor.demo.chapter10;

/**
 * 以测试取代异常
 */
public class _15_Replace_Exception_With_Test {
    private double[] _values;

    double getValueForPeriod_1(int periodNumber) {
        try {
            return _values[periodNumber];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    //////////////////////////////////////////////
    //////////////////////////////////////////////
    //////////////////////////////////////////////

    double getValueForPeriod_2(int periodNumber) {
        if (periodNumber >= _values.length) {
            return 0;
        }

        return _values[periodNumber];

    }
}
