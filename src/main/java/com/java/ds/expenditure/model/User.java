package com.java.ds.expenditure.model;

import com.java.ds.expenditure.model.period.Month;
import com.java.ds.expenditure.model.period.Year;

import java.util.ArrayList;

public class User {
    String login;
    String password;
    ArrayList<Year> years = new ArrayList<>();
    ArrayList<Loan> loans = new ArrayList<>();

    public User() {

    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

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

//    public void addNewMonth(int monthNumber, int yearNumber){
//        Month month = new Month(monthNumber, yearNumber);
//        this.plan.add(month);
//    }

    public void addMYear(Year year) {
        this.years.add(year);
    }

    public void removeMonth(Year year) {
        this.years.remove(year);
    }

    public ArrayList<Year> getYears() {
        return this.years;
    }

    public void addLoan(Loan loan) {
        this.loans.add(loan);
    }

    public void removeLoan(Loan loan) {
        this.loans.remove(loan);
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void generateYear(int yearNumber) {
        Year newYear = new Year(yearNumber);
        years.add(newYear);
        for(int i=1;i<=12;i++) {
            Month month = new Month(i);
            newYear.getMonths().add(month);
        }
    }
}
