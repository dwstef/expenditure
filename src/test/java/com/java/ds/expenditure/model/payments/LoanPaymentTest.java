package com.java.ds.expenditure.model.payments;

import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LoanPaymentTest {

    LoanPayment payment;

    @Test(expected = IllegalArgumentException.class)
    public void testPaymentTitleIsNotEmpty(){
        payment = new LoanPayment("", BigDecimal.valueOf(100.00), LocalDate.of(2021, 12, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEmptyPaymentTitle(){
        payment = new LoanPayment("Repayment", BigDecimal.valueOf(100.00), LocalDate.of(2021, 12, 10));
        payment.setTitle("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPaymentValueIsPositive(){
        payment = new LoanPayment("Repayment", BigDecimal.valueOf(-100.0), LocalDate.of(2021, 12, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativePaymentValue(){
        payment = new LoanPayment("Repayment", BigDecimal.valueOf(100.0), LocalDate.of(2021, 12, 10));
        payment.setValue(BigDecimal.valueOf(-100.0));
    }

}
