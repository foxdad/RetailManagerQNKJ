package com.boyu.kiss.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.boyu.kiss.controller,com.boyu.kiss.service,com.boyu.kiss.config")
public class SpringBootMain {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMain.class, args);
	}
}
