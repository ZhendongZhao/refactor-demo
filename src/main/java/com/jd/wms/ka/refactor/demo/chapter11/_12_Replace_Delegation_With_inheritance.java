package com.jd.wms.ka.refactor.demo.chapter11;

/**
 * 以继承取代委托
 */
public class _12_Replace_Delegation_With_inheritance {
    class Employee {
        Person _person = new Person();

        public String getName() {
            return _person.getName();
        }

        public void setName(String name) {
            _person.setName(name);
        }

        @Override
        public String toString() {
            return "Emp: " + _person.getLastName();
        }
    }

    class Person {
        private String _name;

        public String getName() {
            return _name;
        }

        public void setName(String name) {
            this._name = name;
        }

        public String getLastName() {
            return _name.substring(_name.lastIndexOf(' '), +1);
        }
    }
}
