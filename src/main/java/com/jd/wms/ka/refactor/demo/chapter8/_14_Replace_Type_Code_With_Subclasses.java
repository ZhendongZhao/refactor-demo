package com.jd.wms.ka.refactor.demo.chapter8;

/**
 * 以子类取代类型码
 */
public class _14_Replace_Type_Code_With_Subclasses {
    class Employee {
        static final int EnGINEER = 0;
        static final int salesman = 1;
        static final int MANAGER = 2;
        private int _type;

        public Employee(int type) {
            this._type = type;
        }
    }
}
