package com.example.demo;
import java.util.Scanner;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// Optional: Add this if you want to test your service on startup
	@Bean
	CommandLineRunner demo(UserService userService) {
		return args -> {

			/*Scanner Sc = new Scanner(System.in);

			System.out.println(" Enter Your Name");
			String name = Sc.nextLine();

			System.out.println(" Enter Your Surname");
			String surname = Sc.nextLine(); */
			// Test adding a user
			userService.addUser(1L, "Konanani", "Maduguma");

			// Test getting a user
			userService.getUser(1L);

			// Test removing a user
			userService.removeUser(1L);
		};
	}
}