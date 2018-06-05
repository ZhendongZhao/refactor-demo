package com.jd.wms.ka.refactor.demo.chapter9;

import java.util.Date;

/**
 * 分解条件表达式
 */
public class _1_Decompose_Conditional {
    private static final Date Summer_start = new Date();
    private static final Date Summer_end = new Date();
    private static double _winterRate;
    private static double _summerRate;
    private static double _winterServiceCharge;

    public static void main(String[] args) {
        Date date = new Date();
        double charge, quantity = 1.1;
        if (date.before(Summer_start) || date.after(Summer_end)) {
            charge = quantity * _winterRate + _winterServiceCharge;
        } else {
            charge = quantity * _summerRate;
        }
    }
}
