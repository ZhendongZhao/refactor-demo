package com.jd.wms.ka.refactor.demo.chapter9;

// 合并重复的条件判断
public class _3_Consolidate_Duplicate_Conditional_Fragments {
    public static void main(String[] args) {
        double total;
        double price = 0.1;
        if (isSpecialDeal()) {
            total = price * 0.95;
            send();
        } else {
            total = price * 0.98;
            send();
        }
    }

    private static void send() {

    }

    private static boolean isSpecialDeal() {
        return false;
    }
}
