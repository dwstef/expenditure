package com.java.ds.expenditure.model;

import com.java.ds.expenditure.model.payments.LoanPayment;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Loan {
    String title;
    LocalDate startDate;
    LocalDate endDate;
    BigDecimal totalValue;
    BigDecimal monthlyValue;
    boolean payed;
    ArrayList<LoanPayment> repaymentSchedule;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public BigDecimal getMonthlyValue() {
        return monthlyValue;
    }

    public void setMonthlyValue(BigDecimal monthlyValue) {
        this.monthlyValue = monthlyValue;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }
}
