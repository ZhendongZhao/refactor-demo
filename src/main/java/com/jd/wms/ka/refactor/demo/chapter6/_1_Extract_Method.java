package com.jd.wms.ka.refactor.demo.chapter6;

import com.jd.wms.ka.refactor.demo.chapter6.assist.Order;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 提炼函数
 */
public class _1_Extract_Method {
    private Vector<Object> _orders;
    private String _name;

    void printOwing() {
        Enumeration e = _orders.elements();
        double outstanding = 0.0;

        // print banner
        System.out.println("***************************");
        System.out.println("****** Customer Owes ******");
        System.out.println("***************************");

        // calculate outstanding
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }

        // print details
        System.out.println("name = " + _name);
        System.out.println("amount = " + outstanding);
    }

    void printOwing(double previousAmount) {
        Enumeration e = _orders.elements();
        double outstanding = previousAmount * 1.2;

        // print banner
        System.out.println("***************************");
        System.out.println("****** Customer Owes ******");
        System.out.println("***************************");

        // calculate outstanding
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }

        // print details
        System.out.println("name = " + _name);
        System.out.println("amount = " + outstanding);
    }
}
