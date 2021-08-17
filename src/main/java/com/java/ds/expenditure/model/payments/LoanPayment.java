package com.java.ds.expenditure.model.payments;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LoanPayment implements Payment {
    private String title;
    private BigDecimal value;
    private LocalDate dateOfPayment;
    private boolean payed;

    public LoanPayment(String title, BigDecimal value, LocalDate dateOfPayment) {
        if(title.equals("")) {
            throw new IllegalArgumentException("Payment's title cannot be empty");
        } else
            this.title = title;
        if(value.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Payment's value cannot be negative");
        } else
            this.value = value;
        this.dateOfPayment = dateOfPayment;
        this.payed = false;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.equals("")) {
            throw new IllegalArgumentException("Payment's title cannot be empty");
        } else
            this.title = title;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        if(value.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Payment's value cannot be negative");
        } else
            this.value = value;
    }

    @Override
    public LocalDate getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDate dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }
}
