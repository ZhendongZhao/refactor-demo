package com.jd.wms.ka.refactor.demo.chapter6;

/**
 * 以查询取代临时变量
 */
public class _4_Replace_Temp_With_Query {
    private int _quantity;
    private int _itemPrice;

    public double main() {
        int basePrice = _quantity * _itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;
        }
    }

    public double getPrice() {
        int basePrice = _quantity * _itemPrice;
        double discountFactor;
        if (basePrice > 1000) {
            discountFactor = 0.95;
        } else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
}
