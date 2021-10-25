package com.java.ds.expenditure.persistence;

import org.hibernate.Session;

public class DatabaseConnector {

    protected static DatabaseConnector instance = null;

    public static DatabaseConnector getInstance() {
        if (instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
    }

    private Session session;

    private DatabaseConnector() {
//        session = com.java.ds.expenditure.persistence.HibernateUtil.getSessionFactory().openSession();
          session = HibernateUtil.getSessionFactory().openSession();
    }

    public void teardown() {
        session.close();
//        com.java.ds.expenditure.persistence.HibernateUtil.shutdown();
        HibernateUtil.shutdown();
        instance = null;

    }

    public Session getSession() {
        return session;
    }

}
