package com.jd.wms.ka.refactor.demo.chapter11;

/**
 * 提炼接口
 */
public class _8_Extract_Interface {


    interface Billable {
        int getRate();

        boolean hasSpecialSkill();
    }

    class TimeSheet {
        double charge(Employee emp, int days) {
            int base = emp.getRate() * days;
            if (emp.hasSpecialSkill()) {
                return base * 1.05;
            } else {
                return base;
            }
        }
    }
    //////////////////////////////////////

    //////////////////////////////////////

    class Employee {

        public int getRate() {
            return 0;
        }

        public boolean hasSpecialSkill() {
            return false;
        }
    }
}
