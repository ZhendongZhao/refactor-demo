package com.jd.wms.ka.refactor.demo.chapter9;

/**
 * 引入断言
 */
public class _8_Introduce_Assertion {
    private static final double NULL_EXPENSE = 0;
    private double _expendsLimit;
    private Project _primaryProject;

    double getExpenseLimit() {
        return (_expendsLimit != NULL_EXPENSE) ? _expendsLimit : _primaryProject.getMemberExpenseLimit();
    }

    private class Project {
        public double getMemberExpenseLimit() {
            return 0;
        }
    }
}
