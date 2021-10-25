package com.java.ds.expenditure.model;

import com.java.ds.expenditure.model.period.Year;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    User user;

    @Test
    public void testUserLoginIsCorrect() {
        user = new User("login", "password");
        Assert.assertEquals("login", user.getLogin());
    }

    @Test(expected = NullPointerException.class)
    public void testUserWithNullLogin() {
        user = new User(null, "password");
    }

    @Test(expected = NullPointerException.class)
    public void testUserWithNullPassword() {
        user = new User("login", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserWithEmptyLogin() {
        user = new User("", "password");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserWithEmptyPassword() {
        user = new User("login", "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserSetEmptyLogin() {
        user = new User("login", "password");
        user.setLogin("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserSetEmptyPassword() {
        user = new User("login", "password");
        user.setPassword("");
    }

    @Test(expected = NullPointerException.class)
    public void testUserSetNullLogin() {
        user = new User("login", "password");
        user.setLogin(null);
    }

    @Test(expected = NullPointerException.class)
    public void testUserSetNullPassword() {
        user = new User("login", "password");
        user.setPassword(null);
    }

    @Test
    public void testUserHasUniqueLogin() {
        user = new User("login", "password");
        User user2 = new User("login", "password");
        Assert.assertNotEquals(user.getLogin(), user2.getLogin());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testTheSameYearCannotBeAddedTwice() {
        user = new User("login", "password");
        Year year = new Year(2021);
        user.addYear(year);
        user.addYear(year);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testYearsWithSameNumberCannotBeAddedToUser() {
        user = new User("login", "password");
        Year year = new Year(2021);
        Year newYear = new Year(2021);
        user.addYear(year);
        user.addYear(newYear);
    }

//    @Test
//    public void testUserGeneratesTwelveMonths() {
//        user = new User("login", "password");
//        user.generateYear(2021);
////        Assert.assertEquals(user.getYears().get(0).getMonths().size(), 12);
//    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserGeneratesExistingYear() {
        user = new User("login", "password");
        Year year = new Year(2021);
        user.addYear(year);
        user.generateYear(2021);
    }

}
