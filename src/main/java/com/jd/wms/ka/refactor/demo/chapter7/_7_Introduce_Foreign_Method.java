package com.jd.wms.ka.refactor.demo.chapter7;

import java.util.Date;

/**
 * 引入外加函数
 */
public class _7_Introduce_Foreign_Method {
    public static void main(String[] args) {
        Date previousEnd = new Date();
        Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate());
        newStart = getNewStart(previousEnd);
    }

    private static Date getNewStart(Date previousEnd) {
        return new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate());
    }
}
