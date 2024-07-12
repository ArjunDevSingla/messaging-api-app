package com.training.bms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessagingApiAppApplication {
	
	@Autowired
	Weekend week;
	
	@GetMapping("happyWeekend")
	public String weekendComing()
	{
		return week.weekEndCome();
	}
	
	public static String printGreetings()
	{
		return "Hi Oracle";
	}

	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		System.out.println(printGreetings());
	}

}
