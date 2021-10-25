package com.java.ds.expenditure;

import com.java.ds.expenditure.model.User;
import com.java.ds.expenditure.model.period.Year;
import com.java.ds.expenditure.persistence.services.UserService;
import com.java.ds.expenditure.persistence.services.YearService;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        YearService yearService = new YearService();

        User user = new User("test", "test1");
        userService.addUser(user);
//            userService.deleteUser(user);

        userService.addYearToUser(user, 2021);

        User user22 = new User("user2", "test2");
        userService.addUser(user22);

        Year year = user.getYearByNumber(2021);

        yearService.addMonthToYear(year, 10);
//
//        Year b = new Year(2020);
//        user.addYear(b);
//        Month january = new Month(1,2020);
//        Month may = new Month(5,2020);
//        Month july = new Month(7,2020);
//        Month august = new Month(8,2020);
//
//        b.addMonth(january);
//        b.addMonth(may);
//        b.addMonth(july);
//        b.addMonth(august);
//
//        for(Year year : user.getYears()){
//            for(Month month : year.getMonths()){
//                System.out.println(month.getMonthNumber()+"-"+ month.getMonthYearNumber());
//            }
//        }
//
//        b.generateMonths();
//
//        System.out.println("======================");
//
//        for(Year year : user.getYears()){
//            for(Month month : year.getMonths()){
//                System.out.println(month.getMonthNumber()+"-"+ month.getMonthYearNumber());
//            }
//        }

    }
}
