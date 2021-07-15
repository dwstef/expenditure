package com.java.ds.expenditure.model;

import com.java.ds.expenditure.model.period.Month;
import com.java.ds.expenditure.model.period.Year;

import java.util.ArrayList;

public class User {

    String login;
    String password;

    ArrayList<Year> years = new ArrayList<>();
    ArrayList<Loan> loans = new ArrayList<>();

    public User(String login, String password) {
        if(login.equals("") || password.equals("")){
            throw new IllegalArgumentException();
        }
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if(login.equals("")){
            throw new IllegalArgumentException();
        }
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.equals("")){
            throw new IllegalArgumentException();
        }
        this.password = password;
    }

    public void addYear(Year year) {
        if(!years.contains(year) && !this.yearIsAdded(year)){
            this.years.add(year);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void removeYear(Year year) {
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
        this.addYear(newYear);
        newYear.generateMonths();
    }

    public boolean yearIsAdded(Year year) {
        boolean isAdded = false;
        for (Year existingYear : this.getYears()) {
            if (existingYear.getYearNumber() == year.getYearNumber()) {
                isAdded = true;
                break;
            }
        }
        return isAdded;
    }
}
