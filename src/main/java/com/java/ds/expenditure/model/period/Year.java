package com.java.ds.expenditure.model.period;

import java.util.ArrayList;

public class Year {

    int yearNumber;
    ArrayList<Month> months = new ArrayList<>();

    public Year() {
    }

    public Year(int yearNumber) {
        this.yearNumber = yearNumber;
    }

    public int getYearNumber() {
        return yearNumber;
    }

    public void setYearNumber(int yearNumber) {
        this.yearNumber = yearNumber;
    }

    public void addMonth(Month month) {
        this.months.add(month);
    }

    public void removeMonth(Month month) {
        this.months.remove(months);
    }

    public ArrayList<Month> getMonths() {
        return months;
    }

}
