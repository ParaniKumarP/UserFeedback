package com.display;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class UserFeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserFeedbackApplication.class, args);
	}

}
