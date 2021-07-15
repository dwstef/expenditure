package com.java.ds.expenditure.model.period;

import java.util.*;

public class Year {

    int yearNumber;
    ArrayList<Month> months = new ArrayList<>();


    public Year(int yearNumber) {
        if (yearNumber < 1000 || yearNumber > 9999) {
            throw new IllegalArgumentException("Year number must be between 1000 and 9999");
        }
        this.yearNumber = yearNumber;
    }

    public int getYearNumber() {
        return yearNumber;
    }

    public void setYearNumber(int yearNumber) {
        if (yearNumber < 1000 || yearNumber > 9999) {
            throw new IllegalArgumentException("Year number must be between 1000 and 9999");
        }
        this.yearNumber = yearNumber;
    }

    public void addMonth(Month month) {
        if (this.months.size() < 12) {
            if (!months.contains(month) && !this.monthIsAdded(month)) {
                this.months.add(month);
            } else {
                throw new IllegalArgumentException("Month is already added to the Year");
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Year cannot have more than 12 months");
        }
    }

    public void removeMonth(Month month) {
        this.months.remove(month);
    }

    public ArrayList<Month> getMonths() {
        Collections.sort(months, monthComparator);;
        return months;
    }

    public void generateMonths() {
        for (int i = 1; i <= 12; i++) {
            Month month = new Month(i);
            if (!this.monthIsAdded(month)) {
                this.addMonth(month);
            } else {
                continue;
            }
        }
    }

    public boolean monthIsAdded(Month month) {
        boolean isAdded = false;
        for (Month existingMonth : this.months) {
            if (existingMonth.getMonthNumber() == month.getMonthNumber()) {
                isAdded = true;
                break;
            }
        }
        return isAdded;
    }

    static private Comparator<Month> monthComparator = new Comparator<Month>() {
        @Override
        public int compare(Month m1, Month m2) {
            return Integer.compare(m1.getMonthNumber(), m2.getMonthNumber());
        }
    };



}
