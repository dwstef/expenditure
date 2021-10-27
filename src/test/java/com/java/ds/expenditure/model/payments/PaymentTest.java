package com.java.ds.expenditure.model.payments;

import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PaymentTest {

    Payment payment;

    @Test(expected = IllegalArgumentException.class)
    public void testPaymentTitleIsNotEmpty(){
        payment = new Payment("", BigDecimal.valueOf(100.00), LocalDate.of(2021, 12, 10),1 );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEmptyPaymentTitle(){
        payment = new Payment("Online payment", BigDecimal.valueOf(100.00), LocalDate.of(2021, 12, 10),1);
        payment.setTitle("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPaymentValueIsPositive(){
        payment = new Payment("Online payment", BigDecimal.valueOf(-100.0), LocalDate.of(2021, 12, 10),1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativePaymentValue(){
        payment = new Payment("Online payment", BigDecimal.valueOf(100.0), LocalDate.of(2021, 12, 10),1);
        payment.setValue(BigDecimal.valueOf(-100.0));
    }

}
