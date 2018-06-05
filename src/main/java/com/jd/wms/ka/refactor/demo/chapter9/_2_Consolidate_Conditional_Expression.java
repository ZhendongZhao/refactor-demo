package com.jd.wms.ka.refactor.demo.chapter9;

/**
 * 合并条件表达式
 */
public class _2_Consolidate_Conditional_Expression {
    private int _seniority;
    private int _monthsDisabled;
    private boolean _isPartTime;

    double disabilityAmount() {
        if (_seniority < 2) return 0;
        if (_monthsDisabled > 12) return 0;
        if (_isPartTime) return 0;
        return 0;
    }
}
