package com.java.ds.expenditure.model.payments;

import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OneTimePaymentTest {

    OneTimePayment payment;

    @Test(expected = IllegalArgumentException.class)
    public void testPaymentTitleIsNotEmpty(){
        payment = new OneTimePayment("", BigDecimal.valueOf(100.00), LocalDate.of(2021, 12, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEmptyPaymentTitle(){
        payment = new OneTimePayment("Online payment", BigDecimal.valueOf(100.00), LocalDate.of(2021, 12, 10));
        payment.setTitle("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPaymentValueIsPositive(){
        payment = new OneTimePayment("Online payment", BigDecimal.valueOf(-100.0), LocalDate.of(2021, 12, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativePaymentValue(){
        payment = new OneTimePayment("Online payment", BigDecimal.valueOf(100.0), LocalDate.of(2021, 12, 10));
        payment.setValue(BigDecimal.valueOf(-100.0));
    }

}
