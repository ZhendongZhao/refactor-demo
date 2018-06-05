package com.jd.wms.ka.refactor.demo.chapter7;

/**
 * 隐藏「委托关系」
 */
public class _5_Hide_Delegate {
    class Person {
        Department _department;

        public Department getDepartment() {
            return _department;
        }
    }

    class Department {
        private String _chargeCode;
        private Person _manager;

        public Person getManager() {
            return _manager;
        }

        public void setManager(Person _manager) {
            this._manager = _manager;
        }
    }
}
