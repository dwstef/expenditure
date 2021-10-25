package com.java.ds.expenditure.model;

import com.java.ds.expenditure.model.payments.LoanPayment;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    String title;
    @Column
    LocalDate startDate;
    @Column
    LocalDate endDate;
    @Column
    BigDecimal totalValue;
    @Column
    BigDecimal monthlyValue;
    @Column
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

    public void generateSchedule(){

    }

}
