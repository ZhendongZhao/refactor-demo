package com.jd.wms.ka.refactor.demo.chapter8;

import java.util.Collection;
import java.util.Iterator;

/**
 * 以对象取代数据值
 */
public class _2_Replace_Data_Value_With_Object {
    private static int numberOfOrdersFor(Collection orders, String customer) {
        int result = 0;
        Iterator iter = orders.iterator();
        while (iter.hasNext()) {
            Order each = (Order) iter.next();
            if (each.getCustomer().equals(customer)) result++;
        }
        return result;
    }

    class Order {
        private String _customer;

        public Order(String _customer) {
            this._customer = _customer;
        }

        public String getCustomer() {
            return _customer;
        }

        public void setCustomer(String _customer) {
            this._customer = _customer;
        }

    }


    ////////////////////////////////\\
    class Customer {
        private String _name;

        public String getName() {
            return _name;
        }

        public void setName(String name) {
            this._name = name;
        }
    }
}
