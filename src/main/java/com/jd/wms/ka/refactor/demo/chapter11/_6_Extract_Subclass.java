package com.jd.wms.ka.refactor.demo.chapter11;

/**
 * 提炼子类
 */
public class _6_Extract_Subclass {

    class JobItem {
        private final int unitPrice;
        private final int quantity;
        private final boolean isLabor;
        private final Employee employee;

        JobItem(int unitPrice, int quantity, boolean isLabor, Employee employee) {
            this.unitPrice = unitPrice;
            this.quantity = quantity;
            this.isLabor = isLabor;
            this.employee = employee;
        }

        public int getTotalPrice() {
            return getUnitPrice() * quantity;
        }

        public int getUnitPrice() {
            return unitPrice;
        }

        public int getQuantity() {
            return quantity;
        }

        public boolean isLabor() {
            return isLabor;
        }

        public Employee getEmployee() {
            return employee;
        }
    }

    class Employee {
        private int rate;

        public Employee(int rate) {
            this.rate = rate;
        }

        public int getRate() {
            return rate;
        }
    }
}
