package com.jd.wms.ka.refactor.demo.chapter8;

import java.util.HashSet;
import java.util.Set;

/**
 * 将单向关联改为双向关联
 */
public class _7_Change_Unidirectional_Association_To_Bidirectional {
    class Order {
        private Customer customer;
    }

    class Customer {
        private Set orders = new HashSet();
    }
}
