package com.jd.wms.ka.refactor.demo.chapter8;

import java.util.Collection;
import java.util.Iterator;

/**
 * 将值对象改为引用对象
 */
public class _3_Change_Value_To_Reference {
    private static int numberOfOrdersFor(Collection orders, String customer) {
        int result = 0;
        Iterator iter = orders.iterator();
        while (iter.hasNext()) {
            Order each = (Order) iter.next();
            if (each.getCustomerName().equals(customer)) {
                result++;
            }
        }
        return result;
    }

    class Customer {
        private String _name;

        public Customer(String _name) {
            this._name = _name;
        }

        public String getName() {
            return _name;
        }

    }

    class Order {
        private Customer _customer;

        public Order(String customerName) {
            this._customer = new Customer(customerName);
        }

        public Customer getCustomer() {
            return _customer;
        }

        public void setCustomer(Customer customer) {
            this._customer = customer;
        }

        public Object getCustomerName() {
            return _customer.getName();
        }
    }
}
