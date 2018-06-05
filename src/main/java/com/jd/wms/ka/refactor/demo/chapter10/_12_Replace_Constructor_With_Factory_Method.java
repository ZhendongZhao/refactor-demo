package com.jd.wms.ka.refactor.demo.chapter10;

/**
 * 以工厂函数取代构造函数
 */
public class _12_Replace_Constructor_With_Factory_Method {
    static class Employee {
        Employee(int type) {

        }

        ///////////////////////////////////
        ///////////////////////////////////
        ///////////////////////////////////
        static Employee create(int type) {
            return new Employee(type);
        }
    }
}
