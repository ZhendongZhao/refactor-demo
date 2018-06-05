package com.jd.wms.ka.refactor.demo.chapter1;

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
    }
}