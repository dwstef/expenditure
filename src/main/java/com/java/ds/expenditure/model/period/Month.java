package com.java.ds.expenditure.model.period;

import com.java.ds.expenditure.model.payments.Payment;

import java.util.ArrayList;

public class Month {

    int monthNumber;
    int monthYearNumber;

    ArrayList<Payment> payments = new ArrayList<>();

    public Month(int monthNumber, int monthYearNumber) {
        if(monthNumber < 1 || monthNumber > 12){
            throw new IllegalArgumentException("Month number must be between 1 and 12");
        }
        this.monthNumber = monthNumber;

        if (monthYearNumber < 1900 || monthYearNumber > 9999) {
            throw new IllegalArgumentException("Month year number must be between 1900 and 9999");
        }
        this.monthYearNumber = monthYearNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        if(monthNumber < 1 || monthNumber > 12){
            throw new IllegalArgumentException("Month number must be between 1 and 12");
        }
        this.monthNumber = monthNumber;
    }

    public int getMonthYearNumber() {
        return monthYearNumber;
    }

    public void setMonthYearNumber(int monthYearNumber) {
        if (monthYearNumber < 1900 || monthYearNumber > 9999) {
            throw new IllegalArgumentException("Month year number must be between 1900 and 9999");
        }
        this.monthYearNumber = monthYearNumber;
    }

    public void addPayment(Payment payment) {
        if(payment.getDateOfPayment().getMonthValue() != this.monthNumber || payment.getDateOfPayment().getYear() != this.monthYearNumber){
            throw new IllegalArgumentException("Payment should be payed in other month");
        } else
        if(this.getPayments().contains(payment) || payment.getDateOfPayment().getMonthValue() != this.monthNumber ){
            throw new IllegalArgumentException("Payment is already added to the Month");
        } else
        this.payments.add(payment);
    }

    public void removePayment(Payment payment) {
        this.payments.remove(payment);
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }
}
