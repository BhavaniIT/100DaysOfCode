package com.example.firstdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstdemoApplication.class, args);
		
		GencProfessional gp = context.getBean(GencProfessional.class);
		
		gp.show();
	}

}
