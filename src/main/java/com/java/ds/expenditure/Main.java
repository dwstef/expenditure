package com.java.ds.expenditure;

import com.java.ds.expenditure.model.User;
import com.java.ds.expenditure.model.period.Month;
import com.java.ds.expenditure.model.period.Year;

public class Main {
    public static void main(String[] args) {

        User user = new User("Test", "Test");

        user.generateYear(2021);

        for(Year year : user.getYears()){
            for(Month month : year.getMonths()){
                System.out.println(month.getMonthNumber()+"-"+year.getYearNumber());
            }
        }

    }


}
