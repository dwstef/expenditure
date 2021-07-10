package com.java.ds.expenditure.model.payments;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LoanPayment implements Payment {
    private String title;
    private BigDecimal value;
    private int dayOfPayment;
    private int monthOfPayment;
    private int yearOfPayment;
    private LocalDate dateOfPayment;
    private boolean payed;

    public LoanPayment(String title, double value, int dayOfPayment, int monthOfPayment, int yearOfPayment) {
        this.title = title;
        this.value = new BigDecimal(value);
        this.dayOfPayment = dayOfPayment;
        this.monthOfPayment = monthOfPayment;
        this.yearOfPayment = yearOfPayment;
        this.dateOfPayment = dateOfPayment.of(yearOfPayment, monthOfPayment, dayOfPayment);
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

    public int getDayOfPayment() {
        return dayOfPayment;
    }

    public void setDayOfPayment(int dayOfPayment) {
        this.dayOfPayment = dayOfPayment;
    }

    public int getMonthOfPayment() {
        return monthOfPayment;
    }

    public void setMonthOfPayment(int monthOfPayment) {
        this.monthOfPayment = monthOfPayment;
    }

    public int getYearOfPayment() {
        return yearOfPayment;
    }

    public void setYearOfPayment(int yearOfPayment) {
        this.yearOfPayment = yearOfPayment;
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
