package com.jd.wms.ka.refactor.demo.chapter10;

/**
 * 以函数取代参数
 */
public class _8_Replace_Parameter_With_Methods {
    private static final int _quantity = 0;

    private static final int _itemPrice = 0;

    static {
        int basePrice = _quantity * _itemPrice;
        int discountLevel = getDiscountLevel();
        double fiinalPrice = discountedPrice(basePrice, discountLevel);
    }

    static {
        int basePrice = _quantity * _itemPrice;
        double fiinalPrice = discountedPrice(basePrice);
    }

    private static double discountedPrice(int basePrice) {
        int discountLevel = getDiscountLevel();
        return 0;
    }

    private static double discountedPrice(int basePrice, int discountLevel) {
        return 0;
    }

    private static int getDiscountLevel() {
        return 0;
    }
}
