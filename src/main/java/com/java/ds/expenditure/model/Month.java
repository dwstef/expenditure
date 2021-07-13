package com.java.ds.expenditure.model;

import com.java.ds.expenditure.model.payments.Payment;

import java.util.ArrayList;

public class Month {

    int monthNumber;
    int yearNumber;
    ArrayList<Payment> payments = new ArrayList<>();

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getYearNumber() {
        return yearNumber;
    }

    public void setYearNumber(int yearNumber) {
        this.yearNumber = yearNumber;
    }

    public void addPayment(Payment payment) {
        this.payments.add(payment);
    }

    public void removePayment(Payment payment) {
        this.payments.remove(payment);
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }
}
