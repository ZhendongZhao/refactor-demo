package com.jd.wms.ka.refactor.demo.chapter1_1;

public abstract class Price {
    public static Price create(int priceCode) {
        switch (priceCode) {
            case Movie.NEW_RELEASE:
                return new NewReleasePrice();
            case Movie.CHILDRENS:
                return new ChildrensPrice();
            case Movie.REGULAR:
                return new RegularPrice();
        }
        throw new IllegalArgumentException();
    }

    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}

class ChildrensPrice extends Price {
    @Override
    double getCharge(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3) {
            thisAmount += (daysRented - 3) * 1.5;
        }
        return thisAmount;
    }
}

class NewReleasePrice extends Price {

    @Override
    double getCharge(int daysRented) {
        return (double) (daysRented * 3);
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}

class RegularPrice extends Price {
    @Override
    double getCharge(int daysRented) {
        double thisAmount = 2;

        if (daysRented > 2) {
            thisAmount += (daysRented - 2) * 1.5;
        }

        return thisAmount;
    }
}
