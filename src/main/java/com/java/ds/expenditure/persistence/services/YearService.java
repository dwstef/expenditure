package com.java.ds.expenditure.persistence.services;

import com.java.ds.expenditure.model.User;
import com.java.ds.expenditure.model.period.Year;
import com.java.ds.expenditure.persistence.DatabaseConnector;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component("yearService")
public class YearService {

    DatabaseConnector connector;
    public YearService() {
        connector = DatabaseConnector.getInstance();
    }

}
