package com.java.ds.expenditure.model.payments;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OneTimePayment implements Payment {

    private String title;
    private BigDecimal value;
    private LocalDate dateOfPayment;

    public OneTimePayment(String title, BigDecimal value, LocalDate dateOfPayment){
        this.title = title;
        this.value = value;
        this.dateOfPayment = dateOfPayment;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = new BigDecimal(value);
    }

    @Override
    public LocalDate getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDate dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }
}
