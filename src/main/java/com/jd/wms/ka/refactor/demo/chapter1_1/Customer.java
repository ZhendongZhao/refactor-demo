package com.jd.wms.ka.refactor.demo.chapter1_1;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name; // 姓名
    private Vector _rentals = new Vector(); // 租借记录

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement(); // 取得㆒笔租借记录
            // show figures for this rental（显示此笔租借数据）
            //determine amounts for each line
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }
        // add footer lines（结尾打印）
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) +
                " frequent renter points";
        return result;
    }

    private double getTotalAmount() {
        double totalAmount = 0; // 总消费金额
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement(); // 取得㆒笔租借记录
            //determine amounts for each line
            totalAmount += each.getCharge();
        }
        return totalAmount;
    }

    private int getFrequentRenterPoints() {
        int frequentRenterPoints = 0; // 常客积点
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement(); // 取得㆒笔租借记录
            frequentRenterPoints += each.getFrequentRenterPoints();

        }
        return frequentRenterPoints;
    }

}
