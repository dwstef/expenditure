package com.java.ds.expenditure.model.payments;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LoanPayment implements Payment {
    private String title;
    private BigDecimal value;
    private LocalDate dateOfPayment;
    private boolean payed;

    public LoanPayment() {

    }

    public LoanPayment(String title, BigDecimal value, LocalDate dateOfPayment) {
        this.title = title;
        this.value = value;
        this.dateOfPayment = dateOfPayment;
        this.payed = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = new BigDecimal(value);
    }

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
