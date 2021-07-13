package com.java.ds.expenditure.model.period;

import com.java.ds.expenditure.model.payments.Payment;

import java.util.ArrayList;

public class Month {

    int monthNumber;
    ArrayList<Payment> payments = new ArrayList<>();

    public Month() {

    }

    public Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
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
