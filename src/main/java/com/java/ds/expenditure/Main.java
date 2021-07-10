package com.java.ds.expenditure;

import com.java.ds.expenditure.model.Month;
import com.java.ds.expenditure.model.payments.LoanPayment;
import com.java.ds.expenditure.model.payments.OneTimePayment;
import com.java.ds.expenditure.model.payments.Payment;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        OneTimePayment payment = new OneTimePayment("title", 100  ,10, 10, 2020);

        System.out.println(payment.getTitle());
        System.out.println(payment.getDateOfPayment());
        System.out.println(payment.getValue());

        LoanPayment loan = new LoanPayment("payment", 100.25,25, 10, 2021);
        System.out.println(loan.getTitle());
        System.out.println(loan.getDateOfPayment());
        System.out.println(loan.getValue());
        System.out.println(loan.isPayed());
    }
}
