package com.jd.wms.ka.refactor.demo.chapter6;

/**
 * 引入解释性变量
 */
public class _5_Introduce_Explaining_Variable {
    private String platform;
    private String browser;
    private int resize;

    public void main() {
        if ((platform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("IE") > -1) &&
                wasInitialized() && resize > 0) {
            // do something
        }
    }

    private boolean wasInitialized() {
        return false;
    }

    ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////

    double price() {
        int _queantity = 0;
        double _itemPrice = 0;
        return _queantity * _itemPrice - Math.max(0, _queantity - 500) * _itemPrice * 0.05 +
                Math.min(_queantity * _itemPrice * 0.1, 100.0);
    }
}
