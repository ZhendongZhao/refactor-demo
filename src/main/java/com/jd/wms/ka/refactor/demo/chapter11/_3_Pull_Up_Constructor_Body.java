package com.jd.wms.ka.refactor.demo.chapter11;

/**
 * 构造函数本体上移
 */
public class _3_Pull_Up_Constructor_Body {
    class Employee {
        protected String name;
        protected String id;
    }

    class Manager extends Employee {
        private final int grade;

        public Manager(String name, String id, int grade) {
            this.name = name;
            this.id = id;
            this.grade = grade;
        }
    }
}
