package com.java.ds.expenditure.model.period;

import com.java.ds.expenditure.model.payments.Payment;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MonthTest {

    Month month;

    @Test(expected = IllegalArgumentException.class)
    public void testMonthNumberIsCorrect() {
        month = new Month(0, 2021);
        Month month2 = new Month(13, 2021);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWrongMonthNumber() {
        month = new Month(1, 2021);
        month.setMonthNumber(13);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMonthYearNumberIsGreaterThan1900() {
        month = new Month(1, 100);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSetWrongMonthYearNumber() {
        month = new Month(1, 2021);
        month.setMonthYearNumber(10000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSamePaymentIsNotAddedTwice(){
        month = new Month(12, 2021);
        Payment firstPayment = new Payment("Online payment", BigDecimal.valueOf(100), LocalDate.of(2021, 12, 20),1);

        month.addPayment(firstPayment);
        month.addPayment(firstPayment);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testPaymentMonthIsEven(){
        month = new Month(12, 2021);
        Payment payment = new Payment("Online payment", BigDecimal.valueOf(100), LocalDate.of(2021, 11, 20),1);

        month.addPayment(payment);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testPaymentYearIsEven(){
        month = new Month(12, 2000);
        Payment payment = new Payment("Online payment", BigDecimal.valueOf(100), LocalDate.of(2021, 12, 20),1);

        month.addPayment(payment);
    }

}
