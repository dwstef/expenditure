package com.java.ds.expenditure.model;

import java.util.ArrayList;

public class User {
    String login;
    String password;
    ArrayList<Month> plan = new ArrayList<>();
    ArrayList<Loan> loans = new ArrayList<>();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addMonth(Month month){
        this.plan.add(month);
    }

    public void removeMonth(Month month){
        this.plan.remove(month);
    }

    public ArrayList<Month> getPlan() {
        return plan;
    }

    public void addLoan(Loan loan){
        this.loans.add(loan);
    }

    public void removeLoan(Loan loan){
        this.loans.remove(loan);
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }
}
