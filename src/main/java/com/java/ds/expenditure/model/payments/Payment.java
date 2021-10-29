package com.java.ds.expenditure.model.payments;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
public class Payment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column
    private String title;

    @Column
    private double value;

    @Column(columnDefinition = "DATE")
    private LocalDate dateOfPayment;

    @Column
    private int typeOfPayment;

    public Payment(String title, double value, LocalDate dateOfPayment, int typeOfPayment){
        if(title.equals("")) {
            throw new IllegalArgumentException("Payment's title cannot be empty");
        } else
        this.title = title;
        if(value < 0){
            throw new IllegalArgumentException("Payment's value cannot be negative");
        } else
        this.value = value;
        this.dateOfPayment = dateOfPayment;
        this.typeOfPayment = typeOfPayment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.equals("")) {
            throw new IllegalArgumentException("Payment's title cannot be empty");
        } else
            this.title = title;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if(value < 0.0){
            throw new IllegalArgumentException("Payment's value cannot be negative");
        } else
            this.value = value;
    }

    public LocalDate getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDate dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public int getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(int typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

}
