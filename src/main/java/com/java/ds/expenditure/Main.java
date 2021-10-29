package com.java.ds.expenditure;

import com.java.ds.expenditure.model.User;
import com.java.ds.expenditure.model.payments.Payment;
import com.java.ds.expenditure.model.period.Year;
import com.java.ds.expenditure.persistence.services.MonthService;
import com.java.ds.expenditure.persistence.services.PaymentService;
import com.java.ds.expenditure.persistence.services.UserService;
import com.java.ds.expenditure.persistence.services.YearService;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        Payment payment = new Payment("payme", 100.0, LocalDate.of(2020, 10, 31), 1);
        paymentService.addPayment(payment);


    }
}
