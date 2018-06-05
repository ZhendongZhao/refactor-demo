package com.jd.wms.ka.refactor.demo.chapter9;

/**
 * 以卫语句取代嵌套条件表达式
 */
public class _5_Replace_Nested_Conditional_With_Guard_Clauses {
    private boolean _isDead = false;
    private boolean _isSeparated = false;
    private boolean _isRetired = false;

    double getPayAmount() {
        double result;
        if (_isDead) {
            result = deadAmount();
        } else {
            if (_isSeparated) {
                result = seqaratedAmount();
            } else {
                if (_isRetired) {
                    result = retiredAount();
                } else {
                    result = normalPayAmount();
                }
            }
        }
        return result;
    }

    private double normalPayAmount() {
        return 0;
    }

    private double retiredAount() {
        return 0;
    }

    private double seqaratedAmount() {
        return 0;
    }

    private double deadAmount() {
        return 0;
    }
}
