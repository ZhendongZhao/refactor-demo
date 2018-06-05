package com.jd.wms.ka.refactor.demo.chapter1_1;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void statement() {
        Customer customer = new Customer("current customer");
        customer.addRental(new Rental(new Movie("movie name", Movie.NEW_RELEASE), 10));
        customer.addRental(new Rental(new Movie("movie name", Movie.CHILDRENS), 10));
        customer.addRental(new Rental(new Movie("movie name", Movie.REGULAR), 10));
        String statement = customer.statement();
        System.out.println("statement = " + statement);
        Assert.assertEquals("Rental Record for current customer\n" +
                "\tmovie name\t30.0\n" +
                "\tmovie name\t12.0\n" +
                "\tmovie name\t14.0\n" +
                "Amount owed is 56.0\n" +
                "You earned 4 frequent renter points", statement);
    }
}