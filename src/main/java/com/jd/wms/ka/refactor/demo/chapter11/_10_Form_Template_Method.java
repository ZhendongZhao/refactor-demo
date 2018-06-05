package com.jd.wms.ka.refactor.demo.chapter11;

import com.jd.wms.ka.refactor.demo.chapter1.Movie;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 塑造模板函数
 */
public class _10_Form_Template_Method {
    class Rental {

        public Movie getMovie() {
            return null;
        }

        public double getChange() {
            return 0;
        }

        public int getFrequentRenterPoints() {
            return 0;
        }
    }

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
            Enumeration rentals = _rentals.elements();
            String result = "Rental Record for " + getName() + "\n";
            while (rentals.hasMoreElements()) {
                Rental each = (Rental) rentals.nextElement(); // 取得㆒笔租借记录
                // show figures for this rental（显示此笔租借数据）
                result += "\t" + each.getMovie().getTitle() + "\t" +
                        String.valueOf(each.getChange()) + "\n";
            }

            // add footer lines（结尾打印）
            result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
            result += "You earned " + String.valueOf(getFrequentRenterPoints()) +
                    " frequent renter points";
            return result;
        }

        private int getFrequentRenterPoints() {
            Enumeration rentals = _rentals.elements();
            int frequentRenterPoints = 0; // 常客积点
            while (rentals.hasMoreElements()) {
                Rental each = (Rental) rentals.nextElement(); // 取得㆒笔租借记录

                frequentRenterPoints += each.getFrequentRenterPoints();


            }
            return frequentRenterPoints;
        }

        private double getTotalAmount() {
            Enumeration rentals = _rentals.elements();
            double result = 0; // 总消费金额
            while (rentals.hasMoreElements()) {
                Rental each = (Rental) rentals.nextElement(); // 取得㆒笔租借记录
                result += each.getChange();
            }
            return result;
        }


    }

}
