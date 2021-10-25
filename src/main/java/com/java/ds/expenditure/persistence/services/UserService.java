package com.java.ds.expenditure.persistence.services;

import com.java.ds.expenditure.model.User;
import com.java.ds.expenditure.model.period.Year;
import com.java.ds.expenditure.persistence.DatabaseConnector;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component("userService")
public class UserService {

    DatabaseConnector connector;
    public UserService() {
        connector = DatabaseConnector.getInstance();
    }

    public Collection<User> getAllUsers() {
        String hql = "FROM User";
        Query query = connector.getSession().createQuery(hql);
        return query.list();
    }

    public User addUser(User user) {
        Transaction transaction = connector.getSession().beginTransaction();
        connector.getSession().save(user);
        transaction.commit();
        return user;
    }

    public void deleteUser(User user) {
        Transaction transaction = connector.getSession().beginTransaction();
        connector.getSession().delete(user);
        transaction.commit();
    }

    public void addYearToUser(User user, int yearNumber) {

        Year year = new Year(yearNumber);

        user.addYear(year);
        Transaction transaction = connector.getSession().beginTransaction();
        connector.getSession().save(year);
        transaction.commit();

    }


}
