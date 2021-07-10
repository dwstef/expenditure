package com.java.ds.expenditure.model;

import com.java.ds.expenditure.model.payments.Payment;

import java.util.ArrayList;

public class Month {

    ArrayList<Payment> payments = new ArrayList<>();

    public void addPayment(Payment payment){
        this.payments.add(payment);
    }
}
