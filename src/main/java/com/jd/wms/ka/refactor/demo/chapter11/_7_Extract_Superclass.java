package com.jd.wms.ka.refactor.demo.chapter11;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 提炼超类
 */
public class _7_Extract_Superclass {
    class Employee {
        private final String name;
        private final String id;
        private final int annualCost;

        public Employee(String name, String id, int annualCost) {
            this.name = name;
            this.id = id;
            this.annualCost = annualCost;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAnnualCost() {
            return annualCost;
        }
    }

    class Department {
        private String name;
        private Vector staff = new Vector();

        public Department(String name) {
            this.name = name;
        }

        public int getTotalAnnualCost() {
            Enumeration e = getStaff();
            int result = 0;
            while (e.hasMoreElements()) {
                Employee each = (Employee) e.nextElement();
                result += each.getAnnualCost();
            }
            return result;
        }

        public int getHeadCount() {
            return staff.size();
        }

        public Enumeration getStaff() {
            return staff.elements();
        }

        public void addStaff(Employee employee) {
            staff.add(employee);
        }

        public String getName() {
            return name;
        }
    }
}
