package com.java.ds.expenditure.persistence.services;

import com.java.ds.expenditure.model.User;
import com.java.ds.expenditure.model.payments.Payment;
import com.java.ds.expenditure.persistence.DatabaseConnector;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

@Component("paymentService")
public class PaymentService {
    DatabaseConnector connector;
    public PaymentService() {
        connector = DatabaseConnector.getInstance();
    }

    public Payment addPayment(Payment payment) {

        Transaction transaction = connector.getSession().beginTransaction();
        connector.getSession().save(payment);
        transaction.commit();
        return payment;
    }

}
