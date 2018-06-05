package com.jd.wms.ka.refactor.demo.chapter9;

public class _7_Introduce_Null_Object {
    public static void main(String[] args) {
        Customer customer = null;
        Plan plan;
        if (customer == null) {
            plan = BillingPlan.basic();
        } else {
            plan = customer.getPlan();
        }
    }

    private static class BillingPlan {
        public static Plan basic() {
            return null;
        }
    }

    class Customer{

        public Plan getPlan() {
            return null;
        }
    }
    class Plan{
        
    }
}
