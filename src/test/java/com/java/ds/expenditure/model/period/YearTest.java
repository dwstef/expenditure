package com.java.ds.expenditure.model.period;

import org.junit.Assert;
import org.junit.Test;

public class YearTest {

    private Year year;

    @Test (expected = IllegalArgumentException.class)
    public void testYearNumberIsGreaterThanZero() {
        year = new Year(0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testYearNumberIsGreaterThan1900() {
        year = new Year(900);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSetWrongYearNumber() {
        year = new Year(1900);
        year.setYearNumber(10000);
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testYearHasNoMoreThanTwelveMonths() {
        year = new Year(2021);
        year.generateMonths();
        Month month = new Month(11, 2021);
        year.addMonth(month);
    }

    @Test
    public void testGenerateMissingMonths() {
        year = new Year(2021);
        Month yanuary = new Month(1,2021);
        Month february = new Month(5,2021);
        year.addMonth(yanuary);
        year.addMonth(february);
        year.generateMonths();

        Assert.assertTrue(year.getMonths().size() == 12);

    }

    @Test (expected = IllegalArgumentException.class)
    public void testTheSameMonthCannotBeAddedTwice(){
        year = new Year(2021);
        Month month = new Month(1, 2021);

        year.addMonth(month);
        year.addMonth(month);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMonthsWithSameNumberCannotBeAddedToYear(){
        year = new Year(2021);
        Month month = new Month(1, 2021);
        Month otherMonth = new Month(1, 2021);

        year.addMonth(month);
        year.addMonth(otherMonth);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAddMonthYearNumberIsEven(){
        year = new Year(2021);
        Month month = new Month(10,2020);

        year.addMonth(month);
    }

}
