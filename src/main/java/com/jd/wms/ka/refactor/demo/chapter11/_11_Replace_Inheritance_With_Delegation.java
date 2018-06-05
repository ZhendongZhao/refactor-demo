package com.jd.wms.ka.refactor.demo.chapter11;

import java.util.Vector;

/**
 * 以委托取代继承
 */
public class _11_Replace_Inheritance_With_Delegation {
    class MyStack extends Vector {
        public void push(Object element) {
            insertElementAt(element, 0);
        }

        public Object pop() {
            Object result = firstElement();
            removeElementAt(0);
            return result;
        }
    }
}
