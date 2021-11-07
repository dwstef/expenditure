package com.java.ds.expenditure;

import com.java.ds.expenditure.model.User;
import com.java.ds.expenditure.persistence.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App {

	public static void main(String[] args) {

		SpringApplication.run(App.class, args);
		UserService userService = new UserService();
		User user = new User("test","test");
		userService.addUser(user);
	}



}
