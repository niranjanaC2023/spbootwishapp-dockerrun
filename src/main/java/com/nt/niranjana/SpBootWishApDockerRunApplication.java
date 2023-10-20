package com.nt.niranjana;

import java.util.GregorianCalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpBootWishApDockerRunApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpBootWishApDockerRunApplication.class, args);
	}

	@Bean
	public java.util.Calendar calender()
	{
		return new GregorianCalendar();
	}
}
