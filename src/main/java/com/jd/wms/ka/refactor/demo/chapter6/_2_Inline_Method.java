package com.jd.wms.ka.refactor.demo.chapter6;

/**
 * 内联函数
 */
public class _2_Inline_Method {
    private int _numberOfLateDeliveries;

    int getRating() {
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }

    private boolean moreThanFiveLateDeliveries() {
        return _numberOfLateDeliveries > 5;
    }
}
