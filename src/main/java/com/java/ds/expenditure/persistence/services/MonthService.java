package com.java.ds.expenditure.persistence.services;

import com.java.ds.expenditure.model.User;
import com.java.ds.expenditure.model.payments.Payment;
import com.java.ds.expenditure.model.period.Month;
import com.java.ds.expenditure.model.period.Year;
import com.java.ds.expenditure.persistence.DatabaseConnector;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

@Component("monthService")
public class MonthService {

    DatabaseConnector connector;
    public MonthService() {
        connector = DatabaseConnector.getInstance();
    }



    public void addPaymentToMonth (Month month, Payment payment) {

        month.addPayment(payment);

        Transaction transaction = connector.getSession().beginTransaction();
        connector.getSession().save(month);
        transaction.commit();

    }
}
