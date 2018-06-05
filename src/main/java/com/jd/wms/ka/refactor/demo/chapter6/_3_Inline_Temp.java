package com.jd.wms.ka.refactor.demo.chapter6;

import com.jd.wms.ka.refactor.demo.chapter6.assist.Order;

/**
 * 内联临时变量
 */
public class _3_Inline_Temp {
    private static Order anOrder;

    public boolean main() {
        double basePrice = anOrder.basePrice();
        return (basePrice > 1000);
    }
}
