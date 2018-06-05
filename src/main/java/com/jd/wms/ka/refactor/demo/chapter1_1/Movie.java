package com.jd.wms.ka.refactor.demo.chapter1_1;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title; // 名称

    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        _price = Price.create(priceCode);
    }

    public String getTitle() {
        return _title;
    }

    double getMovie(int daysRented) {
        return _price.getCharge(daysRented);
    }

    int getFrequentRenterPoints(int daysRented) {
        return _price.getFrequentRenterPoints(daysRented);
    }

}
