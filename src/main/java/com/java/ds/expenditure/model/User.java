package com.java.ds.expenditure.model;

import com.java.ds.expenditure.model.period.Year;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private long userid;

    @Column(name="user_login")
    private String userLogin;

    @Column(name="user_password")
    private String userPassword;

    @Transient
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    Set<Year> years = new HashSet<>();

    @Transient
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    Set<Loan> loans = new HashSet<>();

    public User(String userLogin, String userPassword) {
        if(userLogin.equals("") || userPassword.equals("")){
            throw new IllegalArgumentException();
        }
        this.userLogin = userLogin;
        this.userPassword = userPassword;
    }

    public long getUserid() {
        return userid;
    }

    private void setUserid(long userid) {
        this.userid = userid;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        if(userLogin.equals("")){
            throw new IllegalArgumentException();
        }
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        if(userPassword.equals("")){
            throw new IllegalArgumentException();
        }
        this.userPassword = userPassword;
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

    public Set<Year> getYears() {
        return this.years;
    }

    public void addLoan(Loan loan) {
        this.loans.add(loan);
    }

    public void removeLoan(Loan loan) {
        this.loans.remove(loan);
    }

    public Set<Loan> getLoans() {
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

    public Year getYearByNumber(int yearNumber){
        Year yearToGet = null;

        for(Year year : this.getYears()){
            if(year.getYearNumber() == yearNumber){
                yearToGet = year;
            }
        }
        return yearToGet;
    }
}
