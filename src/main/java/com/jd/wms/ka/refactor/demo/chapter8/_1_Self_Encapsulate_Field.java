package com.jd.wms.ka.refactor.demo.chapter8;

/**
 * 自封装字段
 */
public class _1_Self_Encapsulate_Field {

    class IntRange {
        private int _low, _high;

        boolean includes(int arg) {
            return arg >= _low && arg <= _high;
        }

    }
}
