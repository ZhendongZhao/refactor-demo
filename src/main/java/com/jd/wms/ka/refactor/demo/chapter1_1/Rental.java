package com.jd.wms.ka.refactor.demo.chapter1_1;

public class Rental {
    private Movie _movie; // 影片
    private int _daysRented; // 租期

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    double getCharge() {
        return getMovie().getMovie(getDaysRented());
    }

    int getFrequentRenterPoints() {
        // add frequent renter points（累加常客积点）
        // add bonus for a two day new release rental
        return getMovie().getFrequentRenterPoints(getDaysRented());
    }

}
