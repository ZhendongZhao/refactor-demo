package com.jd.wms.ka.refactor.demo.chapter10;

/**
 * 令函数携带参数
 */
public class _5_Parameterize_Method {
    class Employee {
        private double salary = 1;

        void tenPercentRaise() {
            salary *= 1.1;
        }

        void fivePercentRaise() {
            salary *= 1.05;
        }

        //////////////////////////////////
        void raise(double factor) {
            salary *= (1 + factor);
        }
    }
}
