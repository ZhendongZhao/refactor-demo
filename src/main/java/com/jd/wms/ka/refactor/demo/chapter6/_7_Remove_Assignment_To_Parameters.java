package com.jd.wms.ka.refactor.demo.chapter6;

/**
 * 移除对参数的赋值
 */
public class _7_Remove_Assignment_To_Parameters {
    int discount(int inputVal, int quantiry, int yearToDate) {
        if (inputVal > 50) inputVal -= 2;
        if (quantiry > 100) inputVal -= 1;
        if (yearToDate > 10000) inputVal -= 4;
        return inputVal;
    }
}
