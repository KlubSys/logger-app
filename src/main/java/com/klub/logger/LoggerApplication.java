package com.klub.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class LoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggerApplication.class, args);
	}

}
