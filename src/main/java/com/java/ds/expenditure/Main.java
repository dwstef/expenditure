package com.java.ds.expenditure;

import com.java.ds.expenditure.model.User;
import com.java.ds.expenditure.model.period.Month;
import com.java.ds.expenditure.model.period.Year;

public class Main {
    public static void main(String[] args) {

        User user = new User("login", "password");

//        user.generateYear(2021);

//        Year y = new Year(2021);
//        user.addYear(y);
//
//        y.generateMonths();
//
//
//        for(Year year : user.getYears()){
//            for(Month month : year.getMonths()){
//                System.out.println(month.getMonthNumber()+"-"+year.getYearNumber());
//            }
//        }

        Year b = new Year(2020);
        user.addYear(b);
        Month january = new Month(1);
        Month may = new Month(5);
        Month july = new Month(7);

        b.addMonth(january);
        b.addMonth(may);
        b.addMonth(july);

        b.generateMonths();

        for(Year year : user.getYears()){
            for(Month month : year.getMonths()){
                System.out.println(month.getMonthNumber()+"-"+year.getYearNumber());
            }
        }


    }


}
