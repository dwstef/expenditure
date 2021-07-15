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
    public void testYearNumberHasFourDigits() {
        year = new Year(900);
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testYearHasNoMoreThanTwelveMonths() {
        year = new Year(2021);
        year.generateMonths();
        Month month = new Month();
        year.addMonth(month);
    }

    @Test
    public void testGenerateMissingMonths() {
        year = new Year(2021);
        Month yanuary = new Month(1);
        Month february = new Month(5);
        year.addMonth(yanuary);
        year.addMonth(february);
        year.generateMonths();

        Assert.assertTrue(year.getMonths().size() == 12);

    }

    @Test (expected = IllegalArgumentException.class)
    public void testTheSameMonthCannotBeAddedTwice(){
        year = new Year(2021);
        Month month = new Month(1);

        year.addMonth(month);
        year.addMonth(month);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMonthsWithSameNumberCannotBeAddedToYear(){
        year = new Year(2021);
        Month month = new Month(1);
        Month otherMonth = new Month(1);

        year.addMonth(month);
        year.addMonth(otherMonth);
    }

}
